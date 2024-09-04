package com.betelatihanapi.betelatihan.models.entities;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Login")
public class Login {

    @Id
    @Column(name = "id")
    private String userId;  

    @Column(name = "last_login")
    private Timestamp lastLogin; 

    @Column(name = "browser_type")
    private String browserType; 
    
    @Column(name = "ip_address")
    private String ipAddress;  

    // Tambahkan getter dan setter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
