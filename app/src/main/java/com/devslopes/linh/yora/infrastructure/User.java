package com.devslopes.linh.yora.infrastructure;

/**
 * Created by Linh on 6/18/2016.
 */
public class User {
    private int id;
    private String userName;
    private String displayName;
    private String avatarUrl;
    private boolean isLoggedIn;
    private boolean hasPassword;
    private String email;


    public User() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public boolean isHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(boolean hasPassword) {
        this.hasPassword = hasPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
