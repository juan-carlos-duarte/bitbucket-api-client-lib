package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.DeployKey;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedDeployKeys;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.DeployApi")
public class DeployApi {
    private ApiClient apiClient;

    public DeployApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeployApi(ApiClient apiClient) {
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
     * Returns all deploy-keys belonging to a repository.  Example: &#x60;&#x60;&#x60; $ curl -H \&quot;Authorization &lt;auth header&gt;\&quot; \\ https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys  Output: {     \&quot;pagelen\&quot;: 10,     \&quot;values\&quot;: [         {             \&quot;id\&quot;: 123,             \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5\&quot;,             \&quot;label\&quot;: \&quot;mykey\&quot;,             \&quot;type\&quot;: \&quot;deploy_key\&quot;,             \&quot;created_on\&quot;: \&quot;2018-08-15T23:50:59.993890+00:00\&quot;,             \&quot;repository\&quot;: {                 \&quot;full_name\&quot;: \&quot;mleu/test\&quot;,                 \&quot;name\&quot;: \&quot;test\&quot;,                 \&quot;type\&quot;: \&quot;repository\&quot;,                 \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;             },             \&quot;links\&quot;:{                 \&quot;self\&quot;:{                     \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys/123\&quot;                 }             }             \&quot;last_used\&quot;: null,             \&quot;comment\&quot;: \&quot;mleu@C02W454JHTD8\&quot;         }     ],     \&quot;page\&quot;: 1,     \&quot;size\&quot;: 1 } &#x60;&#x60;&#x60;
     * <p><b>200</b> - Deploy keys matching the repository
     * <p><b>403</b> - If the specified user or repository is not accessible to the current user
     * <p><b>404</b> - If the specified user or repository does not exist
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return PaginatedDeployKeys
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedDeployKeys repositoriesWorkspaceRepoSlugDeployKeysGet(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDeployKeysGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDeployKeysGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deploy-keys").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedDeployKeys> returnType = new ParameterizedTypeReference<PaginatedDeployKeys>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * This deletes a deploy key from a repository.  Example: &#x60;&#x60;&#x60; $ curl -XDELETE \\ -H \&quot;Authorization &lt;auth header&gt;\&quot; \\ https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys/1234 &#x60;&#x60;&#x60;
     * <p><b>204</b> - The key has been deleted
     * <p><b>403</b> - If the current user does not have permission to delete a key for the specified user
     * <p><b>404</b> - If the specified user, repository, or deploy key does not exist
     * @param keyId The key ID matching the deploy key.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugDeployKeysKeyIdDelete(String keyId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyId' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key_id", keyId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deploy-keys/{key_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the deploy key belonging to a specific key.  Example: &#x60;&#x60;&#x60; $ curl -H \&quot;Authorization &lt;auth header&gt;\&quot; \\ https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-key/1234  Output: {     \&quot;comment\&quot;: \&quot;mleu@C02W454JHTD8\&quot;,     \&quot;last_used\&quot;: null,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-key/1234\&quot;         }     },     \&quot;repository\&quot;: {         \&quot;full_name\&quot;: \&quot;mleu/test\&quot;,         \&quot;name\&quot;: \&quot;test\&quot;,         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;     },     \&quot;label\&quot;: \&quot;mykey\&quot;,     \&quot;created_on\&quot;: \&quot;2018-08-15T23:50:59.993890+00:00\&quot;,     \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5\&quot;,     \&quot;id\&quot;: 1234,     \&quot;type\&quot;: \&quot;deploy_key\&quot; } &#x60;&#x60;&#x60;
     * <p><b>200</b> - Deploy key matching the key ID
     * <p><b>403</b> - If the specified user or repository is not accessible to the current user
     * <p><b>404</b> - If the specified user or repository does not exist
     * @param keyId The key ID matching the deploy key.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return DeployKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeployKey repositoriesWorkspaceRepoSlugDeployKeysKeyIdGet(String keyId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyId' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key_id", keyId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deploy-keys/{key_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeployKey> returnType = new ParameterizedTypeReference<DeployKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a new deploy key in a repository.  The same key needs to be passed in but the comment and label can change.  Example: &#x60;&#x60;&#x60; $ curl -XPUT \\ -H \&quot;Authorization &lt;auth header&gt;\&quot; \\ -H \&quot;Content-type: application/json\&quot; \\ https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys/1234 -d \\ &#x27;{     \&quot;label\&quot;: \&quot;newlabel\&quot;,     \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5 newcomment\&quot;, }&#x27;  Output: {     \&quot;comment\&quot;: \&quot;newcomment\&quot;,     \&quot;last_used\&quot;: null,     \&quot;links\&quot;: {         \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys/1234\&quot;         }     },     \&quot;repository\&quot;: {         \&quot;full_name\&quot;: \&quot;mleu/test\&quot;,         \&quot;name\&quot;: \&quot;test\&quot;,         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;     },     \&quot;label\&quot;: \&quot;newlabel\&quot;,     \&quot;created_on\&quot;: \&quot;2018-08-15T23:50:59.993890+00:00\&quot;,     \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5\&quot;,     \&quot;id\&quot;: 1234,     \&quot;type\&quot;: \&quot;deploy_key\&quot; } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The newly updated deploy key.
     * <p><b>400</b> - If the submitted key or related value is invalid
     * <p><b>403</b> - If the current user does not have permission to add a key for the specified user
     * <p><b>404</b> - If the specified user, repository, or deploy key does not exist
     * @param keyId The key ID matching the deploy key.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return DeployKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeployKey repositoriesWorkspaceRepoSlugDeployKeysKeyIdPut(String keyId, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyId' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdPut");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdPut");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDeployKeysKeyIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key_id", keyId);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deploy-keys/{key_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeployKey> returnType = new ParameterizedTypeReference<DeployKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create a new deploy key in a repository.  Example: &#x60;&#x60;&#x60; $ curl -XPOST \\ -H \&quot;Authorization &lt;auth header&gt;\&quot; \\ -H \&quot;Content-type: application/json\&quot; \\ https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys -d \\ &#x27;{     \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5 mleu@C02W454JHTD8\&quot;,     \&quot;label\&quot;: \&quot;mydeploykey\&quot; }&#x27;  Output: {     \&quot;id\&quot;: 123,     \&quot;key\&quot;: \&quot;ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDAK/b1cHHDr/TEV1JGQl+WjCwStKG6Bhrv0rFpEsYlyTBm1fzN0VOJJYn4ZOPCPJwqse6fGbXntEs+BbXiptR+++HycVgl65TMR0b5ul5AgwrVdZdT7qjCOCgaSV74/9xlHDK8oqgGnfA7ZoBBU+qpVyaloSjBdJfLtPY/xqj4yHnXKYzrtn/uFc4Kp9Tb7PUg9Io3qohSTGJGVHnsVblq/rToJG7L5xIo0OxK0SJSQ5vuId93ZuFZrCNMXj8JDHZeSEtjJzpRCBEXHxpOPhAcbm4MzULgkFHhAVgp4JbkrT99/wpvZ7r9AdkTg7HGqL3rlaDrEcWfL7Lu6TnhBdq5\&quot;,     \&quot;label\&quot;: \&quot;mydeploykey\&quot;,     \&quot;type\&quot;: \&quot;deploy_key\&quot;,     \&quot;created_on\&quot;: \&quot;2018-08-15T23:50:59.993890+00:00\&quot;,     \&quot;repository\&quot;: {         \&quot;full_name\&quot;: \&quot;mleu/test\&quot;,         \&quot;name\&quot;: \&quot;test\&quot;,         \&quot;type\&quot;: \&quot;repository\&quot;,         \&quot;uuid\&quot;: \&quot;{85d08b4e-571d-44e9-a507-fa476535aa98}\&quot;     },     \&quot;links\&quot;:{         \&quot;self\&quot;:{             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/mleu/test/deploy-keys/123\&quot;         }     }     \&quot;last_used\&quot;: null,     \&quot;comment\&quot;: \&quot;mleu@C02W454JHTD8\&quot; } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The deploy key that was created
     * <p><b>400</b> - Invalid deploy key inputs
     * <p><b>403</b> - If the specified user or repository is not accessible to the current user
     * <p><b>404</b> - If the specified user or repository does not exist
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return DeployKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeployKey repositoriesWorkspaceRepoSlugDeployKeysPost(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugDeployKeysPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugDeployKeysPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/deploy-keys").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeployKey> returnType = new ParameterizedTypeReference<DeployKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
