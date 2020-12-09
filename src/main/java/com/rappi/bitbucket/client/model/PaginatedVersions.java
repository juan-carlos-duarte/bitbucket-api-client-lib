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
import com.rappi.bitbucket.client.model.Version;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A paginated list of issue tracker versions.
 */
@Schema(description = "A paginated list of issue tracker versions.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PaginatedVersions {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pagelen")
  private Integer pagelen = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("values")
  private List<Version> values = null;

  public PaginatedVersions size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.
   * minimum: 0
   * @return size
  **/
  @Schema(description = "Total number of objects in the response. This is an optional element that is not provided in all responses, as it can be expensive to compute.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PaginatedVersions page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number of the current results. This is an optional element that is not provided in all responses.
   * minimum: 1
   * @return page
  **/
  @Schema(description = "Page number of the current results. This is an optional element that is not provided in all responses.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PaginatedVersions pagelen(Integer pagelen) {
    this.pagelen = pagelen;
    return this;
  }

   /**
   * Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.
   * minimum: 1
   * @return pagelen
  **/
  @Schema(description = "Current number of objects on the existing page. The default value is 10 with 100 being the maximum allowed value. Individual APIs may enforce different values.")
  public Integer getPagelen() {
    return pagelen;
  }

  public void setPagelen(Integer pagelen) {
    this.pagelen = pagelen;
  }

  public PaginatedVersions next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.
   * @return next
  **/
  @Schema(description = "Link to the next page if it exists. The last page of a collection does not have this value. Use this link to navigate the result set and refrain from constructing your own URLs.")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PaginatedVersions previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.
   * @return previous
  **/
  @Schema(description = "Link to previous page if it exists. A collections first page does not have this value. This is an optional element that is not provided in all responses. Some result sets strictly support forward navigation and never provide previous links. Clients must anticipate that backwards navigation is not always available. Use this link to navigate the result set and refrain from constructing your own URLs.")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public PaginatedVersions values(List<Version> values) {
    this.values = values;
    return this;
  }

  public PaginatedVersions addValuesItem(Version valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Version>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<Version> getValues() {
    return values;
  }

  public void setValues(List<Version> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedVersions paginatedVersions = (PaginatedVersions) o;
    return Objects.equals(this.size, paginatedVersions.size) &&
        Objects.equals(this.page, paginatedVersions.page) &&
        Objects.equals(this.pagelen, paginatedVersions.pagelen) &&
        Objects.equals(this.next, paginatedVersions.next) &&
        Objects.equals(this.previous, paginatedVersions.previous) &&
        Objects.equals(this.values, paginatedVersions.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, page, pagelen, next, previous, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedVersions {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pagelen: ").append(toIndentedString(pagelen)).append("\n");
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
