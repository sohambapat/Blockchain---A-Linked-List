package com.techprimers.blockchain;
import java.util.List;
public class Block {

    private int previousHash;
    private List<Transaction> transactions;
    //creates a block using Transaction.java
    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    //returns hash code of previous hash
    public int getPreviousHash() {
        return previousHash;
    }
    //sets hash code of previous block
    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }
    //returns list for transactions
    public List<Transaction> getTransactions() {
        return transactions;
    }
    //Sets list for transactions
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
   
    //this is the hash algorithm commonly used which uses 2 prime numbers to make the code unique
    @Override
    public int hashCode() {
        int result = previousHash;
        //result is equal to 31 * result + transactions.hashCode() if transactions is not null (if it is null, add 0 instead)
        result = 31 * result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }
}