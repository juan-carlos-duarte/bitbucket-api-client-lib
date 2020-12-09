package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.SearchResultPage;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.SearchApi")
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    @Autowired
    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Search for code in the repositories of the specified team.  Searching across all repositories:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/teams/team_name/search/code?search_query&#x3D;foo&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 2,       \&quot;content_matches\&quot;: [         {           \&quot;lines\&quot;: [             {               \&quot;line\&quot;: 2,               \&quot;segments\&quot;: []             },             {               \&quot;line\&quot;: 3,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;def \&quot;                 },                 {                   \&quot;text\&quot;: \&quot;foo\&quot;,                   \&quot;match\&quot;: true                 },                 {                   \&quot;text\&quot;: \&quot;():\&quot;                 }               ]             },             {               \&quot;line\&quot;: 4,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;    print(\\\&quot;snek\\\&quot;)\&quot;                 }               ]             },             {               \&quot;line\&quot;: 5,               \&quot;segments\&quot;: []             }           ]         }       ],       \&quot;path_matches\&quot;: [         {           \&quot;text\&quot;: \&quot;src/\&quot;         },         {           \&quot;text\&quot;: \&quot;foo\&quot;,           \&quot;match\&quot;: true         },         {           \&quot;text\&quot;: \&quot;.py\&quot;         }       ],       \&quot;file\&quot;: {         \&quot;path\&quot;: \&quot;src/foo.py\&quot;,         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         }       }     }   ] } &#x60;&#x60;&#x60;  Note that searches can match in the file&#x27;s text (&#x60;content_matches&#x60;), the path (&#x60;path_matches&#x60;), or both as in the example above.  You can use the same syntax for the search query as in the UI, e.g. to only search within a specific repository:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/teams/team_name/search/code?search_query&#x3D;foo+repo:demo&#x27; # results from the \&quot;demo\&quot; repository &#x60;&#x60;&#x60;  Similar to other APIs, you can request more fields using a &#x60;fields&#x60; query parameter. E.g. to get some more information about the repository of matched files (the &#x60;%2B&#x60; is a URL-encoded &#x60;+&#x60;):  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/teams/team_name/search/code&#x27;\\      &#x27;?search_query&#x3D;foo&amp;fields&#x3D;%2Bvalues.file.commit.repository&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 1,       \&quot;content_matches\&quot;: [...],       \&quot;path_matches\&quot;: [...],       \&quot;file\&quot;: {         \&quot;commit\&quot;: {           \&quot;type\&quot;: \&quot;commit\&quot;,           \&quot;hash\&quot;: \&quot;ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;,           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/commit/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo/commits/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             }           },           \&quot;repository\&quot;: {             \&quot;name\&quot;: \&quot;demo\&quot;,             \&quot;type\&quot;: \&quot;repository\&quot;,             \&quot;full_name\&quot;: \&quot;my-workspace/demo\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo\&quot;               },               \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B850e1749-781a-4115-9316-df39d0600e7a%7D?ts&#x3D;default\&quot;               }             },             \&quot;uuid\&quot;: \&quot;{850e1749-781a-4115-9316-df39d0600e7a}\&quot;           }         },         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         },         \&quot;path\&quot;: \&quot;src/foo.py\&quot;       }     }   ] } &#x60;&#x60;&#x60;  Try &#x60;fields&#x3D;%2Bvalues.*.*.*.*&#x60; to get an idea what&#x27;s possible. 
     * 
     * <p><b>200</b> - Successful search
     * <p><b>400</b> - If the search request was invalid due to one of the following reasons:  * the specified type of target account doesn&#x27;&#x27;t match the actual account type;  * malformed pagination properties;  * missing or malformed search query, in the latter case an error key will be returned in &#x60;error.data.key&#x60; property. 
     * <p><b>404</b> - Search is not enabled for the requested team, navigate to [https://bitbucket.org/search](https://bitbucket.org/search) to turn it on
     * <p><b>429</b> - Too many requests, try again later
     * @param username The account to search in; either the username or the UUID in curly braces
     * @param searchQuery The search query
     * @param page Which page of the search results to retrieve
     * @param pagelen How many search results to retrieve per page
     * @return SearchResultPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchResultPage searchAccount(String username, String searchQuery, Integer page, Integer pagelen) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling searchAccount");
        }
        // verify the required parameter 'searchQuery' is set
        if (searchQuery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchQuery' when calling searchAccount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/teams/{username}/search/code").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_query", searchQuery));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagelen", pagelen));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SearchResultPage> returnType = new ParameterizedTypeReference<SearchResultPage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search for code in the repositories of the specified user.  Searching across all repositories:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/users/{ed08f5e1-605b-4f4a-aee4-6c97628a673e}/search/code?search_query&#x3D;foo&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 2,       \&quot;content_matches\&quot;: [         {           \&quot;lines\&quot;: [             {               \&quot;line\&quot;: 2,               \&quot;segments\&quot;: []             },             {               \&quot;line\&quot;: 3,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;def \&quot;                 },                 {                   \&quot;text\&quot;: \&quot;foo\&quot;,                   \&quot;match\&quot;: true                 },                 {                   \&quot;text\&quot;: \&quot;():\&quot;                 }               ]             },             {               \&quot;line\&quot;: 4,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;    print(\\\&quot;snek\\\&quot;)\&quot;                 }               ]             },             {               \&quot;line\&quot;: 5,               \&quot;segments\&quot;: []             }           ]         }       ],       \&quot;path_matches\&quot;: [         {           \&quot;text\&quot;: \&quot;src/\&quot;         },         {           \&quot;text\&quot;: \&quot;foo\&quot;,           \&quot;match\&quot;: true         },         {           \&quot;text\&quot;: \&quot;.py\&quot;         }       ],       \&quot;file\&quot;: {         \&quot;path\&quot;: \&quot;src/foo.py\&quot;,         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         }       }     }   ] } &#x60;&#x60;&#x60;  Note that searches can match in the file&#x27;s text (&#x60;content_matches&#x60;), the path (&#x60;path_matches&#x60;), or both as in the example above.  You can use the same syntax for the search query as in the UI, e.g. to only search within a specific repository:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/users/{ed08f5e1-605b-4f4a-aee4-6c97628a673e}/search/code?search_query&#x3D;foo+repo:demo&#x27; # results from the \&quot;demo\&quot; repository &#x60;&#x60;&#x60;  Similar to other APIs, you can request more fields using a &#x60;fields&#x60; query parameter. E.g. to get some more information about the repository of matched files (the &#x60;%2B&#x60; is a URL-encoded &#x60;+&#x60;):  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/users/{ed08f5e1-605b-4f4a-aee4-6c97628a673e}/search/code&#x27;\\      &#x27;?search_query&#x3D;foo&amp;fields&#x3D;%2Bvalues.file.commit.repository&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 1,       \&quot;content_matches\&quot;: [...],       \&quot;path_matches\&quot;: [...],       \&quot;file\&quot;: {         \&quot;commit\&quot;: {           \&quot;type\&quot;: \&quot;commit\&quot;,           \&quot;hash\&quot;: \&quot;ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;,           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/commit/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo/commits/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             }           },           \&quot;repository\&quot;: {             \&quot;name\&quot;: \&quot;demo\&quot;,             \&quot;type\&quot;: \&quot;repository\&quot;,             \&quot;full_name\&quot;: \&quot;my-workspace/demo\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo\&quot;               },               \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B850e1749-781a-4115-9316-df39d0600e7a%7D?ts&#x3D;default\&quot;               }             },             \&quot;uuid\&quot;: \&quot;{850e1749-781a-4115-9316-df39d0600e7a}\&quot;           }         },         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         },         \&quot;path\&quot;: \&quot;src/foo.py\&quot;       }     }   ] } &#x60;&#x60;&#x60;  Try &#x60;fields&#x3D;%2Bvalues.*.*.*.*&#x60; to get an idea what&#x27;s possible. 
     * 
     * <p><b>200</b> - Successful search
     * <p><b>400</b> - If the search request was invalid due to one of the following reasons:  * the specified type of target account doesn&#x27;&#x27;t match the actual account type;  * malformed pagination properties;  * missing or malformed search query, in the latter case an error key will be returned in &#x60;error.data.key&#x60; property. 
     * <p><b>404</b> - Search is not enabled for the requested user, navigate to [https://bitbucket.org/search](https://bitbucket.org/search) to turn it on
     * <p><b>429</b> - Too many requests, try again later
     * @param selectedUser Either the UUID of the account surrounded by curly-braces, for example &#x60;{account UUID}&#x60;, OR an Atlassian Account ID.
     * @param searchQuery The search query
     * @param page Which page of the search results to retrieve
     * @param pagelen How many search results to retrieve per page
     * @return SearchResultPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchResultPage searchAccount_0(String selectedUser, String searchQuery, Integer page, Integer pagelen) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'selectedUser' is set
        if (selectedUser == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'selectedUser' when calling searchAccount_0");
        }
        // verify the required parameter 'searchQuery' is set
        if (searchQuery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchQuery' when calling searchAccount_0");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("selected_user", selectedUser);
        String path = UriComponentsBuilder.fromPath("/users/{selected_user}/search/code").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_query", searchQuery));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagelen", pagelen));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SearchResultPage> returnType = new ParameterizedTypeReference<SearchResultPage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search for code in the repositories of the specified workspace.  Searching across all repositories:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/workspaces/workspace_slug_or_uuid/search/code?search_query&#x3D;foo&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 2,       \&quot;content_matches\&quot;: [         {           \&quot;lines\&quot;: [             {               \&quot;line\&quot;: 2,               \&quot;segments\&quot;: []             },             {               \&quot;line\&quot;: 3,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;def \&quot;                 },                 {                   \&quot;text\&quot;: \&quot;foo\&quot;,                   \&quot;match\&quot;: true                 },                 {                   \&quot;text\&quot;: \&quot;():\&quot;                 }               ]             },             {               \&quot;line\&quot;: 4,               \&quot;segments\&quot;: [                 {                   \&quot;text\&quot;: \&quot;    print(\\\&quot;snek\\\&quot;)\&quot;                 }               ]             },             {               \&quot;line\&quot;: 5,               \&quot;segments\&quot;: []             }           ]         }       ],       \&quot;path_matches\&quot;: [         {           \&quot;text\&quot;: \&quot;src/\&quot;         },         {           \&quot;text\&quot;: \&quot;foo\&quot;,           \&quot;match\&quot;: true         },         {           \&quot;text\&quot;: \&quot;.py\&quot;         }       ],       \&quot;file\&quot;: {         \&quot;path\&quot;: \&quot;src/foo.py\&quot;,         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         }       }     }   ] } &#x60;&#x60;&#x60;  Note that searches can match in the file&#x27;s text (&#x60;content_matches&#x60;), the path (&#x60;path_matches&#x60;), or both as in the example above.  You can use the same syntax for the search query as in the UI, e.g. to only search within a specific repository:  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/workspaces/my-workspace/search/code?search_query&#x3D;foo+repo:demo&#x27; # results from the \&quot;demo\&quot; repository &#x60;&#x60;&#x60;  Similar to other APIs, you can request more fields using a &#x60;fields&#x60; query parameter. E.g. to get some more information about the repository of matched files (the &#x60;%2B&#x60; is a URL-encoded &#x60;+&#x60;):  &#x60;&#x60;&#x60; curl &#x27;https://api.bitbucket.org/2.0/workspaces/my-workspace/search/code&#x27;\\      &#x27;?search_query&#x3D;foo&amp;fields&#x3D;%2Bvalues.file.commit.repository&#x27; {   \&quot;size\&quot;: 1,   \&quot;page\&quot;: 1,   \&quot;pagelen\&quot;: 10,   \&quot;query_substituted\&quot;: false,   \&quot;values\&quot;: [     {       \&quot;type\&quot;: \&quot;code_search_result\&quot;,       \&quot;content_match_count\&quot;: 1,       \&quot;content_matches\&quot;: [...],       \&quot;path_matches\&quot;: [...],       \&quot;file\&quot;: {         \&quot;commit\&quot;: {           \&quot;type\&quot;: \&quot;commit\&quot;,           \&quot;hash\&quot;: \&quot;ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;,           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/commit/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo/commits/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b\&quot;             }           },           \&quot;repository\&quot;: {             \&quot;name\&quot;: \&quot;demo\&quot;,             \&quot;type\&quot;: \&quot;repository\&quot;,             \&quot;full_name\&quot;: \&quot;my-workspace/demo\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/my-workspace/demo\&quot;               },               \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bytebucket.org/ravatar/%7B850e1749-781a-4115-9316-df39d0600e7a%7D?ts&#x3D;default\&quot;               }             },             \&quot;uuid\&quot;: \&quot;{850e1749-781a-4115-9316-df39d0600e7a}\&quot;           }         },         \&quot;type\&quot;: \&quot;commit_file\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/my-workspace/demo/src/ad6964b5fe2880dbd9ddcad1c89000f1dbcbc24b/src/foo.py\&quot;           }         },         \&quot;path\&quot;: \&quot;src/foo.py\&quot;       }     }   ] } &#x60;&#x60;&#x60;  Try &#x60;fields&#x3D;%2Bvalues.*.*.*.*&#x60; to get an idea what&#x27;s possible. 
     * 
     * <p><b>200</b> - Successful search
     * <p><b>400</b> - If the search request was invalid due to one of the following reasons:  * the specified type of target account doesn&#x27;&#x27;t match the actual account type;  * malformed pagination properties;  * missing or malformed search query, in the latter case an error key will be returned in &#x60;error.data.key&#x60; property. 
     * <p><b>404</b> - Search is not enabled for the requested workspace, navigate to [https://bitbucket.org/search](https://bitbucket.org/search) to turn it on
     * <p><b>429</b> - Too many requests, try again later
     * @param workspace The workspace to search in; either the slug or the UUID in curly braces
     * @param searchQuery The search query
     * @param page Which page of the search results to retrieve
     * @param pagelen How many search results to retrieve per page
     * @return SearchResultPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchResultPage searchAccount_1(String workspace, String searchQuery, Integer page, Integer pagelen) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling searchAccount_1");
        }
        // verify the required parameter 'searchQuery' is set
        if (searchQuery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchQuery' when calling searchAccount_1");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/workspaces/{workspace}/search/code").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_query", searchQuery));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagelen", pagelen));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<SearchResultPage> returnType = new ParameterizedTypeReference<SearchResultPage>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
