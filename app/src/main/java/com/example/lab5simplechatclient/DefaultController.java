package com.example.lab5simplechatclient;

public class DefaultController extends AbstractController {

    public static final String ELEMENT_OUTPUT_PROPERTY = "Output";

    public void changeOutputText(String newText) {
        setModelProperty(ELEMENT_OUTPUT_PROPERTY, newText);
    }

    public void sendGetRequest() {
        invokeModelMethod("sendGetRequest", null);
    }

    public void sendDeleteRequest() {invokeModelMethod("sendDeleteRequest",null);}

    public void sendPostRequest(String message) {
        invokeModelMethod("sendPostRequest", message);
    }

}