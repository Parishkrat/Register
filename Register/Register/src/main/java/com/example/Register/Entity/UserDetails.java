package com.example.Register.Entity;

import javax.persistence.*;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String YourName;
private String email;
private int dob;
private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYourName() {
        return YourName;
    }

    public void setYourName(String yourname) {
        YourName = yourname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", Yourname='" + YourName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", password='" + password + '\'' +
                '}';
    }
}

