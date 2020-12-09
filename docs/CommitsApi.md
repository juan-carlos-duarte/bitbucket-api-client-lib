# CommitsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateOrUpdateAnnotations**](CommitsApi.md#bulkCreateOrUpdateAnnotations) | **POST** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations | 
[**createOrUpdateAnnotation**](CommitsApi.md#createOrUpdateAnnotation) | **PUT** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId} | 
[**createOrUpdateReport**](CommitsApi.md#createOrUpdateReport) | **PUT** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId} | 
[**deleteAnnotation**](CommitsApi.md#deleteAnnotation) | **DELETE** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId} | 
[**deleteReport**](CommitsApi.md#deleteReport) | **DELETE** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId} | 
[**getAnnotation**](CommitsApi.md#getAnnotation) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId} | 
[**getAnnotationsForReport**](CommitsApi.md#getAnnotationsForReport) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations | 
[**getReport**](CommitsApi.md#getReport) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId} | 
[**getReportsForCommit**](CommitsApi.md#getReportsForCommit) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/reports | 
[**repositoriesWorkspaceRepoSlugCommitNodeApproveDelete**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeApproveDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/commit/{node}/approve | 
[**repositoriesWorkspaceRepoSlugCommitNodeApprovePost**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeApprovePost) | **POST** /repositories/{workspace}/{repo_slug}/commit/{node}/approve | 
[**repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet) | **GET** /repositories/{workspace}/{repo_slug}/commit/{node}/comments/{comment_id} | 
[**repositoriesWorkspaceRepoSlugCommitNodeCommentsGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeCommentsGet) | **GET** /repositories/{workspace}/{repo_slug}/commit/{node}/comments | 
[**repositoriesWorkspaceRepoSlugCommitNodeCommentsPost**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeCommentsPost) | **POST** /repositories/{workspace}/{repo_slug}/commit/{node}/comments | 
[**repositoriesWorkspaceRepoSlugCommitNodeGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitNodeGet) | **GET** /repositories/{workspace}/{repo_slug}/commit/{node} | 
[**repositoriesWorkspaceRepoSlugCommitsGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitsGet) | **GET** /repositories/{workspace}/{repo_slug}/commits | 
[**repositoriesWorkspaceRepoSlugCommitsPost**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitsPost) | **POST** /repositories/{workspace}/{repo_slug}/commits | 
[**repositoriesWorkspaceRepoSlugCommitsRevisionGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitsRevisionGet) | **GET** /repositories/{workspace}/{repo_slug}/commits/{revision} | 
[**repositoriesWorkspaceRepoSlugCommitsRevisionPost**](CommitsApi.md#repositoriesWorkspaceRepoSlugCommitsRevisionPost) | **POST** /repositories/{workspace}/{repo_slug}/commits/{revision} | 
[**repositoriesWorkspaceRepoSlugDiffSpecGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugDiffSpecGet) | **GET** /repositories/{workspace}/{repo_slug}/diff/{spec} | 
[**repositoriesWorkspaceRepoSlugMergeBaseRevspecGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugMergeBaseRevspecGet) | **GET** /repositories/{workspace}/{repo_slug}/merge-base/{revspec} | 
[**repositoriesWorkspaceRepoSlugPatchSpecGet**](CommitsApi.md#repositoriesWorkspaceRepoSlugPatchSpecGet) | **GET** /repositories/{workspace}/{repo_slug}/patch/{spec} | 

<a name="bulkCreateOrUpdateAnnotations"></a>
# **bulkCreateOrUpdateAnnotations**
> List&lt;ReportAnnotation&gt; bulkCreateOrUpdateAnnotations(body, username, repoSlug, commit, reportId)



Bulk upload of annotations. Annotations are individual findings that have been identified as part of a report, for example, a line of code that represents a vulnerability. These annotations can be attached to a specific file and even a specific line in that file, however, that is optional. Annotations are not mandatory and a report can contain up to 1000 annotations.  Add the annotations you want to upload as objects in a JSON array and make sure each annotation has the external_id field set to a unique value. If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-annotation001. The external id can later be used to identify the report as an alternative to the generated [UUID](https://developer.atlassian.com/bitbucket/api/2/reference/meta/uri-uuid#uuid). You can upload up to 100 annotations per POST request.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --location &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mysystem-001/annotations&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;[   {         \&quot;external_id\&quot;: \&quot;mysystem-annotation001\&quot;,         \&quot;title\&quot;: \&quot;Security scan report\&quot;,         \&quot;annotation_type\&quot;: \&quot;VULNERABILITY\&quot;,         \&quot;summary\&quot;: \&quot;This line represents a security threat.\&quot;,         \&quot;severity\&quot;: \&quot;HIGH\&quot;,       \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Main.java\&quot;,         \&quot;line\&quot;: 42   },   {         \&quot;external_id\&quot;: \&quot;mySystem-annotation002\&quot;,         \&quot;title\&quot;: \&quot;Bug report\&quot;,         \&quot;annotation_type\&quot;: \&quot;BUG\&quot;,         \&quot;result\&quot;: \&quot;FAILED\&quot;,         \&quot;summary\&quot;: \&quot;This line might introduce a bug.\&quot;,         \&quot;severity\&quot;: \&quot;MEDIUM\&quot;,       \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Helper.java\&quot;,         \&quot;line\&quot;: 13   } ]&#x27; &#x60;&#x60;&#x60;  ### Possible field values: annotation_type: VULNERABILITY, CODE_SMELL, BUG result: PASSED, FAILED, IGNORED, SKIPPED severity: HIGH, MEDIUM, LOW, CRITICAL  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
List<ReportAnnotation> body = Arrays.asList(new ReportAnnotation()); // List<ReportAnnotation> | The annotations to create or update
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit for which to retrieve reports.
String reportId = "reportId_example"; // String | Uuid or external-if of the report for which to get annotations for.
try {
    List<ReportAnnotation> result = apiInstance.bulkCreateOrUpdateAnnotations(body, username, repoSlug, commit, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#bulkCreateOrUpdateAnnotations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;ReportAnnotation&gt;**](ReportAnnotation.md)| The annotations to create or update |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit for which to retrieve reports. |
 **reportId** | **String**| Uuid or external-if of the report for which to get annotations for. |

### Return type

[**List&lt;ReportAnnotation&gt;**](ReportAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateAnnotation"></a>
# **createOrUpdateAnnotation**
> ReportAnnotation createOrUpdateAnnotation(body, username, repoSlug, commit, reportId, annotationId)



Creates or updates an individual annotation for the specified report. Annotations are individual findings that have been identified as part of a report, for example, a line of code that represents a vulnerability. These annotations can be attached to a specific file and even a specific line in that file, however, that is optional. Annotations are not mandatory and a report can contain up to 1000 annotations.  Just as reports, annotation needs to be uploaded with a unique ID that can later be used to identify the report as an alternative to the generated [UUID](https://developer.atlassian.com/bitbucket/api/2/reference/meta/uri-uuid#uuid). If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-annotation001.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --request PUT &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mySystem-001/annotations/mysystem-annotation001&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;{     \&quot;title\&quot;: \&quot;Security scan report\&quot;,     \&quot;annotation_type\&quot;: \&quot;VULNERABILITY\&quot;,     \&quot;summary\&quot;: \&quot;This line represents a security thread.\&quot;,     \&quot;severity\&quot;: \&quot;HIGH\&quot;,     \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Main.java\&quot;,     \&quot;line\&quot;: 42 }&#x27; &#x60;&#x60;&#x60;  ### Possible field values: annotation_type: VULNERABILITY, CODE_SMELL, BUG result: PASSED, FAILED, IGNORED, SKIPPED severity: HIGH, MEDIUM, LOW, CRITICAL  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
ReportAnnotation body = new ReportAnnotation(); // ReportAnnotation | The annotation to create or update
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the report belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the report.
String annotationId = "annotationId_example"; // String | Either the uuid or external-id of the annotation.
try {
    ReportAnnotation result = apiInstance.createOrUpdateAnnotation(body, username, repoSlug, commit, reportId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#createOrUpdateAnnotation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportAnnotation**](ReportAnnotation.md)| The annotation to create or update |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the report belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the report. |
 **annotationId** | **String**| Either the uuid or external-id of the annotation. |

### Return type

[**ReportAnnotation**](ReportAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateReport"></a>
# **createOrUpdateReport**
> Report createOrUpdateReport(body, username, repoSlug, commit, reportId)



Creates or updates a report for the specified commit. To upload a report, make sure to generate an ID that is unique across all reports for that commit. If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-001.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --request PUT &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mysystem-001&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;{     \&quot;title\&quot;: \&quot;Security scan report\&quot;,     \&quot;details\&quot;: \&quot;This pull request introduces 10 new dependency vulnerabilities.\&quot;,     \&quot;report_type\&quot;: \&quot;SECURITY\&quot;,     \&quot;reporter\&quot;: \&quot;mySystem\&quot;,     \&quot;link\&quot;: \&quot;http://www.mysystem.com/reports/001\&quot;,     \&quot;result\&quot;: \&quot;FAILED\&quot;,     \&quot;data\&quot;: [         {             \&quot;title\&quot;: \&quot;Duration (seconds)\&quot;,             \&quot;type\&quot;: \&quot;DURATION\&quot;,             \&quot;value\&quot;: 14         },         {             \&quot;title\&quot;: \&quot;Safe to merge?\&quot;,             \&quot;type\&quot;: \&quot;BOOLEAN\&quot;,             \&quot;value\&quot;: false         }     ] }&#x27; &#x60;&#x60;&#x60;  ### Possible field values: report_type: SECURITY, COVERAGE, TEST, BUG result: PASSED, FAILED, PENDING data.type: BOOLEAN, DATE, DURATION, LINK, NUMBER, PERCENTAGE, TEXT  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
Report body = new Report(); // Report | The report to create or update
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the report belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the report.
try {
    Report result = apiInstance.createOrUpdateReport(body, username, repoSlug, commit, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#createOrUpdateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Report**](Report.md)| The report to create or update |
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the report belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the report. |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAnnotation"></a>
# **deleteAnnotation**
> deleteAnnotation(username, repoSlug, commit, reportId, annotationId)



Deletes a single Annotation matching the provided ID.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the annotation belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the annotation.
String annotationId = "annotationId_example"; // String | Either the uuid or external-id of the annotation.
try {
    apiInstance.deleteAnnotation(username, repoSlug, commit, reportId, annotationId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#deleteAnnotation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the annotation belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the annotation. |
 **annotationId** | **String**| Either the uuid or external-id of the annotation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteReport"></a>
# **deleteReport**
> deleteReport(username, repoSlug, commit, reportId)



Deletes a single Report matching the provided ID.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the report belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the report.
try {
    apiInstance.deleteReport(username, repoSlug, commit, reportId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#deleteReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the report belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the report. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAnnotation"></a>
# **getAnnotation**
> ReportAnnotation getAnnotation(username, repoSlug, commit, reportId, annotationId)



Returns a single Annotation matching the provided ID.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the report belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the report.
String annotationId = "annotationId_example"; // String | Either the uuid or external-id of the annotation.
try {
    ReportAnnotation result = apiInstance.getAnnotation(username, repoSlug, commit, reportId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#getAnnotation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the report belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the report. |
 **annotationId** | **String**| Either the uuid or external-id of the annotation. |

### Return type

[**ReportAnnotation**](ReportAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnnotationsForReport"></a>
# **getAnnotationsForReport**
> PaginatedAnnotations getAnnotationsForReport(username, repoSlug, commit, reportId)



Returns a paginated list of Annotations for a specified report.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit for which to retrieve reports.
String reportId = "reportId_example"; // String | Uuid or external-if of the report for which to get annotations for.
try {
    PaginatedAnnotations result = apiInstance.getAnnotationsForReport(username, repoSlug, commit, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#getAnnotationsForReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit for which to retrieve reports. |
 **reportId** | **String**| Uuid or external-if of the report for which to get annotations for. |

### Return type

[**PaginatedAnnotations**](PaginatedAnnotations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReport"></a>
# **getReport**
> Report getReport(username, repoSlug, commit, reportId)



Returns a single Report matching the provided ID.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit the report belongs to.
String reportId = "reportId_example"; // String | Either the uuid or external-id of the report.
try {
    Report result = apiInstance.getReport(username, repoSlug, commit, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit the report belongs to. |
 **reportId** | **String**| Either the uuid or external-id of the report. |

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportsForCommit"></a>
# **getReportsForCommit**
> PaginatedReports getReportsForCommit(username, repoSlug, commit)



Returns a paginated list of Reports linked to this commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.CommitsApi;


CommitsApi apiInstance = new CommitsApi();
String username = "username_example"; // String | The account.
String repoSlug = "repoSlug_example"; // String | The repository.
String commit = "commit_example"; // String | The commit for which to retrieve reports.
try {
    PaginatedReports result = apiInstance.getReportsForCommit(username, repoSlug, commit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#getReportsForCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account. |
 **repoSlug** | **String**| The repository. |
 **commit** | **String**| The commit for which to retrieve reports. |

### Return type

[**PaginatedReports**](PaginatedReports.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeApproveDelete"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeApproveDelete**
> repositoriesWorkspaceRepoSlugCommitNodeApproveDelete(node, repoSlug, workspace)



Redact the authenticated user&#x27;s approval of the specified commit.  This operation is only available to users that have explicit access to the repository. In contrast, just the fact that a repository is publicly accessible to users does not give them the ability to approve commits.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugCommitNodeApproveDelete(node, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeApproveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeApprovePost"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeApprovePost**
> Participant repositoriesWorkspaceRepoSlugCommitNodeApprovePost(node, repoSlug, workspace)



Approve the specified commit as the authenticated user.  This operation is only available to users that have explicit access to the repository. In contrast, just the fact that a repository is publicly accessible to users does not give them the ability to approve commits.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Participant result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeApprovePost(node, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Participant**](Participant.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet**
> CommitComment repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet(commentId, node, repoSlug, workspace)



Returns the specified commit comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
Integer commentId = 56; // Integer | The id of the comment.
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    CommitComment result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet(commentId, node, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **Integer**| The id of the comment. |
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeCommentsGet"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeCommentsGet**
> PaginatedCommitComments repositoriesWorkspaceRepoSlugCommitNodeCommentsGet(node, repoSlug, workspace, q, sort)



Returns the commit&#x27;s comments.  This includes both global and inline comments.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String | Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
String sort = "sort_example"; // String | Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). 
try {
    PaginatedCommitComments result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeCommentsGet(node, repoSlug, workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeCommentsGet");
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
 **sort** | **String**| Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering).  | [optional]

### Return type

[**PaginatedCommitComments**](PaginatedCommitComments.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitNodeCommentsPost"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeCommentsPost**
> repositoriesWorkspaceRepoSlugCommitNodeCommentsPost(body, node, workspace, username, repoSlug)



Creates new comment on the specified commit.  To post a reply to an existing comment, include the &#x60;parent.id&#x60; field:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/atlassian/prlinks/commit/db9ba1e031d07a02603eae0e559a7adc010257fc/comments/ \\   -X POST -u evzijst \\   -H &#x27;Content-Type: application/json&#x27; \\   -d &#x27;{\&quot;content\&quot;: {\&quot;raw\&quot;: \&quot;One more thing!\&quot;},        \&quot;parent\&quot;: {\&quot;id\&quot;: 5728901}}&#x27; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
CommitComment body = new CommitComment(); // CommitComment | The specified comment.
String node = "node_example"; // String | The commit's SHA1.
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String username = "username_example"; // String | This can either be the username or the UUID of the user, surrounded by curly-braces, for example: `{user UUID}`. 
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugCommitNodeCommentsPost(body, node, workspace, username, repoSlug);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CommitComment**](CommitComment.md)| The specified comment. |
 **node** | **String**| The commit&#x27;s SHA1. |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **username** | **String**| This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.  |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugCommitNodeGet"></a>
# **repositoriesWorkspaceRepoSlugCommitNodeGet**
> Commit repositoriesWorkspaceRepoSlugCommitNodeGet(node, repoSlug, workspace)



Returns the specified commit.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a1 {     \&quot;rendered\&quot;: {         \&quot;message\&quot;: {         \&quot;raw\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,         \&quot;markup\&quot;: \&quot;markdown\&quot;,         \&quot;html\&quot;: \&quot;&lt;p&gt;Add a GEORDI_OUTPUT_DIR setting&lt;/p&gt;\&quot;,         \&quot;type\&quot;: \&quot;rendered\&quot;         }     },     \&quot;hash\&quot;: \&quot;f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;,     \&quot;repository\&quot;: {         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;links\&quot;: {             \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi\&quot;             },             \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi\&quot;             },             \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B85d08b4e-571d-44e9-a507-fa476535aa98%7D?ts&#x3D;1730260\&quot;             }         },         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;     },     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;comments\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/comments\&quot;         },         \&quot;patch\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/patch/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi/commits/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;diff\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/diff/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;approve\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/approve\&quot;         },         \&quot;statuses\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/statuses\&quot;         }     },     \&quot;author\&quot;: {         \&quot;raw\&quot;: \&quot;Brodie Rao &lt;a@b.c&gt;\&quot;,         \&quot;type\&quot;: \&quot;author\&quot;,         \&quot;user\&quot;: {             \&quot;display_name\&quot;: \&quot;Brodie Rao\&quot;,             \&quot;uuid\&quot;: \&quot;{9484702e-c663-4afd-aefb-c93a8cd31c28}\&quot;,             \&quot;links\&quot;: {                 \&quot;self\&quot;: {                     \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/%7B9484702e-c663-4afd-aefb-c93a8cd31c28%7D\&quot;                 },                 \&quot;html\&quot;: {                     \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B9484702e-c663-4afd-aefb-c93a8cd31c28%7D/\&quot;                 },                 \&quot;avatar\&quot;: {                     \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/557058:3aae1e05-702a-41e5-81c8-f36f29afb6ca/613070db-28b0-421f-8dba-ae8a87e2a5c7/128\&quot;                 }             },             \&quot;type\&quot;: \&quot;user\&quot;,             \&quot;nickname\&quot;: \&quot;brodie\&quot;,             \&quot;account_id\&quot;: \&quot;557058:3aae1e05-702a-41e5-81c8-f36f29afb6ca\&quot;         }     },     \&quot;summary\&quot;: {         \&quot;raw\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,         \&quot;markup\&quot;: \&quot;markdown\&quot;,         \&quot;html\&quot;: \&quot;&lt;p&gt;Add a GEORDI_OUTPUT_DIR setting&lt;/p&gt;\&quot;,         \&quot;type\&quot;: \&quot;rendered\&quot;     },     \&quot;participants\&quot;: [],     \&quot;parents\&quot;: [         {             \&quot;type\&quot;: \&quot;commit\&quot;,             \&quot;hash\&quot;: \&quot;f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;,             \&quot;links\&quot;: {                 \&quot;self\&quot;: {                     \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;                 },                 \&quot;html\&quot;: {                     \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi/commits/f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;                 }             }         }     ],     \&quot;date\&quot;: \&quot;2012-07-16T19:37:54+00:00\&quot;,     \&quot;message\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,     \&quot;type\&quot;: \&quot;commit\&quot; } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String node = "node_example"; // String | The commit's SHA1.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Commit result = apiInstance.repositoriesWorkspaceRepoSlugCommitNodeGet(node, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitNodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| The commit&#x27;s SHA1. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Commit**](Commit.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitsGet"></a>
# **repositoriesWorkspaceRepoSlugCommitsGet**
> Error repositoriesWorkspaceRepoSlugCommitsGet(repoSlug, workspace)



These are the repository&#x27;s commits. They are paginated and returned in reverse chronological order, similar to the output of &#x60;git log&#x60; and &#x60;hg log&#x60;. Like these tools, the DAG can be filtered.  ## GET /repositories/{workspace}/{repo_slug}/commits/  Returns all commits in the repo in topological order (newest commit first). All branches and tags are included (similar to &#x60;git log --all&#x60; and &#x60;hg log&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/master  Returns all commits on rev &#x60;master&#x60; (similar to &#x60;git log master&#x60;, &#x60;hg log master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/dev?exclude&#x3D;master  Returns all commits on ref &#x60;dev&#x60;, except those that are reachable on &#x60;master&#x60; (similar to &#x60;git log dev ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?exclude&#x3D;master  Returns all commits in the repo that are not on master (similar to &#x60;git log --all ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;fu&amp;exclude&#x3D;fubar  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;fu&#x60; or &#x60;fubar&#x60; (similar to &#x60;git log foo bar ^fu ^fubar&#x60;).  An optional &#x60;path&#x60; parameter can be specified that will limit the results to commits that affect that path. &#x60;path&#x60; can either be a file or a directory. If a directory is specified, commits are returned that have modified any file in the directory tree rooted by &#x60;path&#x60;. It is important to note that if the &#x60;path&#x60; parameter is specified, the commits returned by this endpoint may no longer be a DAG, parent commits that do not modify the path will be omitted from the response.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;README.md&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed the file README.md.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;src/&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed to a file in any file in the directory src or its children.  Because the response could include a very large number of commits, it is paginated. Follow the &#x27;next&#x27; link in the response to navigate to the next page of commits. As with other paginated resources, do not construct your own links.  When the include and exclude parameters are more than can fit in a query string, clients can use a &#x60;x-www-form-urlencoded&#x60; POST instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugCommitsGet(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitsPost"></a>
# **repositoriesWorkspaceRepoSlugCommitsPost**
> Error repositoriesWorkspaceRepoSlugCommitsPost(repoSlug, workspace)



Identical to &#x60;GET /repositories/{workspace}/{repo_slug}/commits&#x60;, except that POST allows clients to place the include and exclude parameters in the request body to avoid URL length issues.  **Note that this resource does NOT support new commit creation.**

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugCommitsPost(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitsRevisionGet"></a>
# **repositoriesWorkspaceRepoSlugCommitsRevisionGet**
> Error repositoriesWorkspaceRepoSlugCommitsRevisionGet(repoSlug, revision, workspace)



These are the repository&#x27;s commits. They are paginated and returned in reverse chronological order, similar to the output of &#x60;git log&#x60; and &#x60;hg log&#x60;. Like these tools, the DAG can be filtered.  ## GET /repositories/{workspace}/{repo_slug}/commits/  Returns all commits in the repo in topological order (newest commit first). All branches and tags are included (similar to &#x60;git log --all&#x60; and &#x60;hg log&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/master  Returns all commits on rev &#x60;master&#x60; (similar to &#x60;git log master&#x60;, &#x60;hg log master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/dev?exclude&#x3D;master  Returns all commits on ref &#x60;dev&#x60;, except those that are reachable on &#x60;master&#x60; (similar to &#x60;git log dev ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?exclude&#x3D;master  Returns all commits in the repo that are not on master (similar to &#x60;git log --all ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;fu&amp;exclude&#x3D;fubar  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;fu&#x60; or &#x60;fubar&#x60; (similar to &#x60;git log foo bar ^fu ^fubar&#x60;).  An optional &#x60;path&#x60; parameter can be specified that will limit the results to commits that affect that path. &#x60;path&#x60; can either be a file or a directory. If a directory is specified, commits are returned that have modified any file in the directory tree rooted by &#x60;path&#x60;. It is important to note that if the &#x60;path&#x60; parameter is specified, the commits returned by this endpoint may no longer be a DAG, parent commits that do not modify the path will be omitted from the response.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;README.md&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed the file README.md.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;src/&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed to a file in any file in the directory src or its children.  Because the response could include a very large number of commits, it is paginated. Follow the &#x27;next&#x27; link in the response to navigate to the next page of commits. As with other paginated resources, do not construct your own links.  When the include and exclude parameters are more than can fit in a query string, clients can use a &#x60;x-www-form-urlencoded&#x60; POST instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String revision = "revision_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugCommitsRevisionGet(repoSlug, revision, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitsRevisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **revision** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugCommitsRevisionPost"></a>
# **repositoriesWorkspaceRepoSlugCommitsRevisionPost**
> Error repositoriesWorkspaceRepoSlugCommitsRevisionPost(repoSlug, revision, workspace)



Identical to &#x60;GET /repositories/{workspace}/{repo_slug}/commits&#x60;, except that POST allows clients to place the include and exclude parameters in the request body to avoid URL length issues.  **Note that this resource does NOT support new commit creation.**

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String revision = "revision_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugCommitsRevisionPost(repoSlug, revision, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugCommitsRevisionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **revision** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugDiffSpecGet"></a>
# **repositoriesWorkspaceRepoSlugDiffSpecGet**
> repositoriesWorkspaceRepoSlugDiffSpecGet(repoSlug, spec, workspace, context, path, ignoreWhitespace, binary, renames, merge)



Produces a raw, git-style diff for either a single commit (diffed against its first parent), or a revspec of 2 commits (e.g. &#x60;3a8b42..9ff173&#x60; where the first commit represents the source and the second commit the destination).  In case of the latter (diffing a revspec), a 3-way diff, or merge diff, is computed. This shows the changes introduced by the left branch (&#x60;3a8b42&#x60; in our example) as compared againt the right branch (&#x60;9ff173&#x60;).  This is equivalent to merging the left branch into the right branch and then computing the diff of the merge commit against its first parent (the right branch). This follows the same behavior as pull requests that also show this style of 3-way, or merge diff.  While similar to patches, diffs:  * Don&#x27;t have a commit header (username, commit message, etc) * Support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter   the diff to just that one file diff  The raw diff is returned as-is, in whatever encoding the files in the repository use. It is not decoded into unicode. As such, the content-type is &#x60;text/plain&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String spec = "spec_example"; // String | A commit SHA (e.g. `3a8b42`) or a commit range using double dot notation (e.g. `3a8b42..9ff173`). 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Integer context = 56; // Integer | Generate diffs with <n> lines of context instead of the usual three.
String path = "path_example"; // String | Limit the diff to a particular file (this parameter can be repeated for multiple paths).
Boolean ignoreWhitespace = true; // Boolean | Generate diffs that ignore whitespace.
Boolean binary = true; // Boolean | Generate diffs that include binary files, true if omitted.
Boolean renames = true; // Boolean | Whether to perform rename detection, true if omitted.
Boolean merge = true; // Boolean | If true, the source commit is merged into the destination commit, and then a diff from the destination to the merge result is returned. If false, a simple 'two dot' diff between the source and destination is returned. True if omitted.
try {
    apiInstance.repositoriesWorkspaceRepoSlugDiffSpecGet(repoSlug, spec, workspace, context, path, ignoreWhitespace, binary, renames, merge);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugDiffSpecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **spec** | **String**| A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;).  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **context** | **Integer**| Generate diffs with &lt;n&gt; lines of context instead of the usual three. | [optional]
 **path** | **String**| Limit the diff to a particular file (this parameter can be repeated for multiple paths). | [optional]
 **ignoreWhitespace** | **Boolean**| Generate diffs that ignore whitespace. | [optional]
 **binary** | **Boolean**| Generate diffs that include binary files, true if omitted. | [optional]
 **renames** | **Boolean**| Whether to perform rename detection, true if omitted. | [optional]
 **merge** | **Boolean**| If true, the source commit is merged into the destination commit, and then a diff from the destination to the merge result is returned. If false, a simple &#x27;two dot&#x27; diff between the source and destination is returned. True if omitted. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugMergeBaseRevspecGet"></a>
# **repositoriesWorkspaceRepoSlugMergeBaseRevspecGet**
> Commit repositoriesWorkspaceRepoSlugMergeBaseRevspecGet(repoSlug, revspec, workspace)



Returns the best common ancestor between two commits, specified in a revspec of 2 commits (e.g. 3a8b42..9ff173).  If more than one best common ancestor exists, only one will be returned. It is unspecified which will be returned.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String revspec = "revspec_example"; // String | A commit range using double dot notation (e.g. `3a8b42..9ff173`). 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Commit result = apiInstance.repositoriesWorkspaceRepoSlugMergeBaseRevspecGet(repoSlug, revspec, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugMergeBaseRevspecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **revspec** | **String**| A commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;).  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Commit**](Commit.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPatchSpecGet"></a>
# **repositoriesWorkspaceRepoSlugPatchSpecGet**
> repositoriesWorkspaceRepoSlugPatchSpecGet(repoSlug, spec, workspace)



Produces a raw patch for a single commit (diffed against its first parent), or a patch-series for a revspec of 2 commits (e.g. &#x60;3a8b42..9ff173&#x60; where the first commit represents the source and the second commit the destination).  In case of the latter (diffing a revspec), a patch series is returned for the commits on the source branch (&#x60;3a8b42&#x60; and its ancestors in our example). For Mercurial, a single patch is returned that combines the changes of all commits on the source branch.  While similar to diffs, patches:  * Have a commit header (username, commit message, etc) * Do not support the &#x60;path&#x3D;foo/bar.py&#x60; query parameter  The raw patch is returned as-is, in whatever encoding the files in the repository use. It is not decoded into unicode. As such, the content-type is &#x60;text/plain&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String spec = "spec_example"; // String | A commit SHA (e.g. `3a8b42`) or a commit range using double dot notation (e.g. `3a8b42..9ff173`). 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPatchSpecGet(repoSlug, spec, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#repositoriesWorkspaceRepoSlugPatchSpecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **spec** | **String**| A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;).  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

