package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.CreateCustomerRequest;
import com.squareup.connect.models.CreateCustomerResponse;
import com.squareup.connect.models.DeleteCustomerResponse;
import com.squareup.connect.models.ListCustomersResponse;
import com.squareup.connect.models.RetrieveCustomerResponse;
import com.squareup.connect.models.UpdateCustomerRequest;
import com.squareup.connect.models.UpdateCustomerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerApi {
  private ApiClient apiClient;

  public CustomerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * CreateCustomer
   * Creates a new customer for a business, which can have associated cards on file.  You must provide __at least one__ of the following values in your request to this endpoint:  - &#x60;given_name&#x60; - &#x60;family_name&#x60; - &#x60;company_name&#x60; - &#x60;email_address&#x60; - &#x60;phone_number&#x60;  This endpoint does not accept an idempotency key. If you accidentally create a duplicate customer, you can delete it with the [DeleteCustomer](#endpoint-deletecustomer) endpoint.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CreateCustomerResponse
   * @throws ApiException if fails to make API call
   */
  public CreateCustomerResponse createCustomer(String authorization, CreateCustomerRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createCustomer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers";

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

    GenericType<CreateCustomerResponse> localVarReturnType = new GenericType<CreateCustomerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * DeleteCustomer
   * Deletes a customer from a business, along with any linked cards on file.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param customerId The ID of the customer to delete. (required)
   * @return DeleteCustomerResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteCustomerResponse deleteCustomer(String authorization, String customerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling deleteCustomer");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling deleteCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers/{customer_id}"
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

    GenericType<DeleteCustomerResponse> localVarReturnType = new GenericType<DeleteCustomerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * ListCustomers
   * Lists a business&#39;s customers.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param cursor A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information. (optional)
   * @return ListCustomersResponse
   * @throws ApiException if fails to make API call
   */
  public ListCustomersResponse listCustomers(String authorization, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling listCustomers");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

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

    GenericType<ListCustomersResponse> localVarReturnType = new GenericType<ListCustomersResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * RetrieveCustomer
   * Returns details for a single customer.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param customerId The ID of the customer to retrieve. (required)
   * @return RetrieveCustomerResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveCustomerResponse retrieveCustomer(String authorization, String customerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling retrieveCustomer");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling retrieveCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers/{customer_id}"
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

    GenericType<RetrieveCustomerResponse> localVarReturnType = new GenericType<RetrieveCustomerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * UpdateCustomer
   * Updates the details of an existing customer.  You cannot edit a customer&#39;s cards on file with this endpoint. To make changes to a card on file, you must delete the existing card on file with the [DeleteCustomerCard](#endpoint-deletecustomercard) endpoint, then create a new one with the [CreateCustomerCard](#endpoint-createcustomercard) endpoint.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param customerId The ID of the customer to update. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return UpdateCustomerResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateCustomerResponse updateCustomer(String authorization, String customerId, UpdateCustomerRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling updateCustomer");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling updateCustomer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/v2/customers/{customer_id}"
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

    GenericType<UpdateCustomerResponse> localVarReturnType = new GenericType<UpdateCustomerResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
