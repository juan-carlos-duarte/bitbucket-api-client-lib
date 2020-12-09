# Pullrequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullrequestLinks**](PullrequestLinks.md) |  |  [optional]
**id** | **Integer** | The pull request&#x27;s unique ID. Note that pull request IDs are only unique within their associated repository. |  [optional]
**title** | **String** | Title of the pull request. |  [optional]
**rendered** | [**PullrequestRendered**](PullrequestRendered.md) |  |  [optional]
**summary** | [**IssueContent**](IssueContent.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The pull request&#x27;s current status. |  [optional]
**author** | [**Account**](Account.md) |  |  [optional]
**source** | [**PullrequestEndpoint**](PullrequestEndpoint.md) |  |  [optional]
**destination** | [**PullrequestEndpoint**](PullrequestEndpoint.md) |  |  [optional]
**mergeCommit** | [**PullrequestMergeCommit**](PullrequestMergeCommit.md) |  |  [optional]
**commentCount** | **Integer** | The number of comments for a specific pull request. |  [optional]
**taskCount** | **Integer** | The number of open tasks for a specific pull request. |  [optional]
**closeSourceBranch** | **Boolean** | A boolean flag indicating if merging the pull request closes the source branch. |  [optional]
**closedBy** | [**Account**](Account.md) |  |  [optional]
**reason** | **String** | Explains why a pull request was declined. This field is only applicable to pull requests in rejected state. |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | The ISO8601 timestamp the request was created. |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The ISO8601 timestamp the request was last updated. |  [optional]
**reviewers** | [**List&lt;Account&gt;**](Account.md) | The list of users that were added as reviewers on this pull request when it was created. For performance reasons, the API only includes this list on a pull request&#x27;s &#x60;self&#x60; URL. |  [optional]
**participants** | [**List&lt;Participant&gt;**](Participant.md) |         The list of users that are collaborating on this pull request.         Collaborators are user that:          * are added to the pull request as a reviewer (part of the reviewers           list)         * are not explicit reviewers, but have commented on the pull request         * are not explicit reviewers, but have approved the pull request          Each user is wrapped in an object that indicates the user&#x27;s role and         whether they have approved the pull request. For performance reasons,         the API only returns this list when an API requests a pull request by         id.          |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
MERGED | &quot;MERGED&quot;
SUPERSEDED | &quot;SUPERSEDED&quot;
OPEN | &quot;OPEN&quot;
DECLINED | &quot;DECLINED&quot;
