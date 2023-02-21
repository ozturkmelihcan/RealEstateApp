package com.melihcan.realestateapp.exception;

import lombok.Getter;

@Getter
public class RealEstateAppException extends RuntimeException{

    private final ErrorType errorType;


    public RealEstateAppException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public RealEstateAppException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
