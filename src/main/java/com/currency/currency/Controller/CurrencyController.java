package com.currency.currency.Controller;

import com.currency.currency.Services.ICurrencyService;
import com.currency.currency.exception.ApiRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Currency")
@RequiredArgsConstructor
public class CurrencyController {

private  final ICurrencyService currencyService ;

    @GetMapping("/{countryCode}")
    public ResponseEntity<Object> getExchangeRates(@PathVariable("countryCode") String countryCode) throws ApiRequestException {
       try {
           return ResponseEntity.ok(currencyService.fetchExchangeRates(countryCode));
       }catch (Exception  e ) {
           throw new ApiRequestException("error");
       }
    }    @GetMapping("/{source}/{target}/{amount}")
    public ResponseEntity<Object> getExchangeRates(
            @PathVariable("source") String source,@PathVariable("target") String target ,@PathVariable("amount") int amount
    ) throws ApiRequestException {

          return ResponseEntity.ok(currencyService.convertFromSourceToTarget(source,target,amount));
    }




//
//    @GetMapping("/{}")
//    public











}
