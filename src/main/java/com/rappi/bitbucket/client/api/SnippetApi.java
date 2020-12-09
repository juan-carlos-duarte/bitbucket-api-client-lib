package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.SnippetApi")
public class SnippetApi {
    private ApiClient apiClient;

    public SnippetApi() {
        this(new ApiClient());
    }

    @Autowired
    public SnippetApi(ApiClient apiClient) {
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
     * Convenience resource for getting to a snippet&#x27;s raw files without the need for first having to retrieve the snippet itself and having to pull out the versioned file links.
     * <p><b>302</b> - A redirect to the most recent revision of the specified file.
     * <p><b>403</b> - If the authenticated user does not have access to the snippet.
     * <p><b>404</b> - If the snippet does not exist.
     * @param encodedId The encodedId parameter
     * @param path The path parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void snippetsWorkspaceEncodedIdFilesPathGet(String encodedId, String path, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'encodedId' is set
        if (encodedId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encodedId' when calling snippetsWorkspaceEncodedIdFilesPathGet");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling snippetsWorkspaceEncodedIdFilesPathGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling snippetsWorkspaceEncodedIdFilesPathGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("encoded_id", encodedId);
        uriVariables.put("path", path);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/snippets/{workspace}/{encoded_id}/files/{path}").buildAndExpand(uriVariables).toUriString();
        
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
}
