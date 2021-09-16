package com.lt.bean;

public class Payment {
    private  long billId;
    private double billingAmount;
    private String billingMode;

    public Payment(){}

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public Payment(double billingAmount, String billingMode) {
        this.billingAmount = billingAmount;
        this.billingMode = billingMode;
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
