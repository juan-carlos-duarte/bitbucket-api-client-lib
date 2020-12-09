# WorkspacesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userPermissionsWorkspacesGet**](WorkspacesApi.md#userPermissionsWorkspacesGet) | **GET** /user/permissions/workspaces | 
[**workspacesGet**](WorkspacesApi.md#workspacesGet) | **GET** /workspaces | 
[**workspacesWorkspaceGet**](WorkspacesApi.md#workspacesWorkspaceGet) | **GET** /workspaces/{workspace} | 
[**workspacesWorkspaceHooksGet**](WorkspacesApi.md#workspacesWorkspaceHooksGet) | **GET** /workspaces/{workspace}/hooks | 
[**workspacesWorkspaceHooksPost**](WorkspacesApi.md#workspacesWorkspaceHooksPost) | **POST** /workspaces/{workspace}/hooks | 
[**workspacesWorkspaceHooksUidDelete**](WorkspacesApi.md#workspacesWorkspaceHooksUidDelete) | **DELETE** /workspaces/{workspace}/hooks/{uid} | 
[**workspacesWorkspaceHooksUidGet**](WorkspacesApi.md#workspacesWorkspaceHooksUidGet) | **GET** /workspaces/{workspace}/hooks/{uid} | 
[**workspacesWorkspaceHooksUidPut**](WorkspacesApi.md#workspacesWorkspaceHooksUidPut) | **PUT** /workspaces/{workspace}/hooks/{uid} | 
[**workspacesWorkspaceMembersGet**](WorkspacesApi.md#workspacesWorkspaceMembersGet) | **GET** /workspaces/{workspace}/members | 
[**workspacesWorkspaceMembersMemberGet**](WorkspacesApi.md#workspacesWorkspaceMembersMemberGet) | **GET** /workspaces/{workspace}/members/{member} | 
[**workspacesWorkspacePermissionsGet**](WorkspacesApi.md#workspacesWorkspacePermissionsGet) | **GET** /workspaces/{workspace}/permissions | 
[**workspacesWorkspaceProjectsGet**](WorkspacesApi.md#workspacesWorkspaceProjectsGet) | **GET** /workspaces/{workspace}/projects | 
[**workspacesWorkspaceProjectsProjectKeyGet**](WorkspacesApi.md#workspacesWorkspaceProjectsProjectKeyGet) | **GET** /workspaces/{workspace}/projects/{project_key} | 

<a name="userPermissionsWorkspacesGet"></a>
# **userPermissionsWorkspacesGet**
> PaginatedWorkspaceMemberships userPermissionsWorkspacesGet(q, sort)



Returns an object for each workspace the caller is a member of, and their effective role - the highest level of privilege the caller has. If a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;owner&#x60; * &#x60;collaborator&#x60; * &#x60;member&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/user/permissions/workspaces  {   \&quot;pagelen\&quot;: 10,   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;workspace_membership\&quot;,       \&quot;permission\&quot;: \&quot;owner\&quot;,       \&quot;last_accessed\&quot;: \&quot;2019-03-07T12:35:02.900024+00:00\&quot;,       \&quot;added_on\&quot;: \&quot;2018-10-11T17:42:02.961424+00:00\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;uuid\&quot;: \&quot;{470c176d-3574-44ea-bb41-89e8638bcca4}\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,       },       \&quot;workspace\&quot;: {         \&quot;type\&quot;: \&quot;workspace\&quot;,         \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,         \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,         \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,       }     }   ] } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by workspace or permission by adding the following query string parameters:  * &#x60;q&#x3D;workspace.slug&#x3D;\&quot;bbworkspace1\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;owner\&quot;&#x60; * &#x60;sort&#x3D;workspace.slug&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String q = "q_example"; // String |  Query string to narrow down the response. See [filtering and sorting](../../../meta/filtering) for details.
String sort = "sort_example"; // String |  Name of a response property to sort results. See [filtering and sorting](../../../meta/filtering#query-sort) for details. 
try {
    PaginatedWorkspaceMemberships result = apiInstance.userPermissionsWorkspacesGet(q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#userPermissionsWorkspacesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  Query string to narrow down the response. See [filtering and sorting](../../../meta/filtering) for details. | [optional]
 **sort** | **String**|  Name of a response property to sort results. See [filtering and sorting](../../../meta/filtering#query-sort) for details.  | [optional]

### Return type

[**PaginatedWorkspaceMemberships**](PaginatedWorkspaceMemberships.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesGet"></a>
# **workspacesGet**
> PaginatedWorkspaces workspacesGet(role, q, sort)



Returns a list of workspaces accessible by the authenticated user.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces  {   \&quot;pagelen\&quot;: 10,   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1,   \&quot;values\&quot;: [     {         \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,         \&quot;links\&quot;: {             \&quot;owners\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/members?q&#x3D;permission%3D%22owner%22\&quot;             },             \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1\&quot;             },             \&quot;repositories\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bbworkspace1\&quot;             },             \&quot;snippets\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/bbworkspace1\&quot;             },             \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/bbworkspace1/\&quot;             },             \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/workspaces/bbworkspace1/avatar/?ts&#x3D;1543465801\&quot;             },             \&quot;members\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/members\&quot;             },             \&quot;projects\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/projects\&quot;             }         },         \&quot;created_on\&quot;: \&quot;2018-11-14T19:15:05.058566+00:00\&quot;,         \&quot;type\&quot;: \&quot;workspace\&quot;,         \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,         \&quot;is_private\&quot;: true,         \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;     }   ] } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../meta/filtering) by workspace or permission by adding the following query string parameters:  * &#x60;q&#x3D;slug&#x3D;\&quot;bbworkspace1\&quot;&#x60; or &#x60;q&#x3D;is_private&#x3D;true&#x60; * &#x60;sort&#x3D;created_on&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String role = "role_example"; // String |              Filters the workspaces based on the authenticated user's role on each workspace.              * **member**: returns a list of all the workspaces which the caller is a member of                 at least one workspace group or repository             * **collaborator**: returns a list of workspaces which the caller has write access                 to at least one repository in the workspace             * **owner**: returns a list of workspaces which the caller has administrator access             
String q = "q_example"; // String |  Query string to narrow down the response. See [filtering and sorting](../meta/filtering) for details.
String sort = "sort_example"; // String |  Name of a response property to sort results. See [filtering and sorting](../meta/filtering#query-sort) for details. 
try {
    PaginatedWorkspaces result = apiInstance.workspacesGet(role, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**|              Filters the workspaces based on the authenticated user&#x27;s role on each workspace.              * **member**: returns a list of all the workspaces which the caller is a member of                 at least one workspace group or repository             * **collaborator**: returns a list of workspaces which the caller has write access                 to at least one repository in the workspace             * **owner**: returns a list of workspaces which the caller has administrator access              | [optional] [enum: owner, collaborator, member]
 **q** | **String**|  Query string to narrow down the response. See [filtering and sorting](../meta/filtering) for details. | [optional]
 **sort** | **String**|  Name of a response property to sort results. See [filtering and sorting](../meta/filtering#query-sort) for details.  | [optional]

### Return type

[**PaginatedWorkspaces**](PaginatedWorkspaces.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceGet"></a>
# **workspacesWorkspaceGet**
> Workspace workspacesWorkspaceGet(workspace)



Returns the requested workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Workspace result = apiInstance.workspacesWorkspaceGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Workspace**](Workspace.md)

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
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedWebhookSubscriptions result = apiInstance.workspacesWorkspaceHooksGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceHooksGet");
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
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksPost(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceHooksPost");
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
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    apiInstance.workspacesWorkspaceHooksUidDelete(workspace, uid);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceHooksUidDelete");
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
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id.
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksUidGet(workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceHooksUidGet");
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
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String uid = "uid_example"; // String | The installed webhook's id
try {
    WebhookSubscription result = apiInstance.workspacesWorkspaceHooksUidPut(workspace, uid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceHooksUidPut");
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

<a name="workspacesWorkspaceMembersGet"></a>
# **workspacesWorkspaceMembersGet**
> PaginatedWorkspaceMemberships workspacesWorkspaceMembersGet(workspace)



Returns all members of the requested workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedWorkspaceMemberships result = apiInstance.workspacesWorkspaceMembersGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceMembersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedWorkspaceMemberships**](PaginatedWorkspaceMemberships.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceMembersMemberGet"></a>
# **workspacesWorkspaceMembersMemberGet**
> WorkspaceMembership workspacesWorkspaceMembersMemberGet(member, workspace)



Returns the workspace membership, which includes a &#x60;User&#x60; object for the member and a &#x60;Workspace&#x60; object for the requested workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String member = "member_example"; // String | Member's UUID or Atlassian ID.
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    WorkspaceMembership result = apiInstance.workspacesWorkspaceMembersMemberGet(member, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceMembersMemberGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **member** | **String**| Member&#x27;s UUID or Atlassian ID. |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**WorkspaceMembership**](WorkspaceMembership.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspacePermissionsGet"></a>
# **workspacesWorkspacePermissionsGet**
> PaginatedWorkspaceMemberships workspacesWorkspacePermissionsGet(workspace, q)



Returns the list of members in a workspace and their permission levels. Permission can be: * &#x60;owner&#x60; * &#x60;collaborator&#x60; * &#x60;member&#x60;  Example:  &#x60;&#x60;&#x60; $ curl -X https://api.bitbucket.org/2.0/workspaces/bbworkspace1/permissions  {     \&quot;pagelen\&quot;: 10,     \&quot;values\&quot;: [         {             \&quot;permission\&quot;: \&quot;owner\&quot;,             \&quot;type\&quot;: \&quot;workspace_membership\&quot;,             \&quot;user\&quot;: {                 \&quot;type\&quot;: \&quot;user\&quot;,                 \&quot;uuid\&quot;: \&quot;{470c176d-3574-44ea-bb41-89e8638bcca4}\&quot;,                 \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,             },             \&quot;workspace\&quot;: {                 \&quot;type\&quot;: \&quot;workspace\&quot;,                 \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,                 \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,                 \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,             }         },         {             \&quot;permission\&quot;: \&quot;member\&quot;,             \&quot;type\&quot;: \&quot;workspace_membership\&quot;,             \&quot;user\&quot;: {                 \&quot;type\&quot;: \&quot;user\&quot;,                 \&quot;nickname\&quot;: \&quot;seanaty\&quot;,                 \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,                 \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;             },             \&quot;workspace\&quot;: {                 \&quot;type\&quot;: \&quot;workspace\&quot;,                 \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,                 \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,                 \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,             }         }     ],     \&quot;page\&quot;: 1,     \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered](../../../meta/filtering) by permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&#x3D;\&quot;owner\&quot;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
try {
    PaginatedWorkspaceMemberships result = apiInstance.workspacesWorkspacePermissionsGet(workspace, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspacePermissionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering). | [optional]

### Return type

[**PaginatedWorkspaceMemberships**](PaginatedWorkspaceMemberships.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceProjectsGet"></a>
# **workspacesWorkspaceProjectsGet**
> PaginatedProjects workspacesWorkspaceProjectsGet(workspace)



Returns the list of projects in this workspace.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedProjects result = apiInstance.workspacesWorkspaceProjectsGet(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceProjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedProjects**](PaginatedProjects.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspaceProjectsProjectKeyGet"></a>
# **workspacesWorkspaceProjectsProjectKeyGet**
> Project workspacesWorkspaceProjectsProjectKeyGet(projectKey, workspace)



Returns the requested project.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.WorkspacesApi;

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

WorkspacesApi apiInstance = new WorkspacesApi();
String projectKey = "projectKey_example"; // String | The project in question. This is the actual `key` assigned to the project. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Project result = apiInstance.workspacesWorkspaceProjectsProjectKeyGet(projectKey, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkspacesApi#workspacesWorkspaceProjectsProjectKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **String**| The project in question. This is the actual &#x60;key&#x60; assigned to the project.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

