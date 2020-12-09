# PullrequestEndpointBranch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**mergeStrategies** | [**List&lt;MergeStrategiesEnum&gt;**](#List&lt;MergeStrategiesEnum&gt;) | Available merge strategies, when this endpoint is the destination of the pull request. |  [optional]
**defaultMergeStrategy** | **String** | The default merge strategy, when this endpoint is the destination of the pull request. |  [optional]

<a name="List<MergeStrategiesEnum>"></a>
## Enum: List&lt;MergeStrategiesEnum&gt;
Name | Value
---- | -----
MERGE_COMMIT | &quot;merge_commit&quot;
SQUASH | &quot;squash&quot;
FAST_FORWARD | &quot;fast_forward&quot;
