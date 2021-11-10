package com.company;
import java.util.Date;
import java.util.ArrayList;

enum Gender{
    m,
    f
}

public class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public String fullName;
    public Date birthData;
    public Gender gender;
    public String homeAddress;
    public String phone;
    public ArrayList<Hospital> hospitals;
}
