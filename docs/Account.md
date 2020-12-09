# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**AccountLinks**](AccountLinks.md) |  |  [optional]
**username** | **String** |  |  [optional]
**nickname** | **String** | Account name defined by the owner. Should be used instead of the \&quot;username\&quot; field. Note that \&quot;nickname\&quot; cannot be used in place of \&quot;username\&quot; in URLs and queries, as \&quot;nickname\&quot; is not guaranteed to be unique. |  [optional]
**accountStatus** | **String** | The status of the account. Currently the only possible value is \&quot;active\&quot;, but more values may be added in the future. |  [optional]
**displayName** | **String** |  |  [optional]
**website** | **String** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**uuid** | **String** |  |  [optional]
**has2faEnabled** | **Boolean** |  |  [optional]
