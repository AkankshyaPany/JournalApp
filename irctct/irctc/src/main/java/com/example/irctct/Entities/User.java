package irctc.Entities;

import java util.Lists;

public class User{

    private String name;

    private String password;

    private String hashpassword;

    private List<Tickets> tciketsBooking;

    private  String userId;

    public User() {
        this.name=name;
        this.password=password;

    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashpassword() {
        return hashpassword;
    }

    public void setHashpassword(String hashpassword) {
        this.hashpassword = hashpassword;
    }

    public List<Tickets> getTciketsBooking() {
        return tciketsBooking;
    }

    public void setTciketsBooking(List<Tickets> tciketsBooking) {
        this.tciketsBooking = tciketsBooking;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}