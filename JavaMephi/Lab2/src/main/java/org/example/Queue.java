package org.example;

import java.util.Iterator;

public class Queue {
    private static class Node{
        public String item;
        public Node next;
        public Node(String item){
            this.item = item;
            this.next = null;
        }
        public Node(String item, Node next){
            this.item = item;
            this.next = next;
        }

    }
    public class Iterator implements java.util.Iterator<String> {
        private Node currentNode;
        public Iterator(){
            this.currentNode = null;
        }
        public boolean hasNext(){
            if(length == 0) {
                return false;
            }else if (currentNode == null){
                currentNode = new Node("", head);
                return true;
            }
            return currentNode.next != null;
        }
        public String next(){
            currentNode = currentNode.next;
            return currentNode.item;
        }
    }

    private Node head;
    private Node tail;
    private int length;
    public Queue(){
        this.length = 0;
        this.head = null;
    }
    public void add(String item){
        Node node = new Node(item);
        if (this.length == 0){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.length ++;
    }
    public String remove(){
        if(this.length == 0){
            System.out.println("Queue is empty!");
            return null;
        }
        String out;
        if(this.length == 1){
            out = this.head.item;
            this.head = null;
            this.tail = null;
        }else{
            out = this.head.item;
            this.head = this.head.next;
        }
        this.length --;
        return out;
    }

    public int length() {
        return length;
    }
    public Iterator iterator(){
        return new Iterator();
    }
}
