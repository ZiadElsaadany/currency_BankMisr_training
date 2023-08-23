package com.currency.currency.clients;


import com.currency.currency.exception.ApiRequestException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency" , url = "https://v6.exchangerate-api.com/v6/ecf10bab01b34bf0de9636e1")
public interface CurrencyClient {


    //all response
    @GetMapping("/latest/{currency}")
    ResponseEntity<Object> getExchangeRates(@PathVariable("currency") String currency )  throws ApiRequestException;


    @GetMapping("/pair/{source}/{target}/{amount}")

    ResponseEntity<Object> convertFromSourceToTarget(
            @PathVariable("source") String source,
            @PathVariable("target") String target,
            @PathVariable("amount") int amount)  throws ApiRequestException ;





}
