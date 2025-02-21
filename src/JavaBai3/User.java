package JavaBai3;

import java.util.Objects;

public class User {
    private int userID;
    private String userName;
    private String password;
    private String email;

    public User(int userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = userName + "@gmail.com";
    }
    public User(){
    }

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "userID: " + userID
                + "\nuserName: " + userName
                + "\npassword: " + password
                + "\nemail: " + email;
    }
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return userID == user.userID &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password);
    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + userID;
//        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
//        result = prime * result + ((password == null) ? 0 : password.hashCode());
//        result = prime * result + ((email == null) ? 0 : email.hashCode());
//        return result;
//    }
    @Override
    public int hashCode() {
        return Objects.hash(userID, userName, password);
    }
}
