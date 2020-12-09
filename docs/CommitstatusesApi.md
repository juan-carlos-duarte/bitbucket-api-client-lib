# CommitstatusesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet**](CommitstatusesApi.md#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet) | **GET** /repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut**](CommitstatusesApi.md#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut) | **PUT** /repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build/{key} | 
[**repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost**](CommitstatusesApi.md#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost) | **POST** /repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build | 
[**repositoriesWorkspaceRepoSlugCommitNodeStatusesGet**](CommitstatusesApi.md#repositoriesWorkspaceRepoSlugCommitNodeStatusesGet) | **GET** /repositories/{workspace}/{repo_slug}/commit/{node}/statuses | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet**](CommitstatusesApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 

<a name="repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet**
> Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet(key, node, repoSlug, workspace)



Returns the specified build status for a commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String key = "key_example"; // String | The build status' unique key
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Commitstatus result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet(key, node, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The build status&#x27; unique key |
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut**
> Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut(key, node, repoSlug, workspace, body)



Used to update the current status of a build status object on the specific commit.  This operation can also be used to change other properties of the build status:  * &#x60;state&#x60; * &#x60;name&#x60; * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;refname&#x60;  The &#x60;key&#x60; cannot be changed.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String key = "key_example"; // String | The build status' unique key
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Commitstatus body = new Commitstatus(); // Commitstatus | The updated build status object
try {
    Commitstatus result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut(key, node, repoSlug, workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The build status&#x27; unique key |
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**Commitstatus**](Commitstatus.md)| The updated build status object | [optional]

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost**
> Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost(node, repoSlug, workspace, body)



Creates a new build status against the specified commit.  If the specified key already exists, the existing status object will be overwritten.  Example:  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/my-workspace/my-repo/commit/e10dae226959c2194f2b07b077c07762d93821cf/statuses/build/           -X POST -u jdoe -H &#x27;Content-Type: application/json&#x27;           -d &#x27;{     \&quot;key\&quot;: \&quot;MY-BUILD\&quot;,     \&quot;state\&quot;: \&quot;SUCCESSFUL\&quot;,     \&quot;description\&quot;: \&quot;42 tests passed\&quot;,     \&quot;url\&quot;: \&quot;https://www.example.org/my-build-result\&quot;   }&#x27; &#x60;&#x60;&#x60;  When creating a new commit status, you can use a URI template for the URL. Templates are URLs that contain variable names that Bitbucket will evaluate at runtime whenever the URL is displayed anywhere similar to parameter substitution in [Bitbucket Connect](https://developer.atlassian.com/bitbucket/concepts/context-parameters.html). For example, one could use &#x60;https://foo.com/builds/{repository.full_name}&#x60; which Bitbucket will turn into &#x60;https://foo.com/builds/foo/bar&#x60; at render time. The context variables available are &#x60;repository&#x60; and &#x60;commit&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Commitstatus body = new Commitstatus(); // Commitstatus | The new commit status object.
try {
    Commitstatus result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost(node, repoSlug, workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**Commitstatus**](Commitstatus.md)| The new commit status object. | [optional]

### Return type

[**Commitstatus**](Commitstatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeStatusesGet"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeStatusesGet**
> PaginatedCommitstatuses repositoriesWorkspaceRepoSlugCommitNodeStatusesGet(node, repoSlug, workspace, q, sort)



Returns all statuses (e.g. build results) for a specific commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String | Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
String sort = "sort_example"; // String | Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to `created_on`. 
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeStatusesGet(node, repoSlug, workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesWorkspaceRepoSlugCommitNodeStatusesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **q** | **String**| Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).  | [optional]
 **sort** | **String**| Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to &#x60;created_on&#x60;.  | [optional]

### Return type

[**PaginatedCommitstatuses**](PaginatedCommitstatuses.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet**
> PaginatedCommitstatuses repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet(pullRequestId, repoSlug, workspace, q, sort)



Returns all statuses (e.g. build results) for the given pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitstatusesApi;

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

CommitstatusesApi apiInstance = new CommitstatusesApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String | Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
String sort = "sort_example"; // String | Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to `created_on`. 
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet(pullRequestId, repoSlug, workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitstatusesApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **q** | **String**| Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).  | [optional]
 **sort** | **String**| Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to &#x60;created_on&#x60;.  | [optional]

### Return type

[**PaginatedCommitstatuses**](PaginatedCommitstatuses.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

