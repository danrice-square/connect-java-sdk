/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates which high-level category of error has occurred during a request to the Connect API.
 */
public enum ErrorCategory {
  
  API_ERROR("API_ERROR"),
  
  AUTHENTICATION_ERROR("AUTHENTICATION_ERROR"),
  
  INVALID_REQUEST_ERROR("INVALID_REQUEST_ERROR"),
  
  RATE_LIMIT_ERROR("RATE_LIMIT_ERROR"),
  
  PAYMENT_METHOD_ERROR("PAYMENT_METHOD_ERROR"),
  
  REFUND_ERROR("REFUND_ERROR");

  private String value;

  ErrorCategory(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ErrorCategory fromValue(String text) {
    for (ErrorCategory b : ErrorCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

