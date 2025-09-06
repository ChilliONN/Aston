package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTest {
    mvn clean install
    @Test
    public void testGetWithQueryParams() {
        Map<String, String> queryParams = Map.of(
                "search", "test",
                "limit", "10"
        );

        Response response = RestAssured.given()
                .queryParams(queryParams)
                .get("https://postman-echo.com/get");

        assertEquals(200, response.getStatusCode());

        Map<String, String> argsResponse = response.jsonPath().getMap("args");

        assertEquals(queryParams, argsResponse);
    }
}