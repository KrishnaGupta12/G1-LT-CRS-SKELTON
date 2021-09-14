package com.lt.bean;

public class Admin {

    private long adminId;
    private String adminName;
    private String adminEmail;
    private String adminMobileNo;

    public Admin()
    {
    }

    public Admin(long adminId, String adminName, String adminEmail, String adminMobileNo) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminMobileNo = adminMobileNo;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminMobileNo() {
        return adminMobileNo;
    }

    public void setAdminMobileNo(String adminMobileNo) {
        this.adminMobileNo = adminMobileNo;
    }
}
