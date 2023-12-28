package com.ownday.model.dto;

import lombok.Data;

public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userNickName;
    private String userImage;

    public User(String userId, String userName, String userPassword, String userNickName, String userImage) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNickName = userNickName;
        this.userImage = userImage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", userImage='" + userImage + '\'' +
                '}';
    }
}
