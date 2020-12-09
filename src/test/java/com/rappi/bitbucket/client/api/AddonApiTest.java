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

import com.rappi.bitbucket.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddonApi
 */
@Ignore
public class AddonApiTest {

    private final AddonApi api = new AddonApi();

    /**
     * 
     *
     * Deletes the application for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  &#x60;&#x60;&#x60; $ curl -X DELETE https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; &#x60;&#x60;&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonDeleteTest() {
        api.addonDelete();

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a list of all [linkers](/cloud/bitbucket/modules/linker/) for the authenticated application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersGetTest() {
        api.addonLinkersGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a [linker](/cloud/bitbucket/modules/linker/) specified by &#x60;linker_key&#x60; for the authenticated application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyGetTest() {
        String linkerKey = null;
        api.addonLinkersLinkerKeyGet(linkerKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesDeleteTest() {
        String linkerKey = null;
        api.addonLinkersLinkerKeyValuesDelete(linkerKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Gets a list of all [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesGetTest() {
        String linkerKey = null;
        api.addonLinkersLinkerKeyValuesGet(linkerKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Creates a [linker](/cloud/bitbucket/modules/linker/) value for the specified linker of authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesPostTest() {
        String linkerKey = null;
        api.addonLinkersLinkerKeyValuesPost(linkerKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Bulk update [linker](/cloud/bitbucket/modules/linker/) values for the specified linker of the authenticated application.  A linker value lets applications supply values to modify its regular expression.  The base regular expression must use a Bitbucket-specific match group &#x60;(?K)&#x60; which will be translated to &#x60;([\\w\\-]+)&#x60;. A value must match this pattern.  [Read more about linker values](/cloud/bitbucket/modules/linker/#usingthebitbucketapitosupplyvalues)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesPutTest() {
        String linkerKey = null;
        api.addonLinkersLinkerKeyValuesPut(linkerKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesValueIdDeleteTest() {
        String linkerKey = null;
        Integer valueId = null;
        api.addonLinkersLinkerKeyValuesValueIdDelete(linkerKey, valueId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a single [linker](/cloud/bitbucket/modules/linker/) value of the authenticated application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonLinkersLinkerKeyValuesValueIdGetTest() {
        String linkerKey = null;
        Integer valueId = null;
        api.addonLinkersLinkerKeyValuesValueIdGet(linkerKey, valueId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates the application installation for the user.  This endpoint is intended to be used by Bitbucket Connect apps and only supports JWT authentication -- that is how Bitbucket identifies the particular installation of the app. Developers with applications registered in the \&quot;Develop Apps\&quot; section of Bitbucket Marketplace need not use this endpoint as updates for those applications can be sent out via the UI of that section.  A new, valid descriptor must be provided in the body of the PUT request.  &#x60;&#x60;&#x60; $ curl -X PUT https://api.bitbucket.org/2.0/addon \\   -H \&quot;Authorization: JWT &lt;JWT Token&gt;\&quot; \\   --header \&quot;Content-Type: application/json\&quot; \\   --data &#x27;{\&quot;descriptor\&quot;: $NEW_DESCRIPTOR}&#x27; &#x60;&#x60;&#x60;  Note that the scopes of the application cannot be increased in the new descriptor nor reduced to none.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addonPutTest() {
        api.addonPut();

        // TODO: test validations
    }
}
