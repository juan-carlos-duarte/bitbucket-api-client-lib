# WebhookSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The webhook&#x27;s id |  [optional]
**url** | **String** | The URL events get delivered to. |  [optional]
**description** | **String** | A user-defined description of the webhook. |  [optional]
**subjectType** | [**SubjectTypeEnum**](#SubjectTypeEnum) | The type of entity, which is &#x60;repository&#x60; in the case of webhook subscriptions on repositories. |  [optional]
**subject** | **Object** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The events this webhook is subscribed to. |  [optional]

<a name="SubjectTypeEnum"></a>
## Enum: SubjectTypeEnum
Name | Value
---- | -----
WORKSPACE | &quot;workspace&quot;
USER | &quot;user&quot;
REPOSITORY | &quot;repository&quot;
TEAM | &quot;team&quot;

<a name="List<EventsEnum>"></a>
## Enum: List&lt;EventsEnum&gt;
Name | Value
---- | -----
PULLREQUEST_UNAPPROVED | &quot;pullrequest:unapproved&quot;
ISSUE_COMMENT_CREATED | &quot;issue:comment_created&quot;
PULLREQUEST_APPROVED | &quot;pullrequest:approved&quot;
REPO_CREATED | &quot;repo:created&quot;
REPO_DELETED | &quot;repo:deleted&quot;
REPO_IMPORTED | &quot;repo:imported&quot;
PULLREQUEST_COMMENT_UPDATED | &quot;pullrequest:comment_updated&quot;
ISSUE_UPDATED | &quot;issue:updated&quot;
PROJECT_UPDATED | &quot;project:updated&quot;
PULLREQUEST_COMMENT_CREATED | &quot;pullrequest:comment_created&quot;
REPO_COMMIT_STATUS_UPDATED | &quot;repo:commit_status_updated&quot;
PULLREQUEST_UPDATED | &quot;pullrequest:updated&quot;
ISSUE_CREATED | &quot;issue:created&quot;
REPO_FORK | &quot;repo:fork&quot;
PULLREQUEST_COMMENT_DELETED | &quot;pullrequest:comment_deleted&quot;
REPO_COMMIT_STATUS_CREATED | &quot;repo:commit_status_created&quot;
REPO_UPDATED | &quot;repo:updated&quot;
PULLREQUEST_REJECTED | &quot;pullrequest:rejected&quot;
PULLREQUEST_FULFILLED | &quot;pullrequest:fulfilled&quot;
REPO_PUSH | &quot;repo:push&quot;
PULLREQUEST_CREATED | &quot;pullrequest:created&quot;
REPO_TRANSFER | &quot;repo:transfer&quot;
REPO_COMMIT_COMMENT_CREATED | &quot;repo:commit_comment_created&quot;
