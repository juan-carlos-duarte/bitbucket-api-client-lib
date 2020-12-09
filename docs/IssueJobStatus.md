# IssueJobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the import/export job |  [optional]
**phase** | **String** | The phase of the import/export job |  [optional]
**total** | **Integer** | The total number of issues being imported/exported |  [optional]
**count** | **Integer** | The total number of issues already imported/exported |  [optional]
**pct** | [**BigDecimal**](BigDecimal.md) | The percentage of issues already imported/exported |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTED | &quot;ACCEPTED&quot;
STARTED | &quot;STARTED&quot;
RUNNING | &quot;RUNNING&quot;
FAILURE | &quot;FAILURE&quot;
