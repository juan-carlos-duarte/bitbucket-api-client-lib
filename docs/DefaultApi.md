# DefaultApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesWorkspaceRepoSlugDiffstatSpecGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugDiffstatSpecGet) | **GET** /repositories/{workspace}/{repo_slug}/diffstat/{spec} | 
[**repositoriesWorkspaceRepoSlugIssuesExportPost**](DefaultApi.md#repositoriesWorkspaceRepoSlugIssuesExportPost) | **POST** /repositories/{workspace}/{repo_slug}/issues/export | 
[**repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet) | **GET** /repositories/{workspace}/{repo_slug}/issues/export/{repo_name}-issues-{task_id}.zip | 
[**repositoriesWorkspaceRepoSlugIssuesImportGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugIssuesImportGet) | **GET** /repositories/{workspace}/{repo_slug}/issues/import | 
[**repositoriesWorkspaceRepoSlugIssuesImportPost**](DefaultApi.md#repositoriesWorkspaceRepoSlugIssuesImportPost) | **POST** /repositories/{workspace}/{repo_slug}/issues/import | 
[**repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/logs/{log_uuid} | 
[**repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports | 
[**repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports/test_cases | 
[**repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet**](DefaultApi.md#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet) | **GET** /repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports/test_cases/{test_case_uuid}/test_case_reasons | 
[**teamsUsernamePermissionsGet**](DefaultApi.md#teamsUsernamePermissionsGet) | **GET** /teams/{username}/permissions | 
[**teamsUsernamePermissionsRepositoriesGet**](DefaultApi.md#teamsUsernamePermissionsRepositoriesGet) | **GET** /teams/{username}/permissions/repositories | 
[**teamsUsernamePermissionsRepositoriesRepoSlugGet**](DefaultApi.md#teamsUsernamePermissionsRepositoriesRepoSlugGet) | **GET** /teams/{username}/permissions/repositories/{repo_slug} | 
[**userPermissionsTeamsGet**](DefaultApi.md#userPermissionsTeamsGet) | **GET** /user/permissions/teams | 
[**workspacesWorkspacePermissionsRepositoriesGet**](DefaultApi.md#workspacesWorkspacePermissionsRepositoriesGet) | **GET** /workspaces/{workspace}/permissions/repositories | 
[**workspacesWorkspacePermissionsRepositoriesRepoSlugGet**](DefaultApi.md#workspacesWorkspacePermissionsRepositoriesRepoSlugGet) | **GET** /workspaces/{workspace}/permissions/repositories/{repo_slug} | 

<a name="repositoriesWorkspaceRepoSlugDiffstatSpecGet"></a>
# **repositoriesWorkspaceRepoSlugDiffstatSpecGet**
> PaginatedDiffstats repositoriesWorkspaceRepoSlugDiffstatSpecGet(repoSlug, spec, workspace, ignoreWhitespace, merge, path, renames)



Returns the diff stat for the specified commit.  Diff stat responses contain a record for every path modified by the commit and lists the number of lines added and removed for each file.   Example: &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/diffstat/d222fa2..e174964 {     \&quot;pagelen\&quot;: 500,     \&quot;values\&quot;: [         {             \&quot;type\&quot;: \&quot;diffstat\&quot;,             \&quot;status\&quot;: \&quot;modified\&quot;,             \&quot;lines_removed\&quot;: 1,             \&quot;lines_added\&quot;: 2,             \&quot;old\&quot;: {                 \&quot;path\&quot;: \&quot;setup.py\&quot;,                 \&quot;escaped_path\&quot;: \&quot;setup.py\&quot;,                 \&quot;type\&quot;: \&quot;commit_file\&quot;,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/src/e1749643d655d7c7014001a6c0f58abaf42ad850/setup.py\&quot;                     }                 }             },             \&quot;new\&quot;: {                 \&quot;path\&quot;: \&quot;setup.py\&quot;,                 \&quot;escaped_path\&quot;: \&quot;setup.py\&quot;,                 \&quot;type\&quot;: \&quot;commit_file\&quot;,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/src/d222fa235229c55dad20b190b0b571adf737d5a6/setup.py\&quot;                     }                 }             }         }     ],     \&quot;page\&quot;: 1,     \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String spec = "spec_example"; // String | A commit SHA (e.g. `3a8b42`) or a commit range using double dot notation (e.g. `3a8b42..9ff173`). 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Boolean ignoreWhitespace = true; // Boolean | Generate diffs that ignore whitespace
Boolean merge = true; // Boolean | If true, the source commit is merged into the destination commit, and then a diffstat from the destination to the merge result is returned. If false, a simple 'two dot' diffstat between the source and destination is returned. True if omitted.
String path = "path_example"; // String | Limit the diffstat to a particular file (this parameter can be repeated for multiple paths).
Boolean renames = true; // Boolean | Whether to perform rename detection, true if omitted.
try {
    PaginatedDiffstats result = apiInstance.repositoriesWorkspaceRepoSlugDiffstatSpecGet(repoSlug, spec, workspace, ignoreWhitespace, merge, path, renames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugDiffstatSpecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **spec** | **String**| A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;).  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **ignoreWhitespace** | **Boolean**| Generate diffs that ignore whitespace | [optional]
 **merge** | **Boolean**| If true, the source commit is merged into the destination commit, and then a diffstat from the destination to the merge result is returned. If false, a simple &#x27;two dot&#x27; diffstat between the source and destination is returned. True if omitted. | [optional]
 **path** | **String**| Limit the diffstat to a particular file (this parameter can be repeated for multiple paths). | [optional]
 **renames** | **Boolean**| Whether to perform rename detection, true if omitted. | [optional]

### Return type

[**PaginatedDiffstats**](PaginatedDiffstats.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugIssuesExportPost"></a>
# **repositoriesWorkspaceRepoSlugIssuesExportPost**
> repositoriesWorkspaceRepoSlugIssuesExportPost(repoSlug, workspace, body)



A POST request to this endpoint initiates a new background celery task that archives the repo&#x27;s issues.  For example, you can run:  curl -u &lt;username&gt; -X POST http://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/ issues/export  When the job has been accepted, it will return a 202 (Accepted) along with a unique url to this job in the &#x27;Location&#x27; response header. This url is the endpoint for where the user can obtain their zip files.\&quot;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
ExportOptions body = new ExportOptions(); // ExportOptions | The options to apply to the export. Available options include `project_key` and `project_name` which, if specified, are used as the project key and name in the exported Jira json format. Option `send_email` specifies whether an email should be sent upon export result. Option `include_attachments` specifies whether attachments are included in the export.
try {
    apiInstance.repositoriesWorkspaceRepoSlugIssuesExportPost(repoSlug, workspace, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugIssuesExportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**ExportOptions**](ExportOptions.md)| The options to apply to the export. Available options include &#x60;project_key&#x60; and &#x60;project_name&#x60; which, if specified, are used as the project key and name in the exported Jira json format. Option &#x60;send_email&#x60; specifies whether an email should be sent upon export result. Option &#x60;include_attachments&#x60; specifies whether attachments are included in the export. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet"></a>
# **repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet**
> IssueJobStatus repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet(repoSlug, workspace, repoName, taskId)



This endpoint is used to poll for the progress of an issue export job and return the zip file after the job is complete. As long as the job is running, this will return a 200 response with in the response body a description of the current status.  After the job has been scheduled, but before it starts executing, this endpoint&#x27;s response is:  {  \&quot;type\&quot;: \&quot;issue_job_status\&quot;,  \&quot;status\&quot;: \&quot;ACCEPTED\&quot;,  \&quot;phase\&quot;: \&quot;Initializing\&quot;,  \&quot;total\&quot;: 0,  \&quot;count\&quot;: 0,  \&quot;pct\&quot;: 0 }   Then once it starts running, it becomes:  {  \&quot;type\&quot;: \&quot;issue_job_status\&quot;,  \&quot;status\&quot;: \&quot;STARTED\&quot;,  \&quot;phase\&quot;: \&quot;Attachments\&quot;,  \&quot;total\&quot;: 15,  \&quot;count\&quot;: 11,  \&quot;pct\&quot;: 73 }  Once the job has successfully completed, it returns a stream of the zip file.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String repoName = "repoName_example"; // String | The name of the repo
String taskId = "taskId_example"; // String | The ID of the export task
try {
    IssueJobStatus result = apiInstance.repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet(repoSlug, workspace, repoName, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **repoName** | **String**| The name of the repo |
 **taskId** | **String**| The ID of the export task |

### Return type

[**IssueJobStatus**](IssueJobStatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugIssuesImportGet"></a>
# **repositoriesWorkspaceRepoSlugIssuesImportGet**
> IssueJobStatus repositoriesWorkspaceRepoSlugIssuesImportGet(repoSlug, workspace)



When using GET, this endpoint reports the status of the current import task. Request example:  &#x60;&#x60;&#x60; $ curl -u &lt;username&gt; -X GET https://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/issues/import &#x60;&#x60;&#x60;  After the job has been scheduled, but before it starts executing, this endpoint&#x27;s response is:  &#x60;&#x60;&#x60; &lt; HTTP/1.1 202 Accepted {     \&quot;type\&quot;: \&quot;issue_job_status\&quot;,     \&quot;status\&quot;: \&quot;PENDING\&quot;,     \&quot;phase\&quot;: \&quot;Attachments\&quot;,     \&quot;total\&quot;: 15,     \&quot;count\&quot;: 0,     \&quot;percent\&quot;: 0 } &#x60;&#x60;&#x60;  Once it starts running, it is a 202 response with status STARTED and progress filled.  After it is finished, it becomes a 200 response with status SUCCESS or FAILURE.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    IssueJobStatus result = apiInstance.repositoriesWorkspaceRepoSlugIssuesImportGet(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugIssuesImportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**IssueJobStatus**](IssueJobStatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugIssuesImportPost"></a>
# **repositoriesWorkspaceRepoSlugIssuesImportPost**
> IssueJobStatus repositoriesWorkspaceRepoSlugIssuesImportPost(repoSlug, workspace)



A POST request to this endpoint will import the zip file given by the archive parameter into the repository. All existing issues will be deleted and replaced by the contents of the imported zip file.  Imports are done through a multipart/form-data POST. There is one valid and required form field, with the name \&quot;archive,\&quot; which needs to be a file field:  &#x60;&#x60;&#x60; $ curl -u &lt;username&gt; -X POST -F archive&#x3D;@/path/to/file.zip https://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/issues/import &#x60;&#x60;&#x60;  When the import job is accepted, here is example output:  &#x60;&#x60;&#x60; &lt; HTTP/1.1 202 Accepted  {     \&quot;type\&quot;: \&quot;issue_job_status\&quot;,     \&quot;status\&quot;: \&quot;ACCEPTED\&quot;,     \&quot;phase\&quot;: \&quot;Attachments\&quot;,     \&quot;total\&quot;: 15,     \&quot;count\&quot;: 0,     \&quot;percent\&quot;: 0 } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    IssueJobStatus result = apiInstance.repositoriesWorkspaceRepoSlugIssuesImportPost(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugIssuesImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**IssueJobStatus**](IssueJobStatus.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet"></a>
# **repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet**
> repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet()



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet"></a>
# **repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet**
> repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet()



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet"></a>
# **repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet**
> repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet()



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet"></a>
# **repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet**
> repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet()



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="teamsUsernamePermissionsGet"></a>
# **teamsUsernamePermissionsGet**
> PaginatedTeamPermissions teamsUsernamePermissionsGet(username, q, sort)



Returns an object for each team permission a user on the team has.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  Permissions returned are effective permissions — if a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;admin&#x60; * &#x60;collaborator&#x60;  Only users with admin permission for the team may access this resource.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;permission\&quot;: \&quot;admin\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     },     {       \&quot;permission\&quot;: \&quot;collaborator\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;seanaty\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by team, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;user.uuid&#x3D;\&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;admin\&quot;&#x60; * &#x60;sort&#x3D;team.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort). 
try {
    PaginatedTeamPermissions result = apiInstance.teamsUsernamePermissionsGet(username, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#teamsUsernamePermissionsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedTeamPermissions**](PaginatedTeamPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernamePermissionsRepositoriesGet"></a>
# **teamsUsernamePermissionsRepositoriesGet**
> PaginatedRepositoryPermissions teamsUsernamePermissionsRepositoriesGet(username, q, sort)



Returns an object for each repository permission for all of a team’s repositories.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  If the username URL parameter refers to a user account instead of a team account, an object containing the repository permissions of all the username&#x27;s repositories will be returned.  Permissions returned are effective permissions — the highest level of permission the user has. This does not include public repositories that users are not granted any specific permission in, and does not distinguish between direct and indirect privileges.  Only users with admin permission for the team may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions/repositories  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by repository, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;repository.name&#x3D;\&quot;geordi\&quot;&#x60; or &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
try {
    PaginatedRepositoryPermissions result = apiInstance.teamsUsernamePermissionsRepositoriesGet(username, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#teamsUsernamePermissionsRepositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedRepositoryPermissions**](PaginatedRepositoryPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsUsernamePermissionsRepositoriesRepoSlugGet"></a>
# **teamsUsernamePermissionsRepositoriesRepoSlugGet**
> PaginatedRepositoryPermissions teamsUsernamePermissionsRepositoriesRepoSlugGet(repoSlug, username, q, sort)



Returns an object for each repository permission of a given repository.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  If the username URL parameter refers to a user account instead of a team account, an object containing the repository permissions of the username&#x27;s repository will be returned.  Permissions returned are effective permissions — the highest level of permission the user has. This does not include public repositories that users are not granted any specific permission in, and does not distinguish between direct and indirect privileges.  Only users with admin permission for the repository may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions/repositories/geordi  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String username = "username_example"; // String | This can either be the username or the UUID of the account, surrounded by curly-braces, for example: `{account UUID}`. An account is either a team or user. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
try {
    PaginatedRepositoryPermissions result = apiInstance.teamsUsernamePermissionsRepositoriesRepoSlugGet(repoSlug, username, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#teamsUsernamePermissionsRepositoriesRepoSlugGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **username** | **String**| This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedRepositoryPermissions**](PaginatedRepositoryPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userPermissionsTeamsGet"></a>
# **userPermissionsTeamsGet**
> PaginatedTeamPermissions userPermissionsTeamsGet(q, sort)



Returns an object for each team the caller is a member of, and their effective role — the highest level of privilege the caller has. If a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;admin&#x60; * &#x60;collaborator&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/user/permissions/teams  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;permission\&quot;: \&quot;admin\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by team or permission by adding the following query string parameters:  * &#x60;q&#x3D;team.uuid&#x3D;\&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;admin\&quot;&#x60; * &#x60;sort&#x3D;team.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort). 
try {
    PaginatedTeamPermissions result = apiInstance.userPermissionsTeamsGet(q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userPermissionsTeamsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedTeamPermissions**](PaginatedTeamPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspacePermissionsRepositoriesGet"></a>
# **workspacesWorkspacePermissionsRepositoriesGet**
> PaginatedRepositoryPermissions workspacesWorkspacePermissionsRepositoriesGet(workspace, q, sort)



Returns an object for each repository permission for all of a workspace&#x27;s repositories.  Permissions returned are effective permissions: the highest level of permission the user has. This does not distinguish between direct and indirect (group) privileges.  Only users with admin permission for the team may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces/atlassian_tutorial/permissions/repositories  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Jeff Zeng\&quot;,         \&quot;uuid\&quot;: \&quot;{47f92a9a-c3a3-4d0b-bc4e-782a969c5c72}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;whee\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/whee\&quot;,         \&quot;uuid\&quot;: \&quot;{30ba25e9-51ff-4555-8dd0-fc7ee2fa0895}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 3 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by repository, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;repository.name&#x3D;\&quot;geordi\&quot;&#x60; or &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
try {
    PaginatedRepositoryPermissions result = apiInstance.workspacesWorkspacePermissionsRepositoriesGet(workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#workspacesWorkspacePermissionsRepositoriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedRepositoryPermissions**](PaginatedRepositoryPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workspacesWorkspacePermissionsRepositoriesRepoSlugGet"></a>
# **workspacesWorkspacePermissionsRepositoriesRepoSlugGet**
> PaginatedRepositoryPermissions workspacesWorkspacePermissionsRepositoriesRepoSlugGet(repoSlug, workspace, q, sort)



Returns an object for the repository permission of each user in the requested repository.  Permissions returned are effective permissions: the highest level of permission the user has. This does not distinguish between direct and indirect (group) privileges.  Only users with admin permission for the repository may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces/atlassian_tutorial/permissions/repositories/geordi  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String |  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
String sort = "sort_example"; // String |  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
try {
    PaginatedRepositoryPermissions result = apiInstance.workspacesWorkspacePermissionsRepositoriesRepoSlugGet(repoSlug, workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#workspacesWorkspacePermissionsRepositoriesRepoSlugGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **q** | **String**|  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering). | [optional]
 **sort** | **String**|  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort).  | [optional]

### Return type

[**PaginatedRepositoryPermissions**](PaginatedRepositoryPermissions.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

