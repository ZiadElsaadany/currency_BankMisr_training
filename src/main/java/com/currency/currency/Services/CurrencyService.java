package com.currency.currency.Services;

import com.currency.currency.clients.CurrencyClient;
import com.currency.currency.exception.ApiRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


@RequiredArgsConstructor
@Service
public class CurrencyService implements ICurrencyService {



    private   final CurrencyClient currencyClient;



    public ResponseEntity<Object> fetchExchangeRates(String currency) throws  ApiRequestException {
        return currencyClient.getExchangeRates(currency);
    }

    @Override
    public ResponseEntity<Object> convertFromSourceToTarget(String source, String target, int amount) throws ApiRequestException {
        return currencyClient.convertFromSourceToTarget(source, target,amount);
    }


//    @Override
//    public ResponseEntity<Object> convertCurrency(String sourceCode, String targetCode) {
//
//
//
//
//
//
//
//
//    }


}
