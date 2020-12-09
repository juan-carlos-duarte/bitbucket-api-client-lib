# Snippet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**title** | **String** |  |  [optional]
**scm** | [**ScmEnum**](#ScmEnum) | The DVCS used to store the snippet. |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**owner** | [**Account**](Account.md) |  |  [optional]
**creator** | [**Account**](Account.md) |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]

<a name="ScmEnum"></a>
## Enum: ScmEnum
Name | Value
---- | -----
HG | &quot;hg&quot;
GIT | &quot;git&quot;
