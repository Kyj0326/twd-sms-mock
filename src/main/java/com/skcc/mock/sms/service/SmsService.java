package com.skcc.mock.sms.service;

import com.skcc.mock.sms.vo.SmsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;

public interface SmsService {

    public ResponseEntity sendSms(SmsDto smsDto);

    public ResponseEntity badRequest(Errors errors);

}
