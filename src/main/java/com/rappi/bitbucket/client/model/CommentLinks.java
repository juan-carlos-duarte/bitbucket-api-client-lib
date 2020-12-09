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
import com.rappi.bitbucket.client.model.SubjectTypesRepositoryEvents;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CommentLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class CommentLinks {
  @JsonProperty("self")
  private SubjectTypesRepositoryEvents self = null;

  @JsonProperty("html")
  private SubjectTypesRepositoryEvents html = null;

  @JsonProperty("code")
  private SubjectTypesRepositoryEvents code = null;

  public CommentLinks self(SubjectTypesRepositoryEvents self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getSelf() {
    return self;
  }

  public void setSelf(SubjectTypesRepositoryEvents self) {
    this.self = self;
  }

  public CommentLinks html(SubjectTypesRepositoryEvents html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getHtml() {
    return html;
  }

  public void setHtml(SubjectTypesRepositoryEvents html) {
    this.html = html;
  }

  public CommentLinks code(SubjectTypesRepositoryEvents code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getCode() {
    return code;
  }

  public void setCode(SubjectTypesRepositoryEvents code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentLinks commentLinks = (CommentLinks) o;
    return Objects.equals(this.self, commentLinks.self) &&
        Objects.equals(this.html, commentLinks.html) &&
        Objects.equals(this.code, commentLinks.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, html, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
