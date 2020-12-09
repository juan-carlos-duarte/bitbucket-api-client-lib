# DeploymentStateCompleted

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**NameEnum**](#NameEnum) | The name of deployment state (COMPLETED). |  [optional]
**url** | **String** | Link to the deployment result. |  [optional]
**deployer** | [**Account**](Account.md) |  |  [optional]
**status** | [**DeploymentStateCompletedStatus**](DeploymentStateCompletedStatus.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the deployment was started. |  [optional]
**completionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the deployment completed. |  [optional]

<a name="NameEnum"></a>
## Enum: NameEnum
Name | Value
---- | -----
COMPLETED | &quot;COMPLETED&quot;
