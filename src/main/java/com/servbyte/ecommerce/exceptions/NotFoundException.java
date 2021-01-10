package com.servbyte.ecommerce.exceptions;

import com.servbyte.ecommerce.dtos.response.ApiResponse;


public class NotFoundException extends RuntimeException {
    private String code;

    public NotFoundException(ApiResponse responseCode) {
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
