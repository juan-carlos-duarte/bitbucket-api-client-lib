# DeploymentsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEnvironment**](DeploymentsApi.md#createEnvironment) | **POST** /repositories/{workspace}/{repo_slug}/environments/ | 
[**deleteEnvironmentForRepository**](DeploymentsApi.md#deleteEnvironmentForRepository) | **DELETE** /repositories/{workspace}/{repo_slug}/environments/{environment_uuid} | 
[**getDeploymentForRepository**](DeploymentsApi.md#getDeploymentForRepository) | **GET** /repositories/{workspace}/{repo_slug}/deployments/{deployment_uuid} | 
[**getDeploymentsForRepository**](DeploymentsApi.md#getDeploymentsForRepository) | **GET** /repositories/{workspace}/{repo_slug}/deployments/ | 
[**getEnvironmentForRepository**](DeploymentsApi.md#getEnvironmentForRepository) | **GET** /repositories/{workspace}/{repo_slug}/environments/{environment_uuid} | 
[**getEnvironmentsForRepository**](DeploymentsApi.md#getEnvironmentsForRepository) | **GET** /repositories/{workspace}/{repo_slug}/environments/ | 
[**updateEnvironmentForRepository**](DeploymentsApi.md#updateEnvironmentForRepository) | **POST** /repositories/{workspace}/{repo_slug}/environments/{environment_uuid}/changes/ | 

<a name="createEnvironment"></a>
# **createEnvironment**
> DeploymentEnvironment createEnvironment(body, username, repoSlug)



Create an environment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
DeploymentEnvironment body = new DeploymentEnvironment(); // DeploymentEnvironment | The environment to create.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    DeploymentEnvironment result = apiInstance.createEnvironment(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#createEnvironment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentEnvironment**](DeploymentEnvironment.md)| The environment to create. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**DeploymentEnvironment**](DeploymentEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEnvironmentForRepository"></a>
# **deleteEnvironmentForRepository**
> deleteEnvironmentForRepository(username, repoSlug, environmentUuid)



Delete an environment

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment UUID.
try {
    apiInstance.deleteEnvironmentForRepository(username, repoSlug, environmentUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#deleteEnvironmentForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentForRepository"></a>
# **getDeploymentForRepository**
> Deployment getDeploymentForRepository(username, repoSlug, deploymentUuid)



Retrieve a deployment

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String deploymentUuid = "deploymentUuid_example"; // String | The deployment UUID.
try {
    Deployment result = apiInstance.getDeploymentForRepository(username, repoSlug, deploymentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **deploymentUuid** | **String**| The deployment UUID. |

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentsForRepository"></a>
# **getDeploymentsForRepository**
> PaginatedDeployments getDeploymentsForRepository(username, repoSlug)



Find deployments

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedDeployments result = apiInstance.getDeploymentsForRepository(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getDeploymentsForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedDeployments**](PaginatedDeployments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentForRepository"></a>
# **getEnvironmentForRepository**
> DeploymentEnvironment getEnvironmentForRepository(username, repoSlug, environmentUuid)



Retrieve an environment

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment UUID.
try {
    DeploymentEnvironment result = apiInstance.getEnvironmentForRepository(username, repoSlug, environmentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getEnvironmentForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment UUID. |

### Return type

[**DeploymentEnvironment**](DeploymentEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentsForRepository"></a>
# **getEnvironmentsForRepository**
> PaginatedEnvironments getEnvironmentsForRepository(username, repoSlug)



Find environments

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedEnvironments result = apiInstance.getEnvironmentsForRepository(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#getEnvironmentsForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedEnvironments**](PaginatedEnvironments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEnvironmentForRepository"></a>
# **updateEnvironmentForRepository**
> updateEnvironmentForRepository(username, repoSlug, environmentUuid)



Update an environment

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DeploymentsApi;


DeploymentsApi apiInstance = new DeploymentsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment UUID.
try {
    apiInstance.updateEnvironmentForRepository(username, repoSlug, environmentUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentsApi#updateEnvironmentForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment UUID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

