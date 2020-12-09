# BranchingModelApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**repositoriesWorkspaceRepoSlugBranchingModelGet**](BranchingModelApi.md#repositoriesWorkspaceRepoSlugBranchingModelGet) | **GET** /repositories/{workspace}/{repo_slug}/branching-model | 
[**repositoriesWorkspaceRepoSlugBranchingModelSettingsGet**](BranchingModelApi.md#repositoriesWorkspaceRepoSlugBranchingModelSettingsGet) | **GET** /repositories/{workspace}/{repo_slug}/branching-model/settings | 
[**repositoriesWorkspaceRepoSlugBranchingModelSettingsPut**](BranchingModelApi.md#repositoriesWorkspaceRepoSlugBranchingModelSettingsPut) | **PUT** /repositories/{workspace}/{repo_slug}/branching-model/settings | 

<a name="repositoriesWorkspaceRepoSlugBranchingModelGet"></a>
# **repositoriesWorkspaceRepoSlugBranchingModelGet**
> BranchingModel repositoriesWorkspaceRepoSlugBranchingModelGet(repoSlug, workspace)



Return the branching model as applied to the repository. This view is read-only. The branching model settings can be changed using the [settings](branching-model/settings#get) API.  The returned object:  1. Always has a &#x60;development&#x60; property. &#x60;development.branch&#x60; contains    the actual repository branch object that is considered to be the    &#x60;development&#x60; branch. &#x60;development.branch&#x60; will not be present    if it does not exist. 2. Might have a &#x60;production&#x60; property. &#x60;production&#x60; will not    be present when &#x60;production&#x60; is disabled.    &#x60;production.branch&#x60; contains the actual branch object that is    considered to be the &#x60;production&#x60; branch. &#x60;production.branch&#x60; will    not be present if it does not exist. 3. Always has a &#x60;branch_types&#x60; array which contains all enabled branch    types.  Example body:  &#x60;&#x60;&#x60; {   \&quot;development\&quot;: {     \&quot;name\&quot;: \&quot;master\&quot;,     \&quot;branch\&quot;: {       \&quot;type\&quot;: \&quot;branch\&quot;,       \&quot;name\&quot;: \&quot;master\&quot;,       \&quot;target\&quot;: {         \&quot;hash\&quot;: \&quot;16dffcb0de1b22e249db6799532074cf32efe80f\&quot;       }     },     \&quot;use_mainbranch\&quot;: true   },   \&quot;production\&quot;: {     \&quot;name\&quot;: \&quot;production\&quot;,     \&quot;branch\&quot;: {       \&quot;type\&quot;: \&quot;branch\&quot;,       \&quot;name\&quot;: \&quot;production\&quot;,       \&quot;target\&quot;: {         \&quot;hash\&quot;: \&quot;16dffcb0de1b22e249db6799532074cf32efe80f\&quot;       }     },     \&quot;use_mainbranch\&quot;: false   },   \&quot;branch_types\&quot;: [     {       \&quot;kind\&quot;: \&quot;release\&quot;,       \&quot;prefix\&quot;: \&quot;release/\&quot;     },     {       \&quot;kind\&quot;: \&quot;hotfix\&quot;,       \&quot;prefix\&quot;: \&quot;hotfix/\&quot;     },     {       \&quot;kind\&quot;: \&quot;feature\&quot;,       \&quot;prefix\&quot;: \&quot;feature/\&quot;     },     {       \&quot;kind\&quot;: \&quot;bugfix\&quot;,       \&quot;prefix\&quot;: \&quot;bugfix/\&quot;     }   ],   \&quot;type\&quot;: \&quot;branching_model\&quot;,   \&quot;links\&quot;: {     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/.../branching-model\&quot;     }   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.BranchingModelApi;

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

BranchingModelApi apiInstance = new BranchingModelApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    BranchingModel result = apiInstance.repositoriesWorkspaceRepoSlugBranchingModelGet(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchingModelApi#repositoriesWorkspaceRepoSlugBranchingModelGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**BranchingModel**](BranchingModel.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugBranchingModelSettingsGet"></a>
# **repositoriesWorkspaceRepoSlugBranchingModelSettingsGet**
> BranchingModelSettings repositoriesWorkspaceRepoSlugBranchingModelSettingsGet(repoSlug, workspace)



Return the branching model configuration for a repository. The returned object:  1. Always has a &#x60;development&#x60; property for the development branch. 2. Always a &#x60;production&#x60; property for the production branch. The    production branch can be disabled. 3. The &#x60;branch_types&#x60; contains all the branch types.  This is the raw configuration for the branching model. A client wishing to see the branching model with its actual current branches may find the [active model API](../branching-model#get) more useful.  Example body:  &#x60;&#x60;&#x60; {   \&quot;development\&quot;: {     \&quot;is_valid\&quot;: true,     \&quot;name\&quot;: null,     \&quot;use_mainbranch\&quot;: true   },   \&quot;production\&quot;: {     \&quot;is_valid\&quot;: true,     \&quot;name\&quot;: \&quot;production\&quot;,     \&quot;use_mainbranch\&quot;: false,     \&quot;enabled\&quot;: false   },   \&quot;branch_types\&quot;: [     {       \&quot;kind\&quot;: \&quot;release\&quot;,       \&quot;enabled\&quot;: true,       \&quot;prefix\&quot;: \&quot;release/\&quot;     },     {       \&quot;kind\&quot;: \&quot;hotfix\&quot;,       \&quot;enabled\&quot;: true,       \&quot;prefix\&quot;: \&quot;hotfix/\&quot;     },     {       \&quot;kind\&quot;: \&quot;feature\&quot;,       \&quot;enabled\&quot;: true,       \&quot;prefix\&quot;: \&quot;feature/\&quot;     },     {       \&quot;kind\&quot;: \&quot;bugfix\&quot;,       \&quot;enabled\&quot;: false,       \&quot;prefix\&quot;: \&quot;bugfix/\&quot;     }   ],   \&quot;type\&quot;: \&quot;branching_model_settings\&quot;,   \&quot;links\&quot;: {     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/.../branching-model/settings\&quot;     }   } } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.BranchingModelApi;

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

BranchingModelApi apiInstance = new BranchingModelApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    BranchingModelSettings result = apiInstance.repositoriesWorkspaceRepoSlugBranchingModelSettingsGet(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchingModelApi#repositoriesWorkspaceRepoSlugBranchingModelSettingsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**BranchingModelSettings**](BranchingModelSettings.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="repositoriesWorkspaceRepoSlugBranchingModelSettingsPut"></a>
# **repositoriesWorkspaceRepoSlugBranchingModelSettingsPut**
> BranchingModelSettings repositoriesWorkspaceRepoSlugBranchingModelSettingsPut(repoSlug, workspace)



Update the branching model configuration for a repository.  The &#x60;development&#x60; branch can be configured to a specific branch or to track the main branch. When set to a specific branch it must currently exist. Only the passed properties will be updated. The properties not passed will be left unchanged. A request without a &#x60;development&#x60; property will leave the development branch unchanged.  It is possible for the &#x60;development&#x60; branch to be invalid. This happens when it points at a specific branch that has been deleted. This is indicated in the &#x60;is_valid&#x60; field for the branch. It is not possible to update the settings for &#x60;development&#x60; if that would leave the branch in an invalid state. Such a request will be rejected.  The &#x60;production&#x60; branch can be a specific branch, the main branch or disabled. When set to a specific branch it must currently exist. The &#x60;enabled&#x60; property can be used to enable (&#x60;true&#x60;) or disable (&#x60;false&#x60;) it. Only the passed properties will be updated. The properties not passed will be left unchanged. A request without a &#x60;production&#x60; property will leave the production branch unchanged.  It is possible for the &#x60;production&#x60; branch to be invalid. This happens when it points at a specific branch that has been deleted. This is indicated in the &#x60;is_valid&#x60; field for the branch. A request that would leave &#x60;production&#x60; enabled and invalid will be rejected. It is possible to update &#x60;production&#x60; and make it invalid if it would also be left disabled.  The &#x60;branch_types&#x60; property contains the branch types to be updated. Only the branch types passed will be updated. All updates will be rejected if it would leave the branching model in an invalid state. For branch types this means that:  1. The prefixes for all enabled branch types are valid. For example,    it is not possible to use &#x27;*&#x27; inside a Git prefix. 2. A prefix of an enabled branch type must not be a prefix of another    enabled branch type. This is to ensure that a branch can be easily    classified by its prefix unambiguously.  It is possible to store an invalid prefix if that branch type would be left disabled. Only the passed properties will be updated. The properties not passed will be left unchanged. Each branch type must have a &#x60;kind&#x60; property to identify it.  Example Body:  &#x60;&#x60;&#x60;     {       \&quot;development\&quot;: {         \&quot;use_mainbranch\&quot;: true       },       \&quot;production\&quot;: {         \&quot;enabled\&quot;: true,         \&quot;use_mainbranch\&quot;: false,         \&quot;name\&quot;: \&quot;production\&quot;       },       \&quot;branch_types\&quot;: [         {           \&quot;kind\&quot;: \&quot;bugfix\&quot;,           \&quot;enabled\&quot;: true,           \&quot;prefix\&quot;: \&quot;bugfix/\&quot;         },         {           \&quot;kind\&quot;: \&quot;feature\&quot;,           \&quot;enabled\&quot;: true,           \&quot;prefix\&quot;: \&quot;feature/\&quot;         },         {           \&quot;kind\&quot;: \&quot;hotfix\&quot;,           \&quot;prefix\&quot;: \&quot;hotfix/\&quot;         },         {           \&quot;kind\&quot;: \&quot;release\&quot;,           \&quot;enabled\&quot;: false,         }       ]     } &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.BranchingModelApi;

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

BranchingModelApi apiInstance = new BranchingModelApi();
String repoSlug = "repoSlug_example"; // String | This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: `{repository UUID}`. 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    BranchingModelSettings result = apiInstance.repositoriesWorkspaceRepoSlugBranchingModelSettingsPut(repoSlug, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchingModelApi#repositoriesWorkspaceRepoSlugBranchingModelSettingsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repoSlug** | **String**| This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**BranchingModelSettings**](BranchingModelSettings.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

