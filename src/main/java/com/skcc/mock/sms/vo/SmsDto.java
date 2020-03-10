package com.skcc.mock.sms.vo;


import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data
public class SmsDto {

    @NotEmpty
    private String fromNumber;

//    @NotEmpty
//    private String toNumber;
//
//    @NotEmpty
//    private String contents;

}
