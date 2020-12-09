package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.AddonApi")
public class AddonApi {
    private ApiClient apiClient;

    public AddonApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddonApi(ApiClient apiClient) {
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
     * Deletes the application for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  &#x60;&#x60;&#x60; $ curl -X DELETE https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; &#x60;&#x60;&#x60;
     * <p><b>204</b> - Request has succeeded. The application has been deleted for the user.
     * <p><b>401</b> - No authorization.
     * <p><b>403</b> - Improper authentication.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonDelete() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/addon").build().toUriString();
        
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
     * Gets a list of all [linkers](/cloud/bitbucket/modules/linker/) for the authenticated application.
     * <p><b>200</b> - Successful.
     * <p><b>401</b> - Authentication must use app JWT
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/addon/linkers").build().toUriString();
        
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
     * Gets a [linker](/cloud/bitbucket/modules/linker/) specified by &#x60;linker_key&#x60; for the authenticated application.
     * <p><b>200</b> - Successful.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyGet(String linkerKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.
     * <p><b>204</b> - Successfully deleted the linker values.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesDelete(String linkerKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values").buildAndExpand(uriVariables).toUriString();
        
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
     * Gets a list of all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     * <p><b>200</b> - Successful.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesGet(String linkerKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates a [linker](/cloud/bitbucket/modules/linker/) value for the specified linker of authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     * <p><b>201</b> - Successfully created the linker value.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker does not exist.
     * <p><b>409</b> - The linker already has the value being added.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesPost(String linkerKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Bulk update [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     * <p><b>204</b> - Successfully updated the linker values.
     * <p><b>400</b> - Invalid input.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesPut(String linkerKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.
     * <p><b>204</b> - Successfully deleted the linker value.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker value does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @param valueId The numeric ID of the linker value.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesValueIdDelete(String linkerKey, Integer valueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesValueIdDelete");
        }
        // verify the required parameter 'valueId' is set
        if (valueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'valueId' when calling addonLinkersLinkerKeyValuesValueIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        uriVariables.put("value_id", valueId);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values/{value_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.
     * <p><b>200</b> - Successful.
     * <p><b>401</b> - Authentication must use app JWT
     * <p><b>404</b> - The linker value does not exist.
     * @param linkerKey The unique key of a [linker module](/cloud/bitbucket/modules/linker/) as defined in an application descriptor.
     * @param valueId The numeric ID of the linker value.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonLinkersLinkerKeyValuesValueIdGet(String linkerKey, Integer valueId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'linkerKey' is set
        if (linkerKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'linkerKey' when calling addonLinkersLinkerKeyValuesValueIdGet");
        }
        // verify the required parameter 'valueId' is set
        if (valueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'valueId' when calling addonLinkersLinkerKeyValuesValueIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("linker_key", linkerKey);
        uriVariables.put("value_id", valueId);
        String path = UriComponentsBuilder.fromPath("/addon/linkers/{linker_key}/values/{value_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Updates the application installation for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  A new, valid descriptor must be provided in the body of the PUT request.  &#x60;&#x60;&#x60; $ curl -X PUT https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; \\   --header \&quot;Content-Type: application/json\&quot; \\   --data &#x27;{\&quot;descriptor\&quot;: $NEW_DESCRIPTOR}&#x27; &#x60;&#x60;&#x60;  Note that the scopes of the application cannot be increased in the new descriptor nor reduced to none.
     * <p><b>204</b> - Request has succeeded. The installation has been updated to the new descriptor.
     * <p><b>400</b> - Scopes have increased or decreased to none.
     * <p><b>401</b> - No authorization.
     * <p><b>403</b> - Improper authentication.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonPut() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/addon").build().toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
