package Common.User;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private final int userID;
    private static int userCount = 0;
    private String username;
    private String password;
    private boolean isOnline;
    private boolean isBanned;

    // Constructor
    public User(String username, String password) {
        this.userID = ++userCount;
        this.username = username;
        this.password = password;
        this.isOnline = false;
        this.isBanned = false;
    }

    // Getters and setters
    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }
}