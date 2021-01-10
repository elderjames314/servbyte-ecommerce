package com.servbyte.ecommerce.enums;

public enum  ApiErrorCodes {
        INVALID_REQUEST("95","Invalid request"),
        NOT_FOUND("92", "Not found"),
        GENERAL_ERROR("","An error occurred"),
        ACCESS_DENIED("98", "Access Denied");

        private String key;
        private String value;

        ApiErrorCodes(String key, String value){
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }
}
