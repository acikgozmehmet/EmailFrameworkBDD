package com.app.tests;

import com.app.pojos.Person;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import static io.restassured.RestAssured.given;

public class ResponseToJsonExample {

    @Test
    public void test(){

        Response response = given().get("https://uinames.com/api/");
//        response.prettyPrint();

//        String json = response.asString();
//
//        Gson gson = new Gson();
//        Person myPerson = gson.fromJson(json, Person.class);
//        System.out.println(myPerson);


        Person p1 = response.as(Person.class);
        System.out.println("p1 = " + p1);

    }
}
