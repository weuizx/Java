package org.example;

import java.util.ArrayList;

public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }

    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item newItem) {
        items.add(newItem);
    }
    public void printInvoice(){
        System.out.printf("%14s%14s%14s%14s\n", "description", "quantity", "unitPrice", "price");
        for(Item item : this.items){
            System.out.printf("%14s%14s%14s%14s\n", item.description, item.quantity, item.unitPrice, item.unitPrice * item.quantity);
        }
    }
}
