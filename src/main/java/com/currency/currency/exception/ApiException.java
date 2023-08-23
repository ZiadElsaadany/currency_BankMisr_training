package com.currency.currency.exception;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@RequiredArgsConstructor
@Data
@Setter
@Getter
public class ApiException {



    private final String message ;

    private final HttpStatus httpStatus;

    private  final ZonedDateTime zonedDateTime ;


}
