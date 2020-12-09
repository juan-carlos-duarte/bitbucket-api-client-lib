# PipelinesApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeploymentVariable**](PipelinesApi.md#createDeploymentVariable) | **POST** /repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables | 
[**createPipelineForRepository**](PipelinesApi.md#createPipelineForRepository) | **POST** /repositories/{workspace}/{repo_slug}/pipelines/ | 
[**createPipelineVariableForTeam**](PipelinesApi.md#createPipelineVariableForTeam) | **POST** /teams/{username}/pipelines_config/variables/ | 
[**createPipelineVariableForUser**](PipelinesApi.md#createPipelineVariableForUser) | **POST** /users/{selected_user}/pipelines_config/variables/ | 
[**createPipelineVariableForWorkspace**](PipelinesApi.md#createPipelineVariableForWorkspace) | **POST** /workspaces/{workspace}/pipelines-config/variables | 
[**createRepositoryPipelineKnownHost**](PipelinesApi.md#createRepositoryPipelineKnownHost) | **POST** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/ | 
[**createRepositoryPipelineSchedule**](PipelinesApi.md#createRepositoryPipelineSchedule) | **POST** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/ | 
[**createRepositoryPipelineVariable**](PipelinesApi.md#createRepositoryPipelineVariable) | **POST** /repositories/{workspace}/{repo_slug}/pipelines_config/variables/ | 
[**deleteDeploymentVariable**](PipelinesApi.md#deleteDeploymentVariable) | **DELETE** /repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables/{variable_uuid} | 
[**deletePipelineVariableForTeam**](PipelinesApi.md#deletePipelineVariableForTeam) | **DELETE** /teams/{username}/pipelines_config/variables/{variable_uuid} | 
[**deletePipelineVariableForUser**](PipelinesApi.md#deletePipelineVariableForUser) | **DELETE** /users/{selected_user}/pipelines_config/variables/{variable_uuid} | 
[**deletePipelineVariableForWorkspace**](PipelinesApi.md#deletePipelineVariableForWorkspace) | **DELETE** /workspaces/{workspace}/pipelines-config/variables/{variable_uuid} | 
[**deleteRepositoryPipelineCache**](PipelinesApi.md#deleteRepositoryPipelineCache) | **DELETE** /repositories/{workspace}/{repo_slug}/pipelines-config/caches/{cache_uuid} | 
[**deleteRepositoryPipelineKeyPair**](PipelinesApi.md#deleteRepositoryPipelineKeyPair) | **DELETE** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair | 
[**deleteRepositoryPipelineKnownHost**](PipelinesApi.md#deleteRepositoryPipelineKnownHost) | **DELETE** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid} | 
[**deleteRepositoryPipelineSchedule**](PipelinesApi.md#deleteRepositoryPipelineSchedule) | **DELETE** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid} | 
[**deleteRepositoryPipelineVariable**](PipelinesApi.md#deleteRepositoryPipelineVariable) | **DELETE** /repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid} | 
[**getDeploymentVariables**](PipelinesApi.md#getDeploymentVariables) | **GET** /repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables | 
[**getPipelineForRepository**](PipelinesApi.md#getPipelineForRepository) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid} | 
[**getPipelineStepForRepository**](PipelinesApi.md#getPipelineStepForRepository) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid} | 
[**getPipelineStepLogForRepository**](PipelinesApi.md#getPipelineStepLogForRepository) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/log | 
[**getPipelineStepsForRepository**](PipelinesApi.md#getPipelineStepsForRepository) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/ | 
[**getPipelineVariableForTeam**](PipelinesApi.md#getPipelineVariableForTeam) | **GET** /teams/{username}/pipelines_config/variables/{variable_uuid} | 
[**getPipelineVariableForUser**](PipelinesApi.md#getPipelineVariableForUser) | **GET** /users/{selected_user}/pipelines_config/variables/{variable_uuid} | 
[**getPipelineVariableForWorkspace**](PipelinesApi.md#getPipelineVariableForWorkspace) | **GET** /workspaces/{workspace}/pipelines-config/variables/{variable_uuid} | 
[**getPipelineVariablesForTeam**](PipelinesApi.md#getPipelineVariablesForTeam) | **GET** /teams/{username}/pipelines_config/variables/ | 
[**getPipelineVariablesForUser**](PipelinesApi.md#getPipelineVariablesForUser) | **GET** /users/{selected_user}/pipelines_config/variables/ | 
[**getPipelineVariablesForWorkspace**](PipelinesApi.md#getPipelineVariablesForWorkspace) | **GET** /workspaces/{workspace}/pipelines-config/variables | 
[**getPipelinesForRepository**](PipelinesApi.md#getPipelinesForRepository) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/ | 
[**getRepositoryPipelineCacheContentURI**](PipelinesApi.md#getRepositoryPipelineCacheContentURI) | **GET** /repositories/{workspace}/{repo_slug}/pipelines-config/caches/{cache_uuid}/content-uri | 
[**getRepositoryPipelineCaches**](PipelinesApi.md#getRepositoryPipelineCaches) | **GET** /repositories/{workspace}/{repo_slug}/pipelines-config/caches/ | 
[**getRepositoryPipelineConfig**](PipelinesApi.md#getRepositoryPipelineConfig) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config | 
[**getRepositoryPipelineKnownHost**](PipelinesApi.md#getRepositoryPipelineKnownHost) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid} | 
[**getRepositoryPipelineKnownHosts**](PipelinesApi.md#getRepositoryPipelineKnownHosts) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/ | 
[**getRepositoryPipelineSchedule**](PipelinesApi.md#getRepositoryPipelineSchedule) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid} | 
[**getRepositoryPipelineScheduleExecutions**](PipelinesApi.md#getRepositoryPipelineScheduleExecutions) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid}/executions/ | 
[**getRepositoryPipelineSchedules**](PipelinesApi.md#getRepositoryPipelineSchedules) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/ | 
[**getRepositoryPipelineSshKeyPair**](PipelinesApi.md#getRepositoryPipelineSshKeyPair) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair | 
[**getRepositoryPipelineVariable**](PipelinesApi.md#getRepositoryPipelineVariable) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid} | 
[**getRepositoryPipelineVariables**](PipelinesApi.md#getRepositoryPipelineVariables) | **GET** /repositories/{workspace}/{repo_slug}/pipelines_config/variables/ | 
[**stopPipeline**](PipelinesApi.md#stopPipeline) | **POST** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/stopPipeline | 
[**updateDeploymentVariable**](PipelinesApi.md#updateDeploymentVariable) | **PUT** /repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables/{variable_uuid} | 
[**updatePipelineVariableForTeam**](PipelinesApi.md#updatePipelineVariableForTeam) | **PUT** /teams/{username}/pipelines_config/variables/{variable_uuid} | 
[**updatePipelineVariableForUser**](PipelinesApi.md#updatePipelineVariableForUser) | **PUT** /users/{selected_user}/pipelines_config/variables/{variable_uuid} | 
[**updatePipelineVariableForWorkspace**](PipelinesApi.md#updatePipelineVariableForWorkspace) | **PUT** /workspaces/{workspace}/pipelines-config/variables/{variable_uuid} | 
[**updateRepositoryBuildNumber**](PipelinesApi.md#updateRepositoryBuildNumber) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config/build_number | 
[**updateRepositoryPipelineConfig**](PipelinesApi.md#updateRepositoryPipelineConfig) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config | 
[**updateRepositoryPipelineKeyPair**](PipelinesApi.md#updateRepositoryPipelineKeyPair) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair | 
[**updateRepositoryPipelineKnownHost**](PipelinesApi.md#updateRepositoryPipelineKnownHost) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid} | 
[**updateRepositoryPipelineSchedule**](PipelinesApi.md#updateRepositoryPipelineSchedule) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid} | 
[**updateRepositoryPipelineVariable**](PipelinesApi.md#updateRepositoryPipelineVariable) | **PUT** /repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid} | 

<a name="createDeploymentVariable"></a>
# **createDeploymentVariable**
> DeploymentVariable createDeploymentVariable(body, username, repoSlug, environmentUuid, variableUuid)



Create a deployment environment level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
DeploymentVariable body = new DeploymentVariable(); // DeploymentVariable | The variable to create
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to update.
try {
    DeploymentVariable result = apiInstance.createDeploymentVariable(body, username, repoSlug, environmentUuid, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createDeploymentVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentVariable**](DeploymentVariable.md)| The variable to create |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment. |
 **variableUuid** | **String**| The UUID of the variable to update. |

### Return type

[**DeploymentVariable**](DeploymentVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPipelineForRepository"></a>
# **createPipelineForRepository**
> Pipeline createPipelineForRepository(body, username, repoSlug)



Endpoint to create and initiate a pipeline. There are a couple of different options to initiate a pipeline, where the payload of the request will determine which type of pipeline will be instantiated. # Trigger a Pipeline for a branch One way to trigger pipelines is by specifying the branch for which you want to trigger a pipeline. The specified branch will be used to determine which pipeline definition from the &#x60;bitbucket-pipelines.yml&#x60; file will be applied to initiate the pipeline. The pipeline will then do a clone of the repository and checkout the latest revision of the specified branch.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\   -d &#x27;   {     \&quot;target\&quot;: {       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;     }   }&#x27; &#x60;&#x60;&#x60; # Trigger a Pipeline for a commit on a branch or tag You can initiate a pipeline for a specific commit and in the context of a specified reference (e.g. a branch, tag or bookmark). The specified reference will be used to determine which pipeline definition from the bitbucket-pipelines.yml file will be applied to initiate the pipeline. The pipeline will clone the repository and then do a checkout the specified reference.  The following reference types are supported:  * &#x60;branch&#x60; * &#x60;named_branch&#x60; * &#x60;bookmark&#x60;  * &#x60;tag&#x60;  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\   https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\   -d &#x27;   {     \&quot;target\&quot;: {       \&quot;commit\&quot;: {         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;hash\&quot;: \&quot;ce5b7431602f7cbba007062eeb55225c6e18e956\&quot;       },       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;     }   }&#x27; &#x60;&#x60;&#x60; # Trigger a specific pipeline definition for a commit You can trigger a specific pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file for a specific commit. In addition to the commit revision, you specify the type and pattern of the selector that identifies the pipeline definition. The resulting pipeline will then clone the repository and checkout the specified revision.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\  -d &#x27;   {      \&quot;target\&quot;: {       \&quot;commit\&quot;: {          \&quot;hash\&quot;:\&quot;a3c4e02c9a3755eccdc3764e6ea13facdf30f923\&quot;,          \&quot;type\&quot;:\&quot;commit\&quot;        },         \&quot;selector\&quot;: {            \&quot;type\&quot;:\&quot;custom\&quot;,               \&quot;pattern\&quot;:\&quot;Deploy to production\&quot;           },         \&quot;type\&quot;:\&quot;pipeline_commit_target\&quot;    }   }&#x27; &#x60;&#x60;&#x60; # Trigger a specific pipeline definition for a commit on a branch or tag You can trigger a specific pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file for a specific commit in the context of a specified reference. In addition to the commit revision, you specify the type and pattern of the selector that identifies the pipeline definition, as well as the reference information. The resulting pipeline will then clone the repository a checkout the specified reference.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\  -d &#x27;   {      \&quot;target\&quot;: {       \&quot;commit\&quot;: {          \&quot;hash\&quot;:\&quot;a3c4e02c9a3755eccdc3764e6ea13facdf30f923\&quot;,          \&quot;type\&quot;:\&quot;commit\&quot;        },        \&quot;selector\&quot;: {           \&quot;type\&quot;: \&quot;custom\&quot;,           \&quot;pattern\&quot;: \&quot;Deploy to production\&quot;        },        \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,        \&quot;ref_name\&quot;: \&quot;master\&quot;,        \&quot;ref_type\&quot;: \&quot;branch\&quot;      }   }&#x27; &#x60;&#x60;&#x60;   # Trigger a custom pipeline with variables In addition to triggering a custom pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file as shown in the examples above, you can specify variables that will be available for your build. In the request, provide a list of variables, specifying the following for each variable: key, value, and whether it should be secured or not (this field is optional and defaults to not secured).  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/{workspace}/{repo_slug}/pipelines/ \\  -d &#x27;   {     \&quot;target\&quot;: {       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;,       \&quot;selector\&quot;: {         \&quot;type\&quot;: \&quot;custom\&quot;,         \&quot;pattern\&quot;: \&quot;Deploy to production\&quot;       }     },     \&quot;variables\&quot;: [       {         \&quot;key\&quot;: \&quot;var1key\&quot;,         \&quot;value\&quot;: \&quot;var1value\&quot;,         \&quot;secured\&quot;: true       },       {         \&quot;key\&quot;: \&quot;var2key\&quot;,         \&quot;value\&quot;: \&quot;var2value\&quot;       }     ]   }&#x27; &#x60;&#x60;&#x60;  # Trigger a pull request pipeline  You can also initiate a pipeline for a specific pull request.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/{workspace}/{repo_slug}/pipelines/ \\  -d &#x27;   {  \&quot;target\&quot;: {       \&quot;type\&quot;: \&quot;pipeline_pullrequest_target\&quot;,    \&quot;source\&quot;: \&quot;pull-request-branch\&quot;,       \&quot;destination\&quot;: \&quot;master\&quot;,       \&quot;destination_commit\&quot;: {         \&quot;hash\&quot; : \&quot;9f848b7\&quot;       },       \&quot;commit\&quot;: {        \&quot;hash\&quot; : \&quot;1a372fc\&quot;       },       \&quot;pullrequest\&quot; : {        \&quot;id\&quot; : \&quot;3\&quot;       },    \&quot;selector\&quot;: {         \&quot;type\&quot;: \&quot;pull-requests\&quot;,         \&quot;pattern\&quot;: \&quot;**\&quot;       }     }   }&#x27; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
Pipeline body = new Pipeline(); // Pipeline | The pipeline to initiate.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    Pipeline result = apiInstance.createPipelineForRepository(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createPipelineForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pipeline**](Pipeline.md)| The pipeline to initiate. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPipelineVariableForTeam"></a>
# **createPipelineVariableForTeam**
> PipelineVariable createPipelineVariableForTeam(username, body)



Create an account level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The variable to create.
try {
    PipelineVariable result = apiInstance.createPipelineVariableForTeam(username, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createPipelineVariableForTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **body** | [**PipelineVariable**](PipelineVariable.md)| The variable to create. | [optional]

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPipelineVariableForUser"></a>
# **createPipelineVariableForUser**
> PipelineVariable createPipelineVariableForUser(selectedUser, body)



Create a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The variable to create.
try {
    PipelineVariable result = apiInstance.createPipelineVariableForUser(selectedUser, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createPipelineVariableForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **body** | [**PipelineVariable**](PipelineVariable.md)| The variable to create. | [optional]

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPipelineVariableForWorkspace"></a>
# **createPipelineVariableForWorkspace**
> PipelineVariable createPipelineVariableForWorkspace(workspace, body)



Create a workspace level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example `{workspace UUID}`.
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The variable to create.
try {
    PipelineVariable result = apiInstance.createPipelineVariableForWorkspace(workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createPipelineVariableForWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;. |
 **body** | [**PipelineVariable**](PipelineVariable.md)| The variable to create. | [optional]

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepositoryPipelineKnownHost"></a>
# **createRepositoryPipelineKnownHost**
> PipelineKnownHost createRepositoryPipelineKnownHost(body, username, repoSlug)



Create a repository level known host.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineKnownHost body = new PipelineKnownHost(); // PipelineKnownHost | The known host to create.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineKnownHost result = apiInstance.createRepositoryPipelineKnownHost(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createRepositoryPipelineKnownHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineKnownHost**](PipelineKnownHost.md)| The known host to create. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineKnownHost**](PipelineKnownHost.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepositoryPipelineSchedule"></a>
# **createRepositoryPipelineSchedule**
> PipelineSchedule createRepositoryPipelineSchedule(body, username, repoSlug)



Create a schedule for the given repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineSchedule body = new PipelineSchedule(); // PipelineSchedule | The schedule to create.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineSchedule result = apiInstance.createRepositoryPipelineSchedule(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createRepositoryPipelineSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineSchedule**](PipelineSchedule.md)| The schedule to create. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineSchedule**](PipelineSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepositoryPipelineVariable"></a>
# **createRepositoryPipelineVariable**
> PipelineVariable createRepositoryPipelineVariable(body, username, repoSlug)



Create a repository level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The variable to create.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineVariable result = apiInstance.createRepositoryPipelineVariable(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#createRepositoryPipelineVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineVariable**](PipelineVariable.md)| The variable to create. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeploymentVariable"></a>
# **deleteDeploymentVariable**
> deleteDeploymentVariable(username, repoSlug, environmentUuid, variableUuid)



Delete a deployment environment level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to delete.
try {
    apiInstance.deleteDeploymentVariable(username, repoSlug, environmentUuid, variableUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteDeploymentVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment. |
 **variableUuid** | **String**| The UUID of the variable to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePipelineVariableForTeam"></a>
# **deletePipelineVariableForTeam**
> deletePipelineVariableForTeam(username, variableUuid)



Delete a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to delete.
try {
    apiInstance.deletePipelineVariableForTeam(username, variableUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deletePipelineVariableForTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **variableUuid** | **String**| The UUID of the variable to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePipelineVariableForUser"></a>
# **deletePipelineVariableForUser**
> deletePipelineVariableForUser(selectedUser, variableUuid)



Delete an account level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to delete.
try {
    apiInstance.deletePipelineVariableForUser(selectedUser, variableUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deletePipelineVariableForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **variableUuid** | **String**| The UUID of the variable to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePipelineVariableForWorkspace"></a>
# **deletePipelineVariableForWorkspace**
> deletePipelineVariableForWorkspace(workspace, variableUuid)



Delete a workspace level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example `{workspace UUID}`.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to delete.
try {
    apiInstance.deletePipelineVariableForWorkspace(workspace, variableUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deletePipelineVariableForWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;. |
 **variableUuid** | **String**| The UUID of the variable to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRepositoryPipelineCache"></a>
# **deleteRepositoryPipelineCache**
> deleteRepositoryPipelineCache(workspace, repoSlug, cacheUuid)



Delete a repository cache.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String cacheUuid = "cacheUuid_example"; // String | The UUID of the cache to delete.
try {
    apiInstance.deleteRepositoryPipelineCache(workspace, repoSlug, cacheUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteRepositoryPipelineCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **cacheUuid** | **String**| The UUID of the cache to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRepositoryPipelineKeyPair"></a>
# **deleteRepositoryPipelineKeyPair**
> deleteRepositoryPipelineKeyPair(username, repoSlug)



Delete the repository SSH key pair.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    apiInstance.deleteRepositoryPipelineKeyPair(username, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteRepositoryPipelineKeyPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRepositoryPipelineKnownHost"></a>
# **deleteRepositoryPipelineKnownHost**
> deleteRepositoryPipelineKnownHost(username, repoSlug, knownHostUuid)



Delete a repository level known host.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String knownHostUuid = "knownHostUuid_example"; // String | The UUID of the known host to delete.
try {
    apiInstance.deleteRepositoryPipelineKnownHost(username, repoSlug, knownHostUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteRepositoryPipelineKnownHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **knownHostUuid** | **String**| The UUID of the known host to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRepositoryPipelineSchedule"></a>
# **deleteRepositoryPipelineSchedule**
> deleteRepositoryPipelineSchedule(username, repoSlug, scheduleUuid)



Delete a schedule.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String scheduleUuid = "scheduleUuid_example"; // String | The uuid of the schedule.
try {
    apiInstance.deleteRepositoryPipelineSchedule(username, repoSlug, scheduleUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteRepositoryPipelineSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **scheduleUuid** | **String**| The uuid of the schedule. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRepositoryPipelineVariable"></a>
# **deleteRepositoryPipelineVariable**
> deleteRepositoryPipelineVariable(username, repoSlug, variableUuid)



Delete a repository level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to delete.
try {
    apiInstance.deleteRepositoryPipelineVariable(username, repoSlug, variableUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deleteRepositoryPipelineVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **variableUuid** | **String**| The UUID of the variable to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentVariables"></a>
# **getDeploymentVariables**
> PaginatedDeploymentVariable getDeploymentVariables(username, repoSlug, environmentUuid)



Find deployment environment level variables.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment.
try {
    PaginatedDeploymentVariable result = apiInstance.getDeploymentVariables(username, repoSlug, environmentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getDeploymentVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment. |

### Return type

[**PaginatedDeploymentVariable**](PaginatedDeploymentVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineForRepository"></a>
# **getPipelineForRepository**
> Pipeline getPipelineForRepository(username, repoSlug, pipelineUuid)



Retrieve a specified pipeline

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String pipelineUuid = "pipelineUuid_example"; // String | The pipeline UUID.
try {
    Pipeline result = apiInstance.getPipelineForRepository(username, repoSlug, pipelineUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **pipelineUuid** | **String**| The pipeline UUID. |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineStepForRepository"></a>
# **getPipelineStepForRepository**
> PipelineStep getPipelineStepForRepository(username, repoSlug, pipelineUuid, stepUuid)



Retrieve a given step of a pipeline.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String pipelineUuid = "pipelineUuid_example"; // String | The UUID of the pipeline.
String stepUuid = "stepUuid_example"; // String | The UUID of the step.
try {
    PipelineStep result = apiInstance.getPipelineStepForRepository(username, repoSlug, pipelineUuid, stepUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineStepForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **pipelineUuid** | **String**| The UUID of the pipeline. |
 **stepUuid** | **String**| The UUID of the step. |

### Return type

[**PipelineStep**](PipelineStep.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineStepLogForRepository"></a>
# **getPipelineStepLogForRepository**
> getPipelineStepLogForRepository(username, repoSlug, pipelineUuid, stepUuid)



Retrieve the log file for a given step of a pipeline.  This endpoint supports (and encourages!) the use of [HTTP Range requests](https://tools.ietf.org/html/rfc7233) to deal with potentially very large log files.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String pipelineUuid = "pipelineUuid_example"; // String | The UUID of the pipeline.
String stepUuid = "stepUuid_example"; // String | The UUID of the step.
try {
    apiInstance.getPipelineStepLogForRepository(username, repoSlug, pipelineUuid, stepUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineStepLogForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **pipelineUuid** | **String**| The UUID of the pipeline. |
 **stepUuid** | **String**| The UUID of the step. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getPipelineStepsForRepository"></a>
# **getPipelineStepsForRepository**
> PaginatedPipelineSteps getPipelineStepsForRepository(username, repoSlug, pipelineUuid)



Find steps for the given pipeline.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String pipelineUuid = "pipelineUuid_example"; // String | The UUID of the pipeline.
try {
    PaginatedPipelineSteps result = apiInstance.getPipelineStepsForRepository(username, repoSlug, pipelineUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineStepsForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **pipelineUuid** | **String**| The UUID of the pipeline. |

### Return type

[**PaginatedPipelineSteps**](PaginatedPipelineSteps.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariableForTeam"></a>
# **getPipelineVariableForTeam**
> PipelineVariable getPipelineVariableForTeam(username, variableUuid)



Retrieve a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to retrieve.
try {
    PipelineVariable result = apiInstance.getPipelineVariableForTeam(username, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariableForTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **variableUuid** | **String**| The UUID of the variable to retrieve. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariableForUser"></a>
# **getPipelineVariableForUser**
> PipelineVariable getPipelineVariableForUser(selectedUser, variableUuid)



Retrieve a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to retrieve.
try {
    PipelineVariable result = apiInstance.getPipelineVariableForUser(selectedUser, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariableForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **variableUuid** | **String**| The UUID of the variable to retrieve. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariableForWorkspace"></a>
# **getPipelineVariableForWorkspace**
> PipelineVariable getPipelineVariableForWorkspace(workspace, variableUuid)



Retrieve a workspace level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example `{workspace UUID}`.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to retrieve.
try {
    PipelineVariable result = apiInstance.getPipelineVariableForWorkspace(workspace, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariableForWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;. |
 **variableUuid** | **String**| The UUID of the variable to retrieve. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariablesForTeam"></a>
# **getPipelineVariablesForTeam**
> PaginatedPipelineVariables getPipelineVariablesForTeam(username)



Find account level variables. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
try {
    PaginatedPipelineVariables result = apiInstance.getPipelineVariablesForTeam(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariablesForTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |

### Return type

[**PaginatedPipelineVariables**](PaginatedPipelineVariables.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariablesForUser"></a>
# **getPipelineVariablesForUser**
> PaginatedPipelineVariables getPipelineVariablesForUser(selectedUser)



Find user level variables. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
try {
    PaginatedPipelineVariables result = apiInstance.getPipelineVariablesForUser(selectedUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariablesForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |

### Return type

[**PaginatedPipelineVariables**](PaginatedPipelineVariables.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelineVariablesForWorkspace"></a>
# **getPipelineVariablesForWorkspace**
> PaginatedPipelineVariables getPipelineVariablesForWorkspace(workspace)



Find workspace level variables.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example `{workspace UUID}`.
try {
    PaginatedPipelineVariables result = apiInstance.getPipelineVariablesForWorkspace(workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelineVariablesForWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;. |

### Return type

[**PaginatedPipelineVariables**](PaginatedPipelineVariables.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelinesForRepository"></a>
# **getPipelinesForRepository**
> PaginatedPipelines getPipelinesForRepository(username, repoSlug)



Find pipelines

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelines result = apiInstance.getPipelinesForRepository(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelinesForRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelines**](PaginatedPipelines.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineCacheContentURI"></a>
# **getRepositoryPipelineCacheContentURI**
> PipelineCacheContentUri getRepositoryPipelineCacheContentURI(workspace, repoSlug, cacheUuid)



Retrieve the URI of the content of the specified cache.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String cacheUuid = "cacheUuid_example"; // String | The UUID of the cache.
try {
    PipelineCacheContentUri result = apiInstance.getRepositoryPipelineCacheContentURI(workspace, repoSlug, cacheUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineCacheContentURI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **cacheUuid** | **String**| The UUID of the cache. |

### Return type

[**PipelineCacheContentUri**](PipelineCacheContentUri.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineCaches"></a>
# **getRepositoryPipelineCaches**
> PaginatedPipelineCaches getRepositoryPipelineCaches(workspace, repoSlug)



Retrieve the repository pipelines caches.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelineCaches result = apiInstance.getRepositoryPipelineCaches(workspace, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineCaches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelineCaches**](PaginatedPipelineCaches.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineConfig"></a>
# **getRepositoryPipelineConfig**
> PipelinesConfig getRepositoryPipelineConfig(workspace, repoSlug)



Retrieve the repository pipelines configuration.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String workspace = "workspace_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelinesConfig result = apiInstance.getRepositoryPipelineConfig(workspace, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelinesConfig**](PipelinesConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineKnownHost"></a>
# **getRepositoryPipelineKnownHost**
> PipelineKnownHost getRepositoryPipelineKnownHost(username, repoSlug, knownHostUuid)



Retrieve a repository level known host.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String knownHostUuid = "knownHostUuid_example"; // String | The UUID of the known host to retrieve.
try {
    PipelineKnownHost result = apiInstance.getRepositoryPipelineKnownHost(username, repoSlug, knownHostUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineKnownHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **knownHostUuid** | **String**| The UUID of the known host to retrieve. |

### Return type

[**PipelineKnownHost**](PipelineKnownHost.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineKnownHosts"></a>
# **getRepositoryPipelineKnownHosts**
> PaginatedPipelineKnownHosts getRepositoryPipelineKnownHosts(username, repoSlug)



Find repository level known hosts.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelineKnownHosts result = apiInstance.getRepositoryPipelineKnownHosts(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineKnownHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelineKnownHosts**](PaginatedPipelineKnownHosts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineSchedule"></a>
# **getRepositoryPipelineSchedule**
> PipelineSchedule getRepositoryPipelineSchedule(username, repoSlug, scheduleUuid)



Retrieve a schedule by its UUID.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String scheduleUuid = "scheduleUuid_example"; // String | The uuid of the schedule.
try {
    PipelineSchedule result = apiInstance.getRepositoryPipelineSchedule(username, repoSlug, scheduleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **scheduleUuid** | **String**| The uuid of the schedule. |

### Return type

[**PipelineSchedule**](PipelineSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineScheduleExecutions"></a>
# **getRepositoryPipelineScheduleExecutions**
> PaginatedPipelineScheduleExecutions getRepositoryPipelineScheduleExecutions(username, repoSlug)



Retrieve the executions of a given schedule.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelineScheduleExecutions result = apiInstance.getRepositoryPipelineScheduleExecutions(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineScheduleExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelineScheduleExecutions**](PaginatedPipelineScheduleExecutions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineSchedules"></a>
# **getRepositoryPipelineSchedules**
> PaginatedPipelineSchedules getRepositoryPipelineSchedules(username, repoSlug)



Retrieve the configured schedules for the given repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelineSchedules result = apiInstance.getRepositoryPipelineSchedules(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelineSchedules**](PaginatedPipelineSchedules.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineSshKeyPair"></a>
# **getRepositoryPipelineSshKeyPair**
> PipelineSshKeyPair getRepositoryPipelineSshKeyPair(username, repoSlug)



Retrieve the repository SSH key pair excluding the SSH private key. The private key is a write only field and will never be exposed in the logs or the REST API.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineSshKeyPair result = apiInstance.getRepositoryPipelineSshKeyPair(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineSshKeyPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineSshKeyPair**](PipelineSshKeyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineVariable"></a>
# **getRepositoryPipelineVariable**
> PipelineVariable getRepositoryPipelineVariable(username, repoSlug, variableUuid)



Retrieve a repository level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to retrieve.
try {
    PipelineVariable result = apiInstance.getRepositoryPipelineVariable(username, repoSlug, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **variableUuid** | **String**| The UUID of the variable to retrieve. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoryPipelineVariables"></a>
# **getRepositoryPipelineVariables**
> PaginatedPipelineVariables getRepositoryPipelineVariables(username, repoSlug)



Find repository level variables.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PaginatedPipelineVariables result = apiInstance.getRepositoryPipelineVariables(username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getRepositoryPipelineVariables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PaginatedPipelineVariables**](PaginatedPipelineVariables.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopPipeline"></a>
# **stopPipeline**
> stopPipeline(username, repoSlug, pipelineUuid)



Signal the stop of a pipeline and all of its steps that not have completed yet.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String pipelineUuid = "pipelineUuid_example"; // String | The UUID of the pipeline.
try {
    apiInstance.stopPipeline(username, repoSlug, pipelineUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#stopPipeline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **pipelineUuid** | **String**| The UUID of the pipeline. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDeploymentVariable"></a>
# **updateDeploymentVariable**
> DeploymentVariable updateDeploymentVariable(body, username, repoSlug, environmentUuid, variableUuid)



Update a deployment environment level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
DeploymentVariable body = new DeploymentVariable(); // DeploymentVariable | The updated deployment variable.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String environmentUuid = "environmentUuid_example"; // String | The environment.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to update.
try {
    DeploymentVariable result = apiInstance.updateDeploymentVariable(body, username, repoSlug, environmentUuid, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateDeploymentVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeploymentVariable**](DeploymentVariable.md)| The updated deployment variable. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **environmentUuid** | **String**| The environment. |
 **variableUuid** | **String**| The UUID of the variable to update. |

### Return type

[**DeploymentVariable**](DeploymentVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePipelineVariableForTeam"></a>
# **updatePipelineVariableForTeam**
> PipelineVariable updatePipelineVariableForTeam(body, username, variableUuid)



Update a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The updated variable.
String username = "username_example"; // String | The account.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable.
try {
    PipelineVariable result = apiInstance.updatePipelineVariableForTeam(body, username, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipelineVariableForTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineVariable**](PipelineVariable.md)| The updated variable. |
 **username** | **String**| The account. |
 **variableUuid** | **String**| The UUID of the variable. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePipelineVariableForUser"></a>
# **updatePipelineVariableForUser**
> PipelineVariable updatePipelineVariableForUser(body, selectedUser, variableUuid)



Update a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The updated variable.
String selectedUser = "selectedUser_example"; // String | Either the UUID of the account surrounded by curly-braces, for example `{account UUID}`, OR an Atlassian Account ID.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable.
try {
    PipelineVariable result = apiInstance.updatePipelineVariableForUser(body, selectedUser, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipelineVariableForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineVariable**](PipelineVariable.md)| The updated variable. |
 **selectedUser** | **String**| Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. |
 **variableUuid** | **String**| The UUID of the variable. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePipelineVariableForWorkspace"></a>
# **updatePipelineVariableForWorkspace**
> PipelineVariable updatePipelineVariableForWorkspace(body, workspace, variableUuid)



Update a workspace level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The updated variable.
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example `{workspace UUID}`.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable.
try {
    PipelineVariable result = apiInstance.updatePipelineVariableForWorkspace(body, workspace, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updatePipelineVariableForWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineVariable**](PipelineVariable.md)| The updated variable. |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;. |
 **variableUuid** | **String**| The UUID of the variable. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryBuildNumber"></a>
# **updateRepositoryBuildNumber**
> PipelineBuildNumber updateRepositoryBuildNumber(body, username, repoSlug)



Update the next build number that should be assigned to a pipeline. The next build number that will be configured has to be strictly higher than the current latest build number for this repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineBuildNumber body = new PipelineBuildNumber(); // PipelineBuildNumber | The build number to update.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineBuildNumber result = apiInstance.updateRepositoryBuildNumber(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryBuildNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineBuildNumber**](PipelineBuildNumber.md)| The build number to update. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineBuildNumber**](PipelineBuildNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryPipelineConfig"></a>
# **updateRepositoryPipelineConfig**
> PipelinesConfig updateRepositoryPipelineConfig(body, username, repoSlug)



Update the pipelines configuration for a repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelinesConfig body = new PipelinesConfig(); // PipelinesConfig | The updated repository pipelines configuration.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelinesConfig result = apiInstance.updateRepositoryPipelineConfig(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryPipelineConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelinesConfig**](PipelinesConfig.md)| The updated repository pipelines configuration. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelinesConfig**](PipelinesConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryPipelineKeyPair"></a>
# **updateRepositoryPipelineKeyPair**
> PipelineSshKeyPair updateRepositoryPipelineKeyPair(body, username, repoSlug)



Create or update the repository SSH key pair. The private key will be set as a default SSH identity in your build container.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineSshKeyPair body = new PipelineSshKeyPair(); // PipelineSshKeyPair | The created or updated SSH key pair.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
try {
    PipelineSshKeyPair result = apiInstance.updateRepositoryPipelineKeyPair(body, username, repoSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryPipelineKeyPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineSshKeyPair**](PipelineSshKeyPair.md)| The created or updated SSH key pair. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |

### Return type

[**PipelineSshKeyPair**](PipelineSshKeyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryPipelineKnownHost"></a>
# **updateRepositoryPipelineKnownHost**
> PipelineKnownHost updateRepositoryPipelineKnownHost(body, username, repoSlug, knownHostUuid)



Update a repository level known host.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineKnownHost body = new PipelineKnownHost(); // PipelineKnownHost | The updated known host.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String knownHostUuid = "knownHostUuid_example"; // String | The UUID of the known host to update.
try {
    PipelineKnownHost result = apiInstance.updateRepositoryPipelineKnownHost(body, username, repoSlug, knownHostUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryPipelineKnownHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineKnownHost**](PipelineKnownHost.md)| The updated known host. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **knownHostUuid** | **String**| The UUID of the known host to update. |

### Return type

[**PipelineKnownHost**](PipelineKnownHost.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryPipelineSchedule"></a>
# **updateRepositoryPipelineSchedule**
> PipelineSchedule updateRepositoryPipelineSchedule(body, username, repoSlug, scheduleUuid)



Update a schedule.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineSchedule body = new PipelineSchedule(); // PipelineSchedule | The schedule to update.
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String scheduleUuid = "scheduleUuid_example"; // String | The uuid of the schedule.
try {
    PipelineSchedule result = apiInstance.updateRepositoryPipelineSchedule(body, username, repoSlug, scheduleUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryPipelineSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineSchedule**](PipelineSchedule.md)| The schedule to update. |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **scheduleUuid** | **String**| The uuid of the schedule. |

### Return type

[**PipelineSchedule**](PipelineSchedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryPipelineVariable"></a>
# **updateRepositoryPipelineVariable**
> PipelineVariable updateRepositoryPipelineVariable(body, username, repoSlug, variableUuid)



Update a repository level variable.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PipelinesApi;


PipelinesApi apiInstance = new PipelinesApi();
PipelineVariable body = new PipelineVariable(); // PipelineVariable | The updated variable
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String variableUuid = "variableUuid_example"; // String | The UUID of the variable to update.
try {
    PipelineVariable result = apiInstance.updateRepositoryPipelineVariable(body, username, repoSlug, variableUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#updateRepositoryPipelineVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PipelineVariable**](PipelineVariable.md)| The updated variable |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **variableUuid** | **String**| The UUID of the variable to update. |

### Return type

[**PipelineVariable**](PipelineVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

