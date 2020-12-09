# IssueContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**raw** | **String** | The text as it was typed by a user. |  [optional]
**markup** | [**MarkupEnum**](#MarkupEnum) | The type of markup language the raw content is to be interpreted in. |  [optional]
**html** | **String** | The user&#x27;s content rendered as HTML. |  [optional]

<a name="MarkupEnum"></a>
## Enum: MarkupEnum
Name | Value
---- | -----
MARKDOWN | &quot;markdown&quot;
CREOLE | &quot;creole&quot;
PLAINTEXT | &quot;plaintext&quot;
