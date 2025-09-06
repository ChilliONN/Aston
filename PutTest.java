package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PutTest {

    @Test
    public void testPutWithJsonBody() {
        Map<String, Object> jsonBody = Map.of(
                "id", 123,
                "status", "active"
        );

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(jsonBody)
                .put("https://postman-echo.com/put");

        assertEquals(200, response.getStatusCode());

        Map<String, Object> jsonResponse = response.jsonPath().getMap("json");

        assertEquals(jsonBody, jsonResponse);
    }
}