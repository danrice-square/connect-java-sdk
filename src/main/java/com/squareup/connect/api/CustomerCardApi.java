package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.CreateCustomerCardRequest;
import com.squareup.connect.models.CreateCustomerCardResponse;
import com.squareup.connect.models.DeleteCustomerCardResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerCardApi {
  private ApiClient apiClient;

  public CustomerCardApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerCardApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * CreateCustomerCard
   * Adds a card on file to an existing customer.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param customerId The ID of the customer to link the card on file to. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CreateCustomerCardResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCustomerCardResponse createCustomerCard(String authorization, String customerId, CreateCustomerCardRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createCustomerCard");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling createCustomerCard");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomerCard");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers/{customer_id}/cards"
      .replaceAll("\\{" + "customer_id" + "\\}", apiClient.escapeString(customerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CreateCustomerCardResponse> localVarReturnType = new GenericType<CreateCustomerCardResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * DeleteCustomerCard
   * Removes a card on file from a customer.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param customerId The ID of the customer that the card on file belongs to. (required)
   * @param cardId The ID of the card on file to delete. (required)
   * @return DeleteCustomerCardResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteCustomerCardResponse deleteCustomerCard(String authorization, String customerId, String cardId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling deleteCustomerCard");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling deleteCustomerCard");
    }
    
    // verify the required parameter 'cardId' is set
    if (cardId == null) {
      throw new ApiException(400, "Missing the required parameter 'cardId' when calling deleteCustomerCard");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers/{customer_id}/cards/{card_id}"
      .replaceAll("\\{" + "customer_id" + "\\}", apiClient.escapeString(customerId.toString()))
      .replaceAll("\\{" + "card_id" + "\\}", apiClient.escapeString(cardId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DeleteCustomerCardResponse> localVarReturnType = new GenericType<DeleteCustomerCardResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
