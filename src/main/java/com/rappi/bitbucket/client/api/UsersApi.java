package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedWebhookSubscriptions;
import com.rappi.bitbucket.client.model.User;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
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
     * All repositories in the given workspace. This includes any private repositories the calling user has access to.  The teams and users endpoints have been deprecated. Use the [/repositories/{workspace}](https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D)  endpoint in place of both of these endpoints. For more information, see the [deprecation announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>0</b> - Unexpected error.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error teamsWorkspaceRepositoriesGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling teamsWorkspaceRepositoriesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/teams/{workspace}/repositories").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns details about a specific one of the authenticated user&#x27;s email addresses.  Details describe whether the address has been confirmed by the user and whether it is the user&#x27;s primary address or not.
     * <p><b>0</b> - Unexpected error.
     * @param email The email parameter
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error userEmailsEmailGet(String email) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling userEmailsEmailGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email", email);
        String path = UriComponentsBuilder.fromPath("/user/emails/{email}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns all the authenticated user&#x27;s email addresses. Both confirmed and unconfirmed.
     * <p><b>0</b> - Unexpected error.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error userEmailsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/emails").build().toUriString();
        
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

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the currently logged in user.
     * <p><b>200</b> - The current user.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User userGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user").build().toUriString();
        
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

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Gets the public information associated with a user account.  If the user&#x27;s profile is private, &#x60;location&#x60;, &#x60;website&#x60; and &#x60;created_on&#x60; elements are omitted.  Note that the user object returned by this operation is changing significantly, due to privacy changes. See the [announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#changes-to-bitbucket-user-objects) for details.
     * <p><b>200</b> - The user object
     * <p><b>404</b> - If no user exists for the specified UUID, or if the specified account is a team account, not a personal account.
     * @param selectedUser This can either be the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, OR an Atlassian Account ID. 
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User usersSelectedUserGet(String selectedUser) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling usersSelectedUserGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * 
     * <p><b>200</b> - All members
     * <p><b>404</b> - When the team does not exist, or multiple teams with the same name exist that differ only in casing and the URL did not match the exact casing of a particular one.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User usersUsernameMembersGet(String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling usersUsernameMembersGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/users/{username}/members").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * All repositories in the given workspace. This includes any private repositories the calling user has access to.  The teams and users endpoints have been deprecated. Use the [/repositories/{workspace}](https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D)  endpoint in place of both of these endpoints. For more information, see the [deprecation announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>0</b> - Unexpected error.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error usersWorkspaceRepositoriesGet(String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling usersWorkspaceRepositoriesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/users/{workspace}/repositories").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
