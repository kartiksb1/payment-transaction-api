package com.example.payment_transaction_api.service;


import com.example.payment_transaction_api.dto.PaymentRequest;
import com.example.payment_transaction_api.exception.InsufficientBalanceException;
import com.example.payment_transaction_api.exception.PaymentFailedException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	private static Logger logger=LoggerFactory.getLogger(PaymentService.class);
    public void makePayment(PaymentRequest request) {
        logger.info("Payment initiated: from={} to={} amount={}", 
                    request.getFromAccount(), request.getToAccount(), request.getAmount());

        // Simulate logic
        if (request.getAmount() > 1000) { // example: insufficient balance
            logger.error("Payment failed: insufficient balance for {}", request.getFromAccount());
            throw new InsufficientBalanceException("Insufficient balance", "INSUFFICIENT_BALANCE");
        }

        if (request.getToAccount().equalsIgnoreCase("fail")) { // example: forced failure
            logger.error("Payment failed: unknown reason for transaction from {} to {}",
                    request.getFromAccount(), request.getToAccount());
            throw new PaymentFailedException("Payment could not be processed", "PAYMENT_FAILED");
        }

        logger.info("Payment completed successfully for {} -> {}", request.getFromAccount(), request.getToAccount());
    }
}
