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
 * RefLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class RefLinks {
  @JsonProperty("self")
  private SubjectTypesRepositoryEvents self = null;

  @JsonProperty("commits")
  private SubjectTypesRepositoryEvents commits = null;

  @JsonProperty("html")
  private SubjectTypesRepositoryEvents html = null;

  public RefLinks self(SubjectTypesRepositoryEvents self) {
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

  public RefLinks commits(SubjectTypesRepositoryEvents commits) {
    this.commits = commits;
    return this;
  }

   /**
   * Get commits
   * @return commits
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getCommits() {
    return commits;
  }

  public void setCommits(SubjectTypesRepositoryEvents commits) {
    this.commits = commits;
  }

  public RefLinks html(SubjectTypesRepositoryEvents html) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefLinks refLinks = (RefLinks) o;
    return Objects.equals(this.self, refLinks.self) &&
        Objects.equals(this.commits, refLinks.commits) &&
        Objects.equals(this.html, refLinks.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, commits, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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
