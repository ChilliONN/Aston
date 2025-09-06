package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostRawTextTest {

    @Test
    public void testPostRawTextAndCheckDataField() {
        String rawText = "This is a raw text payload";

        Response response = RestAssured.given()
                .contentType("text/plain")
                .body(rawText)
                .post("https://postman-echo.com/post");

        assertEquals(200, response.getStatusCode());

        // В ответе поле "data" содержит отправленный текст
        String dataField = response.jsonPath().getString("data");

        assertEquals(rawText, dataField);
    }
}