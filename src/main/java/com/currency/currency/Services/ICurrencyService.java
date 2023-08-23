package com.currency.currency.Services;


import com.currency.currency.exception.ApiRequestException;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

public interface ICurrencyService {
    public ResponseEntity<Object> fetchExchangeRates(String currency) throws ApiRequestException;
    public ResponseEntity<Object> convertFromSourceToTarget(String source, String target , int amount) throws ApiRequestException;

    // source      target

    // return value--> target
//    public ResponseEntity<Object> convertCurrency(String sourceCode, String targetCode  );
//
    //
}
