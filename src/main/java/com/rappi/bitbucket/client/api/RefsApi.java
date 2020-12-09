package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.invoker.ApiClient;

import com.rappi.bitbucket.client.model.Branch;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedBranches;
import com.rappi.bitbucket.client.model.PaginatedRefs;
import com.rappi.bitbucket.client.model.PaginatedTags;
import com.rappi.bitbucket.client.model.Tag;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")@Component("com.rappi.bitbucket.client.api.RefsApi")
public class RefsApi {
    private ApiClient apiClient;

    public RefsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RefsApi(ApiClient apiClient) {
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
     * Returns a list of all open branches within the specified repository. Results will be in the order the source control manager returns them.  &#x60;&#x60;&#x60; $ curl -s https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches | jq . {   \&quot;pagelen\&quot;: 10,   \&quot;values\&quot;: [     {       \&quot;heads\&quot;: [         {           \&quot;hash\&quot;: \&quot;f1a0933ce59e809f190602655e22ae6ec107c397\&quot;,           \&quot;type\&quot;: \&quot;commit\&quot;,           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;             }           }         }       ],       \&quot;type\&quot;: \&quot;named_branch\&quot;,       \&quot;name\&quot;: \&quot;default\&quot;,       \&quot;links\&quot;: {         \&quot;commits\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commits/default\&quot;         },         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches/default\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/branch/default\&quot;         }       },       \&quot;target\&quot;: {         \&quot;hash\&quot;: \&quot;f1a0933ce59e809f190602655e22ae6ec107c397\&quot;,         \&quot;repository\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial\&quot;             },             \&quot;avatar\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/avatar/32/\&quot;             }           },           \&quot;type\&quot;: \&quot;repository\&quot;,           \&quot;name\&quot;: \&quot;mercurial\&quot;,           \&quot;full_name\&quot;: \&quot;seanfarley/mercurial\&quot;,           \&quot;uuid\&quot;: \&quot;{73dcbd61-e506-4fc1-9ecd-31be2b6d6031}\&quot;         },         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;           },           \&quot;comments\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/comments\&quot;           },           \&quot;patch\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/patch/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;           },           \&quot;diff\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/diff/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;           },           \&quot;approve\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/approve\&quot;           },           \&quot;statuses\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/statuses\&quot;           }         },         \&quot;author\&quot;: {           \&quot;raw\&quot;: \&quot;Martin von Zweigbergk &lt;martinvonz@google.com&gt;\&quot;,           \&quot;type\&quot;: \&quot;author\&quot;,           \&quot;user\&quot;: {             \&quot;username\&quot;: \&quot;martinvonz\&quot;,             \&quot;nickname\&quot;: \&quot;martinvonz\&quot;,             \&quot;display_name\&quot;: \&quot;Martin von Zweigbergk\&quot;,             \&quot;type\&quot;: \&quot;user\&quot;,             \&quot;uuid\&quot;: \&quot;{fdb0e657-3ade-4fad-a136-95f1ffe4a5ac}\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/martinvonz\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/martinvonz/\&quot;               },               \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/account/martinvonz/avatar/32/\&quot;               }             }           }         },         \&quot;parents\&quot;: [           {             \&quot;hash\&quot;: \&quot;5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;,             \&quot;type\&quot;: \&quot;commit\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;               }             }           }         ],         \&quot;date\&quot;: \&quot;2018-02-01T18:44:49+00:00\&quot;,         \&quot;message\&quot;: \&quot;config: replace a for-else by any()\&quot;,         \&quot;type\&quot;: \&quot;commit\&quot;       }     },     {       \&quot;heads\&quot;: [         {           \&quot;hash\&quot;: \&quot;1d60ad093792706e1dc7a52b20942593f2c19655\&quot;,           \&quot;type\&quot;: \&quot;commit\&quot;,           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;             }           }         }       ],       \&quot;type\&quot;: \&quot;named_branch\&quot;,       \&quot;name\&quot;: \&quot;stable\&quot;,       \&quot;links\&quot;: {         \&quot;commits\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commits/stable\&quot;         },         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches/stable\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/branch/stable\&quot;         }       },       \&quot;target\&quot;: {         \&quot;hash\&quot;: \&quot;1d60ad093792706e1dc7a52b20942593f2c19655\&quot;,         \&quot;repository\&quot;: {           \&quot;links\&quot;: {             \&quot;self\&quot;: {               \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial\&quot;             },             \&quot;html\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial\&quot;             },             \&quot;avatar\&quot;: {               \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/avatar/32/\&quot;             }           },           \&quot;type\&quot;: \&quot;repository\&quot;,           \&quot;name\&quot;: \&quot;mercurial\&quot;,           \&quot;full_name\&quot;: \&quot;seanfarley/mercurial\&quot;,           \&quot;uuid\&quot;: \&quot;{73dcbd61-e506-4fc1-9ecd-31be2b6d6031}\&quot;         },         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;           },           \&quot;comments\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/1d60ad093792706e1dc7a52b20942593f2c19655/comments\&quot;           },           \&quot;patch\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/patch/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;           },           \&quot;diff\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/diff/1d60ad093792706e1dc7a52b20942593f2c19655\&quot;           },           \&quot;approve\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/1d60ad093792706e1dc7a52b20942593f2c19655/approve\&quot;           },           \&quot;statuses\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/1d60ad093792706e1dc7a52b20942593f2c19655/statuses\&quot;           }         },         \&quot;author\&quot;: {           \&quot;raw\&quot;: \&quot;Augie Fackler &lt;raf@durin42.com&gt;\&quot;,           \&quot;type\&quot;: \&quot;author\&quot;,           \&quot;user\&quot;: {             \&quot;username\&quot;: \&quot;durin42\&quot;,             \&quot;nickname\&quot;: \&quot;durin42\&quot;,             \&quot;display_name\&quot;: \&quot;Augie Fackler\&quot;,             \&quot;type\&quot;: \&quot;user\&quot;,             \&quot;uuid\&quot;: \&quot;{e07dc61f-bb05-4218-b43a-d991f26be65a}\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/durin42\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/durin42/\&quot;               },               \&quot;avatar\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/account/durin42/avatar/32/\&quot;               }             }           }         },         \&quot;parents\&quot;: [           {             \&quot;hash\&quot;: \&quot;56a0da11bde519d79168e890df4bcf0da62f0a7b\&quot;,             \&quot;type\&quot;: \&quot;commit\&quot;,             \&quot;links\&quot;: {               \&quot;self\&quot;: {                 \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/56a0da11bde519d79168e890df4bcf0da62f0a7b\&quot;               },               \&quot;html\&quot;: {                 \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/56a0da11bde519d79168e890df4bcf0da62f0a7b\&quot;               }             }           }         ],         \&quot;date\&quot;: \&quot;2018-02-01T19:13:41+00:00\&quot;,         \&quot;message\&quot;: \&quot;Added signature for changeset d334afc585e2\&quot;,         \&quot;type\&quot;: \&quot;commit\&quot;       }     }   ],   \&quot;page\&quot;: 1,   \&quot;size\&quot;: 2 } &#x60;&#x60;&#x60;  Branches support [filtering and sorting](../../../../../meta/filtering) that can be used to search for specific branches. For instance, to find all branches that have \&quot;stab\&quot; in their name:  &#x60;&#x60;&#x60; curl -s https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches -G --data-urlencode &#x27;q&#x3D;name ~ \&quot;stab\&quot;&#x27; &#x60;&#x60;&#x60;  By default, results will be in the order the underlying source control system returns them and identical to the ordering one sees when running \&quot;$ hg branches\&quot; or \&quot;$ git branch --list\&quot;. Note that this follows simple lexical ordering of the ref names.  This can be undesirable as it does apply any natural sorting semantics, meaning for instance that tags are sorted [\&quot;v10\&quot;, \&quot;v11\&quot;, \&quot;v9\&quot;] instead of [\&quot;v9\&quot;, \&quot;v10\&quot;, \&quot;v11\&quot;].  Sorting can be changed using the ?q&#x3D; query parameter. When using ?q&#x3D;name to explicitly sort on ref name, Bitbucket will apply natural sorting and interpret numerical values as numbers instead of strings.
     * <p><b>200</b> - A paginated list of branches matching any filter criteria that were provided.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;. 
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../../meta/filtering).
     * @param sort  Field by which the results should be sorted as per [filtering and sorting](../../../../../meta/filtering). The &#x60;name&#x60; field is handled specially for branches in that, if specified as the sort field, it uses a natural sort order instead of the default lexicographical sort order. For example, it will return [&#x27;branch1&#x27;, &#x27;branch2&#x27;, &#x27;branch10&#x27;] instead of [&#x27;branch1&#x27;, &#x27;branch10&#x27;, &#x27;branch2&#x27;].
     * @return PaginatedBranches
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedBranches repositoriesWorkspaceRepoSlugRefsBranchesGet(String workspace, String username, String repoSlug, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsBranchesGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugRefsBranchesGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsBranchesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/branches").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedBranches> returnType = new ParameterizedTypeReference<PaginatedBranches>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete a branch in the specified repository.  The main branch is not allowed to be deleted and will return a 400 response.  For Git, the branch name should not include any prefixes (e.g. refs/heads). For Mercurial, this closes all open heads on the branch, sets the author of the commit to the authenticated caller, and changes the date to the datetime of the call.
     * <p><b>204</b> - Indicates that the specified branch was successfully deleted.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository or branch does not exist.
     * @param name The name of the branch.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugRefsBranchesNameDelete(String name, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/branches/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns a branch object within the specified repository.  &#x60;&#x60;&#x60; $ curl -s https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches/default | jq . {   \&quot;heads\&quot;: [     {       \&quot;hash\&quot;: \&quot;f1a0933ce59e809f190602655e22ae6ec107c397\&quot;,       \&quot;type\&quot;: \&quot;commit\&quot;,       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;         }       }     }   ],   \&quot;type\&quot;: \&quot;named_branch\&quot;,   \&quot;name\&quot;: \&quot;default\&quot;,   \&quot;links\&quot;: {     \&quot;commits\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commits/default\&quot;     },     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/refs/branches/default\&quot;     },     \&quot;html\&quot;: {       \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/branch/default\&quot;     }   },   \&quot;target\&quot;: {     \&quot;hash\&quot;: \&quot;f1a0933ce59e809f190602655e22ae6ec107c397\&quot;,     \&quot;repository\&quot;: {       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial\&quot;         },         \&quot;avatar\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/avatar/32/\&quot;         }       },       \&quot;type\&quot;: \&quot;repository\&quot;,       \&quot;name\&quot;: \&quot;mercurial\&quot;,       \&quot;full_name\&quot;: \&quot;seanfarley/mercurial\&quot;,       \&quot;uuid\&quot;: \&quot;{73dcbd61-e506-4fc1-9ecd-31be2b6d6031}\&quot;     },     \&quot;links\&quot;: {       \&quot;self\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;       },       \&quot;comments\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/comments\&quot;       },       \&quot;patch\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/patch/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;       },       \&quot;html\&quot;: {         \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;       },       \&quot;diff\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/diff/f1a0933ce59e809f190602655e22ae6ec107c397\&quot;       },       \&quot;approve\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/approve\&quot;       },       \&quot;statuses\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/f1a0933ce59e809f190602655e22ae6ec107c397/statuses\&quot;       }     },     \&quot;author\&quot;: {       \&quot;raw\&quot;: \&quot;Martin von Zweigbergk &lt;martinvonz@google.com&gt;\&quot;,       \&quot;type\&quot;: \&quot;author\&quot;,       \&quot;user\&quot;: {         \&quot;username\&quot;: \&quot;martinvonz\&quot;,         \&quot;nickname\&quot;: \&quot;martinvonz\&quot;,         \&quot;display_name\&quot;: \&quot;Martin von Zweigbergk\&quot;,         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;uuid\&quot;: \&quot;{fdb0e657-3ade-4fad-a136-95f1ffe4a5ac}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/martinvonz\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/martinvonz/\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/account/martinvonz/avatar/32/\&quot;           }         }       }     },     \&quot;parents\&quot;: [       {         \&quot;hash\&quot;: \&quot;5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;,         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/mercurial/commit/5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/mercurial/commits/5523aabb85c30ebc2b8e29aadcaf5e13fa92b375\&quot;           }         }       }     ],     \&quot;date\&quot;: \&quot;2018-02-01T18:44:49+00:00\&quot;,     \&quot;message\&quot;: \&quot;config: replace a for-else by any()\&quot;,     \&quot;type\&quot;: \&quot;commit\&quot;   } } &#x60;&#x60;&#x60;  This call requires authentication. Private repositories require the caller to authenticate with an account that has appropriate authorization.  For Git, the branch name should not include any prefixes (e.g. refs/heads).  For Mercurial, the response will include an additional field that lists the open heads.
     * <p><b>200</b> - The branch object.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository or branch does not exist.
     * @param name The name of the branch.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Branch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Branch repositoriesWorkspaceRepoSlugRefsBranchesNameGet(String name, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsBranchesNameGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/branches/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Branch> returnType = new ParameterizedTypeReference<Branch>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new branch in the specified repository.  The payload of the POST should consist of a JSON document that contains the name of the tag and the target hash.  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/seanfarley/hg/refs/branches \\ -s -u seanfarley -X POST -H \&quot;Content-Type: application/json\&quot; \\ -d &#x27;{     \&quot;name\&quot; : \&quot;smf/create-feature\&quot;,     \&quot;target\&quot; : {         \&quot;hash\&quot; : \&quot;default\&quot;,     } }&#x27; &#x60;&#x60;&#x60;  This call requires authentication. Private repositories require the caller to authenticate with an account that has appropriate authorization.  For Git, the branch name should not include any prefixes (e.g. refs/heads). This endpoint does support using short hash prefixes for the commit hash, but it may return a 400 response if the provided prefix is ambiguous. Using a full commit hash is the preferred approach.  For Mercurial, the authenticated user making this call is the author of the new branch commit and the date is current datetime of the call.
     * <p><b>201</b> - The newly created branch object.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository or branch does not exist.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Branch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Branch repositoriesWorkspaceRepoSlugRefsBranchesPost(String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsBranchesPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsBranchesPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/branches").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Branch> returnType = new ParameterizedTypeReference<Branch>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the branches and tags in the repository.  By default, results will be in the order the underlying source control system returns them and identical to the ordering one sees when running \&quot;$ git show-ref\&quot;. Note that this follows simple lexical ordering of the ref names.  This can be undesirable as it does apply any natural sorting semantics, meaning for instance that refs are sorted [\&quot;branch1\&quot;, \&quot;branch10\&quot;, \&quot;branch2\&quot;, \&quot;v10\&quot;, \&quot;v11\&quot;, \&quot;v9\&quot;] instead of [\&quot;branch1\&quot;, \&quot;branch2\&quot;, \&quot;branch10\&quot;, \&quot;v9\&quot;, \&quot;v10\&quot;, \&quot;v11\&quot;].  Sorting can be changed using the ?sort&#x3D; query parameter. When using ?sort&#x3D;name to explicitly sort on ref name, Bitbucket will apply natural sorting and interpret numerical values as numbers instead of strings.
     * <p><b>200</b> - A paginated list of refs matching any filter criteria that were provided.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;. 
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../meta/filtering).
     * @param sort  Field by which the results should be sorted as per [filtering and sorting](../../../../meta/filtering). The &#x60;name&#x60; field is handled specially for refs in that, if specified as the sort field, it uses a natural sort order instead of the default lexicographical sort order. For example, it will return [&#x27;1.1&#x27;, &#x27;1.2&#x27;, &#x27;1.10&#x27;] instead of [&#x27;1.1&#x27;, &#x27;1.10&#x27;, &#x27;1.2&#x27;].
     * @return PaginatedRefs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRefs repositoriesWorkspaceRepoSlugRefsGet(String workspace, String username, String repoSlug, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugRefsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedRefs> returnType = new ParameterizedTypeReference<PaginatedRefs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Returns the tags in the repository.  By default, results will be in the order the underlying source control system returns them and identical to the ordering one sees when running \&quot;$ hg tags\&quot; or \&quot;$ git tag --list\&quot;. Note that this follows simple lexical ordering of the ref names.  This can be undesirable as it does apply any natural sorting semantics, meaning for instance that tags are sorted [\&quot;v10\&quot;, \&quot;v11\&quot;, \&quot;v9\&quot;] instead of [\&quot;v9\&quot;, \&quot;v10\&quot;, \&quot;v11\&quot;].  Sorting can be changed using the ?sort&#x3D; query parameter. When using ?sort&#x3D;name to explicitly sort on ref name, Bitbucket will apply natural sorting and interpret numerical values as numbers instead of strings.
     * <p><b>200</b> - A paginated list of tags matching any filter criteria that were provided.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository does not exist.
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @param username  This can either be the username or the UUID of the user, surrounded by curly-braces, for example: &#x60;{user UUID}&#x60;. 
     * @param repoSlug  This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param q  Query string to narrow down the response as per [filtering and sorting](../../../../../meta/filtering).
     * @param sort  Field by which the results should be sorted as per [filtering and sorting](../../../../../meta/filtering). The &#x60;name&#x60; field is handled specially for tags in that, if specified as the sort field, it uses a natural sort order instead of the default lexicographical sort order. For example, it will return [&#x27;1.1&#x27;, &#x27;1.2&#x27;, &#x27;1.10&#x27;] instead of [&#x27;1.1&#x27;, &#x27;1.10&#x27;, &#x27;1.2&#x27;].
     * @return PaginatedTags
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedTags repositoriesWorkspaceRepoSlugRefsTagsGet(String workspace, String username, String repoSlug, String q, String sort) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsTagsGet");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling repositoriesWorkspaceRepoSlugRefsTagsGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsTagsGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workspace", workspace);
        uriVariables.put("username", username);
        uriVariables.put("repo_slug", repoSlug);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/tags").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PaginatedTags> returnType = new ParameterizedTypeReference<PaginatedTags>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delete a tag in the specified repository.  For Git, the tag name should not include any prefixes (e.g. refs/tags). For Mercurial, this adds a commit to the main branch that removes the specified tag.
     * <p><b>204</b> - Indicates the specified tag was successfully deleted.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository or tag does not exist.
     * @param name The name of the tag.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void repositoriesWorkspaceRepoSlugRefsTagsNameDelete(String name, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling repositoriesWorkspaceRepoSlugRefsTagsNameDelete");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsTagsNameDelete");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsTagsNameDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/tags/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Returns the specified tag.  &#x60;&#x60;&#x60; $ curl -s https://api.bitbucket.org/2.0/repositories/seanfarley/hg/refs/tags/3.8 -G | jq . {   \&quot;name\&quot;: \&quot;3.8\&quot;,   \&quot;links\&quot;: {     \&quot;commits\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commits/3.8\&quot;     },     \&quot;self\&quot;: {       \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/refs/tags/3.8\&quot;     },     \&quot;html\&quot;: {       \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/hg/commits/tag/3.8\&quot;     }   },   \&quot;tagger\&quot;: {     \&quot;raw\&quot;: \&quot;Matt Mackall &lt;mpm@selenic.com&gt;\&quot;,     \&quot;type\&quot;: \&quot;author\&quot;,     \&quot;user\&quot;: {       \&quot;username\&quot;: \&quot;mpmselenic\&quot;,       \&quot;nickname\&quot;: \&quot;mpmselenic\&quot;,       \&quot;display_name\&quot;: \&quot;Matt Mackall\&quot;,       \&quot;type\&quot;: \&quot;user\&quot;,       \&quot;uuid\&quot;: \&quot;{a4934530-db4c-419c-a478-9ab4964c2ee7}\&quot;,       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/mpmselenic\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/mpmselenic/\&quot;         },         \&quot;avatar\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/account/mpmselenic/avatar/32/\&quot;         }       }     }   },   \&quot;date\&quot;: \&quot;2016-05-01T18:52:25+00:00\&quot;,   \&quot;message\&quot;: \&quot;Added tag 3.8 for changeset f85de28eae32\&quot;,   \&quot;type\&quot;: \&quot;tag\&quot;,   \&quot;target\&quot;: {     \&quot;hash\&quot;: \&quot;f85de28eae32e7d3064b1a1321309071bbaaa069\&quot;,     \&quot;repository\&quot;: {       \&quot;links\&quot;: {         \&quot;self\&quot;: {           \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg\&quot;         },         \&quot;html\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/hg\&quot;         },         \&quot;avatar\&quot;: {           \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/hg/avatar/32/\&quot;         }       },       \&quot;type\&quot;: \&quot;repository\&quot;,       \&quot;name\&quot;: \&quot;hg\&quot;,       \&quot;full_name\&quot;: \&quot;seanfarley/hg\&quot;,       \&quot;uuid\&quot;: \&quot;{c75687fb-e99d-4579-9087-190dbd406d30}\&quot;     },     \&quot;links\&quot;: {       \&quot;self\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commit/f85de28eae32e7d3064b1a1321309071bbaaa069\&quot;       },       \&quot;comments\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commit/f85de28eae32e7d3064b1a1321309071bbaaa069/comments\&quot;       },       \&quot;patch\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/patch/f85de28eae32e7d3064b1a1321309071bbaaa069\&quot;       },       \&quot;html\&quot;: {         \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/hg/commits/f85de28eae32e7d3064b1a1321309071bbaaa069\&quot;       },       \&quot;diff\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/diff/f85de28eae32e7d3064b1a1321309071bbaaa069\&quot;       },       \&quot;approve\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commit/f85de28eae32e7d3064b1a1321309071bbaaa069/approve\&quot;       },       \&quot;statuses\&quot;: {         \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commit/f85de28eae32e7d3064b1a1321309071bbaaa069/statuses\&quot;       }     },     \&quot;author\&quot;: {       \&quot;raw\&quot;: \&quot;Sean Farley &lt;sean@farley.io&gt;\&quot;,       \&quot;type\&quot;: \&quot;author\&quot;,       \&quot;user\&quot;: {         \&quot;username\&quot;: \&quot;seanfarley\&quot;,         \&quot;nickname\&quot;: \&quot;seanfarley\&quot;,         \&quot;display_name\&quot;: \&quot;Sean Farley\&quot;,         \&quot;type\&quot;: \&quot;user\&quot;,         \&quot;uuid\&quot;: \&quot;{a295f8a8-5876-4d43-89b5-3ad8c6c3c51d}\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/users/seanfarley\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/\&quot;           },           \&quot;avatar\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/account/seanfarley/avatar/32/\&quot;           }         }       }     },     \&quot;parents\&quot;: [       {         \&quot;hash\&quot;: \&quot;9a98d0e5b07fc60887f9d3d34d9ac7d536f470d2\&quot;,         \&quot;type\&quot;: \&quot;commit\&quot;,         \&quot;links\&quot;: {           \&quot;self\&quot;: {             \&quot;href\&quot;: \&quot;https://api.bitbucket.org/2.0/repositories/seanfarley/hg/commit/9a98d0e5b07fc60887f9d3d34d9ac7d536f470d2\&quot;           },           \&quot;html\&quot;: {             \&quot;href\&quot;: \&quot;https://bitbucket.org/seanfarley/hg/commits/9a98d0e5b07fc60887f9d3d34d9ac7d536f470d2\&quot;           }         }       }     ],     \&quot;date\&quot;: \&quot;2016-05-01T04:21:17+00:00\&quot;,     \&quot;message\&quot;: \&quot;debian: alphabetize build deps\&quot;,     \&quot;type\&quot;: \&quot;commit\&quot;   } } &#x60;&#x60;&#x60;
     * <p><b>200</b> - The tag object.
     * <p><b>403</b> - If the repository is private and the authenticated user does not have access to it. 
     * <p><b>404</b> - The specified repository or tag does not exist.
     * @param name The name of the tag.
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Tag
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tag repositoriesWorkspaceRepoSlugRefsTagsNameGet(String name, String repoSlug, String workspace) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling repositoriesWorkspaceRepoSlugRefsTagsNameGet");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsTagsNameGet");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsTagsNameGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/tags/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Tag> returnType = new ParameterizedTypeReference<Tag>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Creates a new tag in the specified repository.  The payload of the POST should consist of a JSON document that contains the name of the tag and the target hash.  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/jdoe/myrepo/refs/tags \\ -s -u jdoe -X POST -H \&quot;Content-Type: application/json\&quot; \\ -d &#x27;{     \&quot;name\&quot; : \&quot;new-tag-name\&quot;,     \&quot;target\&quot; : {         \&quot;hash\&quot; : \&quot;a1b2c3d4e5f6\&quot;,     } }&#x27; &#x60;&#x60;&#x60;  This endpoint does support using short hash prefixes for the commit hash, but it may return a 400 response if the provided prefix is ambiguous. Using a full commit hash is the preferred approach.
     * <p><b>201</b> - The newly created tag.
     * <p><b>400</b> - If the target hash is missing, ambiguous, or invalid, or if the name is not provided.
     * @param body The body parameter
     * @param repoSlug This can either be the repository slug or the UUID of the repository, surrounded by curly-braces, for example: &#x60;{repository UUID}&#x60;. 
     * @param workspace This can either be the workspace ID (slug) or the workspace UUID surrounded by curly-braces, for example: &#x60;{workspace UUID}&#x60;. 
     * @return Tag
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tag repositoriesWorkspaceRepoSlugRefsTagsPost(Tag body, String repoSlug, String workspace) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling repositoriesWorkspaceRepoSlugRefsTagsPost");
        }
        // verify the required parameter 'repoSlug' is set
        if (repoSlug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repoSlug' when calling repositoriesWorkspaceRepoSlugRefsTagsPost");
        }
        // verify the required parameter 'workspace' is set
        if (workspace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workspace' when calling repositoriesWorkspaceRepoSlugRefsTagsPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("repo_slug", repoSlug);
        uriVariables.put("workspace", workspace);
        String path = UriComponentsBuilder.fromPath("/repositories/{workspace}/{repo_slug}/refs/tags").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Tag> returnType = new ParameterizedTypeReference<Tag>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
