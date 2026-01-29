package com.example.payment_transaction_api.exception;

public class PaymentFailedException extends RuntimeException {
    private final String errorCode;

    public PaymentFailedException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
