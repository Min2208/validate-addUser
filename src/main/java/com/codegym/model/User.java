package com.codegym.model;

import javax.validation.constraints.*;

public class User{
    @Min(18)
    private int age;

    @NotEmpty
    @Size(min = 5,max = 45)
    private String name;


    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    @Pattern(regexp = "(\\\\+84|0)[0-9]{9}")
    private String phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
