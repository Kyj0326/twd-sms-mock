package com.skcc.mock.sms.repository;

import com.skcc.mock.sms.vo.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsRepository extends JpaRepository<Sms, Integer> {
}
