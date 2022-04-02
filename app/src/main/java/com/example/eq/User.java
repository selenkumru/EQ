package com.example.eq;

public class User {

    private String UserID;
    private String Username;
    private String Email;

    public User() {

    }

    public User(String UserID,String username, String email) {
        this.UserID=UserID;
        this.Username = username;
        this.Email = email;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setUsername(String username) {
        Username = username;
    }
}

