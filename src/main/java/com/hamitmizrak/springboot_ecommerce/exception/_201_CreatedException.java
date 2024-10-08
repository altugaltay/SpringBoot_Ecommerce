package com.hamitmizrak.springboot_ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Status Code : 201
// CREATED     : Oluşturuldu

@ResponseStatus(value= HttpStatus.CREATED)
public class _201_CreatedException extends RuntimeException {

    // Constructor Parametreli
    public _201_CreatedException(String message) {
        super(message);
    } //end method
} //end class
