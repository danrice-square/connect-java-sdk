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


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.CreateRefundRequest;
import com.squareup.connect.models.CreateRefundResponse;
import com.squareup.connect.models.ListRefundsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefundApi
 */
@Ignore
public class RefundApiTest {

    private final RefundApi api = new RefundApi();

    
    /**
     * CreateRefund
     *
     * Initiates a refund for a previously charged tender.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRefundTest() throws ApiException {
        String authorization = null;
        String locationId = null;
        String transactionId = null;
        CreateRefundRequest body = null;
        CreateRefundResponse response = api.createRefund(authorization, locationId, transactionId, body);

        // TODO: test validations
    }
    
    /**
     * ListRefunds
     *
     * Lists refunds for one of a business&#39;s locations.  Refunds with a &#x60;status&#x60; of &#x60;PENDING&#x60; are not currently included in this endpoint&#39;s response.  Max results per [page](#paginatingresults): 50
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRefundsTest() throws ApiException {
        String authorization = null;
        String locationId = null;
        String beginTime = null;
        String endTime = null;
        String sortOrder = null;
        String cursor = null;
        ListRefundsResponse response = api.listRefunds(authorization, locationId, beginTime, endTime, sortOrder, cursor);

        // TODO: test validations
    }
    
}
