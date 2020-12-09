package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Commit;
import com.rappi.bitbucket.client.model.CommitComment;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedAnnotations;
import com.rappi.bitbucket.client.model.PaginatedCommitComments;
import com.rappi.bitbucket.client.model.PaginatedReports;
import com.rappi.bitbucket.client.model.Participant;
import com.rappi.bitbucket.client.model.Report;
import com.rappi.bitbucket.client.model.ReportAnnotation;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.CommitsApi")
public class CommitsApi {
    private ApiClient apiClient;

    public CommitsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommitsApi(ApiClient apiClient) {
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
     * Bulk upload of annotations. Annotations are individual findings that have been identified as part of a report, for example, a line of code that represents a vulnerability. These annotations can be attached to a specific file and even a specific line in that file, however, that is optional. Annotations are not mandatory and a report can contain up to 1000 annotations.  Add the annotations you want to upload as objects in a JSON array and make sure each annotation has the external_id field set to a unique value. If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-annotation001. The external id can later be used to identify the report as an alternative to the generated [UUID](https://developer.atlassian.com/bitbucket/api/2/reference/meta/uri-uuid#uuid). You can upload up to 100 annotations per POST request.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --location &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mysystem-001/annotations&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;[   {         \&quot;external_id\&quot;: \&quot;mysystem-annotation001\&quot;,         \&quot;title\&quot;: \&quot;Security scan report\&quot;,         \&quot;annotation_type\&quot;: \&quot;VULNERABILITY\&quot;,         \&quot;summary\&quot;: \&quot;This line represents a security threat.\&quot;,         \&quot;severity\&quot;: \&quot;HIGH\&quot;,       \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Main.java\&quot;,         \&quot;line\&quot;: 42   },   {         \&quot;external_id\&quot;: \&quot;mySystem-annotation002\&quot;,         \&quot;title\&quot;: \&quot;Bug report\&quot;,         \&quot;annotation_type\&quot;: \&quot;BUG\&quot;,         \&quot;result\&quot;: \&quot;FAILED\&quot;,         \&quot;summary\&quot;: \&quot;This line might introduce a bug.\&quot;,         \&quot;severity\&quot;: \&quot;MEDIUM\&quot;,       \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Helper.java\&quot;,         \&quot;line\&quot;: 13   } ]&#x27; &#x60;&#x60;&#x60;  ### Possible field values: annotation_type: VULNERABILITY, CODE_SMELL, BUG result: PASSED, FAILED, IGNORED, SKIPPED severity: HIGH, MEDIUM, LOW, CRITICAL  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 
     * <p><b>200</b> - OK
     * @param body The annotations to create or update
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit for which to retrieve reports.
     * @param reportId Uuid or external-if of the report for which to get annotations for.
     * @return List&lt;ReportAnnotation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ReportAnnotation> bulkCreateOrUpdateAnnotations(List<ReportAnnotation> body, String username, String repoSlug, String commit, String reportId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling bulkCreateOrUpdateAnnotations");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling bulkCreateOrUpdateAnnotations");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling bulkCreateOrUpdateAnnotations");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling bulkCreateOrUpdateAnnotations");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling bulkCreateOrUpdateAnnotations");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<ReportAnnotation>> returnType = new ParameterizedTypeReference<List<ReportAnnotation>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates or updates an individual annotation for the specified report. Annotations are individual findings that have been identified as part of a report, for example, a line of code that represents a vulnerability. These annotations can be attached to a specific file and even a specific line in that file, however, that is optional. Annotations are not mandatory and a report can contain up to 1000 annotations.  Just as reports, annotation needs to be uploaded with a unique ID that can later be used to identify the report as an alternative to the generated [UUID](https://developer.atlassian.com/bitbucket/api/2/reference/meta/uri-uuid#uuid). If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-annotation001.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --request PUT &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mySystem-001/annotations/mysystem-annotation001&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;{     \&quot;title\&quot;: \&quot;Security scan report\&quot;,     \&quot;annotation_type\&quot;: \&quot;VULNERABILITY\&quot;,     \&quot;summary\&quot;: \&quot;This line represents a security thread.\&quot;,     \&quot;severity\&quot;: \&quot;HIGH\&quot;,     \&quot;path\&quot;: \&quot;my-service/src/main/java/com/myCompany/mysystem/logic/Main.java\&quot;,     \&quot;line\&quot;: 42 }&#x27; &#x60;&#x60;&#x60;  ### Possible field values: annotation_type: VULNERABILITY, CODE_SMELL, BUG result: PASSED, FAILED, IGNORED, SKIPPED severity: HIGH, MEDIUM, LOW, CRITICAL  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - The provided Annotation object is malformed or incomplete.
     * @param body The annotation to create or update
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the report belongs to.
     * @param reportId Either the uuid or external-id of the report.
     * @param annotationId Either the uuid or external-id of the annotation.
     * @return ReportAnnotation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReportAnnotation createOrUpdateAnnotation(ReportAnnotation body, String username, String repoSlug, String commit, String reportId, String annotationId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createOrUpdateAnnotation");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createOrUpdateAnnotation");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createOrUpdateAnnotation");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling createOrUpdateAnnotation");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling createOrUpdateAnnotation");
        }
        // verify the required parameter 'annotationId' is set
        if (annotationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'annotationId' when calling createOrUpdateAnnotation");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        uriVariables.put("annotationId", annotationId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReportAnnotation> returnType = new ParameterizedTypeReference<ReportAnnotation>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates or updates a report for the specified commit. To upload a report, make sure to generate an ID that is unique across all reports for that commit. If you want to use an existing id from your own system, we recommend prefixing it with your system&#x27;s name to avoid collisions, for example, mySystem-001.  ### Sample cURL request: &#x60;&#x60;&#x60; curl --request PUT &#x27;https://api.bitbucket.org/2.0/repositories/&lt;username&gt;/&lt;reposity-name&gt;/commit/&lt;commit-hash&gt;/reports/mysystem-001&#x27; \\ --header &#x27;Content-Type: application/json&#x27; \\ --data-raw &#x27;{     \&quot;title\&quot;: \&quot;Security scan report\&quot;,     \&quot;details\&quot;: \&quot;This pull request introduces 10 new dependency vulnerabilities.\&quot;,     \&quot;report_type\&quot;: \&quot;SECURITY\&quot;,     \&quot;reporter\&quot;: \&quot;mySystem\&quot;,     \&quot;link\&quot;: \&quot;http://www.mysystem.com/reports/001\&quot;,     \&quot;result\&quot;: \&quot;FAILED\&quot;,     \&quot;data\&quot;: [         {             \&quot;title\&quot;: \&quot;Duration (seconds)\&quot;,             \&quot;type\&quot;: \&quot;DURATION\&quot;,             \&quot;value\&quot;: 14         },         {             \&quot;title\&quot;: \&quot;Safe to merge?\&quot;,             \&quot;type\&quot;: \&quot;BOOLEAN\&quot;,             \&quot;value\&quot;: false         }     ] }&#x27; &#x60;&#x60;&#x60;  ### Possible field values: report_type: SECURITY, COVERAGE, TEST, BUG result: PASSED, FAILED, PENDING data.type: BOOLEAN, DATE, DURATION, LINK, NUMBER, PERCENTAGE, TEXT  Please refer to the [Code Insights documentation](https://confluence.atlassian.com/bitbucket/code-insights-994316785.html) for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - The provided Report object is malformed or incomplete.
     * @param body The report to create or update
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the report belongs to.
     * @param reportId Either the uuid or external-id of the report.
     * @return Report
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Report createOrUpdateReport(Report body, String username, String repoSlug, String commit, String reportId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createOrUpdateReport");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling createOrUpdateReport");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling createOrUpdateReport");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling createOrUpdateReport");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling createOrUpdateReport");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Report> returnType = new ParameterizedTypeReference<Report>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes a single Annotation matching the provided ID.
     * <p><b>204</b> - No content
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the annotation belongs to.
     * @param reportId Either the uuid or external-id of the annotation.
     * @param annotationId Either the uuid or external-id of the annotation.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAnnotation(String username, String repoSlug, String commit, String reportId, String annotationId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteAnnotation");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteAnnotation");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling deleteAnnotation");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling deleteAnnotation");
        }
        // verify the required parameter 'annotationId' is set
        if (annotationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'annotationId' when calling deleteAnnotation");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        uriVariables.put("annotationId", annotationId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Deletes a single Report matching the provided ID.
     * <p><b>204</b> - No content
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the report belongs to.
     * @param reportId Either the uuid or external-id of the report.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteReport(String username, String repoSlug, String commit, String reportId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteReport");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling deleteReport");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling deleteReport");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling deleteReport");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single Annotation matching the provided ID.
     * <p><b>200</b> - OK
     * <p><b>404</b> - The annotation with the given ID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the report belongs to.
     * @param reportId Either the uuid or external-id of the report.
     * @param annotationId Either the uuid or external-id of the annotation.
     * @return ReportAnnotation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReportAnnotation getAnnotation(String username, String repoSlug, String commit, String reportId, String annotationId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getAnnotation");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getAnnotation");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getAnnotation");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling getAnnotation");
        }
        // verify the required parameter 'annotationId' is set
        if (annotationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'annotationId' when calling getAnnotation");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        uriVariables.put("annotationId", annotationId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations/{annotationId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReportAnnotation> returnType = new ParameterizedTypeReference<ReportAnnotation>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of Annotations for a specified report.
     * <p><b>200</b> - OK
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit for which to retrieve reports.
     * @param reportId Uuid or external-if of the report for which to get annotations for.
     * @return PaginatedAnnotations
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedAnnotations getAnnotationsForReport(String username, String repoSlug, String commit, String reportId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getAnnotationsForReport");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getAnnotationsForReport");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getAnnotationsForReport");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling getAnnotationsForReport");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}/annotations").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedAnnotations> returnType = new ParameterizedTypeReference<PaginatedAnnotations>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a single Report matching the provided ID.
     * <p><b>200</b> - OK
     * <p><b>404</b> - The report with the given ID was not found.
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit the report belongs to.
     * @param reportId Either the uuid or external-id of the report.
     * @return Report
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Report getReport(String username, String repoSlug, String commit, String reportId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getReport");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getReport");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getReport");
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reportId' when calling getReport");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        uriVariables.put("reportId", reportId);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports/{reportId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Report> returnType = new ParameterizedTypeReference<Report>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns a paginated list of Reports linked to this commit.
     * <p><b>200</b> - OK
     * @param username The account.
     * @param repoSlug The repository.
     * @param commit The commit for which to retrieve reports.
     * @return PaginatedReports
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedReports getReportsForCommit(String username, String repoSlug, String commit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getReportsForCommit");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling getReportsForCommit");
        }
        // verify the required parameter 'commit' is set
        if (commit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commit' when calling getReportsForCommit");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("commit", commit);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{commit}/reports").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedReports> returnType = new ParameterizedTypeReference<PaginatedReports>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Redact the authenticated user&#x27;s approval of the specified commit.  This operation is only available to users that have explicit access to the repository. In contrast, just the fact that a repository is publicly accessible to users does not give them the ability to approve commits.
     * <p><b>204</b> - An empty response indicating the authenticated user&#x27;s approval has been withdrawn.
     * <p><b>404</b> - If the specified commit, or the repository does not exist.
     * @param node The commit&#x27;s SHA1.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugCommitNodeApproveDelete(String node, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeApproveDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeApproveDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeApproveDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/approve").buildAndExpand(uriVariables).toUriString();
        
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
     * Approve the specified commit as the authenticated user.  This operation is only available to users that have explicit access to the repository. In contrast, just the fact that a repository is publicly accessible to users does not give them the ability to approve commits.
     * <p><b>200</b> - The &#x60;participant&#x60; object recording that the authenticated user approved the commit.
     * <p><b>404</b> - If the specified commit, or the repository does not exist.
     * @param node The commit&#x27;s SHA1.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Participant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Participant repositoriesWorkspaceRepoSlugCommitNodeApprovePost(String node, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeApprovePost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeApprovePost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeApprovePost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/approve").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the specified commit comment.
     * <p><b>200</b> - The commit comment.
     * @param commentId The id of the comment.
     * @param node The commit&#x27;s SHA1.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return CommitComment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommitComment repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet(Integer commentId, String node, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet");
        }
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsCommentIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("comment_id", commentId);
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/comments/{comment_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CommitComment> returnType = new ParameterizedTypeReference<CommitComment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the commit&#x27;s comments.  This includes both global and inline comments.  The default sorting is oldest to newest and can be overridden with the &#x60;sort&#x60; query parameter.
     * <p><b>200</b> - A paginated list of commit comments.
     * @param node The commit&#x27;s SHA1.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param q Query string to narrow down the response as per [filtering and sorting](../../../../../../meta/filtering). 
     * @param sort Field by which the results should be sorted as per [filtering and sorting](../../../../../../meta/filtering). 
     * @return PaginatedCommitComments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedCommitComments repositoriesWorkspaceRepoSlugCommitNodeCommentsGet(String node, String repoSlug, String workspace, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/comments").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedCommitComments> returnType = new ParameterizedTypeReference<PaginatedCommitComments>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates new comment on the specified commit.  To post a reply to an existing comment, include the &#x60;parent.id&#x60; field:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/atlassian/prlinks/commit/db9ba1e031d07a02603eae0e559a7adc010257fc/comments/ \\   -X POST -u evzijst \\   -H &#x27;Content-Type: application/json&#x27; \\   -d &#x27;{\&quot;content\&quot;: {\&quot;raw\&quot;: \&quot;One more thing!\&quot;},        \&quot;parent\&quot;: {\&quot;id\&quot;: 5728901}}&#x27; &#x60;&#x60;&#x60;
     * <p><b>201</b> - The newly created comment.
     * <p><b>400</b> - If the comment was detected as spam, or if the parent comment is not attached to the same node as the new comment
     * <p><b>404</b> - If a parent ID was passed in that cannot be found
     * @param body The specified comment.
     * @param node The commit&#x27;s SHA1.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param username This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;. 
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugCommitNodeCommentsPost(CommitComment body, String node, String workspace, String username, String repoSlug) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
        }
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeCommentsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}/comments").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
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
     * Returns the specified commit.  Example:  &#x60;&#x60;&#x60; $ curl https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a1 {     \&quot;rendered\&quot;: {         \&quot;message\&quot;: {         \&quot;raw\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,         \&quot;markup\&quot;: \&quot;markdown\&quot;,         \&quot;html\&quot;: \&quot;&lt;p&gt;Add a GEORDI_OUTPUT_DIR setting&lt;/p&gt;\&quot;,         \&quot;type\&quot;: \&quot;rendered\&quot;         }     },     \&quot;hash\&quot;: \&quot;f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;,     \&quot;repository\&quot;: {         \&quot;name\&quot;: \&quot;geordi\&quot;,         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;full_name\&quot;: \&quot;bitbucket/geordi\&quot;,         \&quot;links\&quot;: {             \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi\&quot;             },             \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi\&quot;             },             \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B85d08b4e-571d-44e9-a507-fa476535aa98%7D?ts&#x3D;1730260\&quot;             }         },         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;     },     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;comments\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/comments\&quot;         },         \&quot;patch\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/patch/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi/commits/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;diff\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/diff/f7591a13eda445d9a9167f98eb870319f4b6c2d8\&quot;         },         \&quot;approve\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/approve\&quot;         },         \&quot;statuses\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f7591a13eda445d9a9167f98eb870319f4b6c2d8/statuses\&quot;         }     },     \&quot;author\&quot;: {         \&quot;raw\&quot;: \&quot;Brodie Rao &lt;a@b.c&gt;\&quot;,         \&quot;type\&quot;: \&quot;author\&quot;,         \&quot;user\&quot;: {             \&quot;display_name\&quot;: \&quot;Brodie Rao\&quot;,             \&quot;uuid\&quot;: \&quot;{9484702e-c663-4afd-aefb-c93a8cd31c28}\&quot;,             \&quot;links\&quot;: {                 \&quot;self\&quot;: {                     \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/%7B9484702e-c663-4afd-aefb-c93a8cd31c28%7D\&quot;                 },                 \&quot;html\&quot;: {                     \&quot;href\&quot;: \&quot;https://bitbucket.org/%7B9484702e-c663-4afd-aefb-c93a8cd31c28%7D/\&quot;                 },                 \&quot;avatar\&quot;: {                     \&quot;href\&quot;: \&quot;https://avatar-management--avatars.us-west-2.prod.public.atl-paas.net/557058:3aae1e05-702a-41e5-81c8-f36f29afb6ca/613070db-28b0-421f-8dba-ae8a87e2a5c7/128\&quot;                 }             },             \&quot;type\&quot;: \&quot;user\&quot;,             \&quot;nickname\&quot;: \&quot;brodie\&quot;,             \&quot;account_id\&quot;: \&quot;557058:3aae1e05-702a-41e5-81c8-f36f29afb6ca\&quot;         }     },     \&quot;summary\&quot;: {         \&quot;raw\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,         \&quot;markup\&quot;: \&quot;markdown\&quot;,         \&quot;html\&quot;: \&quot;&lt;p&gt;Add a GEORDI_OUTPUT_DIR setting&lt;/p&gt;\&quot;,         \&quot;type\&quot;: \&quot;rendered\&quot;     },     \&quot;participants\&quot;: [],     \&quot;parents\&quot;: [         {             \&quot;type\&quot;: \&quot;commit\&quot;,             \&quot;hash\&quot;: \&quot;f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;,             \&quot;links\&quot;: {                 \&quot;self\&quot;: {                     \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/bitbucket/geordi/commit/f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;                 },                 \&quot;html\&quot;: {                     \&quot;href\&quot;: \&quot;https://bitbucket.org/bitbucket/geordi/commits/f06941fec4ef6bcb0c2456927a0cf258fa4f899b\&quot;                 }             }         }     ],     \&quot;date\&quot;: \&quot;2012-07-16T19:37:54+00:00\&quot;,     \&quot;message\&quot;: \&quot;Add a GEORDI_OUTPUT_DIR setting\&quot;,     \&quot;type\&quot;: \&quot;commit\&quot; } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The commit object
     * <p><b>404</b> - If the specified commit or repository does not exist.
     * @param node The commit&#x27;s SHA1.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Commit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Commit repositoriesWorkspaceRepoSlugCommitNodeGet(String node, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'node' is set
        if (node == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'node' when calling repositoriesWorkspaceRepoSlugCommitNodeGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitNodeGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitNodeGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("node", node);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commit/{node}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Commit> returnType = new ParameterizedTypeReference<Commit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * These are the repository&#x27;s commits. They are paginated and returned in reverse chronological order, similar to the output of &#x60;git log&#x60; and &#x60;hg log&#x60;. Like these tools, the DAG can be filtered.  ## GET /repositories/{workspace}/{repo_slug}/commits/  Returns all commits in the repo in topological order (newest commit first). All branches and tags are included (similar to &#x60;git log --all&#x60; and &#x60;hg log&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/master  Returns all commits on rev &#x60;master&#x60; (similar to &#x60;git log master&#x60;, &#x60;hg log master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/dev?exclude&#x3D;master  Returns all commits on ref &#x60;dev&#x60;, except those that are reachable on &#x60;master&#x60; (similar to &#x60;git log dev ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?exclude&#x3D;master  Returns all commits in the repo that are not on master (similar to &#x60;git log --all ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;fu&amp;exclude&#x3D;fubar  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;fu&#x60; or &#x60;fubar&#x60; (similar to &#x60;git log foo bar ^fu ^fubar&#x60;).  An optional &#x60;path&#x60; parameter can be specified that will limit the results to commits that affect that path. &#x60;path&#x60; can either be a file or a directory. If a directory is specified, commits are returned that have modified any file in the directory tree rooted by &#x60;path&#x60;. It is important to note that if the &#x60;path&#x60; parameter is specified, the commits returned by this endpoint may no longer be a DAG, parent commits that do not modify the path will be omitted from the response.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;README.md&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed the file README.md.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;src/&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed to a file in any file in the directory src or its children.  Because the response could include a very large number of commits, it is paginated. Follow the &#x27;next&#x27; link in the response to navigate to the next page of commits. As with other paginated resources, do not construct your own links.  When the include and exclude parameters are more than can fit in a query string, clients can use a &#x60;x-www-form-urlencoded&#x60; POST instead.
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugCommitsGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitsGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commits").buildAndExpand(uriVariables).toUriString();
        
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
     * Identical to &#x60;GET /repositories/{workspace}/{repo_slug}/commits&#x60;, except that POST allows clients to place the include and exclude parameters in the request body to avoid URL length issues.  **Note that this resource does NOT support new commit creation.**
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugCommitsPost(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commits").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * These are the repository&#x27;s commits. They are paginated and returned in reverse chronological order, similar to the output of &#x60;git log&#x60; and &#x60;hg log&#x60;. Like these tools, the DAG can be filtered.  ## GET /repositories/{workspace}/{repo_slug}/commits/  Returns all commits in the repo in topological order (newest commit first). All branches and tags are included (similar to &#x60;git log --all&#x60; and &#x60;hg log&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/master  Returns all commits on rev &#x60;master&#x60; (similar to &#x60;git log master&#x60;, &#x60;hg log master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/dev?exclude&#x3D;master  Returns all commits on ref &#x60;dev&#x60;, except those that are reachable on &#x60;master&#x60; (similar to &#x60;git log dev ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?exclude&#x3D;master  Returns all commits in the repo that are not on master (similar to &#x60;git log --all ^master&#x60;).  ## GET /repositories/{workspace}/{repo_slug}/commits/?include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;fu&amp;exclude&#x3D;fubar  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;fu&#x60; or &#x60;fubar&#x60; (similar to &#x60;git log foo bar ^fu ^fubar&#x60;).  An optional &#x60;path&#x60; parameter can be specified that will limit the results to commits that affect that path. &#x60;path&#x60; can either be a file or a directory. If a directory is specified, commits are returned that have modified any file in the directory tree rooted by &#x60;path&#x60;. It is important to note that if the &#x60;path&#x60; parameter is specified, the commits returned by this endpoint may no longer be a DAG, parent commits that do not modify the path will be omitted from the response.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;README.md&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed the file README.md.  ## GET /repositories/{workspace}/{repo_slug}/commits/?path&#x3D;src/&amp;include&#x3D;foo&amp;include&#x3D;bar&amp;exclude&#x3D;master  Returns all commits that are on refs &#x60;foo&#x60; or &#x60;bar&#x60;, but not on &#x60;master&#x60; that changed to a file in any file in the directory src or its children.  Because the response could include a very large number of commits, it is paginated. Follow the &#x27;next&#x27; link in the response to navigate to the next page of commits. As with other paginated resources, do not construct your own links.  When the include and exclude parameters are more than can fit in a query string, clients can use a &#x60;x-www-form-urlencoded&#x60; POST instead.
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param revision The revision parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugCommitsRevisionGet(String repoSlug, String revision, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitsRevisionGet");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revision' when calling repositoriesWorkspaceRepoSlugCommitsRevisionGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitsRevisionGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("revision", revision);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commits/{revision}").buildAndExpand(uriVariables).toUriString();
        
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
     * Identical to &#x60;GET /repositories/{workspace}/{repo_slug}/commits&#x60;, except that POST allows clients to place the include and exclude parameters in the request body to avoid URL length issues.  **Note that this resource does NOT support new commit creation.**
     * <p><b>0</b> - Unexpected error.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param revision The revision parameter
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Error repositoriesWorkspaceRepoSlugCommitsRevisionPost(String repoSlug, String revision, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugCommitsRevisionPost");
        }
        // verify the required parameter 'revision' is set
        if (revision == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revision' when calling repositoriesWorkspaceRepoSlugCommitsRevisionPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugCommitsRevisionPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("revision", revision);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/commits/{revision}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Produces a raw, git-style diff for either a single commit (diffed against its first parent), or a revspec of 2 commits (e.g. &#x60;3a8b42..9ff173&#x60; where the first commit represents the source and the second commit the destination).  In case of the latter (diffing a revspec), a 3-way diff, or merge diff, is computed. This shows the changes introduced by the left branch (&#x60;3a8b42&#x60; in our example) as compared againt the right branch (&#x60;9ff173&#x60;).  This is equivalent to merging the left branch into the right branch and then computing the diff of the merge commit against its first parent (the right branch). This follows the same behavior as pull requests that also show this style of 3-way, or merge diff.  While similar to patches, diffs:  * Don&#x27;t have a commit header (username, commit message, etc) * Support the optional &#x60;path&#x3D;foo/bar.py&#x60; query param to filter   the diff to just that one file diff  The raw diff is returned as-is, in whatever encoding the files in the repository use. It is not decoded into unicode. As such, the content-type is &#x60;text/plain&#x60;.
     * <p><b>200</b> - The raw diff
     * <p><b>555</b> - If the diff was too large and timed out.  Since this endpoint does not employ any form of pagination, but instead returns the diff as a single document, it can run into trouble on very large diffs. If Bitbucket times out in cases like these, a 555 status code is returned.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param spec A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;). 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param context Generate diffs with &lt;n&gt; lines of context instead of the usual three.
     * @param path Limit the diff to a particular file (this parameter can be repeated for multiple paths).
     * @param ignoreWhitespace Generate diffs that ignore whitespace.
     * @param binary Generate diffs that include binary files, true if omitted.
     * @param renames Whether to perform rename detection, true if omitted.
     * @param merge If true, the source commit is merged into the destination commit, and then a diff from the destination to the merge result is returned. If false, a simple &#x27;two dot&#x27; diff between the source and destination is returned. True if omitted.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugDiffSpecGet(String repoSlug, String spec, String workspace, Integer context, String path, Boolean ignoreWhitespace, Boolean binary, Boolean renames, Boolean merge) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDiffSpecGet");
        }
        // verify the required parameter 'spec' is set
        if (spec == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'spec' when calling repositoriesWorkspaceRepoSlugDiffSpecGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDiffSpecGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("spec", spec);
        uriVariables.put("workspace", workspace);
        String pathNew = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/diff/{spec}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "context", context));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "path", path));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ignore_whitespace", ignoreWhitespace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "binary", binary));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "renames", renames));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merge", merge));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key", "basic", "oauth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(pathNew, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the best common ancestor between two commits, specified in a revspec of 2 commits (e.g. 3a8b42..9ff173).  If more than one best common ancestor exists, only one will be returned. It is unspecified which will be returned.
     * <p><b>200</b> - The merge base of the provided spec.
     * <p><b>401</b> - If the request was not authenticated.
     * <p><b>403</b> - If the authenticated user does not have access to any of the repositories specified.
     * <p><b>404</b> - If the repository or ref in the spec does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param revspec A commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;). 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Commit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Commit repositoriesWorkspaceRepoSlugMergeBaseRevspecGet(String repoSlug, String revspec, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugMergeBaseRevspecGet");
        }
        // verify the required parameter 'revspec' is set
        if (revspec == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'revspec' when calling repositoriesWorkspaceRepoSlugMergeBaseRevspecGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugMergeBaseRevspecGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("revspec", revspec);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/merge-base/{revspec}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Commit> returnType = new ParameterizedTypeReference<Commit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Produces a raw patch for a single commit (diffed against its first parent), or a patch-series for a revspec of 2 commits (e.g. &#x60;3a8b42..9ff173&#x60; where the first commit represents the source and the second commit the destination).  In case of the latter (diffing a revspec), a patch series is returned for the commits on the source branch (&#x60;3a8b42&#x60; and its ancestors in our example). For Mercurial, a single patch is returned that combines the changes of all commits on the source branch.  While similar to diffs, patches:  * Have a commit header (username, commit message, etc) * Do not support the &#x60;path&#x3D;foo/bar.py&#x60; query parameter  The raw patch is returned as-is, in whatever encoding the files in the repository use. It is not decoded into unicode. As such, the content-type is &#x60;text/plain&#x60;.
     * <p><b>200</b> - The raw patches
     * <p><b>555</b> - If the diff was too large and timed out.  Since this endpoint does not employ any form of pagination, but instead returns the diff as a single document, it can run into trouble on very large diffs. If Bitbucket times out in cases like these, a 555 status code is returned.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param spec A commit SHA (e.g. &#x60;3a8b42&#x60;) or a commit range using double dot notation (e.g. &#x60;3a8b42..9ff173&#x60;). 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugPatchSpecGet(String repoSlug, String spec, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugPatchSpecGet");
        }
        // verify the required parameter 'spec' is set
        if (spec == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'spec' when calling repositoriesWorkspaceRepoSlugPatchSpecGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugPatchSpecGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("spec", spec);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/patch/{spec}").buildAndExpand(uriVariables).toUriString();
        
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
}
