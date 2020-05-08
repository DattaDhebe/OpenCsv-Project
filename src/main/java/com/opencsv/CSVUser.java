package com.opencsv;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
    @CsvBindByName
    public  String name;

    @CsvBindByName(column = "email", required = true)
    public   String email;

    @CsvBindByName(column = "phone")
    public  String phoneNo;

    @CsvBindByName
    public  String country;

    public CSVUser(String name, String email, String phoneNo, String country) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.country = country;
    }

    public CSVUser() {
    }

    @Override
    public  String toString() {
        return "CSVUserTest{" +
                "name=" + name + '\'' +
                ", email=" + email + '\'' +
                ", phoneNo=" + phoneNo + '\'' +
                ", country=" + country + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public String getEmail() {

        return email;
    }

    public String getPhoneNo() {

        return phoneNo;
    }

    public String getCountry() {

        return country;
    }
}
