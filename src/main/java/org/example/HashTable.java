package org.example;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable(){
        dataMap = new Node[size];
    }

    public class Node{
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

//hash method
    private int hash(String key){
        int hash = 0;
        char[] keyCharArray = key.toCharArray();
        for(int i = 0; i< keyCharArray.length; i++){
            int asciiValue = keyCharArray[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

//set method
    public void set(String key, int value){
        Node newNode = new Node(key, value);
        int index = hash(key);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }
        else{
            Node temp = dataMap[index];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next =  newNode;
        }
    }

//get method
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

// keys method
    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

//print method
    public void printTable(){
        for(int i=0; i< dataMap.length; i++){
            System.out.println(i + ":");
            if(dataMap[i] != null){
                Node temp = dataMap[i];
                while(temp != null){
                    System.out.println("   {" + temp.key + " , " + temp.value + "}");
                    temp = temp.next;
                }
            }

        }
    }
}
