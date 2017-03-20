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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.squareup.connect.models.Checkout;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the [CreateCheckout](#endpoint-createcheckout) endpoint.
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [CreateCheckout](#endpoint-createcheckout) endpoint.")

public class CreateCheckoutResponse {
  @JsonProperty("checkout")
  private Checkout checkout = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public CreateCheckoutResponse checkout(Checkout checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * The newly created checkout. If the same request was made with the same idempotency_key, this will be the checkout created with the idempotency_key.
   * @return checkout
  **/
  @ApiModelProperty(value = "The newly created checkout. If the same request was made with the same idempotency_key, this will be the checkout created with the idempotency_key.")
  public Checkout getCheckout() {
    return checkout;
  }

  public void setCheckout(Checkout checkout) {
    this.checkout = checkout;
  }

  public CreateCheckoutResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CreateCheckoutResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCheckoutResponse createCheckoutResponse = (CreateCheckoutResponse) o;
    return Objects.equals(this.checkout, createCheckoutResponse.checkout) &&
        Objects.equals(this.errors, createCheckoutResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkout, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCheckoutResponse {\n");
    
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

