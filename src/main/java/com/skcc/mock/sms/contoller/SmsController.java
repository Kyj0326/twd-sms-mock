package com.skcc.mock.sms.contoller;

import com.skcc.mock.sms.service.SmsService;
import com.skcc.mock.sms.vo.SmsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/api/sms", produces = MediaTypes.HAL_JSON_VALUE)
public class SmsController {

    @Autowired
    SmsService smsService;

    @PostMapping
    public ResponseEntity sendSms(@RequestBody @Valid SmsDto smsDto, Errors errors){

        if( errors.hasErrors() ) {
                smsService.badRequest(errors);
        }

        return smsService.sendSms(smsDto);
    }

}
