package com.codegym.model;

import javax.validation.constraints.*;

public class User{
    @Min(value = 18,message = "Tuoi >= 18")
    private int age;

    @NotEmpty(message = "Ten phai co it nhat 5 ky tu")
    @Size(min = 5,max = 45,message = "ten nam trong khoang 5-45")
    private String name;


    @Email(message = "email phai dung quy tac")
    @NotEmpty(message = "Hay nhap email")
    private String email;

    @NotEmpty(message = "hay nhap phone")
    @Pattern(regexp = "(\\\\+84|0)[0-9]{9}", message = "Hay nhap dung so phone")
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
