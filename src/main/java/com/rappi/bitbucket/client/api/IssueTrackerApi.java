package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Component;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.Issue;
import com.rappi.bitbucket.client.model.IssueChange;
import com.rappi.bitbucket.client.model.IssueComment;
import com.rappi.bitbucket.client.model.Milestone;
import com.rappi.bitbucket.client.model.PaginatedComponents;
import com.rappi.bitbucket.client.model.PaginatedIssueAttachments;
import com.rappi.bitbucket.client.model.PaginatedIssueComments;
import com.rappi.bitbucket.client.model.PaginatedIssues;
import com.rappi.bitbucket.client.model.PaginatedLogEntries;
import com.rappi.bitbucket.client.model.PaginatedMilestones;
import com.rappi.bitbucket.client.model.PaginatedVersions;
import com.rappi.bitbucket.client.model.Version;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
@org.springframework.stereotype.Component("com.rappi.bitbucket.client.api.IssueTrackerApi")
public class IssueTrackerApi {
    private ApiClient apiClient;

    public IssueTrackerApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTrackerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the specified issue tracker component object.
     * <p><b>200</b> - The specified component object.
     * <p><b>404</b> - The specified repository or component does not exist or does not have the issue tracker enabled.
     *
     * @param componentId The component&#x27;s id
     * @param repoSlug    This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace   This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Component
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Component repositoriesWorkspaceRepoSlugComponentsComponentIdGet(Integer componentId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentId' when calling repositoriesWorkspaceRepoSlugComponentsComponentIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugComponentsComponentIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugComponentsComponentIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("component_id", componentId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/components/{component_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Component> returnType = new ParameterizedTypeReference<Component>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the components that have been defined in the issue tracker.  This resource is only available on repositories that have the issue tracker enabled.
     * <p><b>200</b> - The components that have been defined in the issue tracker.
     * <p><b>404</b> - The specified repository does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return PaginatedComponents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedComponents repositoriesWorkspaceRepoSlugComponentsGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugComponentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugComponentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/components").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedComponents> returnType = new ParameterizedTypeReference<PaginatedComponents>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the issues in the issue tracker.
     * <p><b>200</b> - A paginated list of the issues matching any filter criteria that were provided.
     * <p><b>404</b> - The specified repository does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return PaginatedIssues
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedIssues repositoriesWorkspaceRepoSlugIssuesGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedIssues> returnType = new ParameterizedTypeReference<PaginatedIssues>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns all attachments for this issue.  This returns the files&#x27; meta data. This does not return the files&#x27; actual contents.  The files are always ordered by their upload date.
     * <p><b>200</b> - A paginated list of all attachments for this issue.
     * <p><b>401</b> - If the issue tracker is private and the request was not authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param issueId   The issue&#x27;s id
     * @return PaginatedIssueAttachments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedIssueAttachments repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsGet(String repoSlug, String workspace, Integer issueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsGet");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("issue_id", issueId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/attachments").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedIssueAttachments> returnType = new ParameterizedTypeReference<PaginatedIssueAttachments>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Deletes an attachment.
     * <p><b>204</b> - Indicates that the deletion was successful
     * <p><b>401</b> - If the issue tracker is private and the request was not authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issueId parameter
     * @param path      The path parameter
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathDelete(String issueId, String path, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathDelete");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("path", path);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/attachments/{path}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(pathNew, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the contents of the specified file attachment.  Note that this endpoint does not return a JSON response, but instead returns a redirect pointing to the actual file that in turn will return the raw contents.  The redirect URL contains a one-time token that has a limited lifetime. As a result, the link should not be persisted, stored, or shared.
     * <p><b>302</b> - A redirect to the file&#x27;s contents
     * <p><b>401</b> - If the issue tracker is private and the request was not authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issueId parameter
     * @param path      The path parameter
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathGet(String issueId, String path, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathGet");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPathGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("path", path);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/attachments/{path}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Upload new issue attachments.  To upload files, perform a &#x60;multipart/form-data&#x60; POST containing one or more file fields.  When a file is uploaded with the same name as an existing attachment, then the existing file will be replaced.
     * <p><b>201</b> - An empty response document.
     * <p><b>400</b> - If no files were uploaded, or if the wrong &#x60;Content-Type&#x60; was used.
     * <p><b>401</b> - If the issue tracker is private and the request was not authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param issueId   The issue&#x27;s id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPost(String repoSlug, String workspace, Integer issueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPost");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdAttachmentsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("issue_id", issueId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/attachments").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified issue change object.  This resource is only available on repositories that have the issue tracker enabled.
     * <p><b>200</b> - The specified issue change object.
     * <p><b>404</b> - The specified repository or issue change does not exist or does not have the issue tracker enabled.
     *
     * @param changeId  The issue change id
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return IssueChange
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueChange repositoriesWorkspaceRepoSlugIssuesIssueIdChangesChangeIdGet(String changeId, String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'changeId' is set
        if (changeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changeId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesChangeIdGet");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesChangeIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesChangeIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesChangeIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("change_id", changeId);
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/changes/{change_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<IssueChange> returnType = new ParameterizedTypeReference<IssueChange>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the list of all changes that have been made to the specified issue. Changes are returned in chronological order with the oldest change first.  Each time an issue is edited in the UI or through the API, an immutable change record is created under the &#x60;/issues/123/changes&#x60; endpoint. It also has a comment associated with the change.  Note that this operation is changing significantly, due to privacy changes. See the [announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-changes-gdpr/#changes-to-the-issue-changes-api) for details.  &#x60;&#x60;&#x60; $ curl -s https://api.bitbucket.org/2.0/repositories/evzijst/dogslow/issues/1/changes - | jq .  {   \&quot;pagelen\&quot;: 20,   \&quot;values\&quot;: [     {       \&quot;changes\&quot;: {         \&quot;priority\&quot;: {           \&quot;new\&quot;: \&quot;trivial\&quot;,           \&quot;old\&quot;: \&quot;major\&quot;         },         \&quot;assignee\&quot;: {           \&quot;new\&quot;: \&quot;\&quot;,           \&quot;old\&quot;: \&quot;evzijst\&quot;         },         \&quot;assignee_account_id\&quot;: {           \&quot;new\&quot;: \&quot;\&quot;,           \&quot;old\&quot;: \&quot;557058:c0b72ad0-1cb5-4018-9cdc-0cde8492c443\&quot;         },         \&quot;kind\&quot;: {           \&quot;new\&quot;: \&quot;enhancement\&quot;,           \&quot;old\&quot;: \&quot;bug\&quot;         }       },       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/evzijst/dogslow/issues/1/changes/2\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst/dogslow/issues/1#comment-2\&quot;         }       },       \&quot;issue\&quot;: {         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/evzijst/dogslow/issues/1\&quot;           }         },         \&quot;type\&quot;: \&quot;issue\&quot;,         \&quot;id\&quot;: 1,         \&quot;repository\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/evzijst/dogslow\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst/dogslow\&quot;             },             \&quot;avatar\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst/dogslow/avatar/32/\&quot;             }           },           \&quot;type\&quot;: \&quot;repository\&quot;,           \&quot;name\&quot;: \&quot;dogslow\&quot;,           \&quot;full_name\&quot;: \&quot;evzijst/dogslow\&quot;,           \&quot;uuid\&quot;: \&quot;{988b17c6-1a47-4e70-84ee-854d5f012bf6}\&quot;         },         \&quot;title\&quot;: \&quot;Updated title\&quot;       },       \&quot;created_on\&quot;: \&quot;2018-03-03T00:35:28.353630+00:00\&quot;,       \&quot;user\&quot;: {         \&quot;username\&quot;: \&quot;evzijst\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;evzijst\&quot;,         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;uuid\&quot;: \&quot;{aaa7972b-38af-4fb1-802d-6e3854c95778}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/evzijst\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/evzijst/\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/account/evzijst/avatar/32/\&quot;           }         }       },       \&quot;message\&quot;: {         \&quot;raw\&quot;: \&quot;Removed assignee, changed kind and priority.\&quot;,         \&quot;markup\&quot;: \&quot;markdown\&quot;,         \&quot;html\&quot;: \&quot;&lt;p&gt;Removed assignee, changed kind and priority.&lt;/p&gt;\&quot;,         \&quot;type\&quot;: \&quot;rendered\&quot;       },       \&quot;type\&quot;: \&quot;issue_change\&quot;,       \&quot;id\&quot;: 2     }   ],   \&quot;page\&quot;: 1 } &#x60;&#x60;&#x60;  Changes support [filtering and sorting](../../../meta/filtering) that can be used to search for specific changes. For instance, to see when an issue transitioned to \&quot;resolved\&quot;:  &#x60;&#x60;&#x60; $ curl -s https://api.bitbucket.org/2.0/repositories/site/master/issues/1/changes \\    -G --data-urlencode&#x3D;&#x27;q&#x3D;changes.state.new &#x3D; \&quot;resolved\&quot;&#x27; &#x60;&#x60;&#x60;  This resource is only available on repositories that have the issue tracker enabled.  N.B.  The &#x60;changes.assignee&#x60; and &#x60;changes.assignee_account_id&#x60; fields are not a &#x60;user&#x60; object. Instead, they contain the raw &#x60;username&#x60; and &#x60;account_id&#x60; of the user. This is to protect the integrity of the audit log even after a user account gets deleted.  The &#x60;changes.assignee&#x60; field is deprecated will disappear in the future. Use &#x60;changes.assignee_account_id&#x60; instead.
     * <p><b>200</b> - Returns all the issue changes that were made on the specified issue.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param q         Query string to narrow down the response. See [filtering and sorting](../../../meta/filtering) for details.
     * @param sort      Name of a response property to sort results. See [filtering and sorting](../../../meta/filtering#query-sort) for details.
     * @return PaginatedLogEntries
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedLogEntries repositoriesWorkspaceRepoSlugIssuesIssueIdChangesGet(String issueId, String repoSlug, String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/changes").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedLogEntries> returnType = new ParameterizedTypeReference<PaginatedLogEntries>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Makes a change to the specified issue.  For example, to change an issue&#x27;s state and assignee, create a new change object that modifies these fields:  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/site/master/issues/1234/changes \\   -s -u evzijst -X POST -H \&quot;Content-Type: application/json\&quot; \\   -d &#x27;{     \&quot;changes\&quot;: {       \&quot;assignee_account_id\&quot;: {         \&quot;new\&quot;: \&quot;557058:c0b72ad0-1cb5-4018-9cdc-0cde8492c443\&quot;       },       \&quot;state\&quot;: {         \&quot;new\&quot;: &#x27;resolved\&quot;       }     }     \&quot;message\&quot;: {       \&quot;raw\&quot;: \&quot;This is now resolved.\&quot;     }   }&#x27; &#x60;&#x60;&#x60;  The above example also includes a custom comment to go alongside the change. This comment will also be visible on the issue page in the UI.  The fields of the &#x60;changes&#x60; object are strings, not objects. This allows for immutable change log records, even after user accounts, milestones, or other objects recorded in a change entry, get renamed or deleted.  The &#x60;assignee_account_id&#x60; field stores the account id. When POSTing a new change and changing the assignee, the client should therefore use the user&#x27;s account_id in the &#x60;changes.assignee_account_id.new&#x60; field.  This call requires authentication. Private repositories or private issue trackers require the caller to authenticate with an account that has appropriate authorization.
     * <p><b>201</b> - The newly created issue change.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>403</b> - When the authenticated user isn&#x27;t authorized to modify the issue.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param body      The new issue state change. The only required elements are &#x60;changes.[].new&#x60;. All other elements can be omitted from the body.
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return IssueChange
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueChange repositoriesWorkspaceRepoSlugIssuesIssueIdChangesPost(IssueChange body, String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesPost");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdChangesPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/changes").buildAndExpand(uriVariables).toUriString();

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

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<IssueChange> returnType = new ParameterizedTypeReference<IssueChange>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Deletes the specified comment.
     * <p><b>204</b> - Indicates successful deletion.
     *
     * @param body      The updated comment.
     * @param commentId The commentId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param issueId   The ID of the issue that is being queried.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete(IssueComment body, String commentId, String workspace, String username, String repoSlug, String issueId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("issue_id", issueId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {};
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified issue comment object.
     * <p><b>200</b> - The issue comment.
     *
     * @param commentId The commentId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param issueId   The ID of the issue that is being queried.
     * @return IssueComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueComment repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet(String commentId, String workspace, String username, String repoSlug, String issueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("issue_id", issueId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<IssueComment> returnType = new ParameterizedTypeReference<IssueComment>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Updates the content of the specified issue comment. Note that only the &#x60;content.raw&#x60; field can be modified.  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/atlassian/prlinks/issues/42/comments/5728901 \\   -X PUT -u evzijst \\   -H &#x27;Content-Type: application/json&#x27; \\   -d &#x27;{\&quot;content\&quot;: {\&quot;raw\&quot;: \&quot;Lorem ipsum.\&quot;}&#x27; &#x60;&#x60;&#x60;
     * <p><b>200</b> - The updated issue comment.
     * <p><b>400</b> - If the input was invalid, or if the update to the comment is detected as spam
     *
     * @param body      The updated comment.
     * @param commentId The commentId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param issueId   The ID of the issue that is being queried.
     * @return IssueComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueComment repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut(IssueComment body, String commentId, String workspace, String username, String repoSlug, String issueId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsCommentIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("issue_id", issueId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();

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

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<IssueComment> returnType = new ParameterizedTypeReference<IssueComment>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns a paginated list of all comments that were made on the specified issue.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../../../../../meta/filtering) for more details.
     * <p><b>200</b> - A paginated list of issue comments.
     *
     * @param issueId   The issueId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param q         Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).
     * @return PaginatedIssueComments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedIssueComments repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsGet(String issueId, String workspace, String username, String repoSlug, String q) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/comments").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedIssueComments> returnType = new ParameterizedTypeReference<PaginatedIssueComments>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new issue comment.  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/atlassian/prlinks/issues/42/comments/ \\   -X POST -u evzijst \\   -H &#x27;Content-Type: application/json&#x27; \\   -d &#x27;{\&quot;content\&quot;: {\&quot;raw\&quot;: \&quot;Lorem ipsum.\&quot;}}&#x27; &#x60;&#x60;&#x60;
     * <p><b>201</b> - The newly created comment.
     * <p><b>400</b> - If the input was invalid, or if the comment being created is detected as spam
     *
     * @param body      The new issue comment object.
     * @param issueId   The issueId parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost(IssueComment body, String issueId, String workspace, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost");
        }
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdCommentsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/comments").buildAndExpand(uriVariables).toUriString();

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

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Deletes the specified issue. This requires write access to the repository.
     * <p><b>200</b> - The issue object.
     * <p><b>403</b> - When the authenticated user isn&#x27;t authorized to delete the issue.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Issue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Issue repositoriesWorkspaceRepoSlugIssuesIssueIdDelete(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Issue> returnType = new ParameterizedTypeReference<Issue>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified issue.
     * <p><b>200</b> - The issue object.
     * <p><b>403</b> - When the authenticated user isn&#x27;t authorized to access the issue.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     * <p><b>410</b> - The specified issue is unavailable.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Issue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Issue repositoriesWorkspaceRepoSlugIssuesIssueIdGet(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Issue> returnType = new ParameterizedTypeReference<Issue>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Modifies the issue.  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repostories/evzijst/dogslow/issues/123 \\   -u evzijst -s -X PUT -H &#x27;Content-Type: application/json&#x27; \\   -d &#x27;{   \&quot;title\&quot;: \&quot;Updated title\&quot;,   \&quot;assignee\&quot;: {     \&quot;username\&quot;: \&quot;evzijst\&quot;   },   \&quot;priority\&quot;: \&quot;minor\&quot;,   \&quot;version\&quot;: {     \&quot;name\&quot;: \&quot;1.0\&quot;   },   \&quot;component\&quot;: null }&#x27; &#x60;&#x60;&#x60;  This example changes the &#x60;title&#x60;, &#x60;assignee&#x60;, &#x60;priority&#x60; and the &#x60;version&#x60;. It also removes the value of the &#x60;component&#x60; from the issue by setting the field to &#x60;null&#x60;. Any field not present keeps its existing value.  Each time an issue is edited in the UI or through the API, an immutable change record is created under the &#x60;/issues/123/changes&#x60; endpoint. It also has a comment associated with the change.
     * <p><b>200</b> - The updated issue object.
     * <p><b>403</b> - When the authenticated user isn&#x27;t authorized to access the issue.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Issue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Issue repositoriesWorkspaceRepoSlugIssuesIssueIdPut(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Issue> returnType = new ParameterizedTypeReference<Issue>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Retract your vote.
     * <p><b>0</b> - Unexpected error.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdVoteDelete(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/vote").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Check whether the authenticated user has voted for this issue. A 204 status code indicates that the user has voted, while a 404 implies they haven&#x27;t.
     * <p><b>204</b> - If the authenticated user has not voted for this issue.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>404</b> - If the authenticated user has not voted for this issue, or when the repo does not exist, or does not have an issue tracker.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdVoteGet(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVoteGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/vote").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Vote for this issue.  To cast your vote, do an empty PUT. The 204 status code indicates that the operation was successful.
     * <p><b>204</b> - Indicating the authenticated user has cast their vote successfully.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdVotePut(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVotePut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVotePut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdVotePut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/vote").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Stop watching this issue.
     * <p><b>204</b> - Indicates that the authenticated user successfully stopped watching this issue.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>404</b> - The specified repository or issue does not exist or does not have the issue tracker enabled.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdWatchDelete(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/watch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Indicated whether or not the authenticated user is watching this issue.
     * <p><b>204</b> - If the authenticated user is watching this issue.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>404</b> - If the authenticated user is not watching this issue, or when the repo does not exist, or does not have an issue tracker.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdWatchGet(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/watch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Start watching this issue.  To start watching this issue, do an empty PUT. The 204 status code indicates that the operation was successful.
     * <p><b>204</b> - Indicates that the authenticated user successfully started watching this issue.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>404</b> - If the authenticated user is not watching this issue, or when the repo does not exist, or does not have an issue tracker.
     *
     * @param issueId   The issue id
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugIssuesIssueIdWatchPut(String issueId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueId' is set
        if (issueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueId' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesIssueIdWatchPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issue_id", issueId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/{issue_id}/watch").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Error> returnType = new ParameterizedTypeReference<Error>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new issue.  This call requires authentication. Private repositories or private issue trackers require the caller to authenticate with an account that has appropriate authorization.  The authenticated user is used for the issue&#x27;s &#x60;reporter&#x60; field.
     * <p><b>201</b> - The newly created issue.
     * <p><b>401</b> - When the request wasn&#x27;t authenticated.
     * <p><b>403</b> - When the authenticated user isn&#x27;t authorized to create the issue.
     * <p><b>404</b> - The specified repository does not exist or does not have the issue tracker enabled.
     *
     * @param body      The new issue. The only required element is &#x60;title&#x60;. All other elements can be omitted from the body.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Issue
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Issue repositoriesWorkspaceRepoSlugIssuesPost(Issue body, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugIssuesPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues").buildAndExpand(uriVariables).toUriString();

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

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Issue> returnType = new ParameterizedTypeReference<Issue>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the milestones that have been defined in the issue tracker.  This resource is only available on repositories that have the issue tracker enabled.
     * <p><b>200</b> - The milestones that have been defined in the issue tracker.
     * <p><b>404</b> - The specified repository does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return PaginatedMilestones
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedMilestones repositoriesWorkspaceRepoSlugMilestonesGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugMilestonesGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugMilestonesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/milestones").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedMilestones> returnType = new ParameterizedTypeReference<PaginatedMilestones>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified issue tracker milestone object.
     * <p><b>200</b> - The specified milestone object.
     * <p><b>404</b> - The specified repository or milestone does not exist or does not have the issue tracker enabled.
     *
     * @param milestoneId The milestone&#x27;s id
     * @param repoSlug    This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace   This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Milestone
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Milestone repositoriesWorkspaceRepoSlugMilestonesMilestoneIdGet(Integer milestoneId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'milestoneId' is set
        if (milestoneId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'milestoneId' when calling repositoriesWorkspaceRepoSlugMilestonesMilestoneIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugMilestonesMilestoneIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugMilestonesMilestoneIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("milestone_id", milestoneId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/milestones/{milestone_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Milestone> returnType = new ParameterizedTypeReference<Milestone>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the versions that have been defined in the issue tracker.  This resource is only available on repositories that have the issue tracker enabled.
     * <p><b>200</b> - The versions that have been defined in the issue tracker.
     * <p><b>404</b> - The specified repository does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return PaginatedVersions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedVersions repositoriesWorkspaceRepoSlugVersionsGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugVersionsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugVersionsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/versions").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedVersions> returnType = new ParameterizedTypeReference<PaginatedVersions>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified issue tracker version object.
     * <p><b>200</b> - The specified version object.
     * <p><b>404</b> - The specified repository or version does not exist or does not have the issue tracker enabled.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param versionId The version&#x27;s id
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Version
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Version repositoriesWorkspaceRepoSlugVersionsVersionIdGet(String repoSlug, Integer versionId, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugVersionsVersionIdGet");
        }
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'versionId' when calling repositoriesWorkspaceRepoSlugVersionsVersionIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugVersionsVersionIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("version_id", versionId);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/versions/{version_id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Version> returnType = new ParameterizedTypeReference<Version>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
