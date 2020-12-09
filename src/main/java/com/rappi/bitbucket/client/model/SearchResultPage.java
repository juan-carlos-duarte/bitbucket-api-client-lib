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
import com.rappi.bitbucket.client.model.SearchCodeSearchResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SearchResultPage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class SearchResultPage {
  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pagelen")
  private Integer pagelen = null;

  @JsonProperty("query_substituted")
  private Boolean querySubstituted = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("values")
  private List<SearchCodeSearchResult> values = null;

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

   /**
   * Get page
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

   /**
   * Get pagelen
   * @return pagelen
  **/
  @Schema(description = "")
  public Integer getPagelen() {
    return pagelen;
  }

   /**
   * Get querySubstituted
   * @return querySubstituted
  **/
  @Schema(description = "")
  public Boolean isQuerySubstituted() {
    return querySubstituted;
  }

   /**
   * Get next
   * @return next
  **/
  @Schema(description = "")
  public String getNext() {
    return next;
  }

   /**
   * Get previous
   * @return previous
  **/
  @Schema(description = "")
  public String getPrevious() {
    return previous;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<SearchCodeSearchResult> getValues() {
    return values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultPage searchResultPage = (SearchResultPage) o;
    return Objects.equals(this.size, searchResultPage.size) &&
        Objects.equals(this.page, searchResultPage.page) &&
        Objects.equals(this.pagelen, searchResultPage.pagelen) &&
        Objects.equals(this.querySubstituted, searchResultPage.querySubstituted) &&
        Objects.equals(this.next, searchResultPage.next) &&
        Objects.equals(this.previous, searchResultPage.previous) &&
        Objects.equals(this.values, searchResultPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, page, pagelen, querySubstituted, next, previous, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultPage {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pagelen: ").append(toIndentedString(pagelen)).append("\n");
    sb.append("    querySubstituted: ").append(toIndentedString(querySubstituted)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
