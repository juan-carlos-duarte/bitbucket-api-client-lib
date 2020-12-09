package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;


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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.PropertiesApi")
public class PropertiesApi {
    private ApiClient apiClient;

    public PropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public PropertiesApi(ApiClient apiClient) {
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
     * Delete an application property value stored against a commit.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param commit The commit.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCommitHostedPropertyValue(String workspace, String repoSlug, String commit, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling deleteCommitHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteCommitHostedPropertyValue");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling deleteCommitHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling deleteCommitHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling deleteCommitHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete an application property value stored against a pull request.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param pullrequestId The pull request ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePullRequestHostedPropertyValue(String workspace, String repoSlug, String pullrequestId, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling deletePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deletePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'pullrequestId' is set
        if (pullrequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullrequestId' when calling deletePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling deletePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling deletePullRequestHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pullrequest_id", pullrequestId);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete an application property value stored against a repository.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryHostedPropertyValue(String workspace, String repoSlug, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling deleteRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling deleteRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling deleteRepositoryHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete an application property value stored against a user.
     * <p><b>204</b> - An empty response.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUserHostedPropertyValue(String selectedUser, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling deleteUserHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling deleteUserHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling deleteUserHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve an application property value stored against a commit.
     * <p><b>200</b> - The value of the property.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param commit The commit.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCommitHostedPropertyValue(String workspace, String repoSlug, String commit, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getCommitHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getCommitHostedPropertyValue");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getCommitHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling getCommitHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling getCommitHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve an application property value stored against a pull request.
     * <p><b>200</b> - The value of the property.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param pullrequestId The pull request ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getPullRequestHostedPropertyValue(String workspace, String repoSlug, String pullrequestId, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getPullRequestHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPullRequestHostedPropertyValue");
        }
        // verify the required parameter 'pullrequestId' is set
        if (pullrequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullrequestId' when calling getPullRequestHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling getPullRequestHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling getPullRequestHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pullrequest_id", pullrequestId);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve an application property value stored against a repository.
     * <p><b>200</b> - The value of the property.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRepositoryHostedPropertyValue(String workspace, String repoSlug, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling getRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling getRepositoryHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve an application property value stored against a user.
     * <p><b>200</b> - The value of the property.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void retrieveUserHostedPropertyValue(String selectedUser, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling retrieveUserHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling retrieveUserHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling retrieveUserHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update an application property value stored against a commit.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param commit The commit.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateCommitHostedPropertyValue(String workspace, String repoSlug, String commit, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling updateCommitHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateCommitHostedPropertyValue");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling updateCommitHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling updateCommitHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling updateCommitHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update an application property value stored against a pull request.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param pullrequestId The pull request ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updatePullRequestHostedPropertyValue(String workspace, String repoSlug, String pullrequestId, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling updatePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updatePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'pullrequestId' is set
        if (pullrequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullrequestId' when calling updatePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling updatePullRequestHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling updatePullRequestHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pullrequest_id", pullrequestId);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pullrequest_id}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update an application property value stored against a repository.
     * <p><b>204</b> - An empty response.
     * @param workspace The repository container; either the workspace slug or the UUID in curly braces.
     * @param repoSlug The repository.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateRepositoryHostedPropertyValue(String workspace, String repoSlug, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling updateRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling updateRepositoryHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling updateRepositoryHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update an application property value stored against a user.
     * <p><b>204</b> - An empty response.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param appKey The key of the Connect app.
     * @param propertyName The name of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateUserHostedPropertyValue(String selectedUser, String appKey, String propertyName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling updateUserHostedPropertyValue");
        }
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appKey' when calling updateUserHostedPropertyValue");
        }
        // verify the required parameter 'propertyName' is set
        if (propertyName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyName' when calling updateUserHostedPropertyValue");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("app_key", appKey);
        uriVariables.put("property_name", propertyName);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/properties/{app_key}/{property_name}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
