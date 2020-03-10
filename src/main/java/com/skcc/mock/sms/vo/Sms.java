package com.skcc.mock.sms.vo;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
@Entity
public class Sms {

    @Id @GeneratedValue
    private Integer id;

    private String fromNumber;

    private String toNumber;

    private String contents;

    private LocalDateTime regDateTime;

    private LocalDateTime updDateTime;

    @Enumerated(EnumType.STRING)
    private IfStatus ifStatus = IfStatus.WAITING;



}
