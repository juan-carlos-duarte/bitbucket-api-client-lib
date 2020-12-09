# TeamsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsGet**](TeamsApi.md#teamsGet) | **GET** /teams | 
[**teamsUsernameFollowersGet**](TeamsApi.md#teamsUsernameFollowersGet) | **GET** /teams/{username}/followers | 
[**teamsUsernameFollowingGet**](TeamsApi.md#teamsUsernameFollowingGet) | **GET** /teams/{username}/following | 
[**teamsUsernameGet**](TeamsApi.md#teamsUsernameGet) | **GET** /teams/{username} | 
[**teamsUsernameHooksGet**](TeamsApi.md#teamsUsernameHooksGet) | **GET** /teams/{username}/hooks | 
[**teamsUsernameHooksPost**](TeamsApi.md#teamsUsernameHooksPost) | **POST** /teams/{username}/hooks | 
[**teamsUsernameHooksUidDelete**](TeamsApi.md#teamsUsernameHooksUidDelete) | **DELETE** /teams/{username}/hooks/{uid} | 
[**teamsUsernameHooksUidGet**](TeamsApi.md#teamsUsernameHooksUidGet) | **GET** /teams/{username}/hooks/{uid} | 
[**teamsUsernameHooksUidPut**](TeamsApi.md#teamsUsernameHooksUidPut) | **PUT** /teams/{username}/hooks/{uid} | 
[**teamsUsernameMembersGet**](TeamsApi.md#teamsUsernameMembersGet) | **GET** /teams/{username}/members | 
[**teamsWorkspaceRepositoriesGet**](TeamsApi.md#teamsWorkspaceRepositoriesGet) | **GET** /teams/{workspace}/repositories | 
[**usersWorkspaceRepositoriesGet**](TeamsApi.md#usersWorkspaceRepositoriesGet) | **GET** /users/{workspace}/repositories | 

<a name="teamsGet"></a>
# **teamsGet**
> PaginatedTeams teamsGet(role)



Returns all the teams that the authenticated user is associated with.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [this post](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String role = "role_example"; // String |  Filters the teams based on the authenticated user's role on each team.  * **member**: returns a list of all the teams which the caller is a member of   at least one team group or repository owned by the team * **contributor**: returns a list of teams which the caller has write access   to at least one repository owned by the team * **admin**: returns a list teams which the caller has team administrator access 
try {
    PaginatedTeams result = apiInstance.teamsGet(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**|  Filters the teams based on the authenticated user&#x27;s role on each team.  * **member**: returns a list of all the teams which the caller is a member of   at least one team group or repository owned by the team * **contributor**: returns a list of teams which the caller has write access   to at least one repository owned by the team * **admin**: returns a list teams which the caller has team administrator access  | [optional] [enum: admin, contributor, member]

### Return type

[**PaginatedTeams**](PaginatedTeams.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameFollowersGet"></a>
# **teamsUsernameFollowersGet**
> PaginatedUsers teamsUsernameFollowersGet(username)



Returns the list of accounts that are following this team.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | The team's username
try {
    PaginatedUsers result = apiInstance.teamsUsernameFollowersGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameFollowersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The team&#x27;s username |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameFollowingGet"></a>
# **teamsUsernameFollowingGet**
> PaginatedUsers teamsUsernameFollowingGet(username)



Returns the list of accounts this team is following.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | The team's username
try {
    PaginatedUsers result = apiInstance.teamsUsernameFollowingGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameFollowingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The team&#x27;s username |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameGet"></a>
# **teamsUsernameGet**
> Team teamsUsernameGet(username)



Gets the public information associated with a team.  If the team&#x27;s profile is private, &#x60;location&#x60;, &#x60;website&#x60; and &#x60;created_on&#x60; elements are omitted.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | The team's username or UUID.
try {
    Team result = apiInstance.teamsUsernameGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The team&#x27;s username or UUID. |

### Return type

[**Team**](Team.md)

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
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.teamsUsernameHooksGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameHooksGet");
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
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksPost(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameHooksPost");
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
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.teamsUsernameHooksUidDelete(username, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameHooksUidDelete");
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
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksUidGet(username, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameHooksUidGet");
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
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.teamsUsernameHooksUidPut(username, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameHooksUidPut");
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

<a name="teamsUsernameMembersGet"></a>
# **teamsUsernameMembersGet**
> User teamsUsernameMembersGet(username)



Returns all members of the specified team. Any member of any of the team&#x27;s groups is considered a member of the team. This includes users in groups that may not actually have access to any of the team&#x27;s repositories.  This operation has been deprecated due to privacy changes. See the [announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/) for details.  Use this [workspaces](https://developer.atlassian.com/bitbucket/api/2/reference/resource/workspaces/%7Bworkspace%7D/members) endpoint as a replacement.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    User result = apiInstance.teamsUsernameMembersGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsUsernameMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsWorkspaceRepositoriesGet"></a>
# **teamsWorkspaceRepositoriesGet**
> Error teamsWorkspaceRepositoriesGet(workspace)



All repositories in the given workspace. This includes any private repositories the calling user has access to.  The teams and users endpoints have been deprecated. Use the [/repositories/{workspace}](https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D)  endpoint in place of both of these endpoints. For more information, see the [deprecation announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.teamsWorkspaceRepositoriesGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#teamsWorkspaceRepositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersWorkspaceRepositoriesGet"></a>
# **usersWorkspaceRepositoriesGet**
> Error usersWorkspaceRepositoriesGet(workspace)



All repositories in the given workspace. This includes any private repositories the calling user has access to.  The teams and users endpoints have been deprecated. Use the [/repositories/{workspace}](https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D)  endpoint in place of both of these endpoints. For more information, see the [deprecation announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.TeamsApi;

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

TeamsApi apiInstance = new TeamsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.usersWorkspaceRepositoriesGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#usersWorkspaceRepositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

