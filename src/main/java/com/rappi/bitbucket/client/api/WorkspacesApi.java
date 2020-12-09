package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedProjects;
import com.rappi.bitbucket.client.model.PaginatedWebhookSubscriptions;
import com.rappi.bitbucket.client.model.PaginatedWorkspaceMemberships;
import com.rappi.bitbucket.client.model.PaginatedWorkspaces;
import com.rappi.bitbucket.client.model.Project;
import com.rappi.bitbucket.client.model.WebhookSubscription;
import com.rappi.bitbucket.client.model.Workspace;
import com.rappi.bitbucket.client.model.WorkspaceMembership;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.WorkspacesApi")
public class WorkspacesApi {
    private ApiClient apiClient;

    public WorkspacesApi() {
        this(new ApiClient());
    }

    @Autowired
    public WorkspacesApi(ApiClient apiClient) {
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
     * Returns an object for each workspace the caller is a member of, and their effective role - the highest level of privilege the caller has. If a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;owner&#x60; * &#x60;collaborator&#x60; * &#x60;member&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/user/permissions/workspaces  {   \&quot;pagelen\&quot;: 10,   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;workspace_membership\&quot;,       \&quot;permission\&quot;: \&quot;owner\&quot;,       \&quot;last_accessed\&quot;: \&quot;2019-03-07T12:35:02.900024+00:00\&quot;,       \&quot;added_on\&quot;: \&quot;2018-10-11T17:42:02.961424+00:00\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;uuid\&quot;: \&quot;{470c176d-3574-44ea-bb41-89e8638bcca4}\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,       },       \&quot;workspace\&quot;: {         \&quot;type\&quot;: \&quot;workspace\&quot;,         \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,         \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,         \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,       }     }   ] } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by workspace or permission by adding the following query string parameters:  * &#x60;q&#x3D;workspace.slug&#x3D;\&quot;bbworkspace1\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;owner\&quot;&#x60; * &#x60;sort&#x3D;workspace.slug&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - All of the workspace memberships for the authenticated user.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * @param q  Query string to narrow down the response. See [filtering and sorting](../../../meta/filtering) for details.
     * @param sort  Name of a response property to sort results. See [filtering and sorting](../../../meta/filtering#query-sort) for details. 
     * @return PaginatedWorkspaceMemberships
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWorkspaceMemberships userPermissionsWorkspacesGet(String q, String sort) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/permissions/workspaces").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedWorkspaceMemberships> returnType = new ParameterizedTypeReference<PaginatedWorkspaceMemberships>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a list of workspaces accessible by the authenticated user.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces  {   \&quot;pagelen\&quot;: 10,   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1,   \&quot;values\&quot;: [     {         \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,         \&quot;links\&quot;: {             \&quot;owners\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/members?q&#x3D;permission%3D%22owner%22\&quot;             },             \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1\&quot;             },             \&quot;repositories\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bbworkspace1\&quot;             },             \&quot;snippets\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/snippets/bbworkspace1\&quot;             },             \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/bbworkspace1/\&quot;             },             \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/workspaces/bbworkspace1/avatar/?ts&#x3D;1543465801\&quot;             },             \&quot;members\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/members\&quot;             },             \&quot;projects\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/workspaces/bbworkspace1/projects\&quot;             }         },         \&quot;created_on\&quot;: \&quot;2018-11-14T19:15:05.058566+00:00\&quot;,         \&quot;type\&quot;: \&quot;workspace\&quot;,         \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,         \&quot;is_private\&quot;: true,         \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;     }   ] } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../meta/filtering) by workspace or permission by adding the following query string parameters:  * &#x60;q&#x3D;slug&#x3D;\&quot;bbworkspace1\&quot;&#x60; or &#x60;q&#x3D;is_private&#x3D;true&#x60; * &#x60;sort&#x3D;created_on&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - The list of workspaces accessible by the authenticated user.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * @param role              Filters the workspaces based on the authenticated user&#x27;s role on each workspace.              * **member**: returns a list of all the workspaces which the caller is a member of                 at least one workspace group or repository             * **collaborator**: returns a list of workspaces which the caller has write access                 to at least one repository in the workspace             * **owner**: returns a list of workspaces which the caller has administrator access             
     * @param q  Query string to narrow down the response. See [filtering and sorting](../meta/filtering) for details.
     * @param sort  Name of a response property to sort results. See [filtering and sorting](../meta/filtering#query-sort) for details. 
     * @return PaginatedWorkspaces
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWorkspaces workspacesGet(String role, String q, String sort) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/workspaces").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedWorkspaces> returnType = new ParameterizedTypeReference<PaginatedWorkspaces>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the requested workspace.
     * <p><b>200</b> - The workspace.
     * <p><b>404</b> - If no workspace exists for the specified name or UUID.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Workspace
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Workspace workspacesWorkspaceGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Workspace> returnType = new ParameterizedTypeReference<Workspace>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of webhooks installed on this workspace.
     * <p><b>200</b> - The paginated list of installed webhooks.
     * <p><b>403</b> - If the authenticated user is not an owner on the specified workspace.
     * <p><b>404</b> - If the specified workspace does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedWebhookSubscriptions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWebhookSubscriptions workspacesWorkspaceHooksGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceHooksGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/hooks").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedWebhookSubscriptions> returnType = new ParameterizedTypeReference<PaginatedWebhookSubscriptions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new webhook on the specified workspace.  Workspace webhooks are fired for events from all repositories contained by that workspace.  Note that only owners can install webhooks on workspaces.
     * <p><b>201</b> - The newly installed webhook.
     * <p><b>403</b> - If the authenticated user is not an owner on the specified workspace.
     * <p><b>404</b> - If the specified workspace does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription workspacesWorkspaceHooksPost(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceHooksPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/hooks").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes the specified webhook subscription from the given workspace.
     * <p><b>204</b> - When the webhook was deleted successfully
     * <p><b>403</b> - If the authenticated user does not have permission to delete the webhook.
     * <p><b>404</b> - If the webhook or workspace does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void workspacesWorkspaceHooksUidDelete(String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceHooksUidDelete");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling workspacesWorkspaceHooksUidDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the webhook with the specified id installed on the given workspace.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>404</b> - If the webhook or workspace does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id.
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription workspacesWorkspaceHooksUidGet(String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceHooksUidGet");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling workspacesWorkspaceHooksUidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>403</b> - If the authenticated user does not have permission to update the webhook.
     * <p><b>404</b> - If the webhook or workspace does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription workspacesWorkspaceHooksUidPut(String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceHooksUidPut");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling workspacesWorkspaceHooksUidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns all members of the requested workspace.
     * <p><b>200</b> - The list of users that are part of a workspace.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedWorkspaceMemberships
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWorkspaceMemberships workspacesWorkspaceMembersGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceMembersGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/members").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedWorkspaceMemberships> returnType = new ParameterizedTypeReference<PaginatedWorkspaceMemberships>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the workspace membership, which includes a &#x60;User&#x60; object for the member and a &#x60;Workspace&#x60; object for the requested workspace.
     * <p><b>200</b> - The user that is part of a workspace.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>404</b> - A workspace cannot be found, or a user cannot be found, or the user is not a a member of the workspace.
     * @param member Member&#x27;s UUID or Atlassian ID.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return WorkspaceMembership
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WorkspaceMembership workspacesWorkspaceMembersMemberGet(String member, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'member' is set
        if (member == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'member' when calling workspacesWorkspaceMembersMemberGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceMembersMemberGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("member", member);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/members/{member}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<WorkspaceMembership> returnType = new ParameterizedTypeReference<WorkspaceMembership>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the list of members in a workspace and their permission levels. Permission can be: * &#x60;owner&#x60; * &#x60;collaborator&#x60; * &#x60;member&#x60;  Example:  &#x60;&#x60;&#x60; $ curl -X https://api.bitbucket.org/2.0/workspaces/bbworkspace1/permissions  {     \&quot;pagelen\&quot;: 10,     \&quot;values\&quot;: [         {             \&quot;permission\&quot;: \&quot;owner\&quot;,             \&quot;type\&quot;: \&quot;workspace_membership\&quot;,             \&quot;user\&quot;: {                 \&quot;type\&quot;: \&quot;user\&quot;,                 \&quot;uuid\&quot;: \&quot;{470c176d-3574-44ea-bb41-89e8638bcca4}\&quot;,                 \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,             },             \&quot;workspace\&quot;: {                 \&quot;type\&quot;: \&quot;workspace\&quot;,                 \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,                 \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,                 \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,             }         },         {             \&quot;permission\&quot;: \&quot;member\&quot;,             \&quot;type\&quot;: \&quot;workspace_membership\&quot;,             \&quot;user\&quot;: {                 \&quot;type\&quot;: \&quot;user\&quot;,                 \&quot;nickname\&quot;: \&quot;seanaty\&quot;,                 \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,                 \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;             },             \&quot;workspace\&quot;: {                 \&quot;type\&quot;: \&quot;workspace\&quot;,                 \&quot;uuid\&quot;: \&quot;{a15fb181-db1f-48f7-b41f-e1eff06929d6}\&quot;,                 \&quot;slug\&quot;: \&quot;bbworkspace1\&quot;,                 \&quot;name\&quot;: \&quot;Atlassian Bitbucket\&quot;,             }         }     ],     \&quot;page\&quot;: 1,     \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered](../../../meta/filtering) by permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&#x3D;\&quot;owner\&quot;&#x60;
     * <p><b>200</b> - The list of users that are part of a workspace, along with their permission.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
     * @return PaginatedWorkspaceMemberships
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWorkspaceMemberships workspacesWorkspacePermissionsGet(String workspace, String q) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspacePermissionsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/permissions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedWorkspaceMemberships> returnType = new ParameterizedTypeReference<PaginatedWorkspaceMemberships>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the list of projects in this workspace.
     * <p><b>200</b> - The list of projects in this workspace.
     * <p><b>404</b> - A workspace doesn&#x27;t exist at this location.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedProjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedProjects workspacesWorkspaceProjectsGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspaceProjectsGet");
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
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedProjects> returnType = new ParameterizedTypeReference<PaginatedProjects>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
}
