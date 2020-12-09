# Branchrestriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**BranchingModelSettingsLinks**](BranchingModelSettingsLinks.md) |  |  [optional]
**id** | **Integer** | The branch restriction status&#x27; id. |  [optional]
**kind** | [**KindEnum**](#KindEnum) | The type of restriction that is being applied. | 
**branchMatchKind** | [**BranchMatchKindEnum**](#BranchMatchKindEnum) | Indicates how the restriction is matched against a branch. The default is &#x60;glob&#x60;. | 
**branchType** | [**BranchTypeEnum**](#BranchTypeEnum) | Apply the restriction to branches of this type. Active when &#x60;branch_match_kind&#x60; is &#x60;branching_model&#x60;. The branch type will be calculated using the branching model configured for the repository. |  [optional]
**pattern** | **String** | Apply the restriction to branches that match this pattern. Active when &#x60;branch_match_kind&#x60; is &#x60;glob&#x60;. Will be empty when &#x60;branch_match_kind&#x60; is &#x60;branching_model&#x60;. | 
**users** | [**List&lt;Account&gt;**](Account.md) |  |  [optional]
**groups** | [**List&lt;Group&gt;**](Group.md) |  |  [optional]
**value** | **Integer** | Value with kind-specific semantics: \&quot;require_approvals_to_merge\&quot; uses it to require a minimum number of approvals on a PR; \&quot;require_default_reviewer_approvals_to_merge\&quot; uses it to require a minimum number of approvals from default reviewers on a PR; \&quot;require_passing_builds_to_merge\&quot; uses it to require a minimum number of passing builds. |  [optional]

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
REQUIRE_TASKS_TO_BE_COMPLETED | &quot;require_tasks_to_be_completed&quot;
FORCE | &quot;force&quot;
RESTRICT_MERGES | &quot;restrict_merges&quot;
ENFORCE_MERGE_CHECKS | &quot;enforce_merge_checks&quot;
REQUIRE_APPROVALS_TO_MERGE | &quot;require_approvals_to_merge&quot;
ALLOW_AUTO_MERGE_WHEN_BUILDS_PASS | &quot;allow_auto_merge_when_builds_pass&quot;
DELETE | &quot;delete&quot;
REQUIRE_ALL_DEPENDENCIES_MERGED | &quot;require_all_dependencies_merged&quot;
PUSH | &quot;push&quot;
REQUIRE_PASSING_BUILDS_TO_MERGE | &quot;require_passing_builds_to_merge&quot;
RESET_PULLREQUEST_APPROVALS_ON_CHANGE | &quot;reset_pullrequest_approvals_on_change&quot;
REQUIRE_DEFAULT_REVIEWER_APPROVALS_TO_MERGE | &quot;require_default_reviewer_approvals_to_merge&quot;

<a name="BranchMatchKindEnum"></a>
## Enum: BranchMatchKindEnum
Name | Value
---- | -----
BRANCHING_MODEL | &quot;branching_model&quot;
GLOB | &quot;glob&quot;

<a name="BranchTypeEnum"></a>
## Enum: BranchTypeEnum
Name | Value
---- | -----
FEATURE | &quot;feature&quot;
BUGFIX | &quot;bugfix&quot;
RELEASE | &quot;release&quot;
HOTFIX | &quot;hotfix&quot;
DEVELOPMENT | &quot;development&quot;
PRODUCTION | &quot;production&quot;
