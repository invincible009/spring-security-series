package com.shimadove.springsecurityseries.entity;

import com.shimadove.springsecurityseries.enums.UserType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="USER")
public class User extends AbstractEntity{

    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected String password;
    protected String status;
    protected Date createdOnDate;
    protected Date expiryDate;
    protected Date lockedUntlDate;
    protected Date lastLoginDate;
    protected int noOfLoginAttempts;
    protected Integer noOfTokenAttempts = 0;
    protected UserType userType;
    protected Code alertPreference;
    protected Role role;
    protected String entrustId;
    protected String lastOtpGenerated;
    protected String lastOtpGenExpiry;
    protected boolean enableOtp;
    protected String otpSecret;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(Date createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getLockedUntlDate() {
        return lockedUntlDate;
    }

    public void setLockedUntlDate(Date lockedUntlDate) {
        this.lockedUntlDate = lockedUntlDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public int getNoOfLoginAttempts() {
        return noOfLoginAttempts;
    }

    public void setNoOfLoginAttempts(int noOfLoginAttempts) {
        this.noOfLoginAttempts = noOfLoginAttempts;
    }

    public Integer getNoOfTokenAttempts() {
        return noOfTokenAttempts;
    }

    public void setNoOfTokenAttempts(Integer noOfTokenAttempts) {
        this.noOfTokenAttempts = noOfTokenAttempts;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Code getAlertPreference() {
        return alertPreference;
    }

    public void setAlertPreference(Code alertPreference) {
        this.alertPreference = alertPreference;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(String entrustId) {
        this.entrustId = entrustId;
    }

    public String getLastOtpGenerated() {
        return lastOtpGenerated;
    }

    public void setLastOtpGenerated(String lastOtpGenerated) {
        this.lastOtpGenerated = lastOtpGenerated;
    }

    public String getLastOtpGenExpiry() {
        return lastOtpGenExpiry;
    }

    public void setLastOtpGenExpiry(String lastOtpGenExpiry) {
        this.lastOtpGenExpiry = lastOtpGenExpiry;
    }

    public boolean isEnableOtp() {
        return enableOtp;
    }

    public void setEnableOtp(boolean enableOtp) {
        this.enableOtp = enableOtp;
    }

    public String getOtpSecret() {
        return otpSecret;
    }

    public void setOtpSecret(String otpSecret) {
        this.otpSecret = otpSecret;
    }
}
