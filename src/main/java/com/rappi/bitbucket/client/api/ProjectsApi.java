package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedProjects;
import com.rappi.bitbucket.client.model.Project;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.ProjectsApi")
public class ProjectsApi {
    private ApiClient apiClient;

    public ProjectsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectsApi(ApiClient apiClient) {
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
     * The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - A paginated list of projects that belong to the specified team.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to read the list of projects for the specified team.
     * <p><b>404</b> - A team doesn&#x27;t exist at this location.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return PaginatedProjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedProjects teamsUsernameProjectsGet(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameProjectsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/projects/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedProjects> returnType = new ParameterizedTypeReference<PaginatedProjects>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new project.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  Note that the avatar has to be embedded as either a data-url or a URL to an external image as shown in the examples below:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/...\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;  or even:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;http://i.imgur.com/72tRx4w.gif\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;
     * <p><b>201</b> - A new project has been created.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to create the project.
     * <p><b>404</b> - A team doesn&#x27;t exist at this location.
     * @param body The body parameter
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project teamsUsernameProjectsPost(Project body, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling teamsUsernameProjectsPost");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameProjectsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/projects/").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>204</b> - Successful deletion.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to delete the project or the project isn&#x27;t empty.
     * <p><b>404</b> - A project isn&#x27;t hosted at this location.
     * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)). 
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void teamsUsernameProjectsProjectKeyDelete(String projectKey, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling teamsUsernameProjectsProjectKeyDelete");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameProjectsProjectKeyDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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
     * The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The project object.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to access the project.
     * <p><b>404</b> - A project isn&#x27;t hosted at this location.
     * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)). 
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project teamsUsernameProjectsProjectKeyGet(String projectKey, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling teamsUsernameProjectsProjectKeyGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameProjectsProjectKeyGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Since this endpoint can be used to both update and to create a project, the request body depends on the intent.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  ### Creation  See the POST documentation for the project collection for an example of the request body.  Note: The &#x60;key&#x60; should not be specified in the body of request (since it is already present in the URL). The &#x60;name&#x60; is required, everything else is optional.  ### Update  See the POST documentation for the project collection for an example of the request body.  Note: The key is not required in the body (since it is already in the URL). The key may be specified in the body, if the intent is to change the key itself. In such a scenario, the location of the project is changed and is returned in the &#x60;Location&#x60; header of the response.
     * <p><b>200</b> - The existing project is has been updated.
     * <p><b>201</b> - A new project has been created.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to update or create the project.
     * <p><b>404</b> - A team doesn&#x27;t exist at the location. Note that the project&#x27;s absence from this location doesn&#x27;t raise a 404, since a PUT at a non-existent location can be used to create a new project.
     * @param body The body parameter
     * @param projectKey The project in question. This can either be the actual &#x60;key&#x60; assigned to the project or the &#x60;UUID&#x60; (surrounded by curly-braces (&#x60;{}&#x60;)). 
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project teamsUsernameProjectsProjectKeyPut(Project body, String projectKey, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling teamsUsernameProjectsProjectKeyPut");
        }
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling teamsUsernameProjectsProjectKeyPut");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameProjectsProjectKeyPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new project.  Note that the avatar has to be embedded as either a data-url or a URL to an external image as shown in the examples below:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;data:image/gif;base64,R0lGODlhEAAQAMQAAORHHOVSKudfOulrSOp3WOyDZu6QdvCchPGolfO0o/...\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;  or even:  &#x60;&#x60;&#x60; $ body&#x3D;$(cat &lt;&lt; EOF {     \&quot;name\&quot;: \&quot;Mars Project\&quot;,     \&quot;key\&quot;: \&quot;MARS\&quot;,     \&quot;description\&quot;: \&quot;Software for colonizing mars.\&quot;,     \&quot;links\&quot;: {         \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;http://i.imgur.com/72tRx4w.gif\&quot;         }     },     \&quot;is_private\&quot;: false } EOF ) $ curl -H \&quot;Content-Type: application/json\&quot; \\        -X POST \\        -d \&quot;$body\&quot; \\        https://api.bitbucket.org/2.0/teams/teams-in-space/projects/ | jq . {   // Serialized project document } &#x60;&#x60;&#x60;
     * <p><b>201</b> - A new project has been created.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to create the project.
     * <p><b>404</b> - A workspace doesn&#x27;t exist at this location.
     * @param body The body parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project workspacesWorkspaceProjectsPost(Project body, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling workspacesWorkspaceProjectsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceProjectsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/projects").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes this project. This is an irreversible operation.  You cannot delete a project that still contains repositories. To delete the project, [delete](../../../repositories/%7Bworkspace%7D/%7Brepo_slug%7D#delete) or transfer the repositories first.  Example: &#x60;&#x60;&#x60; $ curl -X DELETE https://api.bitbucket.org/2.0/bbworkspace1/PROJ &#x60;&#x60;&#x60;
     * <p><b>204</b> - Successful deletion.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to delete the project or the project isn&#x27;t empty.
     * <p><b>404</b> - A project isn&#x27;t hosted at this location.
     * @param projectKey The project in question. This is the actual &#x60;key&#x60; assigned to the project. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void workspacesWorkspaceProjectsProjectKeyDelete(String projectKey, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling workspacesWorkspaceProjectsProjectKeyDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceProjectsProjectKeyDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the requested project.
     * <p><b>200</b> - The project that is part of a workspace.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to access the project.
     * <p><b>404</b> - A project isn&#x27;t hosted at this location.
     * @param projectKey The project in question. This is the actual &#x60;key&#x60; assigned to the project. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project workspacesWorkspaceProjectsProjectKeyGet(String projectKey, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling workspacesWorkspaceProjectsProjectKeyGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceProjectsProjectKeyGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Since this endpoint can be used to both update and to create a project, the request body depends on the intent.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  ### Creation  See the POST documentation for the project collection for an example of the request body.  Note: The &#x60;key&#x60; should not be specified in the body of request (since it is already present in the URL). The &#x60;name&#x60; is required, everything else is optional.  ### Update  See the POST documentation for the project collection for an example of the request body.  Note: The key is not required in the body (since it is already in the URL). The key may be specified in the body, if the intent is to change the key itself. In such a scenario, the location of the project is changed and is returned in the &#x60;Location&#x60; header of the response.
     * <p><b>200</b> - The existing project is has been updated.
     * <p><b>201</b> - A new project has been created.
     * <p><b>403</b> - The requesting user isn&#x27;t authorized to update or create the project.
     * <p><b>404</b> - A workspace doesn&#x27;t exist at the location. Note that the project&#x27;s absence from this location doesn&#x27;t raise a 404, since a PUT at a non-existent location can be used to create a new project.
     * @param body The body parameter
     * @param projectKey The project in question. This is the actual &#x60;key&#x60; assigned to the project. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project workspacesWorkspaceProjectsProjectKeyPut(Project body, String projectKey, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling workspacesWorkspaceProjectsProjectKeyPut");
        }
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectKey' when calling workspacesWorkspaceProjectsProjectKeyPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceProjectsProjectKeyPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_key", projectKey);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/projects/{project_key}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
