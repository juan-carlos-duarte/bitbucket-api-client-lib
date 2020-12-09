# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**IssueLinks**](IssueLinks.md) |  |  [optional]
**id** | **Integer** |  |  [optional]
**repository** | [**Repository**](Repository.md) |  |  [optional]
**title** | **String** |  |  [optional]
**reporter** | [**User**](User.md) |  |  [optional]
**assignee** | [**User**](User.md) |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**editedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**kind** | [**KindEnum**](#KindEnum) |  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional]
**milestone** | [**Milestone**](Milestone.md) |  |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**component** | [**Component**](Component.md) |  |  [optional]
**votes** | **Integer** |  |  [optional]
**content** | [**IssueContent**](IssueContent.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NEW | &quot;new&quot;
OPEN | &quot;open&quot;
RESOLVED | &quot;resolved&quot;
ON_HOLD | &quot;on hold&quot;
INVALID | &quot;invalid&quot;
DUPLICATE | &quot;duplicate&quot;
WONTFIX | &quot;wontfix&quot;
CLOSED | &quot;closed&quot;

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
BUG | &quot;bug&quot;
ENHANCEMENT | &quot;enhancement&quot;
PROPOSAL | &quot;proposal&quot;
TASK | &quot;task&quot;

<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
TRIVIAL | &quot;trivial&quot;
MINOR | &quot;minor&quot;
MAJOR | &quot;major&quot;
CRITICAL | &quot;critical&quot;
BLOCKER | &quot;blocker&quot;
