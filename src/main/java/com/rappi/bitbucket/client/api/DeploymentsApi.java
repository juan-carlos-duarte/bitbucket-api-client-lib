package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Deployment;
import com.rappi.bitbucket.client.model.DeploymentEnvironment;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedDeployments;
import com.rappi.bitbucket.client.model.PaginatedEnvironments;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.DeploymentsApi")
public class DeploymentsApi {
    private ApiClient apiClient;

    public DeploymentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeploymentsApi(ApiClient apiClient) {
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
     * Create an environment.
     * <p><b>201</b> - The environment was created.
     * <p><b>404</b> - The account or repository does not exist.
     * <p><b>409</b> - An environment host with the provided name already exists.
     * @param body The environment to create.
     * @param username The account.
     * @param repoSlug The repository.
     * @return DeploymentEnvironment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeploymentEnvironment createEnvironment(DeploymentEnvironment body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createEnvironment");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createEnvironment");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createEnvironment");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/environments/").buildAndExpand(uriVariables).toUriString();
        
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

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DeploymentEnvironment> returnType = new ParameterizedTypeReference<DeploymentEnvironment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete an environment
     * <p><b>204</b> - The environment was deleted.
     * <p><b>404</b> - No account or repository with the UUID provided exists.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment UUID.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEnvironmentForRepository(String username, String repoSlug, String environmentUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteEnvironmentForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteEnvironmentForRepository");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling deleteEnvironmentForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/environments/{environment_uuid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a deployment
     * <p><b>200</b> - The deployment.
     * <p><b>404</b> - No account, repository or deployment with the UUID provided exists.
     * @param username The account.
     * @param repoSlug The repository.
     * @param deploymentUuid The deployment UUID.
     * @return Deployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Deployment getDeploymentForRepository(String username, String repoSlug, String deploymentUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getDeploymentForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getDeploymentForRepository");
        }
        // verify the required parameter 'deploymentUuid' is set
        if (deploymentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentUuid' when calling getDeploymentForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("deployment_uuid", deploymentUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments/{deployment_uuid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Deployment> returnType = new ParameterizedTypeReference<Deployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find deployments
     * <p><b>200</b> - The matching deployments.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedDeployments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedDeployments getDeploymentsForRepository(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getDeploymentsForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getDeploymentsForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PaginatedDeployments> returnType = new ParameterizedTypeReference<PaginatedDeployments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve an environment
     * <p><b>200</b> - The environment.
     * <p><b>404</b> - No account, repository or environment with the UUID provided exists.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment UUID.
     * @return DeploymentEnvironment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeploymentEnvironment getEnvironmentForRepository(String username, String repoSlug, String environmentUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getEnvironmentForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getEnvironmentForRepository");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling getEnvironmentForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/environments/{environment_uuid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DeploymentEnvironment> returnType = new ParameterizedTypeReference<DeploymentEnvironment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find environments
     * <p><b>200</b> - The matching environments.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedEnvironments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedEnvironments getEnvironmentsForRepository(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getEnvironmentsForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getEnvironmentsForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/environments/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PaginatedEnvironments> returnType = new ParameterizedTypeReference<PaginatedEnvironments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update an environment
     * <p><b>202</b> - The environment update request was accepted.
     * <p><b>404</b> - No account, repository or environment with the UUID provided exists.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment UUID.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateEnvironmentForRepository(String username, String repoSlug, String environmentUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateEnvironmentForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateEnvironmentForRepository");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling updateEnvironmentForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/environments/{environment_uuid}/changes/").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
