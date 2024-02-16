package org.example;



public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("HashTable!\n");

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();

        // HASH METHOD MUST BE SET TO PUBLIC FOR THESE LINES TO WORK
//        System.out.println( myHashTable.hash("paint") );
//        System.out.println( myHashTable.hash("bolts") );
//        System.out.println( myHashTable.hash("nails") );
//        System.out.println( myHashTable.hash("stuff") );
//        System.out.println( myHashTable.hash("lumber") );
        myHashTable.set("oleg" , 47);
        myHashTable.set("tetyana" , 46);
        myHashTable.set("daryna" , 14);

        System.out.println("--------------------------\n");
        myHashTable.printTable();
        System.out.println("--------------------------\n");

        System.out.println(" Oleg is " + myHashTable.get("oleg"));
        System.out.println(" Daryna is " + myHashTable.get("daryna"));

        System.out.println("--------------------------\n");
        System.out.println("All keys:");
        System.out.println(myHashTable.keys());

    }
}