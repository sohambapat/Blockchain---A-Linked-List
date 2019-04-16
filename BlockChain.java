package com.techprimers.blockchain;

import java.util.Arrays;

public class BlockChain {

    public static void main(String[] args) {

    	//Creating transactions
    	Transaction t1 = new Transaction("Soham", "KSU", (long) 32000);
    	Transaction t2 = new Transaction("KSU", "Bank", (long) 32000);
    	Transaction t3 = new Transaction("Bank", "Employee", (long) 10000);
    	Transaction t4 = new Transaction("Employee", "Daughter", (long)32000);
    	Transaction t5 = new Transaction("Daughter", "KSU", (long)32000);
    	
    	//Creating a chain of blocks
        Block b1 = new Block(0, Arrays.asList(t1, t2));
        System.out.println(b1.hashCode());
        Block b2 = new Block(b1.hashCode(), Arrays.asList(t3));
        System.out.println(b2.hashCode());
        Block b3 = new Block(b2.hashCode(), Arrays.asList(t4));
        System.out.println(b3.hashCode());
        Block b4 = new Block(b3.hashCode(), Arrays.asList(t5));
        System.out.println(b4.hashCode());

    }
}