package com.example.payment_transaction_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PaymentRequest {

    @NotBlank(message = "From account cannot be blank")
    private String fromAccount;

    @NotBlank(message = "To account cannot be blank")
    private String toAccount;

    @NotNull(message = "Amount is required")
    @Min(value = 1, message = "Amount must be positive")
    private Double amount;

    // Getters & Setters
    public String getFromAccount() { return fromAccount; }
    public void setFromAccount(String fromAccount) { this.fromAccount = fromAccount; }
    public String getToAccount() { return toAccount; }
    public void setToAccount(String toAccount) { this.toAccount = toAccount; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
