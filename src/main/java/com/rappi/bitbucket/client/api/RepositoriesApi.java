package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;
import com.rappi.bitbucket.client.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
@Component("com.rappi.bitbucket.client.api.RepositoriesApi")
public class RepositoriesApi {
    private ApiClient apiClient;

    public RepositoriesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RepositoriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns a paginated list of all public repositories.  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../meta/filtering) for more details.
     * <p><b>200</b> - All public repositories.
     *
     * @param after Filter the results to include only repositories created on or after this [ISO-8601](https://en.wikipedia.org/wiki/ISO_8601)  timestamp. Example: &#x60;YYYY-MM-DDTHH:mm:ss.sssZ&#x60;
     * @param role  Filters the result based on the authenticated user&#x27;s role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user
     * @param q     Query string to narrow down the response as per [filtering and sorting](../meta/filtering). &#x60;role&#x60; parameter must also be specified.
     * @param sort  Field by which the results should be sorted as per [filtering and sorting](../meta/filtering).
     * @return PaginatedRepositories
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositories repositoriesGet(String after, String role, String q, String sort) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/repositories").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedRepositories> returnType = new ParameterizedTypeReference<PaginatedRepositories>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns a paginated list of all repositories owned by the specified account or UUID.  The result can be narrowed down based on the authenticated user&#x27;s role.  E.g. with &#x60;?role&#x3D;contributor&#x60;, only those repositories that the authenticated user has write access to are returned (this includes any repo the user is an admin on, as that implies write access).  This endpoint also supports filtering and sorting of the results. See [filtering and sorting](../../meta/filtering) for more details.
     * <p><b>200</b> - The repositories owned by the specified account.
     * <p><b>404</b> - If the specified account does not exist.
     * <p><b>410</b> - If the specified account marked as spam.
     *
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param role      Filters the result based on the authenticated user&#x27;s role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user
     * @param q         Query string to narrow down the response as per [filtering and sorting](../../meta/filtering).
     * @param sort      Field by which the results should be sorted as per [filtering and sorting](../../meta/filtering).
     * @return PaginatedRepositories
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositories repositoriesWorkspaceGet(String workspace, String role, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}").buildAndExpand(uriVariables).toUriString();

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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedRepositories> returnType = new ParameterizedTypeReference<PaginatedRepositories>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the specified build status for a commit.
     * <p><b>200</b> - The build status object with the specified key.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the repository, commit, or build status key does not exist
     *
     * @param key       The build status&#x27; unique key
     * @param node      The commit&#x27;s SHA1.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Commitstatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet(String key, String node, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet");
        }
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key", key);
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build/{key}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Commitstatus> returnType = new ParameterizedTypeReference<Commitstatus>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Used to update the current status of a build status object on the specific commit.  This operation can also be used to change other properties of the build status:  * &#x60;state&#x60; * &#x60;name&#x60; * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;refname&#x60;  The &#x60;key&#x60; cannot be changed.
     * <p><b>200</b> - The updated build status object.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the repository or build does not exist
     *
     * @param key       The build status&#x27; unique key
     * @param node      The commit&#x27;s SHA1.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param body      The updated build status object
     * @return Commitstatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut(String key, String node, String repoSlug, String workspace, Commitstatus body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut");
        }
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key", key);
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build/{key}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Commitstatus> returnType = new ParameterizedTypeReference<Commitstatus>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new build status against the specified commit.  If the specified key already exists, the existing status object will be overwritten.  Example:  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/my-workspace/my-repo/commit/e10dae226959c2194f2b07b077c07762d93821cf/statuses/build/           -X POST -u jdoe -H &#x27;Content-Type: application/json&#x27;           -d &#x27;{     \&quot;key\&quot;: \&quot;MY-BUILD\&quot;,     \&quot;state\&quot;: \&quot;SUCCESSFUL\&quot;,     \&quot;description\&quot;: \&quot;42 tests passed\&quot;,     \&quot;url\&quot;: \&quot;https://www.example.org/my-build-result\&quot;   }&#x27; &#x60;&#x60;&#x60;  When creating a new commit status, you can use a URI template for the URL. Templates are URLs that contain variable names that Bitbucket will evaluate at runtime whenever the URL is displayed anywhere similar to parameter substitution in [Bitbucket Connect](https://developer.atlassian.com/bitbucket/concepts/context-parameters.html). For example, one could use &#x60;https://foo.com/builds/{repository.full_name}&#x60; which Bitbucket will turn into &#x60;https://foo.com/builds/foo/bar&#x60; at render time. The context variables available are &#x60;repository&#x60; and &#x60;commit&#x60;.
     * <p><b>201</b> - The newly created build status object.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the repository, commit, or build status key does not exist
     *
     * @param node      The commit&#x27;s SHA1.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param body      The new commit status object.
     * @return Commitstatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Commitstatus repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost(String node, String repoSlug, String workspace, Commitstatus body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/statuses/build").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Commitstatus> returnType = new ParameterizedTypeReference<Commitstatus>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns all statuses (e.g. build results) for a specific commit.
     * <p><b>200</b> - A paginated list of all commit statuses for this commit.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the repository or commit does not exist
     *
     * @param node      The commit&#x27;s SHA1.
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param q         Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).
     * @param sort      Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to &#x60;created_on&#x60;.
     * @return PaginatedCommitstatuses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedCommitstatuses repositoriesWorkspaceRepoSlugCommitNodeStatusesGet(String node, String repoSlug, String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeStatusesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/statuses").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<PaginatedCommitstatuses> returnType = new ParameterizedTypeReference<PaginatedCommitstatuses>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Deletes the repository. This is an irreversible operation.  This does not affect its forks.
     * <p><b>204</b> - Indicates successful deletion.
     * <p><b>403</b> - If the caller either does not have admin access to the repository, or the repository is set to read-only.
     * <p><b>404</b> - If the repository does not exist.
     *
     * @param repoSlug   This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace  This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param redirectTo If a repository has been moved to a new location, use this parameter to show users a friendly message in the Bitbucket UI that the repository has moved to a new location. However, a GET to this endpoint will still return a 404.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugDelete(String repoSlug, String workspace, String redirectTo) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect_to", redirectTo));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns a paginated list of commits that modified the specified file.  Commits are returned in reverse chronological order. This is roughly equivalent to the following commands:      $ git log --follow --date-order &lt;sha&gt; &lt;path&gt;      $ hg log --follow &lt;path&gt;  By default, Bitbucket will follow renames and the path name in the returned entries reflects that. This can be turned off using the &#x60;?renames&#x3D;false&#x60; query parameter.  Results are returned in descending chronological order by default, and like most endpoints you can [filter and sort](../../../../../../meta/filtering) the response to only provide exactly the data you want.  For example, if you wanted to find commits made before 2011-05-18 against a file named &#x60;README.rst&#x60;, but you only wanted the path and date, your query would look like this:  &#x60;&#x60;&#x60; $ curl &#x27;https://api.bitbucket.org/2.0/repositories/evzijst/dogslow/filehistory/master/README.rst&#x27;\\   &#x27;?fields&#x3D;values.next,values.path,values.commit.date&amp;q&#x3D;commit.date&lt;&#x3D;2011-05-18&#x27; {   \&quot;values\&quot;: [     {       \&quot;commit\&quot;: {         \&quot;date\&quot;: \&quot;2011-05-17T07:32:09+00:00\&quot;       },       \&quot;path\&quot;: \&quot;README.rst\&quot;     },     {       \&quot;commit\&quot;: {         \&quot;date\&quot;: \&quot;2011-05-16T06:33:28+00:00\&quot;       },       \&quot;path\&quot;: \&quot;README.txt\&quot;     },     {       \&quot;commit\&quot;: {         \&quot;date\&quot;: \&quot;2011-05-16T06:15:39+00:00\&quot;       },       \&quot;path\&quot;: \&quot;README.txt\&quot;     }   ] } &#x60;&#x60;&#x60;  In the response you can see that the file was renamed to &#x60;README.rst&#x60; by the commit made on 2011-05-16, and was previously named &#x60;README.txt&#x60;.
     * <p><b>200</b> - A paginated list of commits that modified the specified file
     * <p><b>404</b> - If the repository does not exist.
     *
     * @param node      The node parameter
     * @param path      The path parameter
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param renames   When &#x60;true&#x60;, Bitbucket will follow the history of the file across renames (this is the default behavior). This can be turned off by specifying &#x60;false&#x60;.
     * @param q         Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).
     * @param sort      Name of a response property sort the result by as per [filtering and sorting](../../../../../../meta/filtering#query-sort).
     * @return PaginatedFiles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedFiles repositoriesWorkspaceRepoSlugFilehistoryNodePathGet(String node, String path, String repoSlug, String workspace, String renames, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugFilehistoryNodePathGet");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling repositoriesWorkspaceRepoSlugFilehistoryNodePathGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugFilehistoryNodePathGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugFilehistoryNodePathGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("path", path);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/filehistory/{node}/{path}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "renames", renames));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedFiles> returnType = new ParameterizedTypeReference<PaginatedFiles>() {
        };
        return apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns a paginated list of all the forks of the specified repository.
     * <p><b>200</b> - All forks.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param role      Filters the result based on the authenticated user&#x27;s role on each repository.  * **member**: returns repositories to which the user has explicit read access * **contributor**: returns repositories to which the user has explicit write access * **admin**: returns repositories to which the user has explicit administrator access * **owner**: returns all repositories owned by the current user
     * @param q         Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort      Field by which the results should be sorted as per [filtering and sorting](../../../../meta/filtering).
     * @return PaginatedRepositories
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositories repositoriesWorkspaceRepoSlugForksGet(String repoSlug, String workspace, String role, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugForksGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugForksGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/forks").buildAndExpand(uriVariables).toUriString();

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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedRepositories> returnType = new ParameterizedTypeReference<PaginatedRepositories>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new fork of the specified repository.  ## Forking a repository  To create a fork, specify the workspace explicitly as part of the request body:  &#x60;&#x60;&#x60; $ curl -X POST -u jdoe https://api.bitbucket.org/2.0/repositories/atlassian/bbql/forks \\   -H &#x27;Content-Type: application/json&#x27; -d &#x27;{     \&quot;name\&quot;: \&quot;bbql_fork\&quot;,     \&quot;workspace\&quot;: {       \&quot;slug\&quot;: \&quot;atlassian\&quot;     } }&#x27; &#x60;&#x60;&#x60;  To fork a repository into the same workspace, also specify a new &#x60;name&#x60;.  When you specify a value for &#x60;name&#x60;, it will also affect the &#x60;slug&#x60;. The &#x60;slug&#x60; is reflected in the repository URL of the new fork. It is derived from &#x60;name&#x60; by substituting non-ASCII characters, removes whitespace, and changes characters to lower case. For example, &#x60;My repo&#x60; would turn into &#x60;my_repo&#x60;.  You need contributor access to create new forks within a workspace.   ## Change the properties of a new fork  By default the fork inherits most of its properties from the parent. However, since the optional POST body document follows the normal &#x60;repository&#x60; JSON schema and you can override the new fork&#x27;s properties.  Properties that can be overridden include:  * description * fork_policy * language * mainbranch * is_private (note that a private repo&#x27;s fork_policy might prohibit   the creation of public forks, in which &#x60;is_private&#x3D;False&#x60; would fail) * has_issues (to initialize or disable the new repo&#x27;s issue tracker --   note that the actual contents of the parent repository&#x27;s issue   tracker are not copied during forking) * has_wiki (to initialize or disable the new repo&#x27;s wiki --   note that the actual contents of the parent repository&#x27;s wiki are not   copied during forking) * project (when forking into a private project, the fork&#x27;s &#x60;is_private&#x60;   must be &#x60;true&#x60;)  Properties that cannot be modified include:  * scm * parent * full_name
     * <p><b>201</b> - The newly created fork.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param body      A repository object. This can be left blank.
     * @return Repository
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Repository repositoriesWorkspaceRepoSlugForksPost(String repoSlug, String workspace, Repository body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugForksPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugForksPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/forks").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Repository> returnType = new ParameterizedTypeReference<Repository>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the object describing this repository.
     * <p><b>200</b> - The repository object.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it.
     * <p><b>404</b> - If no repository exists at this location.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @return Repository
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Repository repositoriesWorkspaceRepoSlugGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Repository> returnType = new ParameterizedTypeReference<Repository>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns a paginated list of webhooks installed on this repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).
     * <p><b>200</b> - The paginated list of installed webhooks.
     * <p><b>403</b> - If the authenticated user does not have permission to access the webhooks.
     * <p><b>404</b> - If the repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedWebhookSubscriptions> returnType = new ParameterizedTypeReference<PaginatedWebhookSubscriptions>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new webhook on the specified repository.  The teams endpoint for projects has been deprecated, and you should ensure you are using the workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).  Example:  &#x60;&#x60;&#x60; $ curl -X POST -u credentials -H &#x27;Content-Type: application/json&#x27;           https://api.bitbucket.org/2.0/repositories/username/slug/hooks           -d &#x27;     {       \&quot;description\&quot;: \&quot;Webhook Description\&quot;,       \&quot;url\&quot;: \&quot;https://example.com/\&quot;,       \&quot;active\&quot;: true,       \&quot;events\&quot;: [         \&quot;repo:push\&quot;,         \&quot;issue:created\&quot;,         \&quot;issue:updated\&quot;       ]     }&#x27; &#x60;&#x60;&#x60;  Note that this call requires the webhook scope, as well as any scope that applies to the events that the webhook subscribes to. In the example above that means: &#x60;webhook&#x60;, &#x60;repository&#x60; and &#x60;issue&#x60;.  Also note that the &#x60;url&#x60; must properly resolve and cannot be an internal, non-routed address.
     * <p><b>201</b> - If the webhook was registered successfully.
     * <p><b>403</b> - If the authenticated user does not have permission to install webhooks on the specified repository.
     * <p><b>404</b> - If the repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Deletes the specified webhook subscription from the given repository.
     * <p><b>204</b> - When the webhook was deleted successfully
     * <p><b>403</b> - If the authenticated user does not have permission to delete the webhook.
     * <p><b>404</b> - If the webhook or repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param uid       The installed webhook&#x27;s id
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns the webhook with the specified id installed on the specified repository.
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>404</b> - If the webhook or repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param uid       The installed webhook&#x27;s id.
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Updates the specified webhook subscription.  The following properties can be mutated:  * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;active&#x60; * &#x60;events&#x60;
     * <p><b>200</b> - The webhook subscription object.
     * <p><b>403</b> - If the authenticated user does not have permission to update the webhook.
     * <p><b>404</b> - If the webhook or repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param uid       The installed webhook&#x27;s id
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<WebhookSubscription> returnType = new ParameterizedTypeReference<WebhookSubscription>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Creates a new repository.  Note: In order to set the project for the newly created repository, pass in either the project key or the project UUID as part of the request body as shown in the examples below:  &#x60;&#x60;&#x60; $ curl -X POST -H \&quot;Content-Type: application/json\&quot; -d &#x27;{     \&quot;scm\&quot;: \&quot;git\&quot;,     \&quot;project\&quot;: {         \&quot;key\&quot;: \&quot;MARS\&quot;     } }&#x27; https://api.bitbucket.org/2.0/repositories/teamsinspace/hablanding &#x60;&#x60;&#x60;  or  &#x60;&#x60;&#x60; $ curl -X POST -H \&quot;Content-Type: application/json\&quot; -d &#x27;{     \&quot;scm\&quot;: \&quot;git\&quot;,     \&quot;project\&quot;: {         \&quot;key\&quot;: \&quot;{ba516952-992a-4c2d-acbd-17d502922f96}\&quot;     } }&#x27; https://api.bitbucket.org/2.0/repositories/teamsinspace/hablanding &#x60;&#x60;&#x60;  The project must be assigned for all repositories. If the project is not provided, the repository is automatically assigned to the oldest project in the workspace.  Note: In the examples above, the workspace ID &#x60;teamsinspace&#x60;, and/or the repository name &#x60;hablanding&#x60; can be replaced by UUIDs.
     * <p><b>200</b> - The newly created repository.
     * <p><b>400</b> - If the input document was invalid, or if the caller lacks the privilege to create repositories under the targeted account.
     * <p><b>401</b> - If the request was not authenticated.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param body      The repository that is to be created. Note that most object elements are optional. Elements &quot;owner&quot; and &quot;full_name&quot; are ignored as the URL implies them.
     * @return Repository
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Repository repositoriesWorkspaceRepoSlugPost(String repoSlug, String workspace, Repository body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Repository> returnType = new ParameterizedTypeReference<Repository>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns all statuses (e.g. build results) for the given pull request.
     * <p><b>200</b> - A paginated list of all commit statuses for this pull request.
     * <p><b>401</b> - If the repository is private and the request was not authenticated.
     * <p><b>404</b> - If the specified repository or pull request does not exist.
     *
     * @param pullRequestId The id of the pull request.
     * @param repoSlug      This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace     This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param q             Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering).
     * @param sort          Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). Defaults to &#x60;created_on&#x60;.
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
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedCommitstatuses> returnType = new ParameterizedTypeReference<PaginatedCommitstatuses>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Since this endpoint can be used to both update and to create a repository, the request body depends on the intent.  ### Creation  See the POST documentation for the repository endpoint for an example of the request body.  ### Update  Note: Changing the &#x60;name&#x60; of the repository will cause the location to be changed. This is because the URL of the repo is derived from the name (a process called slugification). In such a scenario, it is possible for the request to fail if the newly created slug conflicts with an existing repository&#x27;s slug. But if there is no conflict, the new location will be returned in the &#x60;Location&#x60; header of the response.
     * <p><b>200</b> - The existing repository has been updated
     * <p><b>201</b> - A new repository has been created
     * <p><b>400</b> - If the input document was invalid, or if the caller lacks the privilege to create repositories under the targeted account.
     * <p><b>401</b> - If the request was not authenticated.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param body      The repository that is to be updated.
     *                  <p>
     *                  Note that the elements &quot;owner&quot; and &quot;full_name&quot; are ignored since the
     *                  URL implies them.
     * @return Repository
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Repository repositoriesWorkspaceRepoSlugPut(String repoSlug, String workspace, Repository body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Repository> returnType = new ParameterizedTypeReference<Repository>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * This endpoint redirects the client to the directory listing of the root directory on the main branch.  This is equivalent to directly hitting [/2.0/repositories/{username}/{repo_slug}/src/{node}/{path}](src/%7Bnode%7D/%7Bpath%7D) without having to know the name or SHA1 of the repo&#x27;s main branch.  To create new commits, [POST to this endpoint](#post)
     * <p><b>200</b> - If the path matches a file, then the raw contents of the file are returned (unless the &#x60;format&#x3D;meta&#x60; query parameter was provided, in which case a json document containing the file&#x27;s meta data is returned). If the path matches a directory, then a paginated list of file and directory entries is returned (if the &#x60;format&#x3D;meta&#x60; query parameter was provided, then the json document containing the directory&#x27;s meta data is returned).
     * <p><b>404</b> - If the path or commit in the URL does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param format    Instead of returning the file&#x27;s contents, return the (json) meta data for it.
     * @return PaginatedTreeentries
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedTreeentries repositoriesWorkspaceRepoSlugSrcGet(String repoSlug, String workspace, String format) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugSrcGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugSrcGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/src").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedTreeentries> returnType = new ParameterizedTypeReference<PaginatedTreeentries>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * This endpoints is used to retrieve the contents of a single file, or the contents of a directory at a specified revision.  ## Raw file contents  When &#x60;path&#x60; points to a file, this endpoint returns the raw contents. The response&#x27;s Content-Type is derived from the filename extension (not from the contents). The file contents are not processed and no character encoding/recoding is performed and as a result no character encoding is included as part of the Content-Type.  The &#x60;Content-Disposition&#x60; header will be \&quot;attachment\&quot; to prevent browsers from running executable files.  If the file is managed by LFS, then a 301 redirect pointing to Atlassian&#x27;s media services platform is returned.  The response includes an ETag that is based on the contents of the file and its attributes. This means that an empty &#x60;__init__.py&#x60; always returns the same ETag, regardless on the directory it lives in, or the commit it is on.  ## File meta data  When the request for a file path includes the query parameter &#x60;?format&#x3D;meta&#x60;, instead of returning the file&#x27;s raw contents, Bitbucket instead returns the JSON object describing the file&#x27;s properties:  &#x60;&#x60;&#x60;javascript $ curl https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef/tests/__init__.py?format&#x3D;meta {   \&quot;links\&quot;: {     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/__init__.py\&quot;     },     \&quot;meta\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/__init__.py?format&#x3D;meta\&quot;     }   },   \&quot;path\&quot;: \&quot;tests/__init__.py\&quot;,   \&quot;commit\&quot;: {     \&quot;type\&quot;: \&quot;commit\&quot;,     \&quot;hash\&quot;: \&quot;eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;,     \&quot;links\&quot;: {       \&quot;self\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/commit/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;       },       \&quot;html\&quot;: {         \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/bbql/commits/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;       }     }   },   \&quot;attributes\&quot;: [],   \&quot;type\&quot;: \&quot;commit_file\&quot;,   \&quot;size\&quot;: 0 } &#x60;&#x60;&#x60;  File objects contain an &#x60;attributes&#x60; element that contains a list of possible modifiers. Currently defined values are:  * &#x60;link&#x60; -- indicates that the entry is a symbolic link. The contents     of the file represent the path the link points to. * &#x60;executable&#x60; -- indicates that the file has the executable bit set. * &#x60;subrepository&#x60; -- indicates that the entry points to a submodule or     subrepo. The contents of the file is the SHA1 of the repository     pointed to. * &#x60;binary&#x60; -- indicates whether Bitbucket thinks the file is binary.  This endpoint can provide an alternative to how a HEAD request can be used to check for the existence of a file, or a file&#x27;s size without incurring the overhead of receiving its full contents.   ## Directory listings  When &#x60;path&#x60; points to a directory instead of a file, the response is a paginated list of directory and file objects in the same order as the underlying SCM system would return them.  For example:  &#x60;&#x60;&#x60;javascript $ curl https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef/tests {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;path\&quot;: \&quot;tests/test_project\&quot;,       \&quot;type\&quot;: \&quot;commit_directory\&quot;,       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/test_project/\&quot;         },         \&quot;meta\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/test_project/?format&#x3D;meta\&quot;         }       },       \&quot;commit\&quot;: {         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;hash\&quot;: \&quot;eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/commit/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/bbql/commits/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;           }         }       }     },     {       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/__init__.py\&quot;         },         \&quot;meta\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/__init__.py?format&#x3D;meta\&quot;         }       },       \&quot;path\&quot;: \&quot;tests/__init__.py\&quot;,       \&quot;commit\&quot;: {         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;hash\&quot;: \&quot;eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/commit/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/atlassian/bbql/commits/eefd5ef5d3df01aed629f650959d6706d54cd335\&quot;           }         }       },       \&quot;attributes\&quot;: [],       \&quot;type\&quot;: \&quot;commit_file\&quot;,       \&quot;size\&quot;: 0     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  When listing the contents of the repo&#x27;s root directory, the use of a trailing slash at the end of the URL is required.  The response by default is not recursive, meaning that only the direct contents of a path are returned. The response does not recurse down into subdirectories. In order to \&quot;walk\&quot; the entire directory tree, the client can either parse each response and follow the &#x60;self&#x60; links of each &#x60;commit_directory&#x60; object, or can specify a &#x60;max_depth&#x60; to recurse to.  The max_depth parameter will do a breadth-first search to return the contents of the subdirectories up to the depth specified. Breadth-first search was chosen as it leads to the least amount of file system operations for git. If the &#x60;max_depth&#x60; parameter is specified to be too large, the call will time out and return a 555.  Each returned object is either a &#x60;commit_file&#x60;, or a &#x60;commit_directory&#x60;, both of which contain a &#x60;path&#x60; element. This path is the absolute path from the root of the repository. Each object also contains a &#x60;commit&#x60; object which embeds the commit the file is on. Note that this is merely the commit that was used in the URL. It is *not* the commit that last modified the file.  Directory objects have 2 representations. Their &#x60;self&#x60; link returns the paginated contents of the directory. The &#x60;meta&#x60; link on the other hand returns the actual &#x60;directory&#x60; object itself, e.g.:  &#x60;&#x60;&#x60;javascript {   \&quot;path\&quot;: \&quot;tests/test_project\&quot;,   \&quot;type\&quot;: \&quot;commit_directory\&quot;,   \&quot;links\&quot;: {     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/test_project/\&quot;     },     \&quot;meta\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src/eefd5ef5d3df01aed629f650959d6706d54cd335/tests/test_project/?format&#x3D;meta\&quot;     }   },   \&quot;commit\&quot;: { ... } } &#x60;&#x60;&#x60;  ## Querying, filtering and sorting  Like most API endpoints, this API supports the Bitbucket querying/filtering syntax and so you could filter a directory listing to only include entries that match certain criteria. For instance, to list all binary files over 1kb use the expression:  &#x60;size &gt; 1024 and attributes &#x3D; \&quot;binary\&quot;&#x60;  which after urlencoding yields the query string:  &#x60;?q&#x3D;size%3E1024+and+attributes%3D%22binary%22&#x60;  To change the ordering of the response, use the &#x60;?sort&#x60; parameter:  &#x60;.../src/eefd5ef/?sort&#x3D;-size&#x60;  See [filtering and sorting](../../../../../../meta/filtering) for more details.
     * <p><b>200</b> - If the path matches a file, then the raw contents of the file are returned.  If the &#x60;format&#x3D;meta&#x60; query parameter is provided, a json document containing the file&#x27;s meta data is returned.  If the &#x60;format&#x3D;rendered&#x60; query parameter is provided, the contents of the file in HTML-formated rendered markup is returned. If the path matches a directory, then a paginated list of file and directory entries is returned (if the &#x60;format&#x3D;meta&#x60; query parameter was provided, then the json document containing the directory&#x27;s meta data is returned.)
     * <p><b>404</b> - If the path or commit in the URL does not exist.
     * <p><b>555</b> - If the call times out, possibly because the specifiedrecursion depth is too large.
     *
     * @param node      The node parameter
     * @param path      The path parameter
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param format    If &#x27;meta&#x27; is provided, returns the (json) meta data for the contents of the file.  If &#x27;rendered&#x27; is provided, returns the contents of a non-binary file in HTML-formatted rendered markup. Since Git and Mercurial do not generally track what text encoding scheme is used, this endpoint attempts to detect the most appropriate character encoding. While usually correct, determining the character encoding can be ambiguous which in exceptional cases can lead to misinterpretation of the characters. As such, the raw element in the response object should not be treated as equivalent to the file&#x27;s actual contents.
     * @param q         Optional filter expression as per [filtering and sorting](../../../../../../meta/filtering).
     * @param sort      Optional sorting parameter as per [filtering and sorting](../../../../../../meta/filtering#query-sort).
     * @param maxDepth  If provided, returns the contents of the repository and its subdirectories recursively until the specified max_depth of nested directories. When omitted, this defaults to 1.
     * @return PaginatedTreeentries
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedTreeentries repositoriesWorkspaceRepoSlugSrcNodePathGet(String node, String path, String repoSlug, String workspace, String format, String q, String sort, Integer maxDepth) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugSrcNodePathGet");
        }
        // verify the required parameter 'path' is set
        if (path == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'path' when calling repositoriesWorkspaceRepoSlugSrcNodePathGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugSrcNodePathGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugSrcNodePathGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("path", path);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/src/{node}/{path}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "format", format));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max_depth", maxDepth));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<PaginatedTreeentries> returnType = new ParameterizedTypeReference<PaginatedTreeentries>() {
        };
        return apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * This endpoint is used to create new commits in the repository by uploading files.  To add a new file to a repository:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/username/slug/src \\   -F /repo/path/to/image.png&#x3D;@image.png &#x60;&#x60;&#x60;  This will create a new commit on top of the main branch, inheriting the contents of the main branch, but adding (or overwriting) the &#x60;image.png&#x60; file to the repository in the &#x60;/repo/path/to&#x60; directory.  To create a commit that deletes files, use the &#x60;files&#x60; parameter:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/username/slug/src \\   -F files&#x3D;/file/to/delete/1.txt \\   -F files&#x3D;/file/to/delete/2.txt &#x60;&#x60;&#x60;  You can add/modify/delete multiple files in a request. Rename/move a file by deleting the old path and adding the content at the new path.  This endpoint accepts &#x60;multipart/form-data&#x60; (as in the examples above), as well as &#x60;application/x-www-form-urlencoded&#x60;.  ## multipart/form-data  A &#x60;multipart/form-data&#x60; post contains a series of \&quot;form fields\&quot; that identify both the individual files that are being uploaded, as well as additional, optional meta data.  Files are uploaded in file form fields (those that have a &#x60;Content-Disposition&#x60; parameter) whose field names point to the remote path in the repository where the file should be stored. Path field names are always interpreted to be absolute from the root of the repository, regardless whether the client uses a leading slash (as the above &#x60;curl&#x60; example did).  File contents are treated as bytes and are not decoded as text.  The commit message, as well as other non-file meta data for the request, is sent along as normal form field elements. Meta data fields share the same namespace as the file objects. For &#x60;multipart/form-data&#x60; bodies that should not lead to any ambiguity, as the &#x60;Content-Disposition&#x60; header will contain the &#x60;filename&#x60; parameter to distinguish between a file named \&quot;message\&quot; and the commit message field.  ## application/x-www-form-urlencoded  It is also possible to upload new files using a simple &#x60;application/x-www-form-urlencoded&#x60; POST. This can be convenient when uploading pure text files:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/atlassian/bbql/src \\   --data-urlencode \&quot;/path/to/me.txt&#x3D;Lorem ipsum.\&quot; \\   --data-urlencode \&quot;message&#x3D;Initial commit\&quot; \\   --data-urlencode \&quot;author&#x3D;Erik van Zijst &lt;erik.van.zijst@gmail.com&gt;\&quot; &#x60;&#x60;&#x60;  There could be a field name clash if a client were to upload a file named \&quot;message\&quot;, as this filename clashes with the meta data property for the commit message. To avoid this and to upload files whose names clash with the meta data properties, use a leading slash for the files, e.g. &#x60;curl --data-urlencode \&quot;/message&#x3D;file contents\&quot;&#x60;.  When an explicit slash is omitted for a file whose path matches that of a meta data parameter, then it is interpreted as meta data, not as a file.  ## Executables and links  While this API aims to facilitate the most common use cases, it is possible to perform some more advanced operations like creating a new symlink in the repository, or creating an executable file.  Files can be supplied with a &#x60;x-attributes&#x60; value in the &#x60;Content-Disposition&#x60; header. For example, to upload an executable file, as well as create a symlink from &#x60;README.txt&#x60; to &#x60;README&#x60;:  &#x60;&#x60;&#x60; --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D; Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot; MIME-Version: 1.0 Content-Transfer-Encoding: 7bit Content-ID: \&quot;bin/shutdown.sh\&quot; Content-Disposition: attachment; filename&#x3D;\&quot;shutdown.sh\&quot;; x-attributes:\&quot;executable\&quot;  #!/bin/sh halt  --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D; Content-Type: text/plain; charset&#x3D;\&quot;us-ascii\&quot; MIME-Version: 1.0 Content-Transfer-Encoding: 7bit Content-ID: \&quot;/README.txt\&quot; Content-Disposition: attachment; filename&#x3D;\&quot;README.txt\&quot;; x-attributes:\&quot;link\&quot;  README --&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;&#x3D;1438169132528273974&#x3D;&#x3D;-- &#x60;&#x60;&#x60;  Links are files that contain the target path and have &#x60;x-attributes:\&quot;link\&quot;&#x60; set.  When overwriting links with files, or vice versa, the newly uploaded file determines both the new contents, as well as the attributes. That means uploading a file without specifying &#x60;x-attributes&#x3D;\&quot;link\&quot;&#x60; will create a regular file, even if the parent commit hosted a symlink at the same path.  The same applies to executables. When modifying an existing executable file, the form-data file element must include &#x60;x-attributes&#x3D;\&quot;executable\&quot;&#x60; in order to preserve the executable status of the file.  Note that this API does not support the creation or manipulation of subrepos / submodules.
     * <p><b>201</b>
     * <p><b>403</b> - If the authenticated user does not have write or admin access
     * <p><b>404</b> - If the repository does not exist.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @param message   The commit message. When omitted, Bitbucket uses a canned string.
     * @param author    The raw string to be used as the new commit&#x27;s author. This string follows the format &#x60;Erik van Zijst &lt;evzijst@atlassian.com&gt;&#x60;.  When omitted, Bitbucket uses the authenticated user&#x27;s full/display name and primary email address. Commits cannot be created anonymously.
     * @param parents   A comma-separated list of SHA1s of the commits that should be the parents of the newly created commit.  When omitted, the new commit will inherit from and become a child of the main branch&#x27;s tip/HEAD commit.  When more than one SHA1 is provided, the first SHA1 identifies the commit from which the content will be inherited.  When more than 2 parents are provided on a Mercurial repo, a 400 is returned as Mercurial does not support \&quot;octopus merges\&quot;.
     * @param files     Optional field that declares the files that the request is manipulating. When adding a new file to a repo, or when overwriting an existing file, the client can just upload the full contents of the file in a normal form field and the use of this &#x60;files&#x60; meta data field is redundant. However, when the &#x60;files&#x60; field contains a file path that does not have a corresponding, identically-named form field, then Bitbucket interprets that as the client wanting to replace the named file with the null set and the file is deleted instead.  Paths in the repo that are referenced in neither files nor an individual file field, remain unchanged and carry over from the parent to the new commit.  This API does not support renaming as an explicit feature. To rename a file, simply delete it and recreate it under the new name in the same commit.
     * @param branch    The name of the branch that the new commit should be created on. When omitted, the commit will be created on top of the main branch and will become the main branch&#x27;s new head.  When a branch name is provided that already exists in the repo, then the commit will be created on top of that branch. In this case, *if* a parent SHA1 was also provided, then it is asserted that the parent is the branch&#x27;s tip/HEAD at the time the request is made. When this is not the case, a 409 is returned.  This API cannot be used to create new anonymous heads in Mercurial repositories.  When a new branch name is specified (that does not already exist in the repo), and no parent SHA1s are provided, then the new commit will inherit from the current main branch&#x27;s tip/HEAD commit, but not advance the main branch. The new commit will be the new branch. When the request *also* specifies a parent SHA1, then the new commit and branch are created directly on top of the parent commit, regardless of the state of the main branch.  When a branch name is not specified, but a parent SHA1 is provided, then Bitbucket asserts that it represents the main branch&#x27;s current HEAD/tip, or a 409 is returned.  When a branch name is not specified and the repo is empty, the new commit will become the repo&#x27;s root commit and will be on the main branch.  When a branch name is specified and the repo is empty, the new commit will become the repo&#x27;s root commit and also define the repo&#x27;s main branch going forward.  This API cannot be used to create additional root commits in non-empty repos.  The branch field cannot be repeated.  As a side effect, this API can be used to create a new branch without modifying any files, by specifying a new branch name in this field, together with &#x60;parents&#x60;, but omitting the &#x60;files&#x60; fields, while not sending any files. This will create a new commit and branch with the same contents as the first parent. The diff of this commit against its first parent will be empty.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugSrcPost(String repoSlug, String workspace, String message, String author, String parents, String files, String branch, LinkedMultiValueMap<String, Object> formParams) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugSrcPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugSrcPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/src").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        headerParams.setContentType(MediaType.MULTIPART_FORM_DATA);



        if (formParams == null) formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "message", message));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "author", author));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parents", parents));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "files", files));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "branch", branch));

        final String[] accepts = {
                "multipart/form-data"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {"multipart/form-data"};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);






    }

    /**
     * Returns a paginated list of all the watchers on the specified repository.
     * <p><b>200</b> - A paginated list of all the watchers on the specified repository.
     *
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugWatchersGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugWatchersGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugWatchersGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/watchers").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {};
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key", "basic", "oauth2"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Returns an object for each repository the caller has explicit access to and their effective permission — the highest level of permission the caller has. This does not return public repositories that the user was not granted any specific permission in, and does not distinguish between direct and indirect privileges.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/user/permissions/repositories  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by repository or permission by adding the following query string parameters:  * &#x60;q&#x3D;repository.name&#x3D;\&quot;geordi\&quot;&#x60; or &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;repository.name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - Repository permissions for the repositories a caller has explicit access to.
     *
     * @param q    Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
     * @param sort Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort).
     * @return PaginatedRepositoryPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositoryPermissions userPermissionsRepositoriesGet(String q, String sort) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/permissions/repositories").build().toUriString();

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

        ParameterizedTypeReference<PaginatedRepositoryPermissions> returnType = new ParameterizedTypeReference<PaginatedRepositoryPermissions>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
