package com.epam.ration.response;


import java.io.Serializable;

public class DaoResponse<T> implements Serializable {

    private T body;
    private Status status;
    private String message;

    public DaoResponse(Status status) {
        this.status = status;
    }

    public DaoResponse(T body, Status status) {
        this.body = body;
        this.status = status;
    }

    public DaoResponse(Status status, String message) {
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
