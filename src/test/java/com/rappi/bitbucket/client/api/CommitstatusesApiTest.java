/*
 * Bitbucket API
 * Code against the Bitbucket API to automate simple tasks, embed Bitbucket data into your own site, build mobile or desktop apps, or even add custom UI add-ons into Bitbucket itself using the Connect framework.
 *
 * OpenAPI spec version: 2.0
 * Contact: support@bitbucket.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.rappi.bitbucket.client.api;

import com.rappi.bitbucket.client.model.Commitstatus;
import com.rappi.bitbucket.client.model.Error;
import com.rappi.bitbucket.client.model.PaginatedCommitstatuses;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommitstatusesApi
 */
@Ignore
public class CommitstatusesApiTest {

    private final CommitstatusesApi api = new CommitstatusesApi();

    /**
     * 
     *
     * Returns the specified build status for a commit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGetTest() {
        String key = null;
        String node = null;
        String repoSlug = null;
        String workspace = null;
        Commitstatus response = api.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyGet(key, node, repoSlug, workspace);

        // TODO: test validations
    }
    /**
     * 
     *
     * Used to update the current status of a build status object on the specific commit.  This operation can also be used to change other properties of the build status:  * &#x60;state&#x60; * &#x60;name&#x60; * &#x60;description&#x60; * &#x60;url&#x60; * &#x60;refname&#x60;  The &#x60;key&#x60; cannot be changed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPutTest() {
        String key = null;
        String node = null;
        String repoSlug = null;
        String workspace = null;
        Commitstatus body = null;
        Commitstatus response = api.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildKeyPut(key, node, repoSlug, workspace, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a new build status against the specified commit.  If the specified key already exists, the existing status object will be overwritten.  Example:  &#x60;&#x60;&#x60; curl https://api.bitbucket.org/2.0/repositories/my-workspace/my-repo/commit/e10dae226959c2194f2b07b077c07762d93821cf/statuses/build/           -X POST -u jdoe -H &#x27;Content-Type: application/json&#x27;           -d &#x27;{     \&quot;key\&quot;: \&quot;MY-BUILD\&quot;,     \&quot;state\&quot;: \&quot;SUCCESSFUL\&quot;,     \&quot;description\&quot;: \&quot;42 tests passed\&quot;,     \&quot;url\&quot;: \&quot;https://www.example.org/my-build-result\&quot;   }&#x27; &#x60;&#x60;&#x60;  When creating a new commit status, you can use a URI template for the URL. Templates are URLs that contain variable names that Bitbucket will evaluate at runtime whenever the URL is displayed anywhere similar to parameter substitution in [Bitbucket Connect](https://developer.atlassian.com/bitbucket/concepts/context-parameters.html). For example, one could use &#x60;https://foo.com/builds/{repository.full_name}&#x60; which Bitbucket will turn into &#x60;https://foo.com/builds/foo/bar&#x60; at render time. The context variables available are &#x60;repository&#x60; and &#x60;commit&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPostTest() {
        String node = null;
        String repoSlug = null;
        String workspace = null;
        Commitstatus body = null;
        Commitstatus response = api.repositoriesWorkspaceRepoSlugCommitNodeStatusesBuildPost(node, repoSlug, workspace, body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns all statuses (e.g. build results) for a specific commit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesWorkspaceRepoSlugCommitNodeStatusesGetTest() {
        String node = null;
        String repoSlug = null;
        String workspace = null;
        String q = null;
        String sort = null;
        PaginatedCommitstatuses response = api.repositoriesWorkspaceRepoSlugCommitNodeStatusesGet(node, repoSlug, workspace, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns all statuses (e.g. build results) for the given pull request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGetTest() {
        Integer pullRequestId = null;
        String repoSlug = null;
        String workspace = null;
        String q = null;
        String sort = null;
        PaginatedCommitstatuses response = api.repositoriesWorkspaceRepoSlugPullrequestsPullRequestIdStatusesGet(pullRequestId, repoSlug, workspace, q, sort);

        // TODO: test validations
    }
}
