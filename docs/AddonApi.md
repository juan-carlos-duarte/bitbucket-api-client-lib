# AddonApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonDelete**](AddonApi.md#addonDelete) | **DELETE** /addon | 
[**addonLinkersGet**](AddonApi.md#addonLinkersGet) | **GET** /addon/linkers | 
[**addonLinkersLinkerKeyGet**](AddonApi.md#addonLinkersLinkerKeyGet) | **GET** /addon/linkers/{linker_key} | 
[**addonLinkersLinkerKeyValuesDelete**](AddonApi.md#addonLinkersLinkerKeyValuesDelete) | **DELETE** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesGet**](AddonApi.md#addonLinkersLinkerKeyValuesGet) | **GET** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesPost**](AddonApi.md#addonLinkersLinkerKeyValuesPost) | **POST** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesPut**](AddonApi.md#addonLinkersLinkerKeyValuesPut) | **PUT** /addon/linkers/{linker_key}/values | 
[**addonLinkersLinkerKeyValuesValueIdDelete**](AddonApi.md#addonLinkersLinkerKeyValuesValueIdDelete) | **DELETE** /addon/linkers/{linker_key}/values/{value_id} | 
[**addonLinkersLinkerKeyValuesValueIdGet**](AddonApi.md#addonLinkersLinkerKeyValuesValueIdGet) | **GET** /addon/linkers/{linker_key}/values/{value_id} | 
[**addonPut**](AddonApi.md#addonPut) | **PUT** /addon | 

<a name="addonDelete"></a>
# **addonDelete**
> addonDelete()



Deletes the application for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  &#x60;&#x60;&#x60; $ curl -X DELETE https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
try {
    apiInstance.addonDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersGet"></a>
# **addonLinkersGet**
> addonLinkersGet()



Gets a list of all [linkers](/cloud/bitbucket/modules/linker/) for the authenticated application.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
try {
    apiInstance.addonLinkersGet();
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyGet"></a>
# **addonLinkersLinkerKeyGet**
> addonLinkersLinkerKeyGet(linkerKey)



Gets a [linker](/cloud/bitbucket/modules/linker/) specified by &#x60;linker_key&#x60; for the authenticated application.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
try {
    apiInstance.addonLinkersLinkerKeyGet(linkerKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesDelete"></a>
# **addonLinkersLinkerKeyValuesDelete**
> addonLinkersLinkerKeyValuesDelete(linkerKey)



Delete all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
try {
    apiInstance.addonLinkersLinkerKeyValuesDelete(linkerKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesGet"></a>
# **addonLinkersLinkerKeyValuesGet**
> addonLinkersLinkerKeyValuesGet(linkerKey)



Gets a list of all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
try {
    apiInstance.addonLinkersLinkerKeyValuesGet(linkerKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesPost"></a>
# **addonLinkersLinkerKeyValuesPost**
> addonLinkersLinkerKeyValuesPost(linkerKey)



Creates a [linker](/cloud/bitbucket/modules/linker/) value for the specified linker of authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
try {
    apiInstance.addonLinkersLinkerKeyValuesPost(linkerKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesPut"></a>
# **addonLinkersLinkerKeyValuesPut**
> addonLinkersLinkerKeyValuesPut(linkerKey)



Bulk update [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
try {
    apiInstance.addonLinkersLinkerKeyValuesPut(linkerKey);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesValueIdDelete"></a>
# **addonLinkersLinkerKeyValuesValueIdDelete**
> addonLinkersLinkerKeyValuesValueIdDelete(linkerKey, valueId)



Delete a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
Integer valueId = 56; // Integer | The numeric ID of the linker value.
try {
    apiInstance.addonLinkersLinkerKeyValuesValueIdDelete(linkerKey, valueId);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesValueIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |
 **valueId** | **Integer**| The numeric ID of the linker value. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonLinkersLinkerKeyValuesValueIdGet"></a>
# **addonLinkersLinkerKeyValuesValueIdGet**
> addonLinkersLinkerKeyValuesValueIdGet(linkerKey, valueId)



Get a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
String linkerKey = "linkerKey_example"; // String | The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
Integer valueId = 56; // Integer | The numeric ID of the linker value.
try {
    apiInstance.addonLinkersLinkerKeyValuesValueIdGet(linkerKey, valueId);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonLinkersLinkerKeyValuesValueIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkerKey** | **String**| The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor. |
 **valueId** | **Integer**| The numeric ID of the linker value. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPut"></a>
# **addonPut**
> addonPut()



Updates the application installation for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  A new, valid descriptor must be provided in the body of the PUT request.  &#x60;&#x60;&#x60; $ curl -X PUT https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; \\   --header \&quot;Content-Type: application/json\&quot; \\   --data &#x27;{\&quot;descriptor\&quot;: $NEW_DESCRIPTOR}&#x27; &#x60;&#x60;&#x60;  Note that the scopes of the application cannot be increased in the new descriptor nor reduced to none.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.AddonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");
// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AddonApi apiInstance = new AddonApi();
try {
    apiInstance.addonPut();
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addonPut");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

