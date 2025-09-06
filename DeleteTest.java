package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteTest {

    @Test
    public void testDeleteWithQueryParams() {
        Map<String, String> queryParams = Map.of(
                "param1", "value1",
                "param2", "value2"
        );

        Response response = RestAssured.given()
                .queryParams(queryParams)
                .delete("https://postman-echo.com/delete");

        assertEquals(200, response.getStatusCode());

        Map<String, String> argsResponse = response.jsonPath().getMap("args");

        assertEquals(queryParams, argsResponse);
    }
}