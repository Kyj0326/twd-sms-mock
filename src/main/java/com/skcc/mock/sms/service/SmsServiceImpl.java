package com.skcc.mock.sms.service;

import com.skcc.mock.sms.repository.SmsRepository;
import com.skcc.mock.sms.vo.IfStatus;
import com.skcc.mock.sms.vo.Sms;
import com.skcc.mock.sms.vo.SmsDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    SmsRepository smsRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ResponseEntity sendSms(SmsDto smsDto) {
        Sms sms = modelMapper.map(smsDto, Sms.class);
            sms.builder()
                    .ifStatus(IfStatus.WAITING)
                    .regDateTime(LocalDateTime.now())
                    .updDateTime(LocalDateTime.now())
                    .build();
        System.out.println(sms.getFromNumber());
        return null;
    }

    @Override
    public ResponseEntity badRequest(Errors errors) {
        return null;
    }
}
