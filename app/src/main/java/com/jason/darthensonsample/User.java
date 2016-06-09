package com.jason.darthensonsample;

import org.parceler.Parcel;

/**
 * Created by authur on 2016/6/9.
 */
@Parcel
public class User {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
