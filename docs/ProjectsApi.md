# ProjectsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsUsernameProjectsGet**](ProjectsApi.md#teamsUsernameProjectsGet) | **GET** /teams/{username}/projects/ | 
[**teamsUsernameProjectsPost**](ProjectsApi.md#teamsUsernameProjectsPost) | **POST** /teams/{username}/projects/ | 
[**teamsUsernameProjectsProjectKeyDelete**](ProjectsApi.md#teamsUsernameProjectsProjectKeyDelete) | **DELETE** /teams/{username}/projects/{project_key} | 
[**teamsUsernameProjectsProjectKeyGet**](ProjectsApi.md#teamsUsernameProjectsProjectKeyGet) | **GET** /teams/{username}/projects/{project_key} | 
[**teamsUsernameProjectsProjectKeyPut**](ProjectsApi.md#teamsUsernameProjectsProjectKeyPut) | **PUT** /teams/{username}/projects/{project_key} | 
[**workspacesWorkspaceProjectsPost**](ProjectsApi.md#workspacesWorkspaceProjectsPost) | **POST** /workspaces/{workspace}/projects | 
[**workspacesWorkspaceProjectsProjectKeyDelete**](ProjectsApi.md#workspacesWorkspaceProjectsProjectKeyDelete) | **DELETE** /workspaces/{workspace}/projects/{project_key} | 
[**workspacesWorkspaceProjectsProjectKeyGet**](ProjectsApi.md#workspacesWorkspaceProjectsProjectKeyGet) | **GET** /workspaces/{workspace}/projects/{project_key} | 
[**workspacesWorkspaceProjectsProjectKeyPut**](ProjectsApi.md#workspacesWorkspaceProjectsProjectKeyPut) | **PUT** /workspaces/{workspace}/projects/{project_key} | 

<a name="teamsUsernameProjectsGet"></a>
# **teamsUsernameProjectsGet**
> PaginatedProjects teamsUsernameProjectsGet(username)



The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    PaginatedProjects result = apiInstance.teamsUsernameProjectsGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsUsernameProjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**PaginatedProjects**](PaginatedProjects.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameProjectsPost"></a>
# **teamsUsernameProjectsPost**
> Project teamsUsernameProjectsPost(body, username)



Creates a new project.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  Note that the avatar has to be embedded as either a data-url or a URL to an external image as shown in the examples below:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/...\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;  or even:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;http://i.imgur.com/72tRx4w.gif\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | 
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    Project result = apiInstance.teamsUsernameProjectsPost(body, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsUsernameProjectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)|  |
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="teamsUsernameProjectsProjectKeyDelete"></a>
# **teamsUsernameProjectsProjectKeyDelete**
> teamsUsernameProjectsProjectKeyDelete(projectKey, username)



The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    apiInstance.teamsUsernameProjectsProjectKeyDelete(projectKey, username);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsUsernameProjectsProjectKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameProjectsProjectKeyGet"></a>
# **teamsUsernameProjectsProjectKeyGet**
> Project teamsUsernameProjectsProjectKeyGet(projectKey, username)



The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    Project result = apiInstance.teamsUsernameProjectsProjectKeyGet(projectKey, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsUsernameProjectsProjectKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernameProjectsProjectKeyPut"></a>
# **teamsUsernameProjectsProjectKeyPut**
> Project teamsUsernameProjectsProjectKeyPut(body, projectKey, username)



Since this endpoint can be used to both update and to create a project, the request body depends on the intent.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  ### Creation  See the POST documentation for the project collection for an example of the request body.  Note: The &#x60;key&#x60; should not be specified in the body of request (since it is already present in the URL). The &#x60;name&#x60; is required, everything else is optional.  ### Update  See the POST documentation for the project collection for an example of the request body.  Note: The key is not required in the body (since it is already in the URL). The key may be specified in the body, if the intent is to change the key itself. In such a scenario, the location of the project is changed and is returned in the &#x60;Location&#x60; header of the response.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | 
String projectKey = "projectKey_example"; // String | The project in question. This can either be the actual `key` assigned to the project or the `UUID` (surrounded by curly-braces (`{}`)). 
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
try {
    Project result = apiInstance.teamsUsernameProjectsProjectKeyPut(body, projectKey, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#teamsUsernameProjectsProjectKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)|  |
 **projectKey** | **String**| The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)).  |
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workspacesWorkspaceProjectsPost"></a>
# **workspacesWorkspaceProjectsPost**
> Project workspacesWorkspaceProjectsPost(body, workspace)



Creates a new project.  Note that the avatar has to be embedded as either a data-url or a URL to an external image as shown in the examples below:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/...\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;  or even:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;http://i.imgur.com/72tRx4w.gif\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Project result = apiInstance.workspacesWorkspaceProjectsPost(body, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#workspacesWorkspaceProjectsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workspacesWorkspaceProjectsProjectKeyDelete"></a>
# **workspacesWorkspaceProjectsProjectKeyDelete**
> workspacesWorkspaceProjectsProjectKeyDelete(projectKey, workspace)



Deletes this project. This is an irreversible operation.  You cannot delete a project that still contains repositories. To delete the project, [delete](../../../repositories/%7Bworkspace%7D/%7Brepo_slug%7D#delete) or transfer the repositories first.  Example: &#x60;&#x60;&#x60; $ curl -X DELETE https://api.bitbucket.org/2.0/bbworkspace1/PROJ &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String projectKey = "projectKey_example"; // String | The project in question. This is the actual `key` assigned to the project. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.workspacesWorkspaceProjectsProjectKeyDelete(projectKey, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#workspacesWorkspaceProjectsProjectKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **String**| The project in question. This is the actual &#x60;key&#x60; assigned to the project.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

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
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
String projectKey = "projectKey_example"; // String | The project in question. This is the actual `key` assigned to the project. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Project result = apiInstance.workspacesWorkspaceProjectsProjectKeyGet(projectKey, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#workspacesWorkspaceProjectsProjectKeyGet");
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

<a name="workspacesWorkspaceProjectsProjectKeyPut"></a>
# **workspacesWorkspaceProjectsProjectKeyPut**
> Project workspacesWorkspaceProjectsProjectKeyPut(body, projectKey, workspace)



Since this endpoint can be used to both update and to create a project, the request body depends on the intent.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  ### Creation  See the POST documentation for the project collection for an example of the request body.  Note: The &#x60;key&#x60; should not be specified in the body of request (since it is already present in the URL). The &#x60;name&#x60; is required, everything else is optional.  ### Update  See the POST documentation for the project collection for an example of the request body.  Note: The key is not required in the body (since it is already in the URL). The key may be specified in the body, if the intent is to change the key itself. In such a scenario, the location of the project is changed and is returned in the &#x60;Location&#x60; header of the response.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.ProjectsApi;

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

ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | 
String projectKey = "projectKey_example"; // String | The project in question. This is the actual `key` assigned to the project. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Project result = apiInstance.workspacesWorkspaceProjectsProjectKeyPut(body, projectKey, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#workspacesWorkspaceProjectsProjectKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)|  |
 **projectKey** | **String**| The project in question. This is the actual &#x60;key&#x60; assigned to the project.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Project**](Project.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

