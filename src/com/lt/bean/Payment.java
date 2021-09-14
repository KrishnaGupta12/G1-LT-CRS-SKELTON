package com.lt.bean;

public class Payment {
    private long billingId;
    private double billingAmount;
   // private Boolean type;

    public Payment(){}
    public Payment(long billingId, double billingAmount) {
        this.billingId = billingId;
        this.billingAmount = billingAmount;
    }

    public long getBillingId() {
        return billingId;
    }

    public void setBillingId(long billingId) {
        this.billingId = billingId;
    }

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }
}
