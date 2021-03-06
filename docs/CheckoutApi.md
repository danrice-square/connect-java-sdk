# CheckoutApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCheckout**](CheckoutApi.md#createCheckout) | **POST** /v2/locations/{location_id}/checkouts | CreateCheckout


<a name="createCheckout"></a>
# **createCheckout**
> CreateCheckoutResponse createCheckout(authorization, locationId, body)

CreateCheckout

Creates a [Checkout](#type-checkout) response that links a &#x60;checkoutId&#x60; and &#x60;checkout_page_url&#x60; that customers can be directed to in order to provide their payment information using a payment processing workflow hosted on connect.squareup.com.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiException;
//import com.squareup.connect.api.CheckoutApi;


CheckoutApi apiInstance = new CheckoutApi();
String authorization = "authorization_example"; // String | The value to provide in the Authorization header of your request. This value should follow the format `Bearer YOUR_ACCESS_TOKEN_HERE`.
String locationId = "locationId_example"; // String | The ID of the business location to associate the checkout with.
CreateCheckoutRequest body = new CreateCheckoutRequest(); // CreateCheckoutRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateCheckoutResponse result = apiInstance.createCheckout(authorization, locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#createCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The value to provide in the Authorization header of your request. This value should follow the format &#x60;Bearer YOUR_ACCESS_TOKEN_HERE&#x60;. |
 **locationId** | **String**| The ID of the business location to associate the checkout with. |
 **body** | [**CreateCheckoutRequest**](CreateCheckoutRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateCheckoutResponse**](CreateCheckoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

