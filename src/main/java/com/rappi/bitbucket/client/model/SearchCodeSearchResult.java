/*
 * Bitbucket API
 * Code against the Bitbucket API to automate simple tasks, embed Bitbucket data into your own site, build mobile or desktop apps, or even add custom UI add-ons into Bitbucket itself using the Connect framework.
 *
 * OpenAPI spec version: 2.0
 * Contact: support@bitbucket.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.rappi.bitbucket.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.rappi.bitbucket.client.model.CommitFile;
import com.rappi.bitbucket.client.model.SearchContentMatch;
import com.rappi.bitbucket.client.model.SearchSegment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SearchCodeSearchResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class SearchCodeSearchResult {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("content_match_count")
  private Long contentMatchCount = null;

  @JsonProperty("content_matches")
  private List<SearchContentMatch> contentMatches = null;

  @JsonProperty("path_matches")
  private List<SearchSegment> pathMatches = null;

  @JsonProperty("file")
  private CommitFile file = null;

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

   /**
   * Get contentMatchCount
   * @return contentMatchCount
  **/
  @Schema(description = "")
  public Long getContentMatchCount() {
    return contentMatchCount;
  }

   /**
   * Get contentMatches
   * @return contentMatches
  **/
  @Schema(description = "")
  public List<SearchContentMatch> getContentMatches() {
    return contentMatches;
  }

   /**
   * Get pathMatches
   * @return pathMatches
  **/
  @Schema(description = "")
  public List<SearchSegment> getPathMatches() {
    return pathMatches;
  }

  public SearchCodeSearchResult file(CommitFile file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @Schema(description = "")
  public CommitFile getFile() {
    return file;
  }

  public void setFile(CommitFile file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCodeSearchResult searchCodeSearchResult = (SearchCodeSearchResult) o;
    return Objects.equals(this.type, searchCodeSearchResult.type) &&
        Objects.equals(this.contentMatchCount, searchCodeSearchResult.contentMatchCount) &&
        Objects.equals(this.contentMatches, searchCodeSearchResult.contentMatches) &&
        Objects.equals(this.pathMatches, searchCodeSearchResult.pathMatches) &&
        Objects.equals(this.file, searchCodeSearchResult.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contentMatchCount, contentMatches, pathMatches, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCodeSearchResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contentMatchCount: ").append(toIndentedString(contentMatchCount)).append("\n");
    sb.append("    contentMatches: ").append(toIndentedString(contentMatches)).append("\n");
    sb.append("    pathMatches: ").append(toIndentedString(pathMatches)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
