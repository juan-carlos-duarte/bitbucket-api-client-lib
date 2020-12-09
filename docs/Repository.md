# Repository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**RepositoryLinks**](RepositoryLinks.md) |  |  [optional]
**uuid** | **String** | The repository&#x27;s immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user. |  [optional]
**fullName** | **String** | The concatenation of the repository owner&#x27;s username and the slugified name, e.g. \&quot;evzijst/interruptingcow\&quot;. This is the same string used in Bitbucket URLs. |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**parent** | [**Repository**](Repository.md) |  |  [optional]
**scm** | [**ScmEnum**](#ScmEnum) |  |  [optional]
**owner** | [**Account**](Account.md) |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**size** | **Integer** |  |  [optional]
**language** | **String** |  |  [optional]
**hasIssues** | **Boolean** |  |  [optional]
**hasWiki** | **Boolean** |  |  [optional]
**forkPolicy** | [**ForkPolicyEnum**](#ForkPolicyEnum) |  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking  |  [optional]
**project** | [**Project**](Project.md) |  |  [optional]
**mainbranch** | [**Branch**](Branch.md) |  |  [optional]

<a name="ScmEnum"></a>
## Enum: ScmEnum
Name | Value
---- | -----
HG | &quot;hg&quot;
GIT | &quot;git&quot;

<a name="ForkPolicyEnum"></a>
## Enum: ForkPolicyEnum
Name | Value
---- | -----
ALLOW_FORKS | &quot;allow_forks&quot;
NO_PUBLIC_FORKS | &quot;no_public_forks&quot;
NO_FORKS | &quot;no_forks&quot;
