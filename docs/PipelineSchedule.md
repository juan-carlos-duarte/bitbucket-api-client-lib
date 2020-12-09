# PipelineSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The UUID identifying the schedule. |  [optional]
**enabled** | **Boolean** | Whether the schedule is enabled. |  [optional]
**target** | [**PipelineTarget**](PipelineTarget.md) |  |  [optional]
**selector** | [**PipelineSelector**](PipelineSelector.md) |  |  [optional]
**cronPattern** | **String** | The cron expression that the schedule applies. |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the schedule was created. |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the schedule was updated. |  [optional]
