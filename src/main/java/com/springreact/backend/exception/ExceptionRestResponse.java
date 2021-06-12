package com.springreact.backend.exception;

import lombok.Value;

/**
 * ExceptionRestResponse
 * <p>
 * Version 1.0
 * <p>
 * Date: 30-05-2021
 * <p>
 * Copyright By Thanh
 * <p>
 * Modification Logs:
 * DATE             AUTHOR              DESCRIPTION
 * -------------------------------------------------
 * 07-06-2021       ThanhBT11           Create
 */
@Value
public class ExceptionRestResponse {
    int code;
    String message;
}
