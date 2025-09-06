package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {

    @Test
    public void testPostWithJsonBody() {
        Map<String, Object> jsonBody = Map.of(
                "username", "user1",
                "password", "pass123"
        );

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(jsonBody)
                .post("https://postman-echo.com/post");

        assertEquals(200, response.getStatusCode());

        Map<String, Object> jsonResponse = response.jsonPath().getMap("json");

        assertEquals(jsonBody, jsonResponse);
    }
}