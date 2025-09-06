package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatchTest {

    @Test
    public void testPatchWithJsonBody() {
        Map<String, Object> jsonBody = Map.of(
                "email", "newemail@example.com"
        );

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(jsonBody)
                .patch("https://postman-echo.com/patch");

        assertEquals(200, response.getStatusCode());

        Map<String, Object> jsonResponse = response.jsonPath().getMap("json");

        assertEquals(jsonBody, jsonResponse);
    }
}