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
import com.rappi.bitbucket.client.model.Comment;
import com.rappi.bitbucket.client.model.CommentInline;
import com.rappi.bitbucket.client.model.CommentLinks;
import com.rappi.bitbucket.client.model.Issue;
import com.rappi.bitbucket.client.model.IssueContent;
import com.rappi.bitbucket.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * IssueComment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class IssueComment extends Comment {
  @JsonProperty("issue")
  private Issue issue = null;

  public IssueComment issue(Issue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @Schema(description = "")
  public Issue getIssue() {
    return issue;
  }

  public void setIssue(Issue issue) {
    this.issue = issue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueComment issueComment = (IssueComment) o;
    return Objects.equals(this.issue, issueComment.issue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueComment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
