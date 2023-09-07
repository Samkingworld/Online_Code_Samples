package com.example.PowerUser.model;

import jakarta.persistence.*;

@Entity
@Table(name = "power_users", schema = "powerful_users", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "email"}))
public class PowerUser {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    private String email;

    private String address;

    private int age;

    public PowerUser(){
    }

    public PowerUser(int id, String fullName, String email, String address, int age) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
