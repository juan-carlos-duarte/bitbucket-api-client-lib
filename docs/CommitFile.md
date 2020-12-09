# CommitFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**path** | **String** | The path in the repository |  [optional]
**commit** | [**Commit**](Commit.md) |  |  [optional]
**attributes** | [**AttributesEnum**](#AttributesEnum) |  |  [optional]
**escapedPath** | **String** | The escaped version of the path as it appears in a diff. If the path does not require escaping this will be the same as path. |  [optional]

<a name="AttributesEnum"></a>
## Enum: AttributesEnum
Name | Value
---- | -----
LINK | &quot;link&quot;
EXECUTABLE | &quot;executable&quot;
SUBREPOSITORY | &quot;subrepository&quot;
BINARY | &quot;binary&quot;
LFS | &quot;lfs&quot;
