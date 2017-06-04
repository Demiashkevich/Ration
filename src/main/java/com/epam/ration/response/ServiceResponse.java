package com.epam.ration.response;

import java.io.Serializable;

public class ServiceResponse<T> implements Serializable {

    private T body;
    private Status status;
    private String message;

    public ServiceResponse(Status status) {
        this.status = status;
    }

    public ServiceResponse(T body, Status status) {
        this.body = body;
        this.status = status;
    }

    public ServiceResponse(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
