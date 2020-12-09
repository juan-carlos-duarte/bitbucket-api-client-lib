# SnippetsApi

All URIs are relative to *https://api.bitbucket.org/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snippetsGet**](SnippetsApi.md#snippetsGet) | **GET** /snippets | 
[**snippetsPost**](SnippetsApi.md#snippetsPost) | **POST** /snippets | 
[**snippetsWorkspaceEncodedIdCommentsCommentIdDelete**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommentsCommentIdDelete) | **DELETE** /snippets/{workspace}/{encoded_id}/comments/{comment_id} | 
[**snippetsWorkspaceEncodedIdCommentsCommentIdGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommentsCommentIdGet) | **GET** /snippets/{workspace}/{encoded_id}/comments/{comment_id} | 
[**snippetsWorkspaceEncodedIdCommentsCommentIdPut**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommentsCommentIdPut) | **PUT** /snippets/{workspace}/{encoded_id}/comments/{comment_id} | 
[**snippetsWorkspaceEncodedIdCommentsGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommentsGet) | **GET** /snippets/{workspace}/{encoded_id}/comments | 
[**snippetsWorkspaceEncodedIdCommentsPost**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommentsPost) | **POST** /snippets/{workspace}/{encoded_id}/comments | 
[**snippetsWorkspaceEncodedIdCommitsGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommitsGet) | **GET** /snippets/{workspace}/{encoded_id}/commits | 
[**snippetsWorkspaceEncodedIdCommitsRevisionGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdCommitsRevisionGet) | **GET** /snippets/{workspace}/{encoded_id}/commits/{revision} | 
[**snippetsWorkspaceEncodedIdDelete**](SnippetsApi.md#snippetsWorkspaceEncodedIdDelete) | **DELETE** /snippets/{workspace}/{encoded_id} | 
[**snippetsWorkspaceEncodedIdGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdGet) | **GET** /snippets/{workspace}/{encoded_id} | 
[**snippetsWorkspaceEncodedIdNodeIdDelete**](SnippetsApi.md#snippetsWorkspaceEncodedIdNodeIdDelete) | **DELETE** /snippets/{workspace}/{encoded_id}/{node_id} | 
[**snippetsWorkspaceEncodedIdNodeIdFilesPathGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdNodeIdFilesPathGet) | **GET** /snippets/{workspace}/{encoded_id}/{node_id}/files/{path} | 
[**snippetsWorkspaceEncodedIdNodeIdGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdNodeIdGet) | **GET** /snippets/{workspace}/{encoded_id}/{node_id} | 
[**snippetsWorkspaceEncodedIdNodeIdPut**](SnippetsApi.md#snippetsWorkspaceEncodedIdNodeIdPut) | **PUT** /snippets/{workspace}/{encoded_id}/{node_id} | 
[**snippetsWorkspaceEncodedIdPut**](SnippetsApi.md#snippetsWorkspaceEncodedIdPut) | **PUT** /snippets/{workspace}/{encoded_id} | 
[**snippetsWorkspaceEncodedIdRevisionDiffGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdRevisionDiffGet) | **GET** /snippets/{workspace}/{encoded_id}/{revision}/diff | 
[**snippetsWorkspaceEncodedIdRevisionPatchGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdRevisionPatchGet) | **GET** /snippets/{workspace}/{encoded_id}/{revision}/patch | 
[**snippetsWorkspaceEncodedIdWatchDelete**](SnippetsApi.md#snippetsWorkspaceEncodedIdWatchDelete) | **DELETE** /snippets/{workspace}/{encoded_id}/watch | 
[**snippetsWorkspaceEncodedIdWatchGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdWatchGet) | **GET** /snippets/{workspace}/{encoded_id}/watch | 
[**snippetsWorkspaceEncodedIdWatchPut**](SnippetsApi.md#snippetsWorkspaceEncodedIdWatchPut) | **PUT** /snippets/{workspace}/{encoded_id}/watch | 
[**snippetsWorkspaceEncodedIdWatchersGet**](SnippetsApi.md#snippetsWorkspaceEncodedIdWatchersGet) | **GET** /snippets/{workspace}/{encoded_id}/watchers | 
[**snippetsWorkspaceGet**](SnippetsApi.md#snippetsWorkspaceGet) | **GET** /snippets/{workspace} | 
[**snippetsWorkspacePost**](SnippetsApi.md#snippetsWorkspacePost) | **POST** /snippets/{workspace} | 

<a name="snippetsGet"></a>
# **snippetsGet**
> PaginatedSnippets snippetsGet(role)



Returns all snippets. Like pull requests, repositories and workspaces, the full set of snippets is defined by what the current user has access to.  This includes all snippets owned by any of the workspaces the user is a member of, or snippets by other users that the current user is either watching or has collaborated on (for instance by commenting on it).  To limit the set of returned snippets, apply the &#x60;?role&#x3D;[owner|contributor|member]&#x60; query parameter where the roles are defined as follows:  * &#x60;owner&#x60;: all snippets owned by the current user * &#x60;contributor&#x60;: all snippets owned by, or watched by the current user * &#x60;member&#x60;: created in a workspaces or watched by the current user  When no role is specified, all public snippets are returned, as well as all privately owned snippets watched or commented on.  The returned response is a normal paginated JSON list. This endpoint only supports &#x60;application/json&#x60; responses and no &#x60;multipart/form-data&#x60; or &#x60;multipart/related&#x60;. As a result, it is not possible to include the file contents.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String role = "role_example"; // String | Filter down the result based on the authenticated user's role (`owner`, `contributor`, or `member`).
try {
    PaginatedSnippets result = apiInstance.snippetsGet(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| Filter down the result based on the authenticated user&#x27;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). | [optional] [enum: owner, contributor, member]

### Return type

[**PaginatedSnippets**](PaginatedSnippets.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsPost"></a>
# **snippetsPost**
> Snippet snippetsPost(body)



Creates a new snippet under the authenticated user&#x27;s account.  Snippets can contain multiple files. Both text and binary files are supported.  The simplest way to create a new snippet from a local file:      $ curl -u username:password -X POST https://api.bitbucket.org/2.0/snippets               -F file&#x3D;@image.png  Creating snippets through curl has a few limitations and so let&#x27;s look at a more complicated scenario.  Snippets are created with a multipart POST. Both &#x60;multipart/form-data&#x60; and &#x60;multipart/related&#x60; are supported. Both allow the creation of snippets with both meta data (title, etc), as well as multiple text and binary files.  The main difference is that &#x60;multipart/related&#x60; can use rich encoding for the meta data (currently JSON).   multipart/related (RFC-2387) ----------------------------  This is the most advanced and efficient way to create a paste.      POST /2.0/snippets/evzijst HTTP/1.1     Content-Length: 1188     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;title\&quot;: \&quot;My snippet\&quot;,       \&quot;is_private\&quot;: true,       \&quot;scm\&quot;: \&quot;hg\&quot;,       \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {},           \&quot;image.png\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: image/png     MIME-Version: 1.0     Content-Transfer-Encoding: base64     Content-ID: \&quot;image.png\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;image.png\&quot;      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  The request contains multiple parts and is structured as follows.  The first part is the JSON document that describes the snippet&#x27;s properties or meta data. It either has to be the first part, or the request&#x27;s &#x60;Content-Type&#x60; header must contain the &#x60;start&#x60; parameter to point to it.  The remaining parts are the files of which there can be zero or more. Each file part should contain the &#x60;Content-ID&#x60; MIME header through which the JSON meta data&#x27;s &#x60;files&#x60; element addresses it. The value should be the name of the file.  &#x60;Content-Disposition&#x60; is an optional MIME header. The header&#x27;s optional &#x60;filename&#x60; parameter can be used to specify the file name that Bitbucket should use when writing the file to disk. When present, &#x60;filename&#x60; takes precedence over the value of &#x60;Content-ID&#x60;.  When the JSON body omits the &#x60;files&#x60; element, the remaining parts are not ignored. Instead, each file is added to the new snippet as if its name was explicitly linked (the use of the &#x60;files&#x60; elements is mandatory for some operations like deleting or renaming files).   multipart/form-data -------------------  The use of JSON for the snippet&#x27;s meta data is optional. Meta data can also be supplied as regular form fields in a more conventional &#x60;multipart/form-data&#x60; request:      $ curl -X POST -u credentials https://api.bitbucket.org/2.0/snippets               -F title&#x3D;\&quot;My snippet\&quot;               -F file&#x3D;@foo.txt -F file&#x3D;@image.png      POST /2.0/snippets HTTP/1.1     Content-Length: 951     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;image.png\&quot;     Content-Type: application/octet-stream      ?PNG      IHDR?1??I.....     ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;      My snippet     ------------------------------63a4b224c59f--  Here the meta data properties are included as flat, top-level form fields. The file attachments use the &#x60;file&#x60; field name. To attach multiple files, simply repeat the field.  The advantage of &#x60;multipart/form-data&#x60; over &#x60;multipart/related&#x60; is that it can be easier to build clients.  Essentially all properties are optional, &#x60;title&#x60; and &#x60;files&#x60; included.   Sharing and Visibility ----------------------  Snippets can be either public (visible to anyone on Bitbucket, as well as anonymous users), or private (visible only to members of the workspace). This is controlled through the snippet&#x27;s &#x60;is_private&#x60; element:  * **is_private&#x3D;false** -- everyone, including anonymous users can view   the snippet * **is_private&#x3D;true** -- only workspace members can view the snippet  To create the snippet under a workspace, just append the workspace ID to the URL. See [&#x60;/2.0/snippets/{workspace}&#x60;](./snippets/%7Bworkspace%7D#post).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
Snippet body = new Snippet(); // Snippet | The new snippet object.
try {
    Snippet result = apiInstance.snippetsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snippet**](Snippet.md)| The new snippet object. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommentsCommentIdDelete"></a>
# **snippetsWorkspaceEncodedIdCommentsCommentIdDelete**
> snippetsWorkspaceEncodedIdCommentsCommentIdDelete(commentId, encodedId, workspace)



Deletes a snippet comment.  Comments can only be removed by their author.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.snippetsWorkspaceEncodedIdCommentsCommentIdDelete(commentId, encodedId, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommentsCommentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**|  |
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommentsCommentIdGet"></a>
# **snippetsWorkspaceEncodedIdCommentsCommentIdGet**
> SnippetComment snippetsWorkspaceEncodedIdCommentsCommentIdGet(commentId, encodedId, workspace)



Returns the specific snippet comment.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    SnippetComment result = apiInstance.snippetsWorkspaceEncodedIdCommentsCommentIdGet(commentId, encodedId, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommentsCommentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**|  |
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**SnippetComment**](SnippetComment.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommentsCommentIdPut"></a>
# **snippetsWorkspaceEncodedIdCommentsCommentIdPut**
> snippetsWorkspaceEncodedIdCommentsCommentIdPut(commentId, encodedId, workspace)



Updates a comment.  Comments can only be updated by their author.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String commentId = "commentId_example"; // String | 
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.snippetsWorkspaceEncodedIdCommentsCommentIdPut(commentId, encodedId, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommentsCommentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **String**|  |
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommentsGet"></a>
# **snippetsWorkspaceEncodedIdCommentsGet**
> PaginatedSnippetComments snippetsWorkspaceEncodedIdCommentsGet(encodedId, workspace)



Used to retrieve a paginated list of all comments for a specific snippet.  This resource works identical to commit and pull request comments.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedSnippetComments result = apiInstance.snippetsWorkspaceEncodedIdCommentsGet(encodedId, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedSnippetComments**](PaginatedSnippetComments.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommentsPost"></a>
# **snippetsWorkspaceEncodedIdCommentsPost**
> Snippet snippetsWorkspaceEncodedIdCommentsPost(body, encodedId, workspace)



Creates a new comment.  The only required field in the body is &#x60;content.raw&#x60;.  To create a threaded reply to an existing comment, include &#x60;parent.id&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
Snippet body = new Snippet(); // Snippet | The contents of the new comment.
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    Snippet result = apiInstance.snippetsWorkspaceEncodedIdCommentsPost(body, encodedId, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snippet**](Snippet.md)| The contents of the new comment. |
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommitsGet"></a>
# **snippetsWorkspaceEncodedIdCommitsGet**
> PaginatedSnippetCommit snippetsWorkspaceEncodedIdCommitsGet(encodedId, workspace)



Returns the changes (commits) made on this snippet.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String encodedId = "encodedId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    PaginatedSnippetCommit result = apiInstance.snippetsWorkspaceEncodedIdCommitsGet(encodedId, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encodedId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**PaginatedSnippetCommit**](PaginatedSnippetCommit.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdCommitsRevisionGet"></a>
# **snippetsWorkspaceEncodedIdCommitsRevisionGet**
> SnippetCommit snippetsWorkspaceEncodedIdCommitsRevisionGet(encodedId, revision, workspace)



Returns the changes made on this snippet in this commit.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String encodedId = "encodedId_example"; // String | 
String revision = "revision_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    SnippetCommit result = apiInstance.snippetsWorkspaceEncodedIdCommitsRevisionGet(encodedId, revision, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdCommitsRevisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encodedId** | **String**|  |
 **revision** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

[**SnippetCommit**](SnippetCommit.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdDelete"></a>
# **snippetsWorkspaceEncodedIdDelete**
> snippetsWorkspaceEncodedIdDelete(workspace, encodedId)



Deletes a snippet and returns an empty response.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
try {
    apiInstance.snippetsWorkspaceEncodedIdDelete(workspace, encodedId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdGet"></a>
# **snippetsWorkspaceEncodedIdGet**
> Snippet snippetsWorkspaceEncodedIdGet(workspace, encodedId)



Retrieves a single snippet.  Snippets support multiple content types:  * application/json * multipart/related * multipart/form-data   application/json ----------------  The default content type of the response is &#x60;application/json&#x60;. Since JSON is always &#x60;utf-8&#x60;, it cannot reliably contain file contents for files that are not text. Therefore, JSON snippet documents only contain the filename and links to the file contents.  This means that in order to retrieve all parts of a snippet, N+1 requests need to be made (where N is the number of files in the snippet).   multipart/related -----------------  To retrieve an entire snippet in a single response, use the &#x60;Accept: multipart/related&#x60; HTTP request header.      $ curl -H \&quot;Accept: multipart/related\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/1  Response:      HTTP/1.1 200 OK     Content-Length: 2214     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj\&quot;         },         \&quot;comments\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/comments\&quot;         },         \&quot;watchers\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/watchers\&quot;         },         \&quot;commits\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/commits\&quot;         }       },       \&quot;id\&quot;: kypj,       \&quot;title\&quot;: \&quot;My snippet\&quot;,       \&quot;created_on\&quot;: \&quot;2014-12-29T22:22:04.790331+00:00\&quot;,       \&quot;updated_on\&quot;: \&quot;2014-12-29T22:22:04.790331+00:00\&quot;,       \&quot;is_private\&quot;: false,       \&quot;files\&quot;: {         \&quot;foo.txt\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/files/367ab19/foo.txt\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj#file-foo.txt\&quot;             }           }         },         \&quot;image.png\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/files/367ab19/image.png\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj#file-image.png\&quot;             }           }         }       ],       \&quot;owner\&quot;: {         \&quot;username\&quot;: \&quot;evzijst\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/evzijst\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket-staging-assetroot.s3.amazonaws.com/c/photos/2013/Jul/31/erik-avatar-725122544-0_avatar.png\&quot;           }         }       },       \&quot;creator\&quot;: {         \&quot;username\&quot;: \&quot;evzijst\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/evzijst\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket-staging-assetroot.s3.amazonaws.com/c/photos/2013/Jul/31/erik-avatar-725122544-0_avatar.png\&quot;           }         }       }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: image/png     MIME-Version: 1.0     Content-Transfer-Encoding: base64     Content-ID: \&quot;image.png\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;image.png\&quot;      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  multipart/form-data -------------------  As with creating new snippets, &#x60;multipart/form-data&#x60; can be used as an alternative to &#x60;multipart/related&#x60;. However, the inherently flat structure of form-data means that only basic, root-level properties can be returned, while nested elements like &#x60;links&#x60; are omitted:      $ curl -H \&quot;Accept: multipart/form-data\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj  Response:      HTTP/1.1 200 OK     Content-Length: 951     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;     Content-Type: text/plain; charset&#x3D;\&quot;utf-8\&quot;      My snippet     ------------------------------63a4b224c59f--     Content-Disposition: attachment; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: attachment; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;image.png\&quot;     Content-Transfer-Encoding: base64     Content-Type: application/octet-stream      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     ------------------------------5957323a6b76--

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
try {
    Snippet result = apiInstance.snippetsWorkspaceEncodedIdGet(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsWorkspaceEncodedIdNodeIdDelete"></a>
# **snippetsWorkspaceEncodedIdNodeIdDelete**
> snippetsWorkspaceEncodedIdNodeIdDelete(nodeId, workspace, encodedId)



Deletes the snippet.  Note that this only works for versioned URLs that point to the latest commit of the snippet. Pointing to an older commit results in a 405 status code.  To delete a snippet, regardless of whether or not concurrent changes are being made to it, use &#x60;DELETE /snippets/{encoded_id}&#x60; instead.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String nodeId = "nodeId_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
try {
    apiInstance.snippetsWorkspaceEncodedIdNodeIdDelete(nodeId, workspace, encodedId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdNodeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdNodeIdFilesPathGet"></a>
# **snippetsWorkspaceEncodedIdNodeIdFilesPathGet**
> snippetsWorkspaceEncodedIdNodeIdFilesPathGet(encodedId, nodeId, path, workspace)



Retrieves the raw contents of a specific file in the snippet. The &#x60;Content-Disposition&#x60; header will be \&quot;attachment\&quot; to avoid issues with malevolent executable files.  The file&#x27;s mime type is derived from its filename and returned in the &#x60;Content-Type&#x60; header.  Note that for text files, no character encoding is included as part of the content type.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String encodedId = "encodedId_example"; // String | 
String nodeId = "nodeId_example"; // String | 
String path = "path_example"; // String | 
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
try {
    apiInstance.snippetsWorkspaceEncodedIdNodeIdFilesPathGet(encodedId, nodeId, path, workspace);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdNodeIdFilesPathGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encodedId** | **String**|  |
 **nodeId** | **String**|  |
 **path** | **String**|  |
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdNodeIdGet"></a>
# **snippetsWorkspaceEncodedIdNodeIdGet**
> Snippet snippetsWorkspaceEncodedIdNodeIdGet(workspace, encodedId, nodeId)



Identical to &#x60;GET /snippets/encoded_id&#x60;, except that this endpoint can be used to retrieve the contents of the snippet as it was at an older revision, while &#x60;/snippets/encoded_id&#x60; always returns the snippet&#x27;s current revision.  Note that only the snippet&#x27;s file contents are versioned, not its meta data properties like the title.  Other than that, the two endpoints are identical in behavior.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
String nodeId = "nodeId_example"; // String | A commit revision (SHA1).
try {
    Snippet result = apiInstance.snippetsWorkspaceEncodedIdNodeIdGet(workspace, encodedId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdNodeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |
 **nodeId** | **String**| A commit revision (SHA1). |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsWorkspaceEncodedIdNodeIdPut"></a>
# **snippetsWorkspaceEncodedIdNodeIdPut**
> Snippet snippetsWorkspaceEncodedIdNodeIdPut(workspace, encodedId, nodeId)



Identical to &#x60;UPDATE /snippets/encoded_id&#x60;, except that this endpoint takes an explicit commit revision. Only the snippet&#x27;s \&quot;HEAD\&quot;/\&quot;tip\&quot; (most recent) version can be updated and requests on all other, older revisions fail by returning a 405 status.  Usage of this endpoint over the unrestricted &#x60;/snippets/encoded_id&#x60; could be desired if the caller wants to be sure no concurrent modifications have taken place between the moment of the UPDATE request and the original GET.  This can be considered a so-called \&quot;Compare And Swap\&quot;, or CAS operation.  Other than that, the two endpoints are identical in behavior.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
String nodeId = "nodeId_example"; // String | A commit revision (SHA1).
try {
    Snippet result = apiInstance.snippetsWorkspaceEncodedIdNodeIdPut(workspace, encodedId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdNodeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |
 **nodeId** | **String**| A commit revision (SHA1). |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsWorkspaceEncodedIdPut"></a>
# **snippetsWorkspaceEncodedIdPut**
> Snippet snippetsWorkspaceEncodedIdPut(workspace, encodedId)



Used to update a snippet. Use this to add and delete files and to change a snippet&#x27;s title.  To update a snippet, one can either PUT a full snapshot, or only the parts that need to be changed.  The contract for PUT on this API is that properties missing from the request remain untouched so that snippets can be efficiently manipulated with differential payloads.  To delete a property (e.g. the title, or a file), include its name in the request, but omit its value (use &#x60;null&#x60;).  As in Git, explicit renaming of files is not supported. Instead, to rename a file, delete it and add it again under another name. This can be done atomically in a single request. Rename detection is left to the SCM.  PUT supports three different content types for both request and response bodies:  * &#x60;application/json&#x60; * &#x60;multipart/related&#x60; * &#x60;multipart/form-data&#x60;  The content type used for the request body can be different than that used for the response. Content types are specified using standard HTTP headers.  Use the &#x60;Content-Type&#x60; and &#x60;Accept&#x60; headers to select the desired request and response format.   application/json ----------------  As with creation and retrieval, the content type determines what properties can be manipulated. &#x60;application/json&#x60; does not support file contents and is therefore limited to a snippet&#x27;s meta data.  To update the title, without changing any of its files:      $ curl -X POST -H \&quot;Content-Type: application/json\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj             -d &#x27;{\&quot;title\&quot;: \&quot;Updated title\&quot;}&#x27;   To delete the title:      $ curl -X POST -H \&quot;Content-Type: application/json\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj             -d &#x27;{\&quot;title\&quot;: null}&#x27;  Not all parts of a snippet can be manipulated. The owner and creator for instance are immutable.   multipart/related -----------------  &#x60;multipart/related&#x60; can be used to manipulate all of a snippet&#x27;s properties. The body is identical to a POST. properties omitted from the request are left unchanged. Since the &#x60;start&#x60; part contains JSON, the mechanism for manipulating the snippet&#x27;s meta data is identical to &#x60;application/json&#x60; requests.  To update one of a snippet&#x27;s file contents, while also changing its title:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 288     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;title\&quot;: \&quot;My updated snippet\&quot;,       \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      Updated file contents.      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  Here only the parts that are changed are included in the body. The other files remain untouched.  Note the use of the &#x60;files&#x60; list in the JSON part. This list contains the files that are being manipulated. This list should have corresponding multiparts in the request that contain the new contents of these files.  If a filename in the &#x60;files&#x60; list does not have a corresponding part, it will be deleted from the snippet, as shown below:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 188     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;files\&quot;: {         \&quot;image.png\&quot;: {}       }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  To simulate a rename, delete a file and add the same file under another name:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 212     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {         \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {},           \&quot;bar.txt\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;bar.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;bar.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--   multipart/form-data -----------------  Again, one can also use &#x60;multipart/form-data&#x60; to manipulate file contents and meta data atomically.      $ curl -X PUT http://localhost:12345/2.0/snippets/evzijst/kypj             -F title&#x3D;\&quot;My updated snippet\&quot; -F file&#x3D;@foo.txt      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 351     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;      My updated snippet     ------------------------------63a4b224c59f  To delete a file, omit its contents while including its name in the &#x60;files&#x60; field:      $ curl -X PUT https://api.bitbucket.org/2.0/snippets/evzijst/kypj -F files&#x3D;image.png      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 149     Content-Type: multipart/form-data; boundary&#x3D;----------------------------ef8871065a86      ------------------------------ef8871065a86     Content-Disposition: form-data; name&#x3D;\&quot;files\&quot;      image.png     ------------------------------ef8871065a86--  The explicit use of the &#x60;files&#x60; element in &#x60;multipart/related&#x60; and &#x60;multipart/form-data&#x60; is only required when deleting files. The default mode of operation is for file parts to be processed, regardless of whether or not they are listed in &#x60;files&#x60;, as a convenience to the client.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet's id.
try {
    Snippet result = apiInstance.snippetsWorkspaceEncodedIdPut(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet&#x27;s id. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/related, multipart/form-data

<a name="snippetsWorkspaceEncodedIdRevisionDiffGet"></a>
# **snippetsWorkspaceEncodedIdRevisionDiffGet**
> snippetsWorkspaceEncodedIdRevisionDiffGet(workspace, encodedId, revision, path)



Returns the diff of the specified commit against its first parent.  Note that this resource is different in functionality from the &#x60;patch&#x60; resource.  The differences between a diff and a patch are:  * patches have a commit header with the username, message, etc * diffs support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter the   diff to just that one file diff (not supported for patches) * for a merge, the diff will show the diff between the merge commit and   its first parent (identical to how PRs work), while patch returns a   response containing separate patches for each commit on the second   parent&#x27;s ancestry, up to the oldest common ancestor (identical to   its reachability).  Note that the character encoding of the contents of the diff is unspecified as Git and Mercurial do not track this, making it hard for Bitbucket to reliably determine this.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
String revision = "revision_example"; // String | A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like `staging..production`.
String path = "path_example"; // String | When used, only one the diff of the specified file will be returned.
try {
    apiInstance.snippetsWorkspaceEncodedIdRevisionDiffGet(workspace, encodedId, revision, path);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdRevisionDiffGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |
 **revision** | **String**| A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. |
 **path** | **String**| When used, only one the diff of the specified file will be returned. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdRevisionPatchGet"></a>
# **snippetsWorkspaceEncodedIdRevisionPatchGet**
> snippetsWorkspaceEncodedIdRevisionPatchGet(workspace, encodedId, revision)



Returns the patch of the specified commit against its first parent.  Note that this resource is different in functionality from the &#x60;diff&#x60; resource.  The differences between a diff and a patch are:  * patches have a commit header with the username, message, etc * diffs support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter the   diff to just that one file diff (not supported for patches) * for a merge, the diff will show the diff between the merge commit and   its first parent (identical to how PRs work), while patch returns a   response containing separate patches for each commit on the second   parent&#x27;s ancestry, up to the oldest common ancestor (identical to   its reachability).  Note that the character encoding of the contents of the patch is unspecified as Git and Mercurial do not track this, making it hard for Bitbucket to reliably determine this.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
String revision = "revision_example"; // String | A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like `staging..production`.
try {
    apiInstance.snippetsWorkspaceEncodedIdRevisionPatchGet(workspace, encodedId, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdRevisionPatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |
 **revision** | **String**| A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdWatchDelete"></a>
# **snippetsWorkspaceEncodedIdWatchDelete**
> PaginatedUsers snippetsWorkspaceEncodedIdWatchDelete(workspace, encodedId)



Used to stop watching a specific snippet. Returns 204 (No Content) to indicate success.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsWorkspaceEncodedIdWatchDelete(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdWatchDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdWatchGet"></a>
# **snippetsWorkspaceEncodedIdWatchGet**
> PaginatedUsers snippetsWorkspaceEncodedIdWatchGet(workspace, encodedId)



Used to check if the current user is watching a specific snippet.  Returns 204 (No Content) if the user is watching the snippet and 404 if not.  Hitting this endpoint anonymously always returns a 404.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsWorkspaceEncodedIdWatchGet(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdWatchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdWatchPut"></a>
# **snippetsWorkspaceEncodedIdWatchPut**
> PaginatedUsers snippetsWorkspaceEncodedIdWatchPut(workspace, encodedId)



Used to start watching a specific snippet. Returns 204 (No Content).

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsWorkspaceEncodedIdWatchPut(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdWatchPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceEncodedIdWatchersGet"></a>
# **snippetsWorkspaceEncodedIdWatchersGet**
> PaginatedUsers snippetsWorkspaceEncodedIdWatchersGet(workspace, encodedId)



Returns a paginated list of all users watching a specific snippet.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: `{workspace UUID}`. 
String encodedId = "encodedId_example"; // String | The snippet id.
try {
    PaginatedUsers result = apiInstance.snippetsWorkspaceEncodedIdWatchersGet(workspace, encodedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceEncodedIdWatchersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.  |
 **encodedId** | **String**| The snippet id. |

### Return type

[**PaginatedUsers**](PaginatedUsers.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspaceGet"></a>
# **snippetsWorkspaceGet**
> PaginatedSnippets snippetsWorkspaceGet(workspace, role)



Identical to [&#x60;/snippets&#x60;](../snippets), except that the result is further filtered by the snippet owner and only those that are owned by &#x60;{workspace}&#x60; are returned.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
String workspace = "workspace_example"; // String | Limits the result to snippets owned by this workspace.
String role = "role_example"; // String | Filter down the result based on the authenticated user's role (`owner`, `contributor`, or `member`).
try {
    PaginatedSnippets result = apiInstance.snippetsWorkspaceGet(workspace, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspaceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspace** | **String**| Limits the result to snippets owned by this workspace. |
 **role** | **String**| Filter down the result based on the authenticated user&#x27;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;). | [optional] [enum: owner, contributor, member]

### Return type

[**PaginatedSnippets**](PaginatedSnippets.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="snippetsWorkspacePost"></a>
# **snippetsWorkspacePost**
> Snippet snippetsWorkspacePost(body, workspace)



Identical to [&#x60;/snippets&#x60;](../snippets#post), except that the new snippet will be created under the workspace specified in the path parameter &#x60;{workspace}&#x60;.

### Example
```java
// Import classes:
//import com.rappi.bitbucket.client.invoker.ApiClient;
//import com.rappi.bitbucket.client.invoker.ApiException;
//import com.rappi.bitbucket.client.invoker.Configuration;
//import com.rappi.bitbucket.client.invoker.auth.*;
//import com.rappi.bitbucket.client.api.SnippetsApi;

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

SnippetsApi apiInstance = new SnippetsApi();
Snippet body = new Snippet(); // Snippet | The new snippet object.
String workspace = "workspace_example"; // String | Create a snippet in the specified workspace.
try {
    Snippet result = apiInstance.snippetsWorkspacePost(body, workspace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#snippetsWorkspacePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Snippet**](Snippet.md)| The new snippet object. |
 **workspace** | **String**| Create a snippet in the specified workspace. |

### Return type

[**Snippet**](Snippet.md)

### Authorization

[api_key](../README.md#api_key)[basic](../README.md#basic)[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

