# Payment Transaction API

## Overview

This project implements a **Payment Transaction REST API**.  
It simulates a basic payment system, demonstrating:

- Custom exceptions
- Global exception handling with meaningful JSON responses
- Logging with **rolling files**
- **Async logging** for non-blocking performance

---

## Features

- `POST /payments` endpoint to process payments
- **Validations** for request data (non-empty accounts, positive amounts)
- **Custom exceptions**:
  - `PaymentFailedException`
  - `InsufficientBalanceException`
- **Global exception handler** returning JSON:
  ```json
  {
    "timestamp": "2026-01-30T15:12:34",
    "error": "Insufficient balance",
    "errorCode": "INSUFFICIENT_BALANCE"
  }
