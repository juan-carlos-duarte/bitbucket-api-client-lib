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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * IssueChangeChangesAssignee
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class IssueChangeChangesAssignee {
  @JsonProperty("old")
  private String old = null;

  @JsonProperty("new")
  private String _new = null;

  public IssueChangeChangesAssignee old(String old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @Schema(description = "")
  public String getOld() {
    return old;
  }

  public void setOld(String old) {
    this.old = old;
  }

  public IssueChangeChangesAssignee _new(String _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @Schema(description = "")
  public String getNew() {
    return _new;
  }

  public void setNew(String _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueChangeChangesAssignee issueChangeChangesAssignee = (IssueChangeChangesAssignee) o;
    return Objects.equals(this.old, issueChangeChangesAssignee.old) &&
        Objects.equals(this._new, issueChangeChangesAssignee._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(old, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueChangeChangesAssignee {\n");
    
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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