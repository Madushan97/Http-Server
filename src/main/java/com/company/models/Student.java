package com.company.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("gender")
    private String gender;

    public Student() {
    }

    public Student(Integer id, String name, String address, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
