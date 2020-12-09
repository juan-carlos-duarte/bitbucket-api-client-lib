# Participant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**User**](User.md) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**approved** | **Boolean** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**participatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The ISO8601 timestamp of the participant&#x27;s action. For approvers, this is the time of their approval. For commenters and pull request reviewers who are not approvers, this is the time they last commented, or null if they have not commented. |  [optional]

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
PARTICIPANT | &quot;PARTICIPANT&quot;
REVIEWER | &quot;REVIEWER&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
APPROVED | &quot;approved&quot;
CHANGES_REQUESTED | &quot;changes_requested&quot;
