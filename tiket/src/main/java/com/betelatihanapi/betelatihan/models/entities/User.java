package com.betelatihanapi.betelatihan.models.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

// import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id", updatable = false, nullable = false)
    private String userId;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "phonenumber", nullable = false)
    private String phonenumber;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "role_id")
    private Integer roleId;

    // Relasi dengan entitas Auth
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Auth auth;

    // Getters dan Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }
}
