package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.ExportOptions;
import com.rappi.bitbucket.client.model.IssueJobStatus;
import com.rappi.bitbucket.client.model.PaginatedDiffstats;
import com.rappi.bitbucket.client.model.PaginatedRepositoryPermissions;
import com.rappi.bitbucket.client.model.PaginatedTeamPermissions;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
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
     * Returns the diff stat for the specified commit.  Diff stat responses contain a record for every path modified by the commit and lists the number of lines added and removed for each file.   Example: &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/diffstat/d222fa2..e174964 {     \&quot;pagelen\&quot;: 500,     \&quot;values\&quot;: [         {             \&quot;type\&quot;: \&quot;diffstat\&quot;,             \&quot;status\&quot;: \&quot;modified\&quot;,             \&quot;lines_removed\&quot;: 1,             \&quot;lines_added\&quot;: 2,             \&quot;old\&quot;: {                 \&quot;path\&quot;: \&quot;setup.py\&quot;,                 \&quot;escaped_path\&quot;: \&quot;setup.py\&quot;,                 \&quot;type\&quot;: \&quot;commit_file\&quot;,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/src/e1749643d655d7c7014001a6c0f58abaf42ad850/setup.py\&quot;                     }                 }             },             \&quot;new\&quot;: {                 \&quot;path\&quot;: \&quot;setup.py\&quot;,                 \&quot;escaped_path\&quot;: \&quot;setup.py\&quot;,                 \&quot;type\&quot;: \&quot;commit_file\&quot;,                 \&quot;links\&quot;: {                     \&quot;self\&quot;: {                         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/src/d222fa235229c55dad20b190b0b571adf737d5a6/setup.py\&quot;                     }                 }             }         }     ],     \&quot;page\&quot;: 1,     \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The diff stats
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param spec A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;). 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param ignoreWhitespace Generate diffs that ignore whitespace
     * @param merge If true, the source commit is merged into the destination commit, and then a diffstat from the destination to the merge result is returned. If false, a simple &#x27;two dot&#x27; diffstat between the source and destination is returned. True if omitted.
     * @param path Limit the diffstat to a particular file (this parameter can be repeated for multiple paths).
     * @param renames Whether to perform rename detection, true if omitted.
     * @return PaginatedDiffstats
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedDiffstats repositoriesWorkspaceRepoSlugDiffstatSpecGet(String repoSlug, String spec, String workspace, Boolean ignoreWhitespace, Boolean merge, String path, Boolean renames) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDiffstatSpecGet");
        }
        // verify the required parameter 'spec' is set
        if (spec == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'spec' when calling repositoriesWorkspaceRepoSlugDiffstatSpecGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDiffstatSpecGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("spec", spec);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/diffstat/{spec}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ignore_whitespace", ignoreWhitespace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merge", merge));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "path", path));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "renames", renames));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<PaginatedDiffstats> returnType = new ParameterizedTypeReference<PaginatedDiffstats>() {};
        return apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * A POST request to this endpoint initiates a new background celery task that archives the repo&#x27;s issues.  For example, you can run:  curl -u &lt;username&gt; -X POST http://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/ issues/export  When the job has been accepted, it will return a 202 (Accepted) along with a unique url to this job in the &#x27;Location&#x27; response header. This url is the endpoint for where the user can obtain their zip files.\&quot;
     * <p><b>202</b> - The export job has been accepted
     * <p><b>401</b> - The request wasn&#x27;t authenticated properly
     * <p><b>403</b> - When the authenticated user does not have admin permission on the repo
     * <p><b>404</b> - The repo does not exist or does not have an issue tracker
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param body The options to apply to the export. Available options include &#x60;project_key&#x60; and &#x60;project_name&#x60; which, if specified, are used as the project key and name in the exported Jira json format. Option &#x60;send_email&#x60; specifies whether an email should be sent upon export result. Option &#x60;include_attachments&#x60; specifies whether attachments are included in the export.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugIssuesExportPost(String repoSlug, String workspace, ExportOptions body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesExportPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesExportPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/export").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * This endpoint is used to poll for the progress of an issue export job and return the zip file after the job is complete. As long as the job is running, this will return a 200 response with in the response body a description of the current status.  After the job has been scheduled, but before it starts executing, this endpoint&#x27;s response is:  {  \&quot;type\&quot;: \&quot;issue_job_status\&quot;,  \&quot;status\&quot;: \&quot;ACCEPTED\&quot;,  \&quot;phase\&quot;: \&quot;Initializing\&quot;,  \&quot;total\&quot;: 0,  \&quot;count\&quot;: 0,  \&quot;pct\&quot;: 0 }   Then once it starts running, it becomes:  {  \&quot;type\&quot;: \&quot;issue_job_status\&quot;,  \&quot;status\&quot;: \&quot;STARTED\&quot;,  \&quot;phase\&quot;: \&quot;Attachments\&quot;,  \&quot;total\&quot;: 15,  \&quot;count\&quot;: 11,  \&quot;pct\&quot;: 73 }  Once the job has successfully completed, it returns a stream of the zip file.
     * <p><b>202</b> - Export job accepted
     * <p><b>401</b> - The request wasn&#x27;t authenticated properly
     * <p><b>403</b> - When the authenticated user does not have admin permission on the repo
     * <p><b>404</b> - No export job has begun
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param repoName The name of the repo
     * @param taskId The ID of the export task
     * @return IssueJobStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueJobStatus repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet(String repoSlug, String workspace, String repoName, String taskId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet");
        }
        // verify the required parameter 'repoName' is set
        if (repoName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoName' when calling repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet");
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling repositoriesWorkspaceRepoSlugIssuesExportRepoNameIssuesTaskIdZipGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        uriVariables.put("repo_name", repoName);
        uriVariables.put("task_id", taskId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/export/{repo_name}-issues-{task_id}.zip").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<IssueJobStatus> returnType = new ParameterizedTypeReference<IssueJobStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * When using GET, this endpoint reports the status of the current import task. Request example:  &#x60;&#x60;&#x60; $ curl -u &lt;username&gt; -X GET https://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/issues/import &#x60;&#x60;&#x60;  After the job has been scheduled, but before it starts executing, this endpoint&#x27;s response is:  &#x60;&#x60;&#x60; &lt; HTTP/1.1 202 Accepted {     \&quot;type\&quot;: \&quot;issue_job_status\&quot;,     \&quot;status\&quot;: \&quot;PENDING\&quot;,     \&quot;phase\&quot;: \&quot;Attachments\&quot;,     \&quot;total\&quot;: 15,     \&quot;count\&quot;: 0,     \&quot;percent\&quot;: 0 } &#x60;&#x60;&#x60;  Once it starts running, it is a 202 response with status STARTED and progress filled.  After it is finished, it becomes a 200 response with status SUCCESS or FAILURE.
     * <p><b>200</b> - Import job complete with either FAILURE or SUCCESS status
     * <p><b>202</b> - Import job started
     * <p><b>401</b> - The request wasn&#x27;t authenticated properly
     * <p><b>403</b> - When the authenticated user does not have admin permission on the repo
     * <p><b>404</b> - No export job has begun
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return IssueJobStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueJobStatus repositoriesWorkspaceRepoSlugIssuesImportGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesImportGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesImportGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/import").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<IssueJobStatus> returnType = new ParameterizedTypeReference<IssueJobStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * A POST request to this endpoint will import the zip file given by the archive parameter into the repository. All existing issues will be deleted and replaced by the contents of the imported zip file.  Imports are done through a multipart/form-data POST. There is one valid and required form field, with the name \&quot;archive,\&quot; which needs to be a file field:  &#x60;&#x60;&#x60; $ curl -u &lt;username&gt; -X POST -F archive&#x3D;@/path/to/file.zip https://api.bitbucket.org/2.0/repositories/&lt;owner_username&gt;/&lt;repo_slug&gt;/issues/import &#x60;&#x60;&#x60;  When the import job is accepted, here is example output:  &#x60;&#x60;&#x60; &lt; HTTP/1.1 202 Accepted  {     \&quot;type\&quot;: \&quot;issue_job_status\&quot;,     \&quot;status\&quot;: \&quot;ACCEPTED\&quot;,     \&quot;phase\&quot;: \&quot;Attachments\&quot;,     \&quot;total\&quot;: 15,     \&quot;count\&quot;: 0,     \&quot;percent\&quot;: 0 } &#x60;&#x60;&#x60;
     * <p><b>202</b> - Import job accepted
     * <p><b>401</b> - The request wasn&#x27;t authenticated properly
     * <p><b>403</b> - When the authenticated user does not have admin permission on the repo
     * <p><b>404</b> - No export job has begun
     * <p><b>409</b> - Import already running
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return IssueJobStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueJobStatus repositoriesWorkspaceRepoSlugIssuesImportPost(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugIssuesImportPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugIssuesImportPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/issues/import").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<IssueJobStatus> returnType = new ParameterizedTypeReference<IssueJobStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidLogsLogUuidGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/logs/{log_uuid}").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports/test_cases").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPipelinesPipelineUuidStepsStepUuidTestReportsTestCasesTestCaseUuidTestCaseReasonsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/pipelines/{pipeline_uuid}/steps/{step_uuid}/test_reports/test_cases/{test_case_uuid}/test_case_reasons").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for each team permission a user on the team has.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  Permissions returned are effective permissions — if a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;admin&#x60; * &#x60;collaborator&#x60;  Only users with admin permission for the team may access this resource.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;permission\&quot;: \&quot;admin\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     },     {       \&quot;permission\&quot;: \&quot;collaborator\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;seanaty\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by team, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;user.uuid&#x3D;\&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;admin\&quot;&#x60; * &#x60;sort&#x3D;team.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - Repositories owned by a team.
     * <p><b>403</b> - The requesting user isn&#x27;t an admin of the team.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort). 
     * @return PaginatedTeamPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedTeamPermissions teamsUsernamePermissionsGet(String username, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernamePermissionsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/permissions").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedTeamPermissions> returnType = new ParameterizedTypeReference<PaginatedTeamPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for each repository permission for all of a team’s repositories.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  If the username URL parameter refers to a user account instead of a team account, an object containing the repository permissions of all the username&#x27;s repositories will be returned.  Permissions returned are effective permissions — the highest level of permission the user has. This does not include public repositories that users are not granted any specific permission in, and does not distinguish between direct and indirect privileges.  Only users with admin permission for the team may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions/repositories  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by repository, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;repository.name&#x3D;\&quot;geordi\&quot;&#x60; or &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - List of team&#x27;s repository permissions.
     * <p><b>403</b> - The requesting user isn&#x27;t an admin of the team.
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
     * @return PaginatedRepositoryPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositoryPermissions teamsUsernamePermissionsRepositoriesGet(String username, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernamePermissionsRepositoriesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/permissions/repositories").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedRepositoryPermissions> returnType = new ParameterizedTypeReference<PaginatedRepositoryPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for each repository permission of a given repository.  This endpoint has been deprecated, and you should use the new workspaces endpoint. For more information, see [the announcement](https://developer.atlassian.com/cloud/bitbucket/bitbucket-api-teams-deprecation/).\&quot;  If the username URL parameter refers to a user account instead of a team account, an object containing the repository permissions of the username&#x27;s repository will be returned.  Permissions returned are effective permissions — the highest level of permission the user has. This does not include public repositories that users are not granted any specific permission in, and does not distinguish between direct and indirect privileges.  Only users with admin permission for the repository may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/teams/atlassian_tutorial/permissions/repositories/geordi  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - List of repository&#x27;s repository permissions.
     * <p><b>403</b> - The requesting user isn&#x27;t an admin of the repository.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param username This can either be the username or the UUID of the account, surrounded by curly-braces, for example: &#x60;{account UUID}&#x60;. An account is either a team or user. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
     * @return PaginatedRepositoryPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositoryPermissions teamsUsernamePermissionsRepositoriesRepoSlugGet(String repoSlug, String username, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling teamsUsernamePermissionsRepositoriesRepoSlugGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling teamsUsernamePermissionsRepositoriesRepoSlugGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/permissions/repositories/{repo_slug}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedRepositoryPermissions> returnType = new ParameterizedTypeReference<PaginatedRepositoryPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for each team the caller is a member of, and their effective role — the highest level of privilege the caller has. If a user is a member of multiple groups with distinct roles, only the highest level is returned.  Permissions can be:  * &#x60;admin&#x60; * &#x60;collaborator&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/user/permissions/teams  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;permission\&quot;: \&quot;admin\&quot;,       \&quot;type\&quot;: \&quot;team_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;nickname\&quot;: \&quot;evzijst\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;team\&quot;: {         \&quot;display_name\&quot;: \&quot;Atlassian Bitbucket\&quot;,         \&quot;uuid\&quot;: \&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;       }     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../meta/filtering) by team or permission by adding the following query string parameters:  * &#x60;q&#x3D;team.uuid&#x3D;\&quot;{4cc6108a-a241-4db0-96a5-64347ac04f87}\&quot;&#x60; or &#x60;q&#x3D;permission&#x3D;\&quot;admin\&quot;&#x60; * &#x60;sort&#x3D;team.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - Team permissions for the teams a caller is a member of.
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../meta/filtering#query-sort). 
     * @return PaginatedTeamPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedTeamPermissions userPermissionsTeamsGet(String q, String sort) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/user/permissions/teams").build().toUriString();
        
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

        ParameterizedTypeReference<PaginatedTeamPermissions> returnType = new ParameterizedTypeReference<PaginatedTeamPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for each repository permission for all of a workspace&#x27;s repositories.  Permissions returned are effective permissions: the highest level of permission the user has. This does not distinguish between direct and indirect (group) privileges.  Only users with admin permission for the team may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces/atlassian_tutorial/permissions/repositories  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Jeff Zeng\&quot;,         \&quot;uuid\&quot;: \&quot;{47f92a9a-c3a3-4d0b-bc4e-782a969c5c72}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;whee\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/whee\&quot;,         \&quot;uuid\&quot;: \&quot;{30ba25e9-51ff-4555-8dd0-fc7ee2fa0895}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 3 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by repository, user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;repository.name&#x3D;\&quot;geordi\&quot;&#x60; or &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - List of workspace&#x27;s repository permissions.
     * <p><b>403</b> - The requesting user isn&#x27;t an admin of the workspace.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
     * @return PaginatedRepositoryPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositoryPermissions workspacesWorkspacePermissionsRepositoriesGet(String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspacePermissionsRepositoriesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/permissions/repositories").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedRepositoryPermissions> returnType = new ParameterizedTypeReference<PaginatedRepositoryPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns an object for the repository permission of each user in the requested repository.  Permissions returned are effective permissions: the highest level of permission the user has. This does not distinguish between direct and indirect (group) privileges.  Only users with admin permission for the repository may access this resource.  Permissions can be:  * &#x60;admin&#x60; * &#x60;write&#x60; * &#x60;read&#x60;  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/workspaces/atlassian_tutorial/permissions/repositories/geordi  {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Erik van Zijst\&quot;,         \&quot;uuid\&quot;: \&quot;{d301aafa-d676-4ee0-88be-962be7417567}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;admin\&quot;     },     {       \&quot;type\&quot;: \&quot;repository_permission\&quot;,       \&quot;user\&quot;: {         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Conaty\&quot;,         \&quot;uuid\&quot;: \&quot;{504c3b62-8120-4f0c-a7bc-87800b9d6f70}\&quot;       },       \&quot;repository\&quot;: {         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;full_name\&quot;: \&quot;atlassian_tutorial/geordi\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;       },       \&quot;permission\&quot;: \&quot;write\&quot;     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Results may be further [filtered or sorted](../../../../meta/filtering) by user, or permission by adding the following query string parameters:  * &#x60;q&#x3D;permission&gt;\&quot;read\&quot;&#x60; * &#x60;sort&#x3D;user.display_name&#x60;  Note that the query parameter values need to be URL escaped so that &#x60;&#x3D;&#x60; would become &#x60;%3D&#x60;.
     * <p><b>200</b> - The respository permission for all users in this repository.
     * <p><b>403</b> - The requesting user isn&#x27;t an admin of the repository.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort  Name of a response property sort the result by as per [filtering and sorting](../../../../meta/filtering#query-sort). 
     * @return PaginatedRepositoryPermissions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRepositoryPermissions workspacesWorkspacePermissionsRepositoriesRepoSlugGet(String repoSlug, String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling workspacesWorkspacePermissionsRepositoriesRepoSlugGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling workspacesWorkspacePermissionsRepositoriesRepoSlugGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/permissions/repositories/{repo_slug}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedRepositoryPermissions> returnType = new ParameterizedTypeReference<PaginatedRepositoryPermissions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
