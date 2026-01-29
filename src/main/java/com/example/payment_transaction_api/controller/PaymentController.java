package com.example.payment_transaction_api.controller;

import com.example.payment_transaction_api.dto.PaymentRequest;
import com.example.payment_transaction_api.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<String> processPayment(@Valid @RequestBody PaymentRequest request) {
        paymentService.makePayment(request);
        return ResponseEntity.ok("Payment successful");
    }
}
