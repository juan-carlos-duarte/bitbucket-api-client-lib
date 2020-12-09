package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Branchrestriction;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedBranchrestrictions;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.BranchrestrictionsApi")
public class BranchrestrictionsApi {
    private ApiClient apiClient;

    public BranchrestrictionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BranchrestrictionsApi(ApiClient apiClient) {
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
     * Returns a paginated list of all branch restrictions on the repository.
     * <p><b>200</b> - A paginated list of branch restrictions
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have admin access to the repository
     * <p><b>404</b> - If the repository does not exist
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param kind Branch restrictions of this type
     * @param pattern Branch restrictions applied to branches of this pattern
     * @return PaginatedBranchrestrictions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedBranchrestrictions repositoriesWorkspaceRepoSlugBranchRestrictionsGet(String repoSlug, String workspace, String kind, String pattern) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/branch-restrictions").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kind", kind));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pattern", pattern));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedBranchrestrictions> returnType = new ParameterizedTypeReference<PaginatedBranchrestrictions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes an existing branch restriction rule.
     * <p><b>204</b>
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have admin access to the repository
     * <p><b>404</b> - If the repository or branch restriction id does not exist
     * @param id The restriction rule&#x27;s id
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugBranchRestrictionsIdDelete(String id, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/branch-restrictions/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns a specific branch restriction rule.
     * <p><b>200</b> - The branch restriction rule
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have admin access to the repository
     * <p><b>404</b> - If the repository or branch restriction id does not exist
     * @param id The restriction rule&#x27;s id
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Branchrestriction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Branchrestriction repositoriesWorkspaceRepoSlugBranchRestrictionsIdGet(String id, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/branch-restrictions/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Branchrestriction> returnType = new ParameterizedTypeReference<Branchrestriction>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Updates an existing branch restriction rule.  Fields not present in the request body are ignored.  See [&#x60;POST&#x60;](../branch-restrictions#post) for details.
     * <p><b>200</b> - The updated branch restriction rule
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have admin access to the repository
     * <p><b>404</b> - If the repository or branch restriction id does not exist
     * @param body The new version of the existing rule
     * @param id The restriction rule&#x27;s id
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Branchrestriction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Branchrestriction repositoriesWorkspaceRepoSlugBranchRestrictionsIdPut(Branchrestriction body, String id, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdPut");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/branch-restrictions/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Branchrestriction> returnType = new ParameterizedTypeReference<Branchrestriction>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new branch restriction rule for a repository.  &#x60;kind&#x60; describes what will be restricted. Allowed values include: &#x60;push&#x60;, &#x60;force&#x60;, &#x60;delete&#x60; and &#x60;restrict_merges&#x60;.  Different kinds of branch restrictions have different requirements:  * &#x60;push&#x60; and &#x60;restrict_merges&#x60; require &#x60;users&#x60; and &#x60;groups&#x60; to be   specified. Empty lists are allowed, in which case permission is   denied for everybody. * &#x60;force&#x60; can not be specified in a Mercurial repository.  The restriction applies to all branches that match. There are two ways to match a branch. It is configured in &#x60;branch_match_kind&#x60;:  1. &#x60;glob&#x60;: Matches a branch against the &#x60;pattern&#x60;. A &#x60;&#x27;*&#x27;&#x60; in    &#x60;pattern&#x60; will expand to match zero or more characters, and every    other character matches itself. For example, &#x60;&#x27;foo*&#x27;&#x60; will match    &#x60;&#x27;foo&#x27;&#x60; and &#x60;&#x27;foobar&#x27;&#x60;, but not &#x60;&#x27;barfoo&#x27;&#x60;. &#x60;&#x27;*&#x27;&#x60; will match all    branches. 2. &#x60;branching_model&#x60;: Matches a branch against the repository&#x27;s    branching model. The &#x60;branch_type&#x60; controls the type of branch    to match. Allowed values include: &#x60;production&#x60;, &#x60;development&#x60;,    &#x60;bugfix&#x60;, &#x60;release&#x60;, &#x60;feature&#x60; and &#x60;hotfix&#x60;.  The combination of &#x60;kind&#x60; and match must be unique. This means that two &#x60;glob&#x60; restrictions in a repository cannot have the same &#x60;kind&#x60; and &#x60;pattern&#x60;. Additionally, two &#x60;branching_model&#x60; restrictions in a repository cannot have the same &#x60;kind&#x60; and &#x60;branch_type&#x60;.  &#x60;users&#x60; and &#x60;groups&#x60; are lists of users and groups that are except from the restriction. They can only be configured in &#x60;push&#x60; and &#x60;restrict_merges&#x60; restrictions. The &#x60;push&#x60; restriction stops a user pushing to matching branches unless that user is in &#x60;users&#x60; or is a member of a group in &#x60;groups&#x60;. The &#x60;restrict_merges&#x60; stops a user merging pull requests to matching branches unless that user is in &#x60;users&#x60; or is a member of a group in &#x60;groups&#x60;. Adding new users or groups to an existing restriction should be done via &#x60;PUT&#x60;.  Note that branch restrictions with overlapping matchers is allowed, but the resulting behavior may be surprising.
     * <p><b>201</b> - A paginated list of branch restrictions
     * <p><b>401</b> - If the request was not authenticated
     * <p><b>403</b> - If the authenticated user does not have admin access to the repository
     * <p><b>404</b> - If the repository does not exist
     * @param body The new rule
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Branchrestriction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Branchrestriction repositoriesWorkspaceRepoSlugBranchRestrictionsPost(Branchrestriction body, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugBranchRestrictionsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/branch-restrictions").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Branchrestriction> returnType = new ParameterizedTypeReference<Branchrestriction>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
