package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedSnippetComments;
import com.rappi.bitbucket.client.model.PaginatedSnippetCommit;
import com.rappi.bitbucket.client.model.PaginatedSnippets;
import com.rappi.bitbucket.client.model.PaginatedUsers;
import com.rappi.bitbucket.client.model.Snippet;
import com.rappi.bitbucket.client.model.SnippetComment;
import com.rappi.bitbucket.client.model.SnippetCommit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.SnippetsApi")
public class SnippetsApi {
    private ApiClient apiClient;

    public SnippetsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SnippetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Returns all snippets. Like pull requests, repositories and workspaces, the full set of snippets is defined by what the current user has access to.  This includes all snippets owned by any of the workspaces the user is a member of, or snippets by other users that the current user is either watching or has collaborated on (for instance by commenting on it).  To limit the set of returned snippets, apply the &#x60;?role&#x3D;[owner|contributor|member]&#x60; query parameter where the roles are defined as follows:  * &#x60;owner&#x60;: all snippets owned by the current user * &#x60;contributor&#x60;: all snippets owned by, or watched by the current user * &#x60;member&#x60;: created in a workspaces or watched by the current user  When no role is specified, all public snippets are returned, as well as all privately owned snippets watched or commented on.  The returned response is a normal paginated JSON list. This endpoint only supports &#x60;application/json&#x60; responses and no &#x60;multipart/form-data&#x60; or &#x60;multipart/related&#x60;. As a result, it is not possible to include the file contents.
     * <p><b>200</b> - A paginated list of snippets.
     * <p><b>404</b> - If the snippet does not exist.
     * @param role Filter down the result based on the authenticated user&#x27;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;).
     * @return PaginatedSnippets
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedSnippets snippetsGet(String role) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/snippets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedSnippets> returnType = new ParameterizedTypeReference<PaginatedSnippets>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new snippet under the authenticated user&#x27;s account.  Snippets can contain multiple files. Both text and binary files are supported.  The simplest way to create a new snippet from a local file:      $ curl -u username:password -X POST https://api.bitbucket.org/2.0/snippets               -F file&#x3D;@image.png  Creating snippets through curl has a few limitations and so let&#x27;s look at a more complicated scenario.  Snippets are created with a multipart POST. Both &#x60;multipart/form-data&#x60; and &#x60;multipart/related&#x60; are supported. Both allow the creation of snippets with both meta data (title, etc), as well as multiple text and binary files.  The main difference is that &#x60;multipart/related&#x60; can use rich encoding for the meta data (currently JSON).   multipart/related (RFC-2387) ----------------------------  This is the most advanced and efficient way to create a paste.      POST /2.0/snippets/evzijst HTTP/1.1     Content-Length: 1188     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;title\&quot;: \&quot;My snippet\&quot;,       \&quot;is_private\&quot;: true,       \&quot;scm\&quot;: \&quot;hg\&quot;,       \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {},           \&quot;image.png\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: image/png     MIME-Version: 1.0     Content-Transfer-Encoding: base64     Content-ID: \&quot;image.png\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;image.png\&quot;      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  The request contains multiple parts and is structured as follows.  The first part is the JSON document that describes the snippet&#x27;s properties or meta data. It either has to be the first part, or the request&#x27;s &#x60;Content-Type&#x60; header must contain the &#x60;start&#x60; parameter to point to it.  The remaining parts are the files of which there can be zero or more. Each file part should contain the &#x60;Content-ID&#x60; MIME header through which the JSON meta data&#x27;s &#x60;files&#x60; element addresses it. The value should be the name of the file.  &#x60;Content-Disposition&#x60; is an optional MIME header. The header&#x27;s optional &#x60;filename&#x60; parameter can be used to specify the file name that Bitbucket should use when writing the file to disk. When present, &#x60;filename&#x60; takes precedence over the value of &#x60;Content-ID&#x60;.  When the JSON body omits the &#x60;files&#x60; element, the remaining parts are not ignored. Instead, each file is added to the new snippet as if its name was explicitly linked (the use of the &#x60;files&#x60; elements is mandatory for some operations like deleting or renaming files).   multipart/form-data -------------------  The use of JSON for the snippet&#x27;s meta data is optional. Meta data can also be supplied as regular form fields in a more conventional &#x60;multipart/form-data&#x60; request:      $ curl -X POST -u credentials https://api.bitbucket.org/2.0/snippets               -F title&#x3D;\&quot;My snippet\&quot;               -F file&#x3D;@foo.txt -F file&#x3D;@image.png      POST /2.0/snippets HTTP/1.1     Content-Length: 951     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;image.png\&quot;     Content-Type: application/octet-stream      ?PNG      IHDR?1??I.....     ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;      My snippet     ------------------------------63a4b224c59f--  Here the meta data properties are included as flat, top-level form fields. The file attachments use the &#x60;file&#x60; field name. To attach multiple files, simply repeat the field.  The advantage of &#x60;multipart/form-data&#x60; over &#x60;multipart/related&#x60; is that it can be easier to build clients.  Essentially all properties are optional, &#x60;title&#x60; and &#x60;files&#x60; included.   Sharing and Visibility ----------------------  Snippets can be either public (visible to anyone on Bitbucket, as well as anonymous users), or private (visible only to members of the workspace). This is controlled through the snippet&#x27;s &#x60;is_private&#x60; element:  * **is_private&#x3D;false** -- everyone, including anonymous users can view   the snippet * **is_private&#x3D;true** -- only workspace members can view the snippet  To create the snippet under a workspace, just append the workspace ID to the URL. See [&#x60;/2.0/snippets/{workspace}&#x60;](./snippets/%7Bworkspace%7D#post).
     * <p><b>201</b> - The newly created snippet object.
     * <p><b>401</b> - If the request was not authenticated
     * @param body The new snippet object.
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsPost(Snippet body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling snippetsPost");
        }
        String path = UriComponentsBuilder.fromPath("/snippets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes a snippet comment.  Comments can only be removed by their author.
     * <p><b>204</b> - Indicates the comment was deleted successfully.
     * <p><b>403</b> - If the authenticated user is not the author of the comment.
     * <p><b>404</b> - If the comment or the snippet does not exist.
     * @param commentId The commentId parameter
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdCommentsCommentIdDelete(String commentId, String encodedId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommentsCommentIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the specific snippet comment.
     * <p><b>200</b> - The specified comment.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the comment or snippet does not exist.
     * @param commentId The commentId parameter
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return SnippetComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SnippetComment snippetsWorkspaceEncodedIdCommentsCommentIdGet(String commentId, String encodedId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommentsCommentIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<SnippetComment> returnType = new ParameterizedTypeReference<SnippetComment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Updates a comment.  Comments can only be updated by their author.
     * <p><b>200</b> - The updated comment object.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the comment or snippet does not exist.
     * @param commentId The commentId parameter
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdCommentsCommentIdPut(String commentId, String encodedId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdPut");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommentsCommentIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommentsCommentIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Used to retrieve a paginated list of all comments for a specific snippet.  This resource works identical to commit and pull request comments.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.
     * <p><b>200</b> - A paginated list of snippet comments, ordered by creation date.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedSnippetComments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedSnippetComments snippetsWorkspaceEncodedIdCommentsGet(String encodedId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/comments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedSnippetComments> returnType = new ParameterizedTypeReference<PaginatedSnippetComments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new comment.  The only required field in the body is &#x60;content.raw&#x60;.  To create a threaded reply to an existing comment, include &#x60;parent.id&#x60;.
     * <p><b>201</b> - The newly created comment.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param body The contents of the new comment.
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspaceEncodedIdCommentsPost(Snippet body, String encodedId, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling snippetsWorkspaceEncodedIdCommentsPost");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommentsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommentsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/comments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the changes (commits) made on this snippet.
     * <p><b>200</b> - The paginated list of snippet commits.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param encodedId The encodedId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedSnippetCommit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedSnippetCommit snippetsWorkspaceEncodedIdCommitsGet(String encodedId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommitsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommitsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/commits").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedSnippetCommit> returnType = new ParameterizedTypeReference<PaginatedSnippetCommit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the changes made on this snippet in this commit.
     * <p><b>200</b> - The specified snippet commit.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the commit or the snippet does not exist.
     * @param encodedId The encodedId parameter
     * @param revision The revision parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return SnippetCommit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SnippetCommit snippetsWorkspaceEncodedIdCommitsRevisionGet(String encodedId, String revision, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdCommitsRevisionGet");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revision' when calling snippetsWorkspaceEncodedIdCommitsRevisionGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdCommitsRevisionGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("revision", revision);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/commits/{revision}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<SnippetCommit> returnType = new ParameterizedTypeReference<SnippetCommit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes a snippet and returns an empty response.
     * <p><b>204</b> - If the snippet was deleted successfully.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have permission to delete the private snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdDelete(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdDelete");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieves a single snippet.  Snippets support multiple content types:  * application/json * multipart/related * multipart/form-data   application/json ----------------  The default content type of the response is &#x60;application/json&#x60;. Since JSON is always &#x60;utf-8&#x60;, it cannot reliably contain file contents for files that are not text. Therefore, JSON snippet documents only contain the filename and links to the file contents.  This means that in order to retrieve all parts of a snippet, N+1 requests need to be made (where N is the number of files in the snippet).   multipart/related -----------------  To retrieve an entire snippet in a single response, use the &#x60;Accept: multipart/related&#x60; HTTP request header.      $ curl -H \&quot;Accept: multipart/related\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/1  Response:      HTTP/1.1 200 OK     Content-Length: 2214     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj\&quot;         },         \&quot;comments\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/comments\&quot;         },         \&quot;watchers\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/watchers\&quot;         },         \&quot;commits\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/commits\&quot;         }       },       \&quot;id\&quot;: kypj,       \&quot;title\&quot;: \&quot;My snippet\&quot;,       \&quot;created_on\&quot;: \&quot;2014-12-29T22:22:04.790331+00:00\&quot;,       \&quot;updated_on\&quot;: \&quot;2014-12-29T22:22:04.790331+00:00\&quot;,       \&quot;is_private\&quot;: false,       \&quot;files\&quot;: {         \&quot;foo.txt\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/files/367ab19/foo.txt\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj#file-foo.txt\&quot;             }           }         },         \&quot;image.png\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/evzijst/kypj/files/367ab19/image.png\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/snippets/evzijst/kypj#file-image.png\&quot;             }           }         }       ],       \&quot;owner\&quot;: {         \&quot;username\&quot;: \&quot;evzijst\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/evzijst\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket-staging-assetroot.s3.amazonaws.com/c/photos/2013/Jul/31/erik-avatar-725122544-0_avatar.png\&quot;           }         }       },       \&quot;creator\&quot;: {         \&quot;username\&quot;: \&quot;evzijst\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/evzijst\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket-staging-assetroot.s3.amazonaws.com/c/photos/2013/Jul/31/erik-avatar-725122544-0_avatar.png\&quot;           }         }       }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: image/png     MIME-Version: 1.0     Content-Transfer-Encoding: base64     Content-ID: \&quot;image.png\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;image.png\&quot;      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  multipart/form-data -------------------  As with creating new snippets, &#x60;multipart/form-data&#x60; can be used as an alternative to &#x60;multipart/related&#x60;. However, the inherently flat structure of form-data means that only basic, root-level properties can be returned, while nested elements like &#x60;links&#x60; are omitted:      $ curl -H \&quot;Accept: multipart/form-data\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj  Response:      HTTP/1.1 200 OK     Content-Length: 951     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;     Content-Type: text/plain; charset&#x3D;\&quot;utf-8\&quot;      My snippet     ------------------------------63a4b224c59f--     Content-Disposition: attachment; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: attachment; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;image.png\&quot;     Content-Transfer-Encoding: base64     Content-Type: application/octet-stream      iVBORw0KGgoAAAANSUhEUgAAABQAAAAoCAYAAAD+MdrbAAABD0lEQVR4Ae3VMUoDQRTG8ccUaW2m     TKONFxArJYJamCvkCnZTaa+VnQdJSBFl2SMsLFrEWNjZBZs0JgiL/+KrhhVmJRbCLPx4O+/DT2TB     cbblJxf+UWFVVRNsEGAtgvJxnLm2H+A5RQ93uIl+3632PZyl/skjfOn9Gvdwmlcw5aPUwimG+NT5     EnNN036IaZePUuIcK533NVfal7/5yjWeot2z9ta1cAczHEf7I+3J0ws9Cgx0fsOFpmlfwKcWPuBQ     73Oc4FHzBaZ8llq4q1mr5B2mOUCt815qYR8eB1hG2VJ7j35q4RofaH7IG+Xrf/PfJhfmwtfFYoIN     AqxFUD6OMxcvkO+UfKfkOyXfKdsv/AYCHMLVkHAFWgAAAABJRU5ErkJggg&#x3D;&#x3D;     ------------------------------5957323a6b76--
     * <p><b>200</b> - The snippet object.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have access to the private snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * <p><b>410</b> - If the snippet marked as spam.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspaceEncodedIdGet(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "multipart/related", "multipart/form-data"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes the snippet.  Note that this only works for versioned URLs that point to the latest commit of the snippet. Pointing to an older commit results in a 405 status code.  To delete a snippet, regardless of whether or not concurrent changes are being made to it, use &#x60;DELETE /snippets/{encoded_id}&#x60; instead.
     * <p><b>204</b> - If the snippet was deleted successfully.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have permission to delete the private snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * <p><b>405</b> - If &#x60;{node_id}&#x60; is not the latest revision.
     * @param nodeId The nodeId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdNodeIdDelete(String nodeId, String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nodeId' when calling snippetsWorkspaceEncodedIdNodeIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdNodeIdDelete");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdNodeIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node_id", nodeId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{node_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieves the raw contents of a specific file in the snippet. The &#x60;Content-Disposition&#x60; header will be \&quot;attachment\&quot; to avoid issues with malevolent executable files.  The file&#x27;s mime type is derived from its filename and returned in the &#x60;Content-Type&#x60; header.  Note that for text files, no character encoding is included as part of the content type.
     * <p><b>200</b> - Returns the contents of the specified file.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the file or snippet does not exist.
     * @param encodedId The encodedId parameter
     * @param nodeId The nodeId parameter
     * @param path The path parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdNodeIdFilesPathGet(String encodedId, String nodeId, String path, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdNodeIdFilesPathGet");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nodeId' when calling snippetsWorkspaceEncodedIdNodeIdFilesPathGet");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling snippetsWorkspaceEncodedIdNodeIdFilesPathGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdNodeIdFilesPathGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("node_id", nodeId);
        uriVariables.put("path", path);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{node_id}/files/{path}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Identical to &#x60;GET /snippets/encoded_id&#x60;, except that this endpoint can be used to retrieve the contents of the snippet as it was at an older revision, while &#x60;/snippets/encoded_id&#x60; always returns the snippet&#x27;s current revision.  Note that only the snippet&#x27;s file contents are versioned, not its meta data properties like the title.  Other than that, the two endpoints are identical in behavior.
     * <p><b>200</b> - The snippet object.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have access to the private snippet.
     * <p><b>404</b> - If the snippet, or the revision does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @param nodeId A commit revision (SHA1).
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspaceEncodedIdNodeIdGet(String workspace, String encodedId, String nodeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdNodeIdGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdNodeIdGet");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nodeId' when calling snippetsWorkspaceEncodedIdNodeIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("node_id", nodeId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{node_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "multipart/related", "multipart/form-data"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Identical to &#x60;UPDATE /snippets/encoded_id&#x60;, except that this endpoint takes an explicit commit revision. Only the snippet&#x27;s \&quot;HEAD\&quot;/\&quot;tip\&quot; (most recent) version can be updated and requests on all other, older revisions fail by returning a 405 status.  Usage of this endpoint over the unrestricted &#x60;/snippets/encoded_id&#x60; could be desired if the caller wants to be sure no concurrent modifications have taken place between the moment of the UPDATE request and the original GET.  This can be considered a so-called \&quot;Compare And Swap\&quot;, or CAS operation.  Other than that, the two endpoints are identical in behavior.
     * <p><b>200</b> - The updated snippet object.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have permission to update the private snippet.
     * <p><b>404</b> - If the snippet or the revision does not exist.
     * <p><b>405</b> - If &#x60;{node_id}&#x60; is not the latest revision.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @param nodeId A commit revision (SHA1).
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspaceEncodedIdNodeIdPut(String workspace, String encodedId, String nodeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdNodeIdPut");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdNodeIdPut");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nodeId' when calling snippetsWorkspaceEncodedIdNodeIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("node_id", nodeId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{node_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "multipart/related", "multipart/form-data"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Used to update a snippet. Use this to add and delete files and to change a snippet&#x27;s title.  To update a snippet, one can either PUT a full snapshot, or only the parts that need to be changed.  The contract for PUT on this API is that properties missing from the request remain untouched so that snippets can be efficiently manipulated with differential payloads.  To delete a property (e.g. the title, or a file), include its name in the request, but omit its value (use &#x60;null&#x60;).  As in Git, explicit renaming of files is not supported. Instead, to rename a file, delete it and add it again under another name. This can be done atomically in a single request. Rename detection is left to the SCM.  PUT supports three different content types for both request and response bodies:  * &#x60;application/json&#x60; * &#x60;multipart/related&#x60; * &#x60;multipart/form-data&#x60;  The content type used for the request body can be different than that used for the response. Content types are specified using standard HTTP headers.  Use the &#x60;Content-Type&#x60; and &#x60;Accept&#x60; headers to select the desired request and response format.   application/json ----------------  As with creation and retrieval, the content type determines what properties can be manipulated. &#x60;application/json&#x60; does not support file contents and is therefore limited to a snippet&#x27;s meta data.  To update the title, without changing any of its files:      $ curl -X POST -H \&quot;Content-Type: application/json\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj             -d &#x27;{\&quot;title\&quot;: \&quot;Updated title\&quot;}&#x27;   To delete the title:      $ curl -X POST -H \&quot;Content-Type: application/json\&quot; https://api.bitbucket.org/2.0/snippets/evzijst/kypj             -d &#x27;{\&quot;title\&quot;: null}&#x27;  Not all parts of a snippet can be manipulated. The owner and creator for instance are immutable.   multipart/related -----------------  &#x60;multipart/related&#x60; can be used to manipulate all of a snippet&#x27;s properties. The body is identical to a POST. properties omitted from the request are left unchanged. Since the &#x60;start&#x60; part contains JSON, the mechanism for manipulating the snippet&#x27;s meta data is identical to &#x60;application/json&#x60; requests.  To update one of a snippet&#x27;s file contents, while also changing its title:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 288     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;title\&quot;: \&quot;My updated snippet\&quot;,       \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;foo.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;foo.txt\&quot;      Updated file contents.      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  Here only the parts that are changed are included in the body. The other files remain untouched.  Note the use of the &#x60;files&#x60; list in the JSON part. This list contains the files that are being manipulated. This list should have corresponding multiparts in the request that contain the new contents of these files.  If a filename in the &#x60;files&#x60; list does not have a corresponding part, it will be deleted from the snippet, as shown below:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 188     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {       \&quot;files\&quot;: {         \&quot;image.png\&quot;: {}       }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--  To simulate a rename, delete a file and add the same file under another name:      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 212     Content-Type: multipart/related; start&#x3D;\&quot;snippet\&quot;; boundary&#x3D;\&quot;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;\&quot;     MIME-Version: 1.0      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: application/json; charset&#x3D;\&quot;utf-8\&quot;     MIME-Version: 1.0     Content-ID: snippet      {         \&quot;files\&quot;: {           \&quot;foo.txt\&quot;: {},           \&quot;bar.txt\&quot;: {}         }     }      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;     Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot;     MIME-Version: 1.0     Content-Transfer-Encoding: 7bit     Content-ID: \&quot;bar.txt\&quot;     Content-Disposition: attachment; filename&#x3D;\&quot;bar.txt\&quot;      foo      --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;--   multipart/form-data -----------------  Again, one can also use &#x60;multipart/form-data&#x60; to manipulate file contents and meta data atomically.      $ curl -X PUT http://localhost:12345/2.0/snippets/evzijst/kypj             -F title&#x3D;\&quot;My updated snippet\&quot; -F file&#x3D;@foo.txt      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 351     Content-Type: multipart/form-data; boundary&#x3D;----------------------------63a4b224c59f      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;file\&quot;; filename&#x3D;\&quot;foo.txt\&quot;     Content-Type: text/plain      foo      ------------------------------63a4b224c59f     Content-Disposition: form-data; name&#x3D;\&quot;title\&quot;      My updated snippet     ------------------------------63a4b224c59f  To delete a file, omit its contents while including its name in the &#x60;files&#x60; field:      $ curl -X PUT https://api.bitbucket.org/2.0/snippets/evzijst/kypj -F files&#x3D;image.png      PUT /2.0/snippets/evzijst/kypj HTTP/1.1     Content-Length: 149     Content-Type: multipart/form-data; boundary&#x3D;----------------------------ef8871065a86      ------------------------------ef8871065a86     Content-Disposition: form-data; name&#x3D;\&quot;files\&quot;      image.png     ------------------------------ef8871065a86--  The explicit use of the &#x60;files&#x60; element in &#x60;multipart/related&#x60; and &#x60;multipart/form-data&#x60; is only required when deleting files. The default mode of operation is for file parts to be processed, regardless of whether or not they are listed in &#x60;files&#x60;, as a convenience to the client.
     * <p><b>200</b> - The updated snippet object.
     * <p><b>401</b> - If the snippet is private and the request was not authenticated.
     * <p><b>403</b> - If authenticated user does not have permission to update the private snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet&#x27;s id.
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspaceEncodedIdPut(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdPut");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "multipart/related", "multipart/form-data"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the diff of the specified commit against its first parent.  Note that this resource is different in functionality from the &#x60;patch&#x60; resource.  The differences between a diff and a patch are:  * patches have a commit header with the username, message, etc * diffs support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter the   diff to just that one file diff (not supported for patches) * for a merge, the diff will show the diff between the merge commit and   its first parent (identical to how PRs work), while patch returns a   response containing separate patches for each commit on the second   parent&#x27;s ancestry, up to the oldest common ancestor (identical to   its reachability).  Note that the character encoding of the contents of the diff is unspecified as Git and Mercurial do not track this, making it hard for Bitbucket to reliably determine this.
     * <p><b>200</b> - The raw diff contents.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @param revision A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;.
     * @param path When used, only one the diff of the specified file will be returned.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdRevisionDiffGet(String workspace, String encodedId, String revision, String path) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdRevisionDiffGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdRevisionDiffGet");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revision' when calling snippetsWorkspaceEncodedIdRevisionDiffGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("revision", revision);
        String pathNew = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{revision}/diff").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "path", pathNew));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the patch of the specified commit against its first parent.  Note that this resource is different in functionality from the &#x60;diff&#x60; resource.  The differences between a diff and a patch are:  * patches have a commit header with the username, message, etc * diffs support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter the   diff to just that one file diff (not supported for patches) * for a merge, the diff will show the diff between the merge commit and   its first parent (identical to how PRs work), while patch returns a   response containing separate patches for each commit on the second   parent&#x27;s ancestry, up to the oldest common ancestor (identical to   its reachability).  Note that the character encoding of the contents of the patch is unspecified as Git and Mercurial do not track this, making it hard for Bitbucket to reliably determine this.
     * <p><b>200</b> - The raw patch contents.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @param revision A revspec expression. This can simply be a commit SHA1, a ref name, or a compare expression like &#x60;staging..production&#x60;.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdRevisionPatchGet(String workspace, String encodedId, String revision) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdRevisionPatchGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdRevisionPatchGet");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revision' when calling snippetsWorkspaceEncodedIdRevisionPatchGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("revision", revision);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/{revision}/patch").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Used to stop watching a specific snippet. Returns 204 (No Content) to indicate success.
     * <p><b>204</b> - Indicates the user stopped watching the snippet successfully.
     * <p><b>401</b> - If the request was not authenticated.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @return PaginatedUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedUsers snippetsWorkspaceEncodedIdWatchDelete(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdWatchDelete");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdWatchDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/watch").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedUsers> returnType = new ParameterizedTypeReference<PaginatedUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Used to check if the current user is watching a specific snippet.  Returns 204 (No Content) if the user is watching the snippet and 404 if not.  Hitting this endpoint anonymously always returns a 404.
     * <p><b>204</b> - If the authenticated user is watching the snippet.
     * <p><b>404</b> - If the snippet does not exist, or if the authenticated user is not watching the snippet.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @return PaginatedUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedUsers snippetsWorkspaceEncodedIdWatchGet(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdWatchGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdWatchGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/watch").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedUsers> returnType = new ParameterizedTypeReference<PaginatedUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Used to start watching a specific snippet. Returns 204 (No Content).
     * <p><b>204</b> - Indicates the authenticated user is now watching the snippet.
     * <p><b>401</b> - If the request was not authenticated.
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @return PaginatedUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedUsers snippetsWorkspaceEncodedIdWatchPut(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdWatchPut");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdWatchPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/watch").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedUsers> returnType = new ParameterizedTypeReference<PaginatedUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of all users watching a specific snippet.
     * <p><b>200</b> - The paginated list of users watching this snippet
     * <p><b>404</b> - If the snippet does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param encodedId The snippet id.
     * @return PaginatedUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedUsers snippetsWorkspaceEncodedIdWatchersGet(String workspace, String encodedId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdWatchersGet");
        }
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdWatchersGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("encoded_id", encodedId);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/watchers").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedUsers> returnType = new ParameterizedTypeReference<PaginatedUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Identical to [&#x60;/snippets&#x60;](../snippets), except that the result is further filtered by the snippet owner and only those that are owned by &#x60;{workspace}&#x60; are returned.
     * <p><b>200</b> - A paginated list of snippets.
     * <p><b>404</b> - If the user does not exist.
     * @param workspace Limits the result to snippets owned by this workspace.
     * @param role Filter down the result based on the authenticated user&#x27;s role (&#x60;owner&#x60;, &#x60;contributor&#x60;, or &#x60;member&#x60;).
     * @return PaginatedSnippets
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedSnippets snippetsWorkspaceGet(String workspace, String role) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedSnippets> returnType = new ParameterizedTypeReference<PaginatedSnippets>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Identical to [&#x60;/snippets&#x60;](../snippets#post), except that the new snippet will be created under the workspace specified in the path parameter &#x60;{workspace}&#x60;.
     * <p><b>201</b> - The newly created snippet object.
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have permission to create snippets in the specified workspace.
     * @param body The new snippet object.
     * @param workspace Create a snippet in the specified workspace.
     * @return Snippet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Snippet snippetsWorkspacePost(Snippet body, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling snippetsWorkspacePost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspacePost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/snippets/{workspace}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Snippet> returnType = new ParameterizedTypeReference<Snippet>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
