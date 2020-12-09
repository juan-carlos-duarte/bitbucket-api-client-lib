# PipelineStep

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The UUID identifying the step. |  [optional]
**startedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the step execution was started. This is not set when the step hasn&#x27;t executed yet. |  [optional]
**completedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the step execution was completed. This is not set if the step is still in progress. |  [optional]
**state** | [**PipelineStepState**](PipelineStepState.md) |  |  [optional]
**image** | [**PipelineImage**](PipelineImage.md) |  |  [optional]
**setupCommands** | [**List&lt;PipelineCommand&gt;**](PipelineCommand.md) | The list of commands that are executed as part of the setup phase of the build. These commands are executed outside the build container. |  [optional]
**scriptCommands** | [**List&lt;PipelineCommand&gt;**](PipelineCommand.md) | The list of build commands. These commands are executed in the build container. |  [optional]
