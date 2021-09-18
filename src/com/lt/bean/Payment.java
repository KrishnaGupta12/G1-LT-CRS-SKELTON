package com.lt.bean;

public class Payment {
    private long transactionId;
    private double billingAmount;
    private String billingMode;

    public Payment() {
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Payment(double billingAmount, String billingMode, long transactionId) {
        this.billingAmount = billingAmount;
        this.billingMode = billingMode;
        this.transactionId = transactionId;
    }

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }

    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }
}
