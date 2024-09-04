package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Payment;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class DemoController {
    @GetMapping("/payments")
    public List<Payment> getPayments(@RequestHeader Map<String, String> RequestHeader) {
        log.info("request payment {}", RequestHeader);
        return Arrays.asList(
                new Payment(1L, "book", 1234.00,LocalDate.now()),
                new Payment(2L, "cars", 1224.00,LocalDate.now()),
                new Payment(3L, "disk", 1244.00,LocalDate.now()));
    }
}
 