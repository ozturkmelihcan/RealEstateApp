package com.melihcan.realestateapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    BAD_REQUEST_ERROR(1201,"Geçersiz Parametre Girişi Yaptınız.",BAD_REQUEST),

    INTERNAL_ERROR(3000,"Sunucuda beklenmeyen hata",INTERNAL_SERVER_ERROR),

    KULLANICI_BULUNAMADI(2301,"Aradıgınız id ye ait kullanıcı bulunamadı",INTERNAL_SERVER_ERROR);

    private int code;

    private String message;

    private HttpStatus httpStatus;
}
