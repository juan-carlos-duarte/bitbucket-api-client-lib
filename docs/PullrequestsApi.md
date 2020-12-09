# PullrequestsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPullrequestsForCommit**](PullrequestsApi.md#getPullrequestsForCommit) | **GET** /repositories/{workspace}/{repo_slug}/commit/{commit}/pullrequests | Returns a paginated list of all pull requests as part of which this commit was reviewed. Pull Request Commit Links app must be installed first before using this API; installation automatically occurs when &#x27;Go to pull request&#x27; is clicked from the web interface for a commit&#x27;s details.
[**pullrequestsSelectedUserGet**](PullrequestsApi.md#pullrequestsSelectedUserGet) | **GET** /pullrequests/{selected_user} | 
[**repositoriesWorkspaceRepoSlugDefaultReviewersGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugDefaultReviewersGet) | **GET** /repositories/{workspace}/{repo_slug}/default-reviewers | 
[**repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet) | **GET** /repositories/{workspace}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut) | **PUT** /repositories/{workspace}/{repo_slug}/default-reviewers/{target_username} | 
[**repositoriesWorkspaceRepoSlugPullrequestsActivityGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsActivityGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/activity | 
[**repositoriesWorkspaceRepoSlugPullrequestsGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests | 
[**repositoriesWorkspaceRepoSlugPullrequestsPost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/activity | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/approve | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut) | **PUT** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/commits | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/decline | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/diff | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/diffstat | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/merge | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/merge/task-status/{task_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/patch | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut) | **PUT** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id} | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete) | **DELETE** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/request-changes | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost) | **POST** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/request-changes | 
[**repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet**](PullrequestsApi.md#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet) | **GET** /repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/statuses | 

<a name="getPullrequestsForCommit"></a>
# **getPullrequestsForCommit**
> PaginatedPullrequests getPullrequestsForCommit(username, repoSlug, commit, page, pagelen)

Returns a paginated list of all pull requests as part of which this commit was reviewed. Pull Request Commit Links app must be installed first before using this API; installation automatically occurs when &#x27;Go to pull request&#x27; is clicked from the web interface for a commit&#x27;s details.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.api.PullrequestsApi;


PullrequestsApi apiInstance = new PullrequestsApi();
String username = "username_example"; // String | The account; either the UUID in curly braces, or the account_id
String repoSlug = "repoSlug_example"; // String | The repository; either the UUID in curly braces, or the slug
String commit = "commit_example"; // String | The SHA1 of the commit
Integer page = 1; // Integer | Which page to retrieve
Integer pagelen = 30; // Integer | How many pull requests to retrieve per page
try {
    PaginatedPullrequests result = apiInstance.getPullrequestsForCommit(username, repoSlug, commit, page, pagelen);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#getPullrequestsForCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The account; either the UUID in curly braces, or the account_id |
 **repoSlug** | **String**| The repository; either the UUID in curly braces, or the slug |
 **commit** | **String**| The SHA1 of the commit |
 **page** | **Integer**| Which page to retrieve | [optional] [default to 1]
 **pagelen** | **Integer**| How many pull requests to retrieve per page | [optional] [default to 30]

### Return type

[**PaginatedPullrequests**](PaginatedPullrequests.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pullrequestsSelectedUserGet"></a>
# **pullrequestsSelectedUserGet**
> PaginatedPullrequests pullrequestsSelectedUserGet(selectedUser, state)



Returns all pull requests authored by the specified user.  By default only open pull requests are returned. This can be controlled using the &#x60;state&#x60; query parameter. To retrieve pull requests that are in one of multiple states, repeat the &#x60;state&#x60; parameter for each individual state.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../meta/filtering) for more details.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String selectedUser = "selectedUser_example"; // String | This can either be the username of the pull request author, the author's UUID surrounded by curly-braces, for example: `{account UUID}`, or the author's Atlassian ID. 
String state = "state_example"; // String | Only return pull requests that are in this state. This parameter can be repeated.
try {
    PaginatedPullrequests result = apiInstance.pullrequestsSelectedUserGet(selectedUser, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#pullrequestsSelectedUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **selectedUser** | **String**| This can either be the username of the pull request author, the author&#x27;s UUID surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, or the author&#x27;s Atlassian ID.  |
 **state** | **String**| Only return pull requests that are in this state. This parameter can be repeated. | [optional] [enum: MERGED, SUPERSEDED, OPEN, DECLINED]

### Return type

[**PaginatedPullrequests**](PaginatedPullrequests.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugDefaultReviewersGet"></a>
# **repositoriesWorkspaceRepoSlugDefaultReviewersGet**
> repositoriesWorkspaceRepoSlugDefaultReviewersGet(repoSlug, workspace)



Returns the repository&#x27;s default reviewers.  These are the users that are automatically added as reviewers on every new pull request that is created.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugDefaultReviewersGet(repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugDefaultReviewersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete"></a>
# **repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete**
> Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete(repoSlug, targetUsername, workspace)



Removes a default reviewer from the repository.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String targetUsername = "targetUsername_example"; // String | This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: `{account UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete(repoSlug, targetUsername, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **targetUsername** | **String**| This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet"></a>
# **repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet**
> Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet(repoSlug, targetUsername, workspace)



Returns the specified reviewer.  This can be used to test whether a user is among the repository&#x27;s default reviewers list. A 404 indicates that that specified user is not a default reviewer.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String targetUsername = "targetUsername_example"; // String | This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: `{account UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet(repoSlug, targetUsername, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **targetUsername** | **String**| This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut"></a>
# **repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut**
> Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut(repoSlug, targetUsername, workspace)



Adds the specified user to the repository&#x27;s list of default reviewers.  This method is idempotent. Adding a user a second time has no effect.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String targetUsername = "targetUsername_example"; // String | This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: `{account UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut(repoSlug, targetUsername, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **targetUsername** | **String**| This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsActivityGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsActivityGet**
> repositoriesWorkspaceRepoSlugPullrequestsActivityGet(repoSlug, workspace)



Returns a paginated list of the pull request&#x27;s activity log.  This handler serves both a v20 and internal endpoint. The v20 endpoint returns reviewer comments, updates, and approvals. The internal endpoint includes those plus tasks and attachments.  Comments created on a file or a line of code have an inline property.  Comment example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;comment\&quot;: {                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695/comments/118571088\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695/_/diff#comment-118571088\&quot;                     }                 },                 \&quot;deleted\&quot;: false,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;content\&quot;: {                     \&quot;raw\&quot;: \&quot;inline with to a dn from lines\&quot;,                     \&quot;markup\&quot;: \&quot;markdown\&quot;,                     \&quot;html\&quot;: \&quot;&lt;p&gt;inline with to a dn from lines&lt;/p&gt;\&quot;,                     \&quot;type\&quot;: \&quot;rendered\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;updated_on\&quot;: \&quot;2019-09-27T00:33:46.055384+00:00\&quot;,                 \&quot;inline\&quot;: {                     \&quot;context_lines\&quot;: \&quot;\&quot;,                     \&quot;to\&quot;: null,                     \&quot;path\&quot;: \&quot;\&quot;,                     \&quot;outdated\&quot;: false,                     \&quot;from\&quot;: 211                 },                 \&quot;type\&quot;: \&quot;pullrequest_comment\&quot;,                 \&quot;id\&quot;: 118571088             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Updates include a state property of OPEN, MERGED, or DECLINED.  Update example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;update\&quot;: {                 \&quot;description\&quot;: \&quot;\&quot;,                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;,                 \&quot;destination\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;6a2c16e4a152\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/6a2c16e4a152\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/6a2c16e4a152\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;master\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;reason\&quot;: \&quot;\&quot;,                 \&quot;source\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;728c8bad1813\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/728c8bad1813\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/728c8bad1813\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;username/NONE-add-onClick-prop-for-accessibility\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;state\&quot;: \&quot;OPEN\&quot;,                 \&quot;author\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;date\&quot;: \&quot;2019-05-10T06:48:25.305565+00:00\&quot;             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Approval example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;approval\&quot;: {                 \&quot;date\&quot;: \&quot;2019-09-27T00:37:19.849534+00:00\&quot;,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 }             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsActivityGet(repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsGet**
> PaginatedPullrequests repositoriesWorkspaceRepoSlugPullrequestsGet(repoSlug, workspace, state)



Returns all pull requests on the specified repository.  By default only open pull requests are returned. This can be controlled using the &#x60;state&#x60; query parameter. To retrieve pull requests that are in one of multiple states, repeat the &#x60;state&#x60; parameter for each individual state.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../meta/filtering) for more details.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String state = "state_example"; // String | Only return pull requests that are in this state. This parameter can be repeated.
try {
    PaginatedPullrequests result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsGet(repoSlug, workspace, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **state** | **String**| Only return pull requests that are in this state. This parameter can be repeated. | [optional] [enum: MERGED, SUPERSEDED, OPEN, DECLINED]

### Return type

[**PaginatedPullrequests**](PaginatedPullrequests.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPost**
> Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPost(repoSlug, workspace, body)



Creates a new pull request where the destination repository is this repository and the author is the authenticated user.  The minimum required fields to create a pull request are &#x60;title&#x60; and &#x60;source&#x60;, specified by a branch name.  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/my-username/my-repository/pullrequests \\     -u my-username:my-password \\     --request POST \\     --header &#x27;Content-Type: application/json&#x27; \\     --data &#x27;{         \&quot;title\&quot;: \&quot;My Title\&quot;,         \&quot;source\&quot;: {             \&quot;branch\&quot;: {                 \&quot;name\&quot;: \&quot;staging\&quot;             }         }     }&#x27; &#x60;&#x60;&#x60;  If the pull request&#x27;s &#x60;destination&#x60; is not specified, it will default to the &#x60;repository.mainbranch&#x60;. To open a pull request to a different branch, say from a feature branch to a staging branch, specify a &#x60;destination&#x60; (same format as the &#x60;source&#x60;):  &#x60;&#x60;&#x60; {     \&quot;title\&quot;: \&quot;My Title\&quot;,     \&quot;source\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;my-feature-branch\&quot;         }     },     \&quot;destination\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;staging\&quot;         }     } } &#x60;&#x60;&#x60;  Reviewers can be specified by adding an array of user objects as the &#x60;reviewers&#x60; property.  &#x60;&#x60;&#x60; {     \&quot;title\&quot;: \&quot;My Title\&quot;,     \&quot;source\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;my-feature-branch\&quot;         }     },     \&quot;reviewers\&quot;: [         {             \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;         }     ] } &#x60;&#x60;&#x60;  Other fields:  * &#x60;description&#x60; - a string * &#x60;close_source_branch&#x60; - boolean that specifies if the source branch should be closed upon merging

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Pullrequest body = new Pullrequest(); // Pullrequest | The new pull request.

The request URL you POST to becomes the destination repository URL. For this reason, you must specify an explicit source repository in the request object if you want to pull from a different repository (fork).

Since not all elements are required or even mutable, you only need to include the elements you want to initialize, such as the source branch and the title.
try {
    Pullrequest result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPost(repoSlug, workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**Pullrequest**](Pullrequest.md)| The new pull request.

The request URL you POST to becomes the destination repository URL. For this reason, you must specify an explicit source repository in the request object if you want to pull from a different repository (fork).

Since not all elements are required or even mutable, you only need to include the elements you want to initialize, such as the source branch and the title. | [optional]

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet(pullRequestId, repoSlug, workspace)



Returns a paginated list of the pull request&#x27;s activity log.  This handler serves both a v20 and internal endpoint. The v20 endpoint returns reviewer comments, updates, and approvals. The internal endpoint includes those plus tasks and attachments.  Comments created on a file or a line of code have an inline property.  Comment example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;comment\&quot;: {                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695/comments/118571088\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695/_/diff#comment-118571088\&quot;                     }                 },                 \&quot;deleted\&quot;: false,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;content\&quot;: {                     \&quot;raw\&quot;: \&quot;inline with to a dn from lines\&quot;,                     \&quot;markup\&quot;: \&quot;markdown\&quot;,                     \&quot;html\&quot;: \&quot;&lt;p&gt;inline with to a dn from lines&lt;/p&gt;\&quot;,                     \&quot;type\&quot;: \&quot;rendered\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;updated_on\&quot;: \&quot;2019-09-27T00:33:46.055384+00:00\&quot;,                 \&quot;inline\&quot;: {                     \&quot;context_lines\&quot;: \&quot;\&quot;,                     \&quot;to\&quot;: null,                     \&quot;path\&quot;: \&quot;\&quot;,                     \&quot;outdated\&quot;: false,                     \&quot;from\&quot;: 211                 },                 \&quot;type\&quot;: \&quot;pullrequest_comment\&quot;,                 \&quot;id\&quot;: 118571088             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Updates include a state property of OPEN, MERGED, or DECLINED.  Update example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;update\&quot;: {                 \&quot;description\&quot;: \&quot;\&quot;,                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;,                 \&quot;destination\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;6a2c16e4a152\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/6a2c16e4a152\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/6a2c16e4a152\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;master\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;reason\&quot;: \&quot;\&quot;,                 \&quot;source\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;728c8bad1813\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/728c8bad1813\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/728c8bad1813\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;username/NONE-add-onClick-prop-for-accessibility\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;state\&quot;: \&quot;OPEN\&quot;,                 \&quot;author\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;date\&quot;: \&quot;2019-05-10T06:48:25.305565+00:00\&quot;             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Approval example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;approval\&quot;: {                 \&quot;date\&quot;: \&quot;2019-09-27T00:37:19.849534+00:00\&quot;,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 }             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete(pullRequestId, repoSlug, workspace)



Redact the authenticated user&#x27;s approval of the specified pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost**
> Participant repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost(pullRequestId, repoSlug, workspace)



Approve the specified pull request as the authenticated user.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Participant result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Participant**](Participant.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete(commentId, pullRequestId, repoSlug, workspace)



Deletes a specific pull request comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String commentId = "commentId_example"; // String | 
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete(commentId, pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**|  |
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet**
> PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet(commentId, pullRequestId, repoSlug, workspace)



Returns a specific pull request comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
String commentId = "commentId_example"; // String | 
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PullrequestComment result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet(commentId, pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**|  |
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PullrequestComment**](PullrequestComment.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut**
> PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut(body, commentId, pullRequestId, repoSlug, workspace)



Updates a specific pull request comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
PullrequestComment body = new PullrequestComment(); // PullrequestComment | The contents of the updated comment.
String commentId = "commentId_example"; // String | 
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PullrequestComment result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut(body, commentId, pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PullrequestComment**](PullrequestComment.md)| The contents of the updated comment. |
 **commentId** | **String**|  |
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PullrequestComment**](PullrequestComment.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet**
> PaginatedPullrequestComments repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet(pullRequestId, repoSlug, workspace)



Returns a paginated list of the pull request&#x27;s comments.  This includes both global, inline comments and replies.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../../../meta/filtering) for more details.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedPullrequestComments result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedPullrequestComments**](PaginatedPullrequestComments.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost**
> PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost(body, pullRequestId, repoSlug, workspace)



Creates a new pull request comment.  Returns the newly created pull request comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
PullrequestComment body = new PullrequestComment(); // PullrequestComment | The comment object.
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PullrequestComment result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost(body, pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PullrequestComment**](PullrequestComment.md)| The comment object. |
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PullrequestComment**](PullrequestComment.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet**
> Error repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet(pullRequestId, repoSlug, workspace)



Returns a paginated list of the pull request&#x27;s commits.  These are the commits that are being merged into the destination branch when the pull requests gets accepted.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Error result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Error**](Error.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost**
> Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost(pullRequestId, repoSlug, workspace)



Declines the pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Pullrequest result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet(pullRequestId, repoSlug, workspace)



Redirects to the [repository diff](../../diff/%7Bspec%7D) with the revspec that corresponds to the pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet(pullRequestId, repoSlug, workspace)



Redirects to the [repository diffstat](../../diffstat/%7Bspec%7D) with the revspec that corresponds to the pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet**
> Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet(pullRequestId, repoSlug, workspace)



Returns the specified pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Pullrequest result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost**
> Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost(pullRequestId, repoSlug, workspace, body)



Merges the pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
PullrequestMergeParameters body = new PullrequestMergeParameters(); // PullrequestMergeParameters | 
try {
    Pullrequest result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost(pullRequestId, repoSlug, workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**PullrequestMergeParameters**](PullrequestMergeParameters.md)|  | [optional]

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet(pullRequestId, repoSlug, taskId, workspace)



When merging a pull request takes too long, the client receives a task ID along with a 202 status code. The task ID can be used in a call to this endpoint to check the status of a merge task.  &#x60;&#x60;&#x60; curl -X GET https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt; &#x60;&#x60;&#x60;  If the merge task is not yet finished, a PENDING status will be returned.  &#x60;&#x60;&#x60; HTTP/2 200 {     \&quot;task_status\&quot;: \&quot;PENDING\&quot;,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt;\&quot;         }     } } &#x60;&#x60;&#x60;  If the merge was successful, a SUCCESS status will be returned.  &#x60;&#x60;&#x60; HTTP/2 200 {     \&quot;task_status\&quot;: \&quot;SUCCESS\&quot;,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt;\&quot;         }     },     \&quot;merge_result\&quot;: &lt;the merged pull request object&gt; } &#x60;&#x60;&#x60;  If the merge task failed, an error will be returned.  &#x60;&#x60;&#x60; {     \&quot;type\&quot;: \&quot;error\&quot;,     \&quot;error\&quot;: {         \&quot;message\&quot;: \&quot;&lt;error message&gt;\&quot;     } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String taskId = "taskId_example"; // String | ID of the merge task
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet(pullRequestId, repoSlug, taskId, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **taskId** | **String**| ID of the merge task |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet(pullRequestId, repoSlug, workspace)



Redirects to the [repository patch](../../patch/%7Bspec%7D) with the revspec that corresponds to pull request.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut**
> Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut(pullRequestId, repoSlug, workspace, body)



Mutates the specified pull request.  This can be used to change the pull request&#x27;s branches or description.  Only open pull requests can be mutated.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
Pullrequest body = new Pullrequest(); // Pullrequest | The pull request that is to be updated.
try {
    Pullrequest result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut(pullRequestId, repoSlug, workspace, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **body** | [**Pullrequest**](Pullrequest.md)| The pull request that is to be updated. | [optional]

### Return type

[**Pullrequest**](Pullrequest.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete**
> repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete(pullRequestId, repoSlug, workspace)



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete(pullRequestId, repoSlug, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost"></a>
# **repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost**
> Participant repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost(pullRequestId, repoSlug, workspace)



### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Participant result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost(pullRequestId, repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pullRequestId** | **Integer**| The id of the pull request. |
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Participant**](Participant.md)

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
//import com.rappi.bitbucket.client.api.PullrequestsApi;

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

PullrequestsApi apiInstance = new PullrequestsApi();
Integer pullRequestId = 56; // Integer | The id of the pull request.
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String q = "q_example"; // String | Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
String sort = "sort_example"; // String | Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to `created_on`. 
try {
    PaginatedCommitstatuses result = apiInstance.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet(pullRequestId, repoSlug, workspace, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PullrequestsApi#repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet");
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

