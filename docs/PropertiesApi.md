# PropertiesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCommitHostedPropertyValue**](PropertiesApi.md#deleteCommitHostedPropertyValue) | **DELETE** /repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name} | 
[**deletePullRequestHostedPropertyValue**](PropertiesApi.md#deletePullRequestHostedPropertyValue) | **DELETE** /repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name} | 
[**deleteRepositoryHostedPropertyValue**](PropertiesApi.md#deleteRepositoryHostedPropertyValue) | **DELETE** /repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name} | 
[**deleteUserHostedPropertyValue**](PropertiesApi.md#deleteUserHostedPropertyValue) | **DELETE** /users/{selected_user}/properties/{app_key}/{property_name} | 
[**getCommitHostedPropertyValue**](PropertiesApi.md#getCommitHostedPropertyValue) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name} | 
[**getPullRequestHostedPropertyValue**](PropertiesApi.md#getPullRequestHostedPropertyValue) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name} | 
[**getRepositoryHostedPropertyValue**](PropertiesApi.md#getRepositoryHostedPropertyValue) | **GET** /repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name} | 
[**retrieveUserHostedPropertyValue**](PropertiesApi.md#retrieveUserHostedPropertyValue) | **GET** /users/{selected_user}/properties/{app_key}/{property_name} | 
[**updateCommitHostedPropertyValue**](PropertiesApi.md#updateCommitHostedPropertyValue) | **PUT** /repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name} | 
[**updatePullRequestHostedPropertyValue**](PropertiesApi.md#updatePullRequestHostedPropertyValue) | **PUT** /repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name} | 
[**updateRepositoryHostedPropertyValue**](PropertiesApi.md#updateRepositoryHostedPropertyValue) | **PUT** /repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name} | 
[**updateUserHostedPropertyValue**](PropertiesApi.md#updateUserHostedPropertyValue) | **PUT** /users/{selected_user}/properties/{app_key}/{property_name} | 

<a name="deleteCommitHostedPropertyValue"></a>
# **deleteCommitHostedPropertyValue**
> deleteCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName)



Delete an application property value stored against a commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.deleteCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#deleteCommitHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePullRequestHostedPropertyValue"></a>
# **deletePullRequestHostedPropertyValue**
> deletePullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName)



Delete an application property value stored against a pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String pullrequestId = "pullrequestId_example"; // String | The pull request ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.deletePullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#deletePullRequestHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **pullrequestId** | **String**| The pull request ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRepositoryHostedPropertyValue"></a>
# **deleteRepositoryHostedPropertyValue**
> deleteRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName)



Delete an application property value stored against a repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.deleteRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#deleteRepositoryHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserHostedPropertyValue"></a>
# **deleteUserHostedPropertyValue**
> deleteUserHostedPropertyValue(selectedUser, appKey, propertyName)



Delete an application property value stored against a user.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.deleteUserHostedPropertyValue(selectedUser, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#deleteUserHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCommitHostedPropertyValue"></a>
# **getCommitHostedPropertyValue**
> getCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName)



Retrieve an application property value stored against a commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.getCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#getCommitHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPullRequestHostedPropertyValue"></a>
# **getPullRequestHostedPropertyValue**
> getPullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName)



Retrieve an application property value stored against a pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String pullrequestId = "pullrequestId_example"; // String | The pull request ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.getPullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#getPullRequestHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **pullrequestId** | **String**| The pull request ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRepositoryHostedPropertyValue"></a>
# **getRepositoryHostedPropertyValue**
> getRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName)



Retrieve an application property value stored against a repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.getRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#getRepositoryHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveUserHostedPropertyValue"></a>
# **retrieveUserHostedPropertyValue**
> retrieveUserHostedPropertyValue(selectedUser, appKey, propertyName)



Retrieve an application property value stored against a user.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.retrieveUserHostedPropertyValue(selectedUser, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#retrieveUserHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCommitHostedPropertyValue"></a>
# **updateCommitHostedPropertyValue**
> updateCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName)



Update an application property value stored against a commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.updateCommitHostedPropertyValue(workspace, repoSlug, commit, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#updateCommitHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePullRequestHostedPropertyValue"></a>
# **updatePullRequestHostedPropertyValue**
> updatePullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName)



Update an application property value stored against a pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String pullrequestId = "pullrequestId_example"; // String | The pull request ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.updatePullRequestHostedPropertyValue(workspace, repoSlug, pullrequestId, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#updatePullRequestHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **pullrequestId** | **String**| The pull request ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateRepositoryHostedPropertyValue"></a>
# **updateRepositoryHostedPropertyValue**
> updateRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName)



Update an application property value stored against a repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String workspace = "workspace_example"; // String | The repository container; either the workspace slug or the UUID in curly braces.
String repoSlug = "repoSlug_example"; // String | The repository.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.updateRepositoryHostedPropertyValue(workspace, repoSlug, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#updateRepositoryHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The repository container; either the workspace slug or the UUID in curly braces. |
 **repoSlug** | **String**| The repository. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUserHostedPropertyValue"></a>
# **updateUserHostedPropertyValue**
> updateUserHostedPropertyValue(selectedUser, appKey, propertyName)



Update an application property value stored against a user.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PropertiesApi;


PropertiesApi apiInstance = new PropertiesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String appKey = "appKey_example"; // String | The key of the Connect app.
String propertyName = "propertyName_example"; // String | The name of the property.
try {
    apiInstance.updateUserHostedPropertyValue(selectedUser, appKey, propertyName);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertiesApi#updateUserHostedPropertyValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **appKey** | **String**| The key of the Connect app. |
 **propertyName** | **String**| The name of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

