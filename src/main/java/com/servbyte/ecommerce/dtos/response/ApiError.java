package com.servbyte.ecommerce.dtos.response;


public class ApiError {
    private String fieldName;
    private String message;

    public ApiError() {
    }

    public ApiError(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "ApiError{fieldName='" + this.fieldName + '\'' + ", message='" + this.message + '\'' + '}';
    }
}
