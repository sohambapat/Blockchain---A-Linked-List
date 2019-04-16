package com.techprimers.blockchain;

public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long sum;
    
    //Initiator of transaction
    public String getSourceName() {
        return sourceName;
    }
    
    //Set name of source
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    
    //Receiver of transaction
    public String getDestinationName() {
        return destinationName;
    }
    
    //Set name of receiver
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    
    //return transaction amount
    public Long getSum() {
        return sum;
    }
    
    //set transaction amount
    public void setSum(Long sum) {
        this.sum = sum;
    }
    
    
    //creates a transaction 
    public Transaction(String sourceName, String destinationName, Long sum) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.sum = sum;
    }
    
    @Override
    //Using recursion, returns a hash function with all integer values
    //This hash code algorithm is commonly used and secure
    public int hashCode() {
        int result = 0;
        if(sourceName!= null) {
        	sourceName.hashCode();
        }
        else
        	result = 0;
        //if receiver is not null, generate hash code
        result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
        //if transaction amount is not null, generate hash code
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        return result;
    }
}