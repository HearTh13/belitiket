package com.betelatihanapi.betelatihan.models.entities;


import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "auth")
public class Auth {

    @Id
    private String userId; // Gunakan userId langsung sebagai ID
    
    @Column(name = "otp")
    private Integer otp;

    @Column(name = "otp_expired_at")
    private LocalDateTime otpExpiredAt;

    @Column(name = "is_used")
    private Boolean isUsed;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "access_token_expired_at")
    private LocalDateTime accessTokenExpiredAt;

    @Column(name = "refresh_token_expired_at")
    private LocalDateTime refreshTokenExpiredAt;

    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String password;

    // Relasi dengan entitas User
    @OneToOne
    @MapsId // Ini menunjukkan bahwa 'userId' berasal dari 'User' ID
    @JoinColumn(name = "id") // Nama kolom di tabel 'auth' yang menjadi kunci
    private User user;

    // Getters dan Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public LocalDateTime getOtpExpiredAt() {
        return otpExpiredAt;
    }

    public void setOtpExpiredAt(LocalDateTime otpExpiredAt) {
        this.otpExpiredAt = otpExpiredAt;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public LocalDateTime getAccessTokenExpiredAt() {
        return accessTokenExpiredAt;
    }

    public void setAccessTokenExpiredAt(LocalDateTime accessTokenExpiredAt) {
        this.accessTokenExpiredAt = accessTokenExpiredAt;
    }

    public LocalDateTime getRefreshTokenExpiredAt() {
        return refreshTokenExpiredAt;
    }

    public void setRefreshTokenExpiredAt(LocalDateTime refreshTokenExpiredAt) {
        this.refreshTokenExpiredAt = refreshTokenExpiredAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
