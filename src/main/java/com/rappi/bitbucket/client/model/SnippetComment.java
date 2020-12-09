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
import com.rappi.bitbucket.client.model.GroupLinks;
import com.rappi.bitbucket.client.model.Snippet;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SnippetComment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class SnippetComment extends Object {
  @JsonProperty("links")
  private GroupLinks links = null;

  @JsonProperty("snippet")
  private Snippet snippet = null;

  public SnippetComment links(GroupLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public GroupLinks getLinks() {
    return links;
  }

  public void setLinks(GroupLinks links) {
    this.links = links;
  }

  public SnippetComment snippet(Snippet snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * Get snippet
   * @return snippet
  **/
  @Schema(description = "")
  public Snippet getSnippet() {
    return snippet;
  }

  public void setSnippet(Snippet snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnippetComment snippetComment = (SnippetComment) o;
    return Objects.equals(this.links, snippetComment.links) &&
        Objects.equals(this.snippet, snippetComment.snippet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, snippet, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnippetComment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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