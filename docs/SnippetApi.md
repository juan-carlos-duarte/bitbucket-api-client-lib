# SnippetApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snippetsWorkspaceEncodedIdFilesPathGet**](SnippetApi.md#snippetsWorkspaceEncodedIdFilesPathGet) | **GET** /snippets/{workspace}/{encoded_id}/files/{path} | 

<a name="snippetsWorkspaceEncodedIdFilesPathGet"></a>
# **snippetsWorkspaceEncodedIdFilesPathGet**
> snippetsWorkspaceEncodedIdFilesPathGet(encodedId, path, workspace)



Convenience resource for getting to a snippet&#x27;s raw files without the need for first having to retrieve the snippet itself and having to pull out the versioned file links.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetApi;

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

SnippetApi apiInstance = new SnippetApi();
String encodedId = "encodedId_example"; // String | 
String path = "path_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.snippetsWorkspaceEncodedIdFilesPathGet(encodedId, path, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetApi#snippetsWorkspaceEncodedIdFilesPathGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encodedId** | **String**|  |
 **path** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

