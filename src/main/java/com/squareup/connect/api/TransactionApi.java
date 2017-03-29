package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.CaptureTransactionResponse;
import com.squareup.connect.models.ChargeRequest;
import com.squareup.connect.models.ChargeResponse;
import com.squareup.connect.models.ListTransactionsResponse;
import com.squareup.connect.models.RetrieveTransactionResponse;
import com.squareup.connect.models.VoidTransactionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TransactionApi {
  private ApiClient apiClient;

  public TransactionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * CaptureTransaction
   * Captures a transaction that was created with the [Charge](#endpoint-charge) endpoint with a &#x60;delay_capture&#x60; value of &#x60;true&#x60;.  See [Delayed capture transactions](/articles/delayed-capture-transactions/) for more information.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param locationId  (required)
   * @param transactionId  (required)
   * @return CaptureTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public CaptureTransactionResponse captureTransaction(String authorization, String locationId, String transactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling captureTransaction");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling captureTransaction");
    }
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling captureTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/transactions/{transaction_id}/capture"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "transaction_id" + "\\}", apiClient.escapeString(transactionId.toString()));

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

    GenericType<CaptureTransactionResponse> localVarReturnType = new GenericType<CaptureTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Charge
   * Charges a card represented by a card nonce or a customer&#39;s card on file.  Your request to this endpoint must include _either_:  - A value for the &#x60;card_nonce&#x60; parameter (to charge a card nonce generated with the &#x60;SqPaymentForm&#x60;) - Values for the &#x60;customer_card_id&#x60; and &#x60;customer_id&#x60; parameters (to charge a customer&#39;s card on file)  In order for an e-commerce payment to potentially qualify for [Square chargeback protection](https://squareup.com/help/article/5394), you _must_ provide values for the following parameters in your request:  - &#x60;buyer_email_address&#x60; - At least one of &#x60;billing_address&#x60; or &#x60;shipping_address&#x60;  When this response is returned, the amount of Square&#39;s processing fee might not yet be calculated. To obtain the processing fee, wait about ten seconds and call [RetrieveTransaction](#endpoint-retrievetransaction). See the &#x60;processing_fee_money&#x60; field of each [Tender included](#type-tender) in the transaction.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param locationId The ID of the location to associate the created transaction with. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return ChargeResponse
   * @throws ApiException if fails to make API call
   */
  public ChargeResponse charge(String authorization, String locationId, ChargeRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling charge");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling charge");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling charge");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/transactions"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

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

    GenericType<ChargeResponse> localVarReturnType = new GenericType<ChargeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * ListTransactions
   * Lists transactions for a particular location.  Max results per [page](#paginatingresults): 50
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param locationId The ID of the location to list transactions for. (required)
   * @param beginTime The beginning of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time minus one year. (optional)
   * @param endTime The end of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time. (optional)
   * @param sortOrder The order in which results are listed in the response (&#x60;ASC&#x60; for oldest first, &#x60;DESC&#x60; for newest first).  Default value: &#x60;DESC&#x60; (optional)
   * @param cursor A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Paginating results](#paginatingresults) for more information. (optional)
   * @return ListTransactionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListTransactionsResponse listTransactions(String authorization, String locationId, String beginTime, String endTime, String sortOrder, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling listTransactions");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/transactions"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "begin_time", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_order", sortOrder));
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

    GenericType<ListTransactionsResponse> localVarReturnType = new GenericType<ListTransactionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * RetrieveTransaction
   * Retrieves details for a single transaction.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param locationId The ID of the transaction&#39;s associated location. (required)
   * @param transactionId The ID of the transaction to retrieve. (required)
   * @return RetrieveTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveTransactionResponse retrieveTransaction(String authorization, String locationId, String transactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling retrieveTransaction");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveTransaction");
    }
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling retrieveTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/transactions/{transaction_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "transaction_id" + "\\}", apiClient.escapeString(transactionId.toString()));

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

    GenericType<RetrieveTransactionResponse> localVarReturnType = new GenericType<RetrieveTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * VoidTransaction
   * Cancels a transaction that was created with the [Charge](#endpoint-charge) endpoint with a &#x60;delay_capture&#x60; value of &#x60;true&#x60;.  See [Delayed capture transactions](/articles/delayed-capture-transactions/) for more information.
   * @param authorization The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. (required)
   * @param locationId  (required)
   * @param transactionId  (required)
   * @return VoidTransactionResponse
   * @throws ApiException if fails to make API call
   */
  public VoidTransactionResponse voidTransaction(String authorization, String locationId, String transactionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling voidTransaction");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling voidTransaction");
    }
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling voidTransaction");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/transactions/{transaction_id}/void"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "transaction_id" + "\\}", apiClient.escapeString(transactionId.toString()));

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

    GenericType<VoidTransactionResponse> localVarReturnType = new GenericType<VoidTransactionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
