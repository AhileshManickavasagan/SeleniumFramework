package com.ahilesh;

import com.github.javafaker.Faker;

public class FakerTest {


    public static void main(String[] args) {
        Faker faker=new Faker();
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
    }

}
