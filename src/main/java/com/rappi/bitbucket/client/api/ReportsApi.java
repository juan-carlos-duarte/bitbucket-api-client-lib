package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedAnnotations;
import com.rappi.bitbucket.client.model.PaginatedReports;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.ReportsApi")
public class ReportsApi {
    private ApiClient apiClient;

    public ReportsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReportsApi(ApiClient apiClient) {
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
}
