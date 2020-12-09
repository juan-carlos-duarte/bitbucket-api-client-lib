# PipelineRefTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refType** | [**RefTypeEnum**](#RefTypeEnum) | The type of reference (branch/tag). |  [optional]
**refName** | **String** | The name of the reference. |  [optional]
**commit** | [**Commit**](Commit.md) |  |  [optional]
**selector** | [**PipelineSelector**](PipelineSelector.md) |  |  [optional]

<a name="RefTypeEnum"></a>
## Enum: RefTypeEnum
Name | Value
---- | -----
BRANCH | &quot;branch&quot;
TAG | &quot;tag&quot;
NAMED_BRANCH | &quot;named_branch&quot;
BOOKMARK | &quot;bookmark&quot;
