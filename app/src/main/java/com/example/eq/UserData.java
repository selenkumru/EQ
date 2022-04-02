package com.example.eq;

public final class UserData {

    private static UserData INSTANCE;
    private String UserID;
    private String SelectedCity;
    private User user;
    private UserData() {
    }

    public static UserData getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new UserData();
        }

        return INSTANCE;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getSelectedCity() {
        return SelectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        SelectedCity = selectedCity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}