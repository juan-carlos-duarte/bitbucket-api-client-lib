package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.DeploymentVariable;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedDeploymentVariable;
import com.rappi.bitbucket.client.model.PaginatedPipelineCaches;
import com.rappi.bitbucket.client.model.PaginatedPipelineKnownHosts;
import com.rappi.bitbucket.client.model.PaginatedPipelineScheduleExecutions;
import com.rappi.bitbucket.client.model.PaginatedPipelineSchedules;
import com.rappi.bitbucket.client.model.PaginatedPipelineSteps;
import com.rappi.bitbucket.client.model.PaginatedPipelineVariables;
import com.rappi.bitbucket.client.model.PaginatedPipelines;
import com.rappi.bitbucket.client.model.Pipeline;
import com.rappi.bitbucket.client.model.PipelineBuildNumber;
import com.rappi.bitbucket.client.model.PipelineCacheContentUri;
import com.rappi.bitbucket.client.model.PipelineKnownHost;
import com.rappi.bitbucket.client.model.PipelineSchedule;
import com.rappi.bitbucket.client.model.PipelineSshKeyPair;
import com.rappi.bitbucket.client.model.PipelineStep;
import com.rappi.bitbucket.client.model.PipelineVariable;
import com.rappi.bitbucket.client.model.PipelinesConfig;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.PipelinesApi")
public class PipelinesApi {
    private ApiClient apiClient;

    public PipelinesApi() {
        this(new ApiClient());
    }

    @Autowired
    public PipelinesApi(ApiClient apiClient) {
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
     * Create a deployment environment level variable.
     * <p><b>201</b> - The variable was created.
     * <p><b>404</b> - The account, repository, environment or variable with the given UUID was not found.
     * <p><b>409</b> - A variable with the provided key already exists.
     * @param body The variable to create
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment.
     * @param variableUuid The UUID of the variable to update.
     * @return DeploymentVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeploymentVariable createDeploymentVariable(DeploymentVariable body, String username, String repoSlug, String environmentUuid, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDeploymentVariable");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createDeploymentVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createDeploymentVariable");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling createDeploymentVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling createDeploymentVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeploymentVariable> returnType = new ParameterizedTypeReference<DeploymentVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Endpoint to create and initiate a pipeline. There are a couple of different options to initiate a pipeline, where the payload of the request will determine which type of pipeline will be instantiated. # Trigger a Pipeline for a branch One way to trigger pipelines is by specifying the branch for which you want to trigger a pipeline. The specified branch will be used to determine which pipeline definition from the &#x60;bitbucket-pipelines.yml&#x60; file will be applied to initiate the pipeline. The pipeline will then do a clone of the repository and checkout the latest revision of the specified branch.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\   -d &#x27;   {     \&quot;target\&quot;: {       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;     }   }&#x27; &#x60;&#x60;&#x60; # Trigger a Pipeline for a commit on a branch or tag You can initiate a pipeline for a specific commit and in the context of a specified reference (e.g. a branch, tag or bookmark). The specified reference will be used to determine which pipeline definition from the bitbucket-pipelines.yml file will be applied to initiate the pipeline. The pipeline will clone the repository and then do a checkout the specified reference.  The following reference types are supported:  * &#x60;branch&#x60; * &#x60;named_branch&#x60; * &#x60;bookmark&#x60;  * &#x60;tag&#x60;  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\   https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\   -d &#x27;   {     \&quot;target\&quot;: {       \&quot;commit\&quot;: {         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;hash\&quot;: \&quot;ce5b7431602f7cbba007062eeb55225c6e18e956\&quot;       },       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;     }   }&#x27; &#x60;&#x60;&#x60; # Trigger a specific pipeline definition for a commit You can trigger a specific pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file for a specific commit. In addition to the commit revision, you specify the type and pattern of the selector that identifies the pipeline definition. The resulting pipeline will then clone the repository and checkout the specified revision.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\  -d &#x27;   {      \&quot;target\&quot;: {       \&quot;commit\&quot;: {          \&quot;hash\&quot;:\&quot;a3c4e02c9a3755eccdc3764e6ea13facdf30f923\&quot;,          \&quot;type\&quot;:\&quot;commit\&quot;        },         \&quot;selector\&quot;: {            \&quot;type\&quot;:\&quot;custom\&quot;,               \&quot;pattern\&quot;:\&quot;Deploy to production\&quot;           },         \&quot;type\&quot;:\&quot;pipeline_commit_target\&quot;    }   }&#x27; &#x60;&#x60;&#x60; # Trigger a specific pipeline definition for a commit on a branch or tag You can trigger a specific pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file for a specific commit in the context of a specified reference. In addition to the commit revision, you specify the type and pattern of the selector that identifies the pipeline definition, as well as the reference information. The resulting pipeline will then clone the repository a checkout the specified reference.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/jeroendr/meat-demo2/pipelines/ \\  -d &#x27;   {      \&quot;target\&quot;: {       \&quot;commit\&quot;: {          \&quot;hash\&quot;:\&quot;a3c4e02c9a3755eccdc3764e6ea13facdf30f923\&quot;,          \&quot;type\&quot;:\&quot;commit\&quot;        },        \&quot;selector\&quot;: {           \&quot;type\&quot;: \&quot;custom\&quot;,           \&quot;pattern\&quot;: \&quot;Deploy to production\&quot;        },        \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,        \&quot;ref_name\&quot;: \&quot;master\&quot;,        \&quot;ref_type\&quot;: \&quot;branch\&quot;      }   }&#x27; &#x60;&#x60;&#x60;   # Trigger a custom pipeline with variables In addition to triggering a custom pipeline that is defined in your &#x60;bitbucket-pipelines.yml&#x60; file as shown in the examples above, you can specify variables that will be available for your build. In the request, provide a list of variables, specifying the following for each variable: key, value, and whether it should be secured or not (this field is optional and defaults to not secured).  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/{workspace}/{repo_slug}/pipelines/ \\  -d &#x27;   {     \&quot;target\&quot;: {       \&quot;type\&quot;: \&quot;pipeline_ref_target\&quot;,       \&quot;ref_type\&quot;: \&quot;branch\&quot;,       \&quot;ref_name\&quot;: \&quot;master\&quot;,       \&quot;selector\&quot;: {         \&quot;type\&quot;: \&quot;custom\&quot;,         \&quot;pattern\&quot;: \&quot;Deploy to production\&quot;       }     },     \&quot;variables\&quot;: [       {         \&quot;key\&quot;: \&quot;var1key\&quot;,         \&quot;value\&quot;: \&quot;var1value\&quot;,         \&quot;secured\&quot;: true       },       {         \&quot;key\&quot;: \&quot;var2key\&quot;,         \&quot;value\&quot;: \&quot;var2value\&quot;       }     ]   }&#x27; &#x60;&#x60;&#x60;  # Trigger a pull request pipeline  You can also initiate a pipeline for a specific pull request.  ### Example  &#x60;&#x60;&#x60; $ curl -X POST -is -u username:password \\   -H &#x27;Content-Type: application/json&#x27; \\  https://api.bitbucket.org/2.0/repositories/{workspace}/{repo_slug}/pipelines/ \\  -d &#x27;   {  \&quot;target\&quot;: {       \&quot;type\&quot;: \&quot;pipeline_pullrequest_target\&quot;,    \&quot;source\&quot;: \&quot;pull-request-branch\&quot;,       \&quot;destination\&quot;: \&quot;master\&quot;,       \&quot;destination_commit\&quot;: {         \&quot;hash\&quot; : \&quot;9f848b7\&quot;       },       \&quot;commit\&quot;: {        \&quot;hash\&quot; : \&quot;1a372fc\&quot;       },       \&quot;pullrequest\&quot; : {        \&quot;id\&quot; : \&quot;3\&quot;       },    \&quot;selector\&quot;: {         \&quot;type\&quot;: \&quot;pull-requests\&quot;,         \&quot;pattern\&quot;: \&quot;**\&quot;       }     }   }&#x27; &#x60;&#x60;&#x60; 
     * <p><b>201</b> - The initiated pipeline.
     * <p><b>400</b> - The account or repository is not enabled, the yml file does not exist in the repository for the given revision, or the request body contained invalid properties.
     * <p><b>404</b> - The account or repository was not found.
     * @param body The pipeline to initiate.
     * @param username The account.
     * @param repoSlug The repository.
     * @return Pipeline
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pipeline createPipelineForRepository(Pipeline body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createPipelineForRepository");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createPipelineForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createPipelineForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pipeline> returnType = new ParameterizedTypeReference<Pipeline>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create an account level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>201</b> - The created variable.
     * <p><b>404</b> - The account does not exist.
     * <p><b>409</b> - A variable with the provided key already exists.
     * @param username The account.
     * @param body The variable to create.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable createPipelineVariableForTeam(String username, PipelineVariable body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createPipelineVariableForTeam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>201</b> - The created variable.
     * <p><b>404</b> - The account does not exist.
     * <p><b>409</b> - A variable with the provided key already exists.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param body The variable to create.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable createPipelineVariableForUser(String selectedUser, PipelineVariable body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling createPipelineVariableForUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a workspace level variable.
     * <p><b>201</b> - The created variable.
     * <p><b>404</b> - The workspace does not exist.
     * <p><b>409</b> - A variable with the provided key already exists.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;.
     * @param body The variable to create.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable createPipelineVariableForWorkspace(String workspace, PipelineVariable body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling createPipelineVariableForWorkspace");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/pipelines-config/variables").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a repository level known host.
     * <p><b>201</b> - The known host was created.
     * <p><b>404</b> - The account or repository does not exist.
     * <p><b>409</b> - A known host with the provided hostname already exists.
     * @param body The known host to create.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineKnownHost
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineKnownHost createRepositoryPipelineKnownHost(PipelineKnownHost body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createRepositoryPipelineKnownHost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineKnownHost> returnType = new ParameterizedTypeReference<PipelineKnownHost>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a schedule for the given repository.
     * <p><b>201</b> - The created schedule.
     * <p><b>400</b> - There were errors validating the request.
     * <p><b>401</b> - The maximum limit of schedules for this repository was reached.
     * <p><b>404</b> - The account or repository was not found.
     * @param body The schedule to create.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineSchedule createRepositoryPipelineSchedule(PipelineSchedule body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createRepositoryPipelineSchedule");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createRepositoryPipelineSchedule");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createRepositoryPipelineSchedule");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineSchedule> returnType = new ParameterizedTypeReference<PipelineSchedule>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a repository level variable.
     * <p><b>201</b> - The variable was created.
     * <p><b>404</b> - The account or repository does not exist.
     * <p><b>409</b> - A variable with the provided key already exists.
     * @param body The variable to create.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable createRepositoryPipelineVariable(PipelineVariable body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createRepositoryPipelineVariable");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createRepositoryPipelineVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createRepositoryPipelineVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete a deployment environment level variable.
     * <p><b>204</b> - The variable was deleted.
     * <p><b>404</b> - The account, repository, environment or variable with given UUID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment.
     * @param variableUuid The UUID of the variable to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDeploymentVariable(String username, String repoSlug, String environmentUuid, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteDeploymentVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteDeploymentVariable");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling deleteDeploymentVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling deleteDeploymentVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>204</b> - The variable was deleted
     * <p><b>404</b> - The account or the variable with the provided UUID does not exist.
     * @param username The account.
     * @param variableUuid The UUID of the variable to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePipelineVariableForTeam(String username, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deletePipelineVariableForTeam");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling deletePipelineVariableForTeam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete an account level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>204</b> - The variable was deleted
     * <p><b>404</b> - The account or the variable with the provided UUID does not exist.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param variableUuid The UUID of the variable to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePipelineVariableForUser(String selectedUser, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling deletePipelineVariableForUser");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling deletePipelineVariableForUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a workspace level variable.
     * <p><b>204</b> - The variable was deleted
     * <p><b>404</b> - The workspace or the variable with the provided UUID does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;.
     * @param variableUuid The UUID of the variable to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deletePipelineVariableForWorkspace(String workspace, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling deletePipelineVariableForWorkspace");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling deletePipelineVariableForWorkspace");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/pipelines-config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a repository cache.
     * <p><b>204</b> - The cache was deleted.
     * <p><b>404</b> - The workspace, repository or cache_uuid with given UUID was not found.
     * @param workspace The account.
     * @param repoSlug The repository.
     * @param cacheUuid The UUID of the cache to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryPipelineCache(String workspace, String repoSlug, String cacheUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling deleteRepositoryPipelineCache");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryPipelineCache");
        }
        // verify the required parameter 'cacheUuid' is set
        if (cacheUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cacheUuid' when calling deleteRepositoryPipelineCache");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("cache_uuid", cacheUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines-config/caches/{cache_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete the repository SSH key pair.
     * <p><b>204</b> - The SSH key pair was deleted.
     * <p><b>404</b> - The account, repository or SSH key pair was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryPipelineKeyPair(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteRepositoryPipelineKeyPair");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryPipelineKeyPair");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a repository level known host.
     * <p><b>204</b> - The known host was deleted.
     * <p><b>404</b> - The account, repository or known host with given UUID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param knownHostUuid The UUID of the known host to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryPipelineKnownHost(String username, String repoSlug, String knownHostUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'knownHostUuid' is set
        if (knownHostUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'knownHostUuid' when calling deleteRepositoryPipelineKnownHost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("known_host_uuid", knownHostUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a schedule.
     * <p><b>204</b> - The schedule was deleted.
     * <p><b>404</b> - The account, repository or schedule was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param scheduleUuid The uuid of the schedule.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryPipelineSchedule(String username, String repoSlug, String scheduleUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteRepositoryPipelineSchedule");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryPipelineSchedule");
        }
        // verify the required parameter 'scheduleUuid' is set
        if (scheduleUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleUuid' when calling deleteRepositoryPipelineSchedule");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("schedule_uuid", scheduleUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a repository level variable.
     * <p><b>204</b> - The variable was deleted.
     * <p><b>404</b> - The account, repository or variable with given UUID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param variableUuid The UUID of the variable to delete.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRepositoryPipelineVariable(String username, String repoSlug, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteRepositoryPipelineVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteRepositoryPipelineVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling deleteRepositoryPipelineVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Find deployment environment level variables.
     * <p><b>200</b> - The retrieved deployment variables.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment.
     * @return PaginatedDeploymentVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedDeploymentVariable getDeploymentVariables(String username, String repoSlug, String environmentUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getDeploymentVariables");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getDeploymentVariables");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling getDeploymentVariables");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedDeploymentVariable> returnType = new ParameterizedTypeReference<PaginatedDeploymentVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a specified pipeline
     * <p><b>200</b> - The pipeline.
     * <p><b>404</b> - No account, repository or pipeline with the UUID provided exists.
     * @param username The account.
     * @param repoSlug The repository.
     * @param pipelineUuid The pipeline UUID.
     * @return Pipeline
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pipeline getPipelineForRepository(String username, String repoSlug, String pipelineUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPipelineForRepository");
        }
        // verify the required parameter 'pipelineUuid' is set
        if (pipelineUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineUuid' when calling getPipelineForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pipeline_uuid", pipelineUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pipeline> returnType = new ParameterizedTypeReference<Pipeline>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a given step of a pipeline.
     * <p><b>200</b> - The step.
     * <p><b>404</b> - No account, repository, pipeline or step with the UUID provided exists for the pipeline with the UUID provided.
     * @param username The account.
     * @param repoSlug The repository.
     * @param pipelineUuid The UUID of the pipeline.
     * @param stepUuid The UUID of the step.
     * @return PipelineStep
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineStep getPipelineStepForRepository(String username, String repoSlug, String pipelineUuid, String stepUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineStepForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPipelineStepForRepository");
        }
        // verify the required parameter 'pipelineUuid' is set
        if (pipelineUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineUuid' when calling getPipelineStepForRepository");
        }
        // verify the required parameter 'stepUuid' is set
        if (stepUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stepUuid' when calling getPipelineStepForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pipeline_uuid", pipelineUuid);
        uriVariables.put("step_uuid", stepUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineStep> returnType = new ParameterizedTypeReference<PipelineStep>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the log file for a given step of a pipeline.  This endpoint supports (and encourages!) the use of [HTTP Range requests](https://tools.ietf.org/html/rfc7233) to deal with potentially very large log files.
     * <p><b>200</b> - The raw log file for this pipeline step.
     * <p><b>304</b> - The log has the same etag as the provided If-None-Match header.
     * <p><b>404</b> - A pipeline with the given UUID does not exist, a step with the given UUID does not exist in the pipeline or a log file does not exist for the given step.
     * <p><b>416</b> - The requested range does not exist for requests that specified the [HTTP Range header](https://tools.ietf.org/html/rfc7233#section-3.1).
     * @param username The account.
     * @param repoSlug The repository.
     * @param pipelineUuid The UUID of the pipeline.
     * @param stepUuid The UUID of the step.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getPipelineStepLogForRepository(String username, String repoSlug, String pipelineUuid, String stepUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineStepLogForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPipelineStepLogForRepository");
        }
        // verify the required parameter 'pipelineUuid' is set
        if (pipelineUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineUuid' when calling getPipelineStepLogForRepository");
        }
        // verify the required parameter 'stepUuid' is set
        if (stepUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stepUuid' when calling getPipelineStepLogForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pipeline_uuid", pipelineUuid);
        uriVariables.put("step_uuid", stepUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/log").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/octet-stream"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find steps for the given pipeline.
     * <p><b>200</b> - The steps.
     * @param username The account.
     * @param repoSlug The repository.
     * @param pipelineUuid The UUID of the pipeline.
     * @return PaginatedPipelineSteps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineSteps getPipelineStepsForRepository(String username, String repoSlug, String pipelineUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineStepsForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPipelineStepsForRepository");
        }
        // verify the required parameter 'pipelineUuid' is set
        if (pipelineUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineUuid' when calling getPipelineStepsForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pipeline_uuid", pipelineUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineSteps> returnType = new ParameterizedTypeReference<PaginatedPipelineSteps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The variable.
     * <p><b>404</b> - The account or variable with the given UUID was not found.
     * @param username The account.
     * @param variableUuid The UUID of the variable to retrieve.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable getPipelineVariableForTeam(String username, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineVariableForTeam");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling getPipelineVariableForTeam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The variable.
     * <p><b>404</b> - The account or variable with the given UUID was not found.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param variableUuid The UUID of the variable to retrieve.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable getPipelineVariableForUser(String selectedUser, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling getPipelineVariableForUser");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling getPipelineVariableForUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a workspace level variable.
     * <p><b>200</b> - The variable.
     * <p><b>404</b> - The workspace or variable with the given UUID was not found.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;.
     * @param variableUuid The UUID of the variable to retrieve.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable getPipelineVariableForWorkspace(String workspace, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getPipelineVariableForWorkspace");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling getPipelineVariableForWorkspace");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/pipelines-config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find account level variables. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The found account level variables.
     * @param username The account.
     * @return PaginatedPipelineVariables
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineVariables getPipelineVariablesForTeam(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelineVariablesForTeam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineVariables> returnType = new ParameterizedTypeReference<PaginatedPipelineVariables>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find user level variables. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The found user level variables.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @return PaginatedPipelineVariables
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineVariables getPipelineVariablesForUser(String selectedUser) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling getPipelineVariablesForUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineVariables> returnType = new ParameterizedTypeReference<PaginatedPipelineVariables>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find workspace level variables.
     * <p><b>200</b> - The found workspace level variables.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;.
     * @return PaginatedPipelineVariables
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineVariables getPipelineVariablesForWorkspace(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getPipelineVariablesForWorkspace");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/pipelines-config/variables").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineVariables> returnType = new ParameterizedTypeReference<PaginatedPipelineVariables>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find pipelines
     * <p><b>200</b> - The matching pipelines.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelines
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelines getPipelinesForRepository(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPipelinesForRepository");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPipelinesForRepository");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelines> returnType = new ParameterizedTypeReference<PaginatedPipelines>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the URI of the content of the specified cache.
     * <p><b>200</b> - The cache content uri.
     * <p><b>404</b> - The workspace, repository or cache_uuid with given UUID was not found.
     * @param workspace The account.
     * @param repoSlug The repository.
     * @param cacheUuid The UUID of the cache.
     * @return PipelineCacheContentUri
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineCacheContentUri getRepositoryPipelineCacheContentURI(String workspace, String repoSlug, String cacheUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getRepositoryPipelineCacheContentURI");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineCacheContentURI");
        }
        // verify the required parameter 'cacheUuid' is set
        if (cacheUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cacheUuid' when calling getRepositoryPipelineCacheContentURI");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("cache_uuid", cacheUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines-config/caches/{cache_uuid}/content-uri").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineCacheContentUri> returnType = new ParameterizedTypeReference<PipelineCacheContentUri>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the repository pipelines caches.
     * <p><b>200</b> - The list of caches for the given repository.
     * <p><b>404</b> - The account or repository was not found.
     * @param workspace The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelineCaches
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineCaches getRepositoryPipelineCaches(String workspace, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getRepositoryPipelineCaches");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineCaches");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines-config/caches/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineCaches> returnType = new ParameterizedTypeReference<PaginatedPipelineCaches>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the repository pipelines configuration.
     * <p><b>200</b> - The repository pipelines configuration.
     * @param workspace The account.
     * @param repoSlug The repository.
     * @return PipelinesConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelinesConfig getRepositoryPipelineConfig(String workspace, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling getRepositoryPipelineConfig");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelinesConfig> returnType = new ParameterizedTypeReference<PipelinesConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a repository level known host.
     * <p><b>200</b> - The known host.
     * <p><b>404</b> - The account, repository or known host with the specified UUID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param knownHostUuid The UUID of the known host to retrieve.
     * @return PipelineKnownHost
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineKnownHost getRepositoryPipelineKnownHost(String username, String repoSlug, String knownHostUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'knownHostUuid' is set
        if (knownHostUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'knownHostUuid' when calling getRepositoryPipelineKnownHost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("known_host_uuid", knownHostUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineKnownHost> returnType = new ParameterizedTypeReference<PipelineKnownHost>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find repository level known hosts.
     * <p><b>200</b> - The retrieved known hosts.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelineKnownHosts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineKnownHosts getRepositoryPipelineKnownHosts(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineKnownHosts");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineKnownHosts");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineKnownHosts> returnType = new ParameterizedTypeReference<PaginatedPipelineKnownHosts>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a schedule by its UUID.
     * <p><b>200</b> - The requested schedule.
     * <p><b>404</b> - The account, repository or schedule was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param scheduleUuid The uuid of the schedule.
     * @return PipelineSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineSchedule getRepositoryPipelineSchedule(String username, String repoSlug, String scheduleUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineSchedule");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineSchedule");
        }
        // verify the required parameter 'scheduleUuid' is set
        if (scheduleUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleUuid' when calling getRepositoryPipelineSchedule");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("schedule_uuid", scheduleUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineSchedule> returnType = new ParameterizedTypeReference<PipelineSchedule>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the executions of a given schedule.
     * <p><b>200</b> - The list of executions of a schedule.
     * <p><b>404</b> - The account or repository was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelineScheduleExecutions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineScheduleExecutions getRepositoryPipelineScheduleExecutions(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineScheduleExecutions");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineScheduleExecutions");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid}/executions/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineScheduleExecutions> returnType = new ParameterizedTypeReference<PaginatedPipelineScheduleExecutions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the configured schedules for the given repository.
     * <p><b>200</b> - The list of schedules.
     * <p><b>404</b> - The account or repository was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelineSchedules
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineSchedules getRepositoryPipelineSchedules(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineSchedules");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineSchedules");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineSchedules> returnType = new ParameterizedTypeReference<PaginatedPipelineSchedules>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve the repository SSH key pair excluding the SSH private key. The private key is a write only field and will never be exposed in the logs or the REST API.
     * <p><b>200</b> - The SSH key pair.
     * <p><b>404</b> - The account, repository or SSH key pair was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineSshKeyPair
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineSshKeyPair getRepositoryPipelineSshKeyPair(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineSshKeyPair");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineSshKeyPair");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineSshKeyPair> returnType = new ParameterizedTypeReference<PipelineSshKeyPair>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Retrieve a repository level variable.
     * <p><b>200</b> - The variable.
     * <p><b>404</b> - The account, repository or variable with the specified UUID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param variableUuid The UUID of the variable to retrieve.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable getRepositoryPipelineVariable(String username, String repoSlug, String variableUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling getRepositoryPipelineVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Find repository level variables.
     * <p><b>200</b> - The retrieved variables.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PaginatedPipelineVariables
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPipelineVariables getRepositoryPipelineVariables(String username, String repoSlug) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getRepositoryPipelineVariables");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getRepositoryPipelineVariables");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/variables/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPipelineVariables> returnType = new ParameterizedTypeReference<PaginatedPipelineVariables>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Signal the stop of a pipeline and all of its steps that not have completed yet.
     * <p><b>204</b> - The pipeline has been signaled to stop.
     * <p><b>400</b> - The specified pipeline has already completed.
     * <p><b>404</b> - Either the account, repository or pipeline with the given UUID does not exist.
     * @param username The account.
     * @param repoSlug The repository.
     * @param pipelineUuid The UUID of the pipeline.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void stopPipeline(String username, String repoSlug, String pipelineUuid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling stopPipeline");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling stopPipeline");
        }
        // verify the required parameter 'pipelineUuid' is set
        if (pipelineUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineUuid' when calling stopPipeline");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("pipeline_uuid", pipelineUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/stopPipeline").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * 
     * Update a deployment environment level variable.
     * <p><b>200</b> - The deployment variable was updated.
     * <p><b>404</b> - The account, repository, environment or variable with the given UUID was not found.
     * @param body The updated deployment variable.
     * @param username The account.
     * @param repoSlug The repository.
     * @param environmentUuid The environment.
     * @param variableUuid The UUID of the variable to update.
     * @return DeploymentVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeploymentVariable updateDeploymentVariable(DeploymentVariable body, String username, String repoSlug, String environmentUuid, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDeploymentVariable");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateDeploymentVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateDeploymentVariable");
        }
        // verify the required parameter 'environmentUuid' is set
        if (environmentUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentUuid' when calling updateDeploymentVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling updateDeploymentVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("environment_uuid", environmentUuid);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deployments_config/environments/{environment_uuid}/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeploymentVariable> returnType = new ParameterizedTypeReference<DeploymentVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a team level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The variable was updated.
     * <p><b>404</b> - The account or the variable was not found.
     * @param body The updated variable.
     * @param username The account.
     * @param variableUuid The UUID of the variable.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable updatePipelineVariableForTeam(PipelineVariable body, String username, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updatePipelineVariableForTeam");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updatePipelineVariableForTeam");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling updatePipelineVariableForTeam");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a user level variable. This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The variable was updated.
     * <p><b>404</b> - The account or the variable was not found.
     * @param body The updated variable.
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param variableUuid The UUID of the variable.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable updatePipelineVariableForUser(PipelineVariable body, String selectedUser, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updatePipelineVariableForUser");
        }
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling updatePipelineVariableForUser");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling updatePipelineVariableForUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a workspace level variable.
     * <p><b>200</b> - The variable was updated.
     * <p><b>404</b> - The workspace or the variable was not found.
     * @param body The updated variable.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example &#x60;{workspace UUID}&#x60;.
     * @param variableUuid The UUID of the variable.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable updatePipelineVariableForWorkspace(PipelineVariable body, String workspace, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updatePipelineVariableForWorkspace");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling updatePipelineVariableForWorkspace");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling updatePipelineVariableForWorkspace");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/pipelines-config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update the next build number that should be assigned to a pipeline. The next build number that will be configured has to be strictly higher than the current latest build number for this repository.
     * <p><b>200</b> - The build number has been configured.
     * <p><b>400</b> - The update failed because the next number was invalid (it should be higher than the current number).
     * <p><b>404</b> - The account or repository was not found.
     * @param body The build number to update.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineBuildNumber
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineBuildNumber updateRepositoryBuildNumber(PipelineBuildNumber body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryBuildNumber");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryBuildNumber");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryBuildNumber");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/build_number").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineBuildNumber> returnType = new ParameterizedTypeReference<PipelineBuildNumber>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update the pipelines configuration for a repository.
     * <p><b>200</b> - The repository pipelines configuration was updated.
     * @param body The updated repository pipelines configuration.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelinesConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelinesConfig updateRepositoryPipelineConfig(PipelinesConfig body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryPipelineConfig");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryPipelineConfig");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryPipelineConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelinesConfig> returnType = new ParameterizedTypeReference<PipelinesConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create or update the repository SSH key pair. The private key will be set as a default SSH identity in your build container.
     * <p><b>200</b> - The SSH key pair was created or updated.
     * <p><b>404</b> - The account, repository or SSH key pair was not found.
     * @param body The created or updated SSH key pair.
     * @param username The account.
     * @param repoSlug The repository.
     * @return PipelineSshKeyPair
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineSshKeyPair updateRepositoryPipelineKeyPair(PipelineSshKeyPair body, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryPipelineKeyPair");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryPipelineKeyPair");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryPipelineKeyPair");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/key_pair").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineSshKeyPair> returnType = new ParameterizedTypeReference<PipelineSshKeyPair>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a repository level known host.
     * <p><b>200</b> - The known host was updated.
     * <p><b>404</b> - The account, repository or known host with the given UUID was not found.
     * @param body The updated known host.
     * @param username The account.
     * @param repoSlug The repository.
     * @param knownHostUuid The UUID of the known host to update.
     * @return PipelineKnownHost
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineKnownHost updateRepositoryPipelineKnownHost(PipelineKnownHost body, String username, String repoSlug, String knownHostUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryPipelineKnownHost");
        }
        // verify the required parameter 'knownHostUuid' is set
        if (knownHostUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'knownHostUuid' when calling updateRepositoryPipelineKnownHost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("known_host_uuid", knownHostUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/ssh/known_hosts/{known_host_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineKnownHost> returnType = new ParameterizedTypeReference<PipelineKnownHost>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a schedule.
     * <p><b>200</b> - The schedule is updated.
     * <p><b>404</b> - The account, repository or schedule was not found.
     * @param body The schedule to update.
     * @param username The account.
     * @param repoSlug The repository.
     * @param scheduleUuid The uuid of the schedule.
     * @return PipelineSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineSchedule updateRepositoryPipelineSchedule(PipelineSchedule body, String username, String repoSlug, String scheduleUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryPipelineSchedule");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryPipelineSchedule");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryPipelineSchedule");
        }
        // verify the required parameter 'scheduleUuid' is set
        if (scheduleUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleUuid' when calling updateRepositoryPipelineSchedule");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("schedule_uuid", scheduleUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/schedules/{schedule_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineSchedule> returnType = new ParameterizedTypeReference<PipelineSchedule>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Update a repository level variable.
     * <p><b>200</b> - The variable was updated.
     * <p><b>404</b> - The account, repository or variable with the given UUID was not found.
     * @param body The updated variable
     * @param username The account.
     * @param repoSlug The repository.
     * @param variableUuid The UUID of the variable to update.
     * @return PipelineVariable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PipelineVariable updateRepositoryPipelineVariable(PipelineVariable body, String username, String repoSlug, String variableUuid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateRepositoryPipelineVariable");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateRepositoryPipelineVariable");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling updateRepositoryPipelineVariable");
        }
        // verify the required parameter 'variableUuid' is set
        if (variableUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableUuid' when calling updateRepositoryPipelineVariable");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("variable_uuid", variableUuid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines_config/variables/{variable_uuid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PipelineVariable> returnType = new ParameterizedTypeReference<PipelineVariable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
