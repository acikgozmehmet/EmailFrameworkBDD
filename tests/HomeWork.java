package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.*;


public class HomeWork {
    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://api.github.com";
    }

    @Test
    public void userTest(){
        // given --> prepare our request
        // submit it to url
        given().pathParam("username", "marufjont").
        when().get("/users/{username}").
        prettyPrint();

    }


}
