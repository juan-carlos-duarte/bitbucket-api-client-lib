# WebhooksApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hookEventsGet**](WebhooksApi.md#hookEventsGet) | **GET** /hook_events | 
[**hookEventsSubjectTypeGet**](WebhooksApi.md#hookEventsSubjectTypeGet) | **GET** /hook_events/{subject_type} | 
[**repositoriesWorkspaceRepoSlugHooksGet**](WebhooksApi.md#repositoriesWorkspaceRepoSlugHooksGet) | **GET** /repositories/{workspace}/{repo_slug}/hooks | 
[**repositoriesWorkspaceRepoSlugHooksPost**](WebhooksApi.md#repositoriesWorkspaceRepoSlugHooksPost) | **POST** /repositories/{workspace}/{repo_slug}/hooks | 
[**repositoriesWorkspaceRepoSlugHooksUidDelete**](WebhooksApi.md#repositoriesWorkspaceRepoSlugHooksUidDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/hooks/{uid} | 
[**repositoriesWorkspaceRepoSlugHooksUidGet**](WebhooksApi.md#repositoriesWorkspaceRepoSlugHooksUidGet) | **GET** /repositories/{workspace}/{repo_slug}/hooks/{uid} | 
[**repositoriesWorkspaceRepoSlugHooksUidPut**](WebhooksApi.md#repositoriesWorkspaceRepoSlugHooksUidPut) | **PUT** /repositories/{workspace}/{repo_slug}/hooks/{uid} | 
[**teamsUsernameHooksGet**](WebhooksApi.md#teamsUsernameHooksGet) | **GET** /teams/{username}/hooks | 
[**teamsUsernameHooksPost**](WebhooksApi.md#teamsUsernameHooksPost) | **POST** /teams/{username}/hooks | 
[**teamsUsernameHooksUidDelete**](WebhooksApi.md#teamsUsernameHooksUidDelete) | **DELETE** /teams/{username}/hooks/{uid} | 
[**teamsUsernameHooksUidGet**](WebhooksApi.md#teamsUsernameHooksUidGet) | **GET** /teams/{username}/hooks/{uid} | 
[**teamsUsernameHooksUidPut**](WebhooksApi.md#teamsUsernameHooksUidPut) | **PUT** /teams/{username}/hooks/{uid} | 
[**usersSelectedUserHooksGet**](WebhooksApi.md#usersSelectedUserHooksGet) | **GET** /users/{selected_user}/hooks | 
[**usersSelectedUserHooksPost**](WebhooksApi.md#usersSelectedUserHooksPost) | **POST** /users/{selected_user}/hooks | 
[**usersSelectedUserHooksUidDelete**](WebhooksApi.md#usersSelectedUserHooksUidDelete) | **DELETE** /users/{selected_user}/hooks/{uid} | 
[**usersSelectedUserHooksUidGet**](WebhooksApi.md#usersSelectedUserHooksUidGet) | **GET** /users/{selected_user}/hooks/{uid} | 
[**usersSelectedUserHooksUidPut**](WebhooksApi.md#usersSelectedUserHooksUidPut) | **PUT** /users/{selected_user}/hooks/{uid} | 
[**workspacesWorkspaceHooksGet**](WebhooksApi.md#workspacesWorkspaceHooksGet) | **GET** /workspaces/{workspace}/hooks | 
[**workspacesWorkspaceHooksPost**](WebhooksApi.md#workspacesWorkspaceHooksPost) | **POST** /workspaces/{workspace}/hooks | 
[**workspacesWorkspaceHooksUidDelete**](WebhooksApi.md#workspacesWorkspaceHooksUidDelete) | **DELETE** /workspaces/{workspace}/hooks/{uid} | 
[**workspacesWorkspaceHooksUidGet**](WebhooksApi.md#workspacesWorkspaceHooksUidGet) | **GET** /workspaces/{workspace}/hooks/{uid} | 
[**workspacesWorkspaceHooksUidPut**](WebhooksApi.md#workspacesWorkspaceHooksUidPut) | **PUT** /workspaces/{workspace}/hooks/{uid} | 

<a name="hookEventsGet"></a>
# **hookEventsGet**
> SubjectTypes hookEventsGet()



Returns the webhook resource or subject types on which webhooks can be registered.  Each resource/subject type contains an &#x60;events&#x60; link that returns the paginated list of specific events each individual subject type can emit.  This endpoint is publicly accessible and does not require authentication or scopes.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/hook_events  {     \&quot;repository\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/repository\&quot;             }         }     },     \&quot;team\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/team\&quot;             }         }     },     \&quot;user\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/user\&quot;             }         }     } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
try {
    SubjectTypes result = apiInstance.hookEventsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hookEventsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SubjectTypes**](SubjectTypes.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hookEventsSubjectTypeGet"></a>
# **hookEventsSubjectTypeGet**
> PaginatedHookEvents hookEventsSubjectTypeGet(subjectType)



Returns a paginated list of all valid webhook events for the specified entity.  This is public data that does not require any scopes or authentication.  Example:  NOTE: The following example is a truncated response object for the &#x60;team&#x60; &#x60;subject_type&#x60;. We return the same structure for the other &#x60;subject_type&#x60; objects.  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/hook_events/team {     \&quot;page\&quot;: 1,     \&quot;pagelen\&quot;: 30,     \&quot;size\&quot;: 21,     \&quot;values\&quot;: [         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository push occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:push\&quot;,             \&quot;label\&quot;: \&quot;Push\&quot;         },         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository fork occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:fork\&quot;,             \&quot;label\&quot;: \&quot;Fork\&quot;         },         ...         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository import occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:imported\&quot;,             \&quot;label\&quot;: \&quot;Import\&quot;         }     ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String subjectType = "subjectType_example"; // String | A resource or subject type.
try {
    PaginatedHookEvents result = apiInstance.hookEventsSubjectTypeGet(subjectType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#hookEventsSubjectTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectType** | **String**| A resource or subject type. | [enum: workspace, user, repository, team]

### Return type

[**PaginatedHookEvents**](PaginatedHookEvents.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugHooksGet"></a>
# **repositoriesWorkspaceRepoSlugHooksGet**
> PaginatedWebhookSubscriptions repositoriesWorkspaceRepoSlugHooksGet(repoSlug, workspace)



Returns a paginated list of webhooks installed on this repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.repositoriesWorkspaceRepoSlugHooksGet(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#repositoriesWorkspaceRepoSlugHooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedWebhookSubscriptions**](PaginatedWebhookSubscriptions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugHooksPost"></a>
# **repositoriesWorkspaceRepoSlugHooksPost**
> WebhookSubscription repositoriesWorkspaceRepoSlugHooksPost(repoSlug, workspace)



Creates a new webhook on the specified repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  Example:  &#x60;&#x60;&#x60; $ curl -X POST -u credentials -H &#x27;Content-Type: application/json&#x27;           https://api.bitbucket.org/2.0/repositories/username/slug/hooks           -d &#x27;     {       \&quot;description\&quot;: \&quot;Webhook Description\&quot;,       \&quot;url\&quot;: \&quot;https://example.com/\&quot;,       \&quot;active\&quot;: true,       \&quot;events\&quot;: [         \&quot;repo:push\&quot;,         \&quot;issue:created\&quot;,         \&quot;issue:updated\&quot;       ]     }&#x27; &#x60;&#x60;&#x60;  Note that this call requires the webhook scope, as well as any scope that applies to the events that the webhook subscribes to. In the example above that means: &#x60;webhook&#x60;, &#x60;repository&#x60; and &#x60;issue&#x60;.  Also note that the &#x60;url&#x60; must properly resolve and cannot be an internal, non-routed address.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    WebhookSubscription result = apiInstance.repositoriesWorkspaceRepoSlugHooksPost(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#repositoriesWorkspaceRepoSlugHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugHooksUidDelete"></a>
# **repositoriesWorkspaceRepoSlugHooksUidDelete**
> repositoriesWorkspaceRepoSlugHooksUidDelete(repoSlug, workspace, uid)



Deletes the specified webhook subscription from the given repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.repositoriesWorkspaceRepoSlugHooksUidDelete(repoSlug, workspace, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#repositoriesWorkspaceRepoSlugHooksUidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugHooksUidGet"></a>
# **repositoriesWorkspaceRepoSlugHooksUidGet**
> WebhookSubscription repositoriesWorkspaceRepoSlugHooksUidGet(repoSlug, workspace, uid)



Returns the webhook with the specified id installed on the specified repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.repositoriesWorkspaceRepoSlugHooksUidGet(repoSlug, workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#repositoriesWorkspaceRepoSlugHooksUidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id. |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugHooksUidPut"></a>
# **repositoriesWorkspaceRepoSlugHooksUidPut**
> WebhookSubscription repositoriesWorkspaceRepoSlugHooksUidPut(repoSlug, workspace, uid)



Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.repositoriesWorkspaceRepoSlugHooksUidPut(repoSlug, workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#repositoriesWorkspaceRepoSlugHooksUidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameHooksGet"></a>
# **teamsUsernameHooksGet**
> PaginatedWebhookSubscriptions teamsUsernameHooksGet(username)



Returns a paginated list of webhooks installed on this team.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.teamsUsernameHooksGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#teamsUsernameHooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**PaginatedWebhookSubscriptions**](PaginatedWebhookSubscriptions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameHooksPost"></a>
# **teamsUsernameHooksPost**
> WebhookSubscription teamsUsernameHooksPost(username)



Creates a new webhook on the specified team.  Team webhooks are fired for events from all repositories belonging to that team account.  Note that only admins can install webhooks on teams.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksPost(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#teamsUsernameHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameHooksUidDelete"></a>
# **teamsUsernameHooksUidDelete**
> teamsUsernameHooksUidDelete(username, uid)



Deletes the specified webhook subscription from the given team account.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.teamsUsernameHooksUidDelete(username, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#teamsUsernameHooksUidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameHooksUidGet"></a>
# **teamsUsernameHooksUidGet**
> WebhookSubscription teamsUsernameHooksUidGet(username, uid)



Returns the webhook with the specified id installed on the given team account.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksUidGet(username, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#teamsUsernameHooksUidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **uid** | **String**| The installed webhook&#x27;s id. |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameHooksUidPut"></a>
# **teamsUsernameHooksUidPut**
> WebhookSubscription teamsUsernameHooksUidPut(username, uid)



Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksUidPut(username, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#teamsUsernameHooksUidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSelectedUserHooksGet"></a>
# **usersSelectedUserHooksGet**
> PaginatedWebhookSubscriptions usersSelectedUserHooksGet(selectedUser)



Returns a paginated list of webhooks installed on this user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.  Also note that the users endpoint has been deprecated, and the workspaces endpoint should be used instead. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String selectedUser = "selectedUser_example"; // String | This can either be the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`, OR an Atlassian Account ID. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.usersSelectedUserHooksGet(selectedUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#usersSelectedUserHooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.  |

### Return type

[**PaginatedWebhookSubscriptions**](PaginatedWebhookSubscriptions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSelectedUserHooksPost"></a>
# **usersSelectedUserHooksPost**
> WebhookSubscription usersSelectedUserHooksPost(selectedUser)



Creates a new webhook on the specified user account.  Account-level webhooks are fired for events from all repositories belonging to that account.  Note that one can only register webhooks on one&#x27;s own account, not that of others.  Also, note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.  The users endpoints have been deprecated, and the workspaces endpoint should be used instead. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String selectedUser = "selectedUser_example"; // String | This can either be the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`, OR an Atlassian Account ID. 
try {
    WebhookSubscription result = apiInstance.usersSelectedUserHooksPost(selectedUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#usersSelectedUserHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.  |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSelectedUserHooksUidDelete"></a>
# **usersSelectedUserHooksUidDelete**
> usersSelectedUserHooksUidDelete(selectedUser, uid)



Deletes the specified webhook subscription from the given user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String selectedUser = "selectedUser_example"; // String | This can either be the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`, OR an Atlassian Account ID. 
String uid = "uid_example"; // String | Installed webhook's ID
try {
    apiInstance.usersSelectedUserHooksUidDelete(selectedUser, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#usersSelectedUserHooksUidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.  |
 **uid** | **String**| Installed webhook&#x27;s ID |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSelectedUserHooksUidGet"></a>
# **usersSelectedUserHooksUidGet**
> WebhookSubscription usersSelectedUserHooksUidGet(selectedUser, uid)



Returns the webhook with the specified id installed on the given user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String selectedUser = "selectedUser_example"; // String | This can either be the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`, OR an Atlassian Account ID. 
String uid = "uid_example"; // String | Installed webhook's ID
try {
    WebhookSubscription result = apiInstance.usersSelectedUserHooksUidGet(selectedUser, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#usersSelectedUserHooksUidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.  |
 **uid** | **String**| Installed webhook&#x27;s ID |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSelectedUserHooksUidPut"></a>
# **usersSelectedUserHooksUidPut**
> WebhookSubscription usersSelectedUserHooksUidPut(selectedUser, uid)



Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String selectedUser = "selectedUser_example"; // String | This can either be the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`, OR an Atlassian Account ID. 
String uid = "uid_example"; // String | Installed webhook's ID
try {
    WebhookSubscription result = apiInstance.usersSelectedUserHooksUidPut(selectedUser, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#usersSelectedUserHooksUidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.  |
 **uid** | **String**| Installed webhook&#x27;s ID |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceHooksGet"></a>
# **workspacesWorkspaceHooksGet**
> PaginatedWebhookSubscriptions workspacesWorkspaceHooksGet(workspace)



Returns a paginated list of webhooks installed on this workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.workspacesWorkspaceHooksGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#workspacesWorkspaceHooksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedWebhookSubscriptions**](PaginatedWebhookSubscriptions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceHooksPost"></a>
# **workspacesWorkspaceHooksPost**
> WebhookSubscription workspacesWorkspaceHooksPost(workspace)



Creates a new webhook on the specified workspace.  Workspace webhooks are fired for events from all repositories contained by that workspace.  Note that only owners can install webhooks on workspaces.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksPost(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#workspacesWorkspaceHooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceHooksUidDelete"></a>
# **workspacesWorkspaceHooksUidDelete**
> workspacesWorkspaceHooksUidDelete(workspace, uid)



Deletes the specified webhook subscription from the given workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.workspacesWorkspaceHooksUidDelete(workspace, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#workspacesWorkspaceHooksUidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceHooksUidGet"></a>
# **workspacesWorkspaceHooksUidGet**
> WebhookSubscription workspacesWorkspaceHooksUidGet(workspace, uid)



Returns the webhook with the specified id installed on the given workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksUidGet(workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#workspacesWorkspaceHooksUidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id. |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceHooksUidPut"></a>
# **workspacesWorkspaceHooksUidPut**
> WebhookSubscription workspacesWorkspaceHooksUidPut(workspace, uid)



Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WebhooksApi;

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

WebhooksApi apiInstance = new WebhooksApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksUidPut(workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#workspacesWorkspaceHooksUidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **uid** | **String**| The installed webhook&#x27;s id |

### Return type

[**WebhookSubscription**](WebhookSubscription.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

