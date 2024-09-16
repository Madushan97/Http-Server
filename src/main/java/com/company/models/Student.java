package com.company.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty("id")
    private final Integer id = 1;

    @JsonProperty("name")
    private final String name = "nipuna";

    @JsonProperty("address")
    private final String address = "kuruwita";

    @JsonProperty("phone")
    private final String phone = "+94 71 889 51 81";

    @JsonProperty("gender")
    private final String gender = "male";

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
