package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedCommitstatuses;
import com.rappi.bitbucket.client.model.PaginatedPullrequestComments;
import com.rappi.bitbucket.client.model.PaginatedPullrequests;
import com.rappi.bitbucket.client.model.Participant;
import com.rappi.bitbucket.client.model.Pullrequest;
import com.rappi.bitbucket.client.model.PullrequestComment;
import com.rappi.bitbucket.client.model.PullrequestMergeParameters;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.PullrequestsApi")
public class PullrequestsApi {
    private ApiClient apiClient;

    public PullrequestsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PullrequestsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns a paginated list of all pull requests as part of which this commit was reviewed. Pull Request Commit Links app must be installed first before using this API; installation automatically occurs when &#x27;Go to pull request&#x27; is clicked from the web interface for a commit&#x27;s details.
     * 
     * <p><b>200</b> - The paginated list of pull requests.
     * <p><b>202</b> - The repository&#x27;s pull requests are still being indexed.
     * <p><b>404</b> - Either the repository does not exist, or pull request commit links have not yet been indexed.
     * @param username The account; either the UUID in curly braces, or the account_id
     * @param repoSlug The repository; either the UUID in curly braces, or the slug
     * @param commit The SHA1 of the commit
     * @param page Which page to retrieve
     * @param pagelen How many pull requests to retrieve per page
     * @return PaginatedPullrequests
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPullrequests getPullrequestsForCommit(String username, String repoSlug, String commit, Integer page, Integer pagelen) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getPullrequestsForCommit");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getPullrequestsForCommit");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getPullrequestsForCommit");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/pullrequests").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagelen", pagelen));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PaginatedPullrequests> returnType = new ParameterizedTypeReference<PaginatedPullrequests>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns all pull requests authored by the specified user.  By default only open pull requests are returned. This can be controlled using the &#x60;state&#x60; query parameter. To retrieve pull requests that are in one of multiple states, repeat the &#x60;state&#x60; parameter for each individual state.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../meta/filtering) for more details.
     * <p><b>200</b> - All pull requests authored by the specified user.
     * <p><b>404</b> - If the specified user does not exist.
     * @param selectedUser This can either be the username of the pull request author, the author&#x27;s UUID surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;, or the author&#x27;s Atlassian ID. 
     * @param state Only return pull requests that are in this state. This parameter can be repeated.
     * @return PaginatedPullrequests
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPullrequests pullrequestsSelectedUserGet(String selectedUser, String state) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling pullrequestsSelectedUserGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/pullrequests/{selected_user}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedPullrequests> returnType = new ParameterizedTypeReference<PaginatedPullrequests>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the repository&#x27;s default reviewers.  These are the users that are automatically added as reviewers on every new pull request that is created.
     * <p><b>200</b> - The paginated list of default reviewers
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugDefaultReviewersGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDefaultReviewersGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDefaultReviewersGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/default-reviewers").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Removes a default reviewer from the repository.
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param targetUsername This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete(String repoSlug, String targetUsername, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete");
        }
        // verify the required parameter 'targetUsername' is set
        if (targetUsername == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetUsername' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("target_username", targetUsername);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/default-reviewers/{target_username}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the specified reviewer.  This can be used to test whether a user is among the repository&#x27;s default reviewers list. A 404 indicates that that specified user is not a default reviewer.
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param targetUsername This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet(String repoSlug, String targetUsername, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet");
        }
        // verify the required parameter 'targetUsername' is set
        if (targetUsername == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetUsername' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernameGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("target_username", targetUsername);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/default-reviewers/{target_username}").buildAndExpand(uriVariables).toUriString();
        
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
     * Adds the specified user to the repository&#x27;s list of default reviewers.  This method is idempotent. Adding a user a second time has no effect.
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param targetUsername This can either be the username or the UUID of the default reviewer, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut(String repoSlug, String targetUsername, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut");
        }
        // verify the required parameter 'targetUsername' is set
        if (targetUsername == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetUsername' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDefaultReviewersTargetUsernamePut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("target_username", targetUsername);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/default-reviewers/{target_username}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of the pull request&#x27;s activity log.  This handler serves both a v20 and internal endpoint. The v20 endpoint returns reviewer comments, updates, and approvals. The internal endpoint includes those plus tasks and attachments.  Comments created on a file or a line of code have an inline property.  Comment example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;comment\&quot;: {                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695/comments/118571088\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695/_/diff#comment-118571088\&quot;                     }                 },                 \&quot;deleted\&quot;: false,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;content\&quot;: {                     \&quot;raw\&quot;: \&quot;inline with to a dn from lines\&quot;,                     \&quot;markup\&quot;: \&quot;markdown\&quot;,                     \&quot;html\&quot;: \&quot;&lt;p&gt;inline with to a dn from lines&lt;/p&gt;\&quot;,                     \&quot;type\&quot;: \&quot;rendered\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;updated_on\&quot;: \&quot;2019-09-27T00:33:46.055384+00:00\&quot;,                 \&quot;inline\&quot;: {                     \&quot;context_lines\&quot;: \&quot;\&quot;,                     \&quot;to\&quot;: null,                     \&quot;path\&quot;: \&quot;\&quot;,                     \&quot;outdated\&quot;: false,                     \&quot;from\&quot;: 211                 },                 \&quot;type\&quot;: \&quot;pullrequest_comment\&quot;,                 \&quot;id\&quot;: 118571088             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Updates include a state property of OPEN, MERGED, or DECLINED.  Update example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;update\&quot;: {                 \&quot;description\&quot;: \&quot;\&quot;,                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;,                 \&quot;destination\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;6a2c16e4a152\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/6a2c16e4a152\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/6a2c16e4a152\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;master\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;reason\&quot;: \&quot;\&quot;,                 \&quot;source\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;728c8bad1813\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/728c8bad1813\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/728c8bad1813\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;username/NONE-add-onClick-prop-for-accessibility\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;state\&quot;: \&quot;OPEN\&quot;,                 \&quot;author\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;date\&quot;: \&quot;2019-05-10T06:48:25.305565+00:00\&quot;             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Approval example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;approval\&quot;: {                 \&quot;date\&quot;: \&quot;2019-09-27T00:37:19.849534+00:00\&quot;,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 }             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The pull request activity log
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the specified repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsActivityGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsActivityGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsActivityGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/activity").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns all pull requests on the specified repository.  By default only open pull requests are returned. This can be controlled using the &#x60;state&#x60; query parameter. To retrieve pull requests that are in one of multiple states, repeat the &#x60;state&#x60; parameter for each individual state.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../meta/filtering) for more details.
     * <p><b>200</b> - All pull requests on the specified repository.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the specified repository does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param state Only return pull requests that are in this state. This parameter can be repeated.
     * @return PaginatedPullrequests
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPullrequests repositoriesWorkspaceRepoSlugPullrequestsGet(String repoSlug, String workspace, String state) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedPullrequests> returnType = new ParameterizedTypeReference<PaginatedPullrequests>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new pull request where the destination repository is this repository and the author is the authenticated user.  The minimum required fields to create a pull request are &#x60;title&#x60; and &#x60;source&#x60;, specified by a branch name.  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/my-username/my-repository/pullrequests \\     -u my-username:my-password \\     --request POST \\     --header &#x27;Content-Type: application/json&#x27; \\     --data &#x27;{         \&quot;title\&quot;: \&quot;My Title\&quot;,         \&quot;source\&quot;: {             \&quot;branch\&quot;: {                 \&quot;name\&quot;: \&quot;staging\&quot;             }         }     }&#x27; &#x60;&#x60;&#x60;  If the pull request&#x27;s &#x60;destination&#x60; is not specified, it will default to the &#x60;repository.mainbranch&#x60;. To open a pull request to a different branch, say from a feature branch to a staging branch, specify a &#x60;destination&#x60; (same format as the &#x60;source&#x60;):  &#x60;&#x60;&#x60; {     \&quot;title\&quot;: \&quot;My Title\&quot;,     \&quot;source\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;my-feature-branch\&quot;         }     },     \&quot;destination\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;staging\&quot;         }     } } &#x60;&#x60;&#x60;  Reviewers can be specified by adding an array of user objects as the &#x60;reviewers&#x60; property.  &#x60;&#x60;&#x60; {     \&quot;title\&quot;: \&quot;My Title\&quot;,     \&quot;source\&quot;: {         \&quot;branch\&quot;: {             \&quot;name\&quot;: \&quot;my-feature-branch\&quot;         }     },     \&quot;reviewers\&quot;: [         {             \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;         }     ] } &#x60;&#x60;&#x60;  Other fields:  * &#x60;description&#x60; - a string * &#x60;close_source_branch&#x60; - boolean that specifies if the source branch should be closed upon merging
     * <p><b>201</b> - The newly created pull request.
     * <p><b>400</b> - If the input document was invalid, or if the caller lacks the privilege to create repositories under the targeted account.
     * <p><b>401</b> - If the request was not authenticated.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param body The new pull request.

The request URL you POST to becomes the destination repository URL. For this reason, you must specify an explicit source repository in the request object if you want to pull from a different repository (fork).

Since not all elements are required or even mutable, you only need to include the elements you want to initialize, such as the source branch and the title.
     * @return Pullrequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPost(String repoSlug, String workspace, Pullrequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pullrequest> returnType = new ParameterizedTypeReference<Pullrequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of the pull request&#x27;s activity log.  This handler serves both a v20 and internal endpoint. The v20 endpoint returns reviewer comments, updates, and approvals. The internal endpoint includes those plus tasks and attachments.  Comments created on a file or a line of code have an inline property.  Comment example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;comment\&quot;: {                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695/comments/118571088\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695/_/diff#comment-118571088\&quot;                     }                 },                 \&quot;deleted\&quot;: false,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;content\&quot;: {                     \&quot;raw\&quot;: \&quot;inline with to a dn from lines\&quot;,                     \&quot;markup\&quot;: \&quot;markdown\&quot;,                     \&quot;html\&quot;: \&quot;&lt;p&gt;inline with to a dn from lines&lt;/p&gt;\&quot;,                     \&quot;type\&quot;: \&quot;rendered\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;created_on\&quot;: \&quot;2019-09-27T00:33:46.039178+00:00\&quot;,                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;updated_on\&quot;: \&quot;2019-09-27T00:33:46.055384+00:00\&quot;,                 \&quot;inline\&quot;: {                     \&quot;context_lines\&quot;: \&quot;\&quot;,                     \&quot;to\&quot;: null,                     \&quot;path\&quot;: \&quot;\&quot;,                     \&quot;outdated\&quot;: false,                     \&quot;from\&quot;: 211                 },                 \&quot;type\&quot;: \&quot;pullrequest_comment\&quot;,                 \&quot;id\&quot;: 118571088             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Updates include a state property of OPEN, MERGED, or DECLINED.  Update example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;update\&quot;: {                 \&quot;description\&quot;: \&quot;\&quot;,                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;,                 \&quot;destination\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;6a2c16e4a152\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/6a2c16e4a152\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/6a2c16e4a152\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;master\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;reason\&quot;: \&quot;\&quot;,                 \&quot;source\&quot;: {                     \&quot;commit\&quot;: {                         \&quot;type\&quot;: \&quot;commit\&quot;,                         \&quot;hash\&quot;: \&quot;728c8bad1813\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/commit/728c8bad1813\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/commits/728c8bad1813\&quot;                             }                         }                     },                     \&quot;branch\&quot;: {                         \&quot;name\&quot;: \&quot;username/NONE-add-onClick-prop-for-accessibility\&quot;                     },                     \&quot;repository\&quot;: {                         \&quot;name\&quot;: \&quot;Atlaskit-MK-2\&quot;,                         \&quot;type\&quot;: \&quot;repository\&quot;,                         \&quot;full_name\&quot;: \&quot;atlassian/atlaskit-mk-2\&quot;,                         \&quot;links\&quot;: {                             \&quot;self\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;html\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2\&quot;                             },                             \&quot;avatar\&quot;: {                                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B%7D?ts&#x3D;js\&quot;                             }                         },                         \&quot;uuid\&quot;: \&quot;{}\&quot;                     }                 },                 \&quot;state\&quot;: \&quot;OPEN\&quot;,                 \&quot;author\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 },                 \&quot;date\&quot;: \&quot;2019-05-10T06:48:25.305565+00:00\&quot;             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;  Approval example: &#x60;&#x60;&#x60; {     \&quot;pagelen\&quot;: 20,     \&quot;values\&quot;: [         {             \&quot;approval\&quot;: {                 \&quot;date\&quot;: \&quot;2019-09-27T00:37:19.849534+00:00\&quot;,                 \&quot;pullrequest\&quot;: {                     \&quot;type\&quot;: \&quot;pullrequest\&quot;,                     \&quot;id\&quot;: 5695,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                         }                     },                     \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;                 },                 \&quot;user\&quot;: {                     \&quot;display_name\&quot;: \&quot;Name Lastname\&quot;,                     \&quot;uuid\&quot;: \&quot;{}\&quot;,                     \&quot;links\&quot;: {                         \&quot;self\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/users/%7B%7D\&quot;                         },                         \&quot;html\&quot;: {                             \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B%7D/\&quot;                         },                         \&quot;avatar\&quot;: {                             \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/:/128\&quot;                         }                     },                     \&quot;type\&quot;: \&quot;user\&quot;,                     \&quot;nickname\&quot;: \&quot;Name\&quot;,                     \&quot;account_id\&quot;: \&quot;\&quot;                 }             },             \&quot;pull_request\&quot;: {                 \&quot;type\&quot;: \&quot;pullrequest\&quot;,                 \&quot;id\&quot;: 5695,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/!api/2.0/repositories/atlassian/atlaskit-mk-2/pullrequests/5695\&quot;                     },                     \&quot;html\&quot;: {                         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/atlaskit-mk-2/pull-requests/5695\&quot;                     }                 },                 \&quot;title\&quot;: \&quot;username/NONE: small change from onFocus to onClick to handle tabbing through the page and not expand the editor unless a click event triggers it\&quot;             }         }     ] } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The pull request activity log
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the specified repository does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdActivityGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/activity").buildAndExpand(uriVariables).toUriString();
        
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
     * Redact the authenticated user&#x27;s approval of the specified pull request.
     * <p><b>204</b> - An empty response indicating the authenticated user&#x27;s approval has been withdrawn.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified pull request or the repository does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApproveDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/approve").buildAndExpand(uriVariables).toUriString();
        
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
     * Approve the specified pull request as the authenticated user.
     * <p><b>200</b> - The &#x60;participant&#x60; object recording that the authenticated user approved the pull request.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified pull request or the repository does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Participant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Participant repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdApprovePost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/approve").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Participant> returnType = new ParameterizedTypeReference<Participant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes a specific pull request comment.
     * <p><b>204</b> - Successful deletion.
     * <p><b>403</b> - If the authenticated user does not have access to delete the comment.
     * <p><b>404</b> - If the comment does not exist.
     * @param commentId The commentId parameter
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete(String commentId, Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns a specific pull request comment.
     * <p><b>200</b> - The comment.
     * <p><b>403</b> - If the authenticated user does not have access to the pull request.
     * <p><b>404</b> - If the comment does not exist.
     * @param commentId The commentId parameter
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PullrequestComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet(String commentId, Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
        }
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PullrequestComment> returnType = new ParameterizedTypeReference<PullrequestComment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Updates a specific pull request comment.
     * <p><b>200</b> - The updated comment.
     * <p><b>403</b> - If the authenticated user does not have access to the comment.
     * <p><b>404</b> - If the comment does not exist.
     * @param body The contents of the updated comment.
     * @param commentId The commentId parameter
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PullrequestComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut(PullrequestComment body, String commentId, Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
        }
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsCommentIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PullrequestComment> returnType = new ParameterizedTypeReference<PullrequestComment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of the pull request&#x27;s comments.  This includes both global, inline comments and replies.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../../../meta/filtering) for more details.
     * <p><b>200</b> - A paginated list of comments made on the given pull request, in chronological order.
     * <p><b>403</b> - If the authenticated user does not have access to the pull request.
     * <p><b>404</b> - If the pull request does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedPullrequestComments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedPullrequestComments repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedPullrequestComments> returnType = new ParameterizedTypeReference<PaginatedPullrequestComments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new pull request comment.  Returns the newly created pull request comment.
     * <p><b>201</b> - The newly created comment.
     * <p><b>403</b> - If the authenticated user does not have access to the pull request.
     * <p><b>404</b> - If the pull request does not exist.
     * @param body The comment object.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PullrequestComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PullrequestComment repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost(PullrequestComment body, Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost");
        }
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommentsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/comments").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PullrequestComment> returnType = new ParameterizedTypeReference<PullrequestComment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of the pull request&#x27;s commits.  These are the commits that are being merged into the destination branch when the pull requests gets accepted.
     * <p><b>0</b> - Unexpected error.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdCommitsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/commits").buildAndExpand(uriVariables).toUriString();
        
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
     * Declines the pull request.
     * <p><b>200</b> - The pull request object.
     * <p><b>555</b> - If the decline took too long and timed out. In this case the caller should retry the request later.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Pullrequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDeclinePost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/decline").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pullrequest> returnType = new ParameterizedTypeReference<Pullrequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Redirects to the [repository diff](../../diff/%7Bspec%7D) with the revspec that corresponds to the pull request.
     * <p><b>302</b> - Redirects to the [repository diff](../../diff/%7Bspec%7D) with the revspec that corresponds to the pull request. 
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/diff").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Redirects to the [repository diffstat](../../diffstat/%7Bspec%7D) with the revspec that corresponds to the pull request.
     * <p><b>302</b> - Redirects to the [repository diffstat](../../diffstat/%7Bspec%7D) with the revspec that corresponds to pull request. 
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdDiffstatGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/diffstat").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the specified pull request.
     * <p><b>200</b> - The pull request object
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the repository or pull request does not exist
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Pullrequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pullrequest> returnType = new ParameterizedTypeReference<Pullrequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Merges the pull request.
     * <p><b>200</b> - The pull request object.
     * <p><b>202</b> - In the Location header, the URL to poll for the pull request merge status
     * <p><b>555</b> - If the merge took too long and timed out. In this case the caller should retry the request later
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param body The body parameter
     * @return Pullrequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost(Integer pullRequestId, String repoSlug, String workspace, PullrequestMergeParameters body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergePost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/merge").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pullrequest> returnType = new ParameterizedTypeReference<Pullrequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * When merging a pull request takes too long, the client receives a task ID along with a 202 status code. The task ID can be used in a call to this endpoint to check the status of a merge task.  &#x60;&#x60;&#x60; curl -X GET https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt; &#x60;&#x60;&#x60;  If the merge task is not yet finished, a PENDING status will be returned.  &#x60;&#x60;&#x60; HTTP/2 200 {     \&quot;task_status\&quot;: \&quot;PENDING\&quot;,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt;\&quot;         }     } } &#x60;&#x60;&#x60;  If the merge was successful, a SUCCESS status will be returned.  &#x60;&#x60;&#x60; HTTP/2 200 {     \&quot;task_status\&quot;: \&quot;SUCCESS\&quot;,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bitbucket/pullrequests/2286/merge/task-status/&lt;task_id&gt;\&quot;         }     },     \&quot;merge_result\&quot;: &lt;the merged pull request object&gt; } &#x60;&#x60;&#x60;  If the merge task failed, an error will be returned.  &#x60;&#x60;&#x60; {     \&quot;type\&quot;: \&quot;error\&quot;,     \&quot;error\&quot;: {         \&quot;message\&quot;: \&quot;&lt;error message&gt;\&quot;     } } &#x60;&#x60;&#x60;
     * <p><b>200</b> - Returns a task status if the merge is either pending or successful, and if it is successful, a pull request
     * <p><b>400</b> - If the provided task ID does not relate to this pull request, or if something went wrong during the merge operation
     * <p><b>403</b> - The user making the request does not have permission to the repo and is different from the user who queued the task
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param taskId ID of the merge task
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet(Integer pullRequestId, String repoSlug, String taskId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet");
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdMergeTaskStatusTaskIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("task_id", taskId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/merge/task-status/{task_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Redirects to the [repository patch](../../patch/%7Bspec%7D) with the revspec that corresponds to pull request.
     * <p><b>302</b> - Redirects to the [repository patch](../../patch/%7Bspec%7D) with the revspec that corresponds to pull request. 
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPatchGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/patch").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Mutates the specified pull request.  This can be used to change the pull request&#x27;s branches or description.  Only open pull requests can be mutated.
     * <p><b>200</b> - The updated pull request
     * <p><b>400</b> - If the input document was invalid.
     * <p><b>401</b> - If the request was not authenticated.
     * <p><b>404</b> - If the repository or pull request id does not exist
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param body The pull request that is to be updated.
     * @return Pullrequest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pullrequest repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut(Integer pullRequestId, String repoSlug, String workspace, Pullrequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pullrequest> returnType = new ParameterizedTypeReference<Pullrequest>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>204</b> - An empty response indicating the authenticated user&#x27;s request for change has been withdrawn.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified pull request or the repository does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/request-changes").buildAndExpand(uriVariables).toUriString();
        
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
     * 
     * <p><b>200</b> - The &#x60;participant&#x60; object recording that the authenticated user requested changes on the pull request.
     * <p><b>401</b> - The request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified pull request or the repository does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Participant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Participant repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost(Integer pullRequestId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdRequestChangesPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/request-changes").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Participant> returnType = new ParameterizedTypeReference<Participant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns all statuses (e.g. build results) for the given pull request.
     * <p><b>200</b> - A paginated list of all commit statuses for this pull request.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the specified repository or pull request does not exist.
     * @param pullRequestId The id of the pull request.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param q Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
     * @param sort Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to &#x60;created_on&#x60;. 
     * @return PaginatedCommitstatuses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedCommitstatuses repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet(Integer pullRequestId, String repoSlug, String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pullRequestId' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pull_request_id", pullRequestId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pullrequests/{pull_request_id}/statuses").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedCommitstatuses> returnType = new ParameterizedTypeReference<PaginatedCommitstatuses>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
