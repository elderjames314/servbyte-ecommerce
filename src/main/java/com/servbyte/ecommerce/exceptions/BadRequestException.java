package com.servbyte.ecommerce.exceptions;


import com.servbyte.ecommerce.dtos.response.ApiResponse;

public class BadRequestException extends RuntimeException {
     private String code;


    public BadRequestException(String code, String message){
        super(message);
        this.code = code;
    }
    public BadRequestException(ApiResponse responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
