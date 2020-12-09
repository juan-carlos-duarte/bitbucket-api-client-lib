# Report

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | The UUID that can be used to identify the report. |  [optional]
**title** | **String** | The title of the report. |  [optional]
**details** | **String** | A string to describe the purpose of the report. |  [optional]
**externalId** | **String** | ID of the report provided by the report creator. It can be used to identify the report as an alternative to it&#x27;s generated uuid. It is not used by Bitbucket, but only by the report creator for updating or deleting this specific report. Needs to be unique. |  [optional]
**reporter** | **String** | A string to describe the tool or company who created the report. |  [optional]
**link** | **String** | A URL linking to the results of the report in an external tool. |  [optional]
**remoteLinkEnabled** | **Boolean** | If enabled, a remote link is created in Jira for the issue associated with the commit the report belongs to. |  [optional]
**logoUrl** | **String** | A URL to the report logo. If none is provided, the default insights logo will be used. |  [optional]
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | The type of the report. |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | The state of the report. May be set to PENDING and later updated. |  [optional]
**data** | [**List&lt;ReportData&gt;**](ReportData.md) | An array of data fields to display information on the report. Maximum 10. |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the report was created. |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the report was updated. |  [optional]

<a name="ReportTypeEnum"></a>
## Enum: ReportTypeEnum
Name | Value
---- | -----
SECURITY | &quot;SECURITY&quot;
COVERAGE | &quot;COVERAGE&quot;
TEST | &quot;TEST&quot;
BUG | &quot;BUG&quot;

<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
PASSED | &quot;PASSED&quot;
FAILED | &quot;FAILED&quot;
PENDING | &quot;PENDING&quot;
