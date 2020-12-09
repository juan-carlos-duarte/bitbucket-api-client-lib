package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedHookEvents;
import com.rappi.bitbucket.client.model.PaginatedWebhookSubscriptions;
import com.rappi.bitbucket.client.model.SubjectTypes;
import com.rappi.bitbucket.client.model.WebhookSubscription;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.WebhooksApi")
public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhooksApi(ApiClient apiClient) {
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
     * Returns the webhook resource or subject types on which webhooks can be registered.  Each resource/subject type contains an &#x60;events&#x60; link that returns the paginated list of specific events each individual subject type can emit.  This endpoint is publicly accessible and does not require authentication or scopes.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/hook_events  {     \&quot;repository\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/repository\&quot;             }         }     },     \&quot;team\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/team\&quot;             }         }     },     \&quot;user\&quot;: {         \&quot;links\&quot;: {             \&quot;events\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/hook_events/user\&quot;             }         }     } } &#x60;&#x60;&#x60;
     * <p><b>200</b> - A mapping of resource/subject types pointing to their individual event types.
     * @return SubjectTypes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubjectTypes hookEventsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/hook_events").build().toUriString();
        
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

        ParameterizedTypeReference<SubjectTypes> returnType = new ParameterizedTypeReference<SubjectTypes>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of all valid webhook events for the specified entity.  This is public data that does not require any scopes or authentication.  Example:  NOTE: The following example is a truncated response object for the &#x60;team&#x60; &#x60;subject_type&#x60;. We return the same structure for the other &#x60;subject_type&#x60; objects.  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/hook_events/team {     \&quot;page\&quot;: 1,     \&quot;pagelen\&quot;: 30,     \&quot;size\&quot;: 21,     \&quot;values\&quot;: [         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository push occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:push\&quot;,             \&quot;label\&quot;: \&quot;Push\&quot;         },         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository fork occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:fork\&quot;,             \&quot;label\&quot;: \&quot;Fork\&quot;         },         ...         {             \&quot;category\&quot;: \&quot;Repository\&quot;,             \&quot;description\&quot;: \&quot;Whenever a repository import occurs\&quot;,             \&quot;event\&quot;: \&quot;repo:imported\&quot;,             \&quot;label\&quot;: \&quot;Import\&quot;         }     ] } &#x60;&#x60;&#x60;
     * <p><b>200</b> - A paginated list of webhook types available to subscribe on.
     * <p><b>404</b> - If an invalid &#x60;{subject_type}&#x60; value was specified.
     * @param subjectType A resource or subject type.
     * @return PaginatedHookEvents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedHookEvents hookEventsSubjectTypeGet(String subjectType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'subjectType' is set
        if (subjectType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subjectType' when calling hookEventsSubjectTypeGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subject_type", subjectType);
        String path = UriComponentsBuilder.fromPath("/hook_events/{subject_type}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedHookEvents> returnType = new ParameterizedTypeReference<PaginatedHookEvents>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of webhooks installed on this repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The paginated list of installed webhooks.
     * <p><b>403</b> - If the authenticated user does not have permission to access the webhooks.
     * <p><b>404</b> - If the repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedWebhookSubscriptions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWebhookSubscriptions repositoriesWorkspaceRepoSlugHooksGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugHooksGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugHooksGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates a new webhook on the specified repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  Example:  &#x60;&#x60;&#x60; $ curl -X POST -u credentials -H &#x27;Content-Type: application/json&#x27;           https://api.bitbucket.org/2.0/repositories/username/slug/hooks           -d &#x27;     {       \&quot;description\&quot;: \&quot;Webhook Description\&quot;,       \&quot;url\&quot;: \&quot;https://example.com/\&quot;,       \&quot;active\&quot;: true,       \&quot;events\&quot;: [         \&quot;repo:push\&quot;,         \&quot;issue:created\&quot;,         \&quot;issue:updated\&quot;       ]     }&#x27; &#x60;&#x60;&#x60;  Note that this call requires the webhook scope, as well as any scope that applies to the events that the webhook subscribes to. In the example above that means: &#x60;webhook&#x60;, &#x60;repository&#x60; and &#x60;issue&#x60;.  Also note that the &#x60;url&#x60; must properly resolve and cannot be an internal, non-routed address.
     * <p><b>201</b> - If the webhook was registered successfully.
     * <p><b>403</b> - If the authenticated user does not have permission to install webhooks on the specified repository.
     * <p><b>404</b> - If the repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription repositoriesWorkspaceRepoSlugHooksPost(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugHooksPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugHooksPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Deletes the specified webhook subscription from the given repository.
     * <p><b>204</b> - When the webhook was deleted successfully
     * <p><b>403</b> - If the authenticated user does not have permission to delete the webhook.
     * <p><b>404</b> - If the webhook or repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugHooksUidDelete(String repoSlug, String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugHooksUidDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugHooksUidDelete");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling repositoriesWorkspaceRepoSlugHooksUidDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the webhook with the specified id installed on the specified repository.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>404</b> - If the webhook or repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id.
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription repositoriesWorkspaceRepoSlugHooksUidGet(String repoSlug, String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugHooksUidGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugHooksUidGet");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling repositoriesWorkspaceRepoSlugHooksUidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * <p><b>404</b> - If the webhook or repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param uid The installed webhook&#x27;s id
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription repositoriesWorkspaceRepoSlugHooksUidPut(String repoSlug, String workspace, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugHooksUidPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugHooksUidPut");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling repositoriesWorkspaceRepoSlugHooksUidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns a paginated list of webhooks installed on this team.
     * <p><b>200</b> - The paginated list of installed webhooks.
     * <p><b>403</b> - If the authenticated user is not an admin on the specified team.
     * <p><b>404</b> - If the specified team does not exist.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return PaginatedWebhookSubscriptions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWebhookSubscriptions teamsUsernameHooksGet(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameHooksGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates a new webhook on the specified team.  Team webhooks are fired for events from all repositories belonging to that team account.  Note that only admins can install webhooks on teams.
     * <p><b>201</b> - The newly installed webhook.
     * <p><b>403</b> - If the authenticated user is not an admin on the specified team.
     * <p><b>404</b> - If the specified team does not exist.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription teamsUsernameHooksPost(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameHooksPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Deletes the specified webhook subscription from the given team account.
     * <p><b>204</b> - When the webhook was deleted successfully
     * <p><b>403</b> - If the authenticated user does not have permission to delete the webhook.
     * <p><b>404</b> - If the webhook or team does not exist.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param uid The installed webhook&#x27;s id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void teamsUsernameHooksUidDelete(String username, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameHooksUidDelete");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the webhook with the specified id installed on the given team account.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>404</b> - If the webhook or team does not exist.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param uid The installed webhook&#x27;s id.
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription teamsUsernameHooksUidGet(String username, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameHooksUidGet");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * <p><b>404</b> - If the webhook or team does not exist.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param uid The installed webhook&#x27;s id
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription teamsUsernameHooksUidPut(String username, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernameHooksUidPut");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling teamsUsernameHooksUidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns a paginated list of webhooks installed on this user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.  Also note that the users endpoint has been deprecated, and the workspaces endpoint should be used instead. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The paginated list of installed webhooks.
     * <p><b>403</b> - If the authenticated user is accessing an account other than their own.
     * <p><b>404</b> - If the specified account does not exist.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @return PaginatedWebhookSubscriptions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedWebhookSubscriptions usersSelectedUserHooksGet(String selectedUser) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserHooksGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates a new webhook on the specified user account.  Account-level webhooks are fired for events from all repositories belonging to that account.  Note that one can only register webhooks on one&#x27;s own account, not that of others.  Also, note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.  The users endpoints have been deprecated, and the workspaces endpoint should be used instead. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>201</b> - The newly installed webhook.
     * <p><b>403</b> - If the authenticated user is accessing an account other than their own.
     * <p><b>404</b> - If the specified account does not exist.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription usersSelectedUserHooksPost(String selectedUser) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserHooksPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/hooks").buildAndExpand(uriVariables).toUriString();
        
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
     * Deletes the specified webhook subscription from the given user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.
     * <p><b>204</b> - When the webhook was deleted successfully
     * <p><b>403</b> - If the authenticated user does not have permission to delete the webhook.
     * <p><b>404</b> - If the webhook or user does not exist.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @param uid Installed webhook&#x27;s ID
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersSelectedUserHooksUidDelete(String selectedUser, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserHooksUidDelete");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling usersSelectedUserHooksUidDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the webhook with the specified id installed on the given user account.  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>404</b> - If the webhook or user does not exist.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @param uid Installed webhook&#x27;s ID
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription usersSelectedUserHooksUidGet(String selectedUser, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserHooksUidGet");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling usersSelectedUserHooksUidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
     * Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;  Note that the username path parameter has been deprecated due to [privacy changes](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#removal-of-usernames-from-user-referencing-apis). Use the account&#x27;s UUID or account_id instead.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>403</b> - If the authenticated user does not have permission to update the webhook.
     * <p><b>404</b> - If the webhook or user does not exist.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @param uid Installed webhook&#x27;s ID
     * @return WebhookSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookSubscription usersSelectedUserHooksUidPut(String selectedUser, String uid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserHooksUidPut");
        }
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uid' when calling usersSelectedUserHooksUidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        uriVariables.put("uid", uid);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/hooks/{uid}").buildAndExpand(uriVariables).toUriString();
        
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
}
