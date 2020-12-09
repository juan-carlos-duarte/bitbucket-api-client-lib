# Diffstat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**linesAdded** | **Integer** |  |  [optional]
**linesRemoved** | **Integer** |  |  [optional]
**old** | [**CommitFile**](CommitFile.md) |  |  [optional]
**_new** | [**CommitFile**](CommitFile.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ADDED | &quot;added&quot;
REMOVED | &quot;removed&quot;
MODIFIED | &quot;modified&quot;
RENAMED | &quot;renamed&quot;
