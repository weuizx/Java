package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Task3 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        String str, str1;
        String[] name;
        Package box;
        int n = Integer.parseInt(in.readLine());
        long start = System.nanoTime();
        str = in.readLine();
        int iend = str.indexOf("/");
        if(iend > 0 ) {
            str1 = str.substring(0, iend);
            box = new Package(str1);
            box.add(str.split("/"), 1);
        }else{
            str1 = str;
            box = new Package(str1);
        }
        for(int i = 1; i < n; i++){
            str = in.readLine();
            name = str.split("/");
            box.add(name,1);
        }
        Package.print(box, 0);

    }
}

class SortByName implements Comparator<Package>{

    @Override
    public int compare(Package o1, Package o2) {
        return o1.name.compareTo(o2.name);
    }
}
class Package{
    public final String name;
    public TreeSet<Package> set = null;
    public Package(String name){
        this.name = name;
    }
    private Package search(Package key) {
        Package ceil  = set.ceiling(key);
        Package floor = set.floor(key);
        return ceil == floor? ceil : null;
    }
    public void add(String[] name, int offset){
        if (name.length - offset == 0)
            return;
        if(set == null){
            set = new TreeSet<Package>(new SortByName());
        }
        Package pack= new Package((name[offset]));
        set.add(pack);
        search(pack).add(name, offset + 1);
    }
    public static void print(Package pack, int offset){
        for (int j = 0; j < offset; j++) {
            System.out.print("  ");
        }
        System.out.println(pack.name);
        if(pack.set == null){
            return;
        }
        for(Package item : pack.set){
            print(item, offset + 1);
        }
    }
}