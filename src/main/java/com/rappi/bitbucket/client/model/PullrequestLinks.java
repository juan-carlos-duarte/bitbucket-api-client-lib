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
 * PullrequestLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PullrequestLinks {
  @JsonProperty("self")
  private SubjectTypesRepositoryEvents self = null;

  @JsonProperty("html")
  private SubjectTypesRepositoryEvents html = null;

  @JsonProperty("commits")
  private SubjectTypesRepositoryEvents commits = null;

  @JsonProperty("approve")
  private SubjectTypesRepositoryEvents approve = null;

  @JsonProperty("diff")
  private SubjectTypesRepositoryEvents diff = null;

  @JsonProperty("diffstat")
  private SubjectTypesRepositoryEvents diffstat = null;

  @JsonProperty("comments")
  private SubjectTypesRepositoryEvents comments = null;

  @JsonProperty("activity")
  private SubjectTypesRepositoryEvents activity = null;

  @JsonProperty("merge")
  private SubjectTypesRepositoryEvents merge = null;

  @JsonProperty("decline")
  private SubjectTypesRepositoryEvents decline = null;

  public PullrequestLinks self(SubjectTypesRepositoryEvents self) {
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

  public PullrequestLinks html(SubjectTypesRepositoryEvents html) {
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

  public PullrequestLinks commits(SubjectTypesRepositoryEvents commits) {
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

  public PullrequestLinks approve(SubjectTypesRepositoryEvents approve) {
    this.approve = approve;
    return this;
  }

   /**
   * Get approve
   * @return approve
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getApprove() {
    return approve;
  }

  public void setApprove(SubjectTypesRepositoryEvents approve) {
    this.approve = approve;
  }

  public PullrequestLinks diff(SubjectTypesRepositoryEvents diff) {
    this.diff = diff;
    return this;
  }

   /**
   * Get diff
   * @return diff
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getDiff() {
    return diff;
  }

  public void setDiff(SubjectTypesRepositoryEvents diff) {
    this.diff = diff;
  }

  public PullrequestLinks diffstat(SubjectTypesRepositoryEvents diffstat) {
    this.diffstat = diffstat;
    return this;
  }

   /**
   * Get diffstat
   * @return diffstat
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getDiffstat() {
    return diffstat;
  }

  public void setDiffstat(SubjectTypesRepositoryEvents diffstat) {
    this.diffstat = diffstat;
  }

  public PullrequestLinks comments(SubjectTypesRepositoryEvents comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getComments() {
    return comments;
  }

  public void setComments(SubjectTypesRepositoryEvents comments) {
    this.comments = comments;
  }

  public PullrequestLinks activity(SubjectTypesRepositoryEvents activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getActivity() {
    return activity;
  }

  public void setActivity(SubjectTypesRepositoryEvents activity) {
    this.activity = activity;
  }

  public PullrequestLinks merge(SubjectTypesRepositoryEvents merge) {
    this.merge = merge;
    return this;
  }

   /**
   * Get merge
   * @return merge
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getMerge() {
    return merge;
  }

  public void setMerge(SubjectTypesRepositoryEvents merge) {
    this.merge = merge;
  }

  public PullrequestLinks decline(SubjectTypesRepositoryEvents decline) {
    this.decline = decline;
    return this;
  }

   /**
   * Get decline
   * @return decline
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getDecline() {
    return decline;
  }

  public void setDecline(SubjectTypesRepositoryEvents decline) {
    this.decline = decline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullrequestLinks pullrequestLinks = (PullrequestLinks) o;
    return Objects.equals(this.self, pullrequestLinks.self) &&
        Objects.equals(this.html, pullrequestLinks.html) &&
        Objects.equals(this.commits, pullrequestLinks.commits) &&
        Objects.equals(this.approve, pullrequestLinks.approve) &&
        Objects.equals(this.diff, pullrequestLinks.diff) &&
        Objects.equals(this.diffstat, pullrequestLinks.diffstat) &&
        Objects.equals(this.comments, pullrequestLinks.comments) &&
        Objects.equals(this.activity, pullrequestLinks.activity) &&
        Objects.equals(this.merge, pullrequestLinks.merge) &&
        Objects.equals(this.decline, pullrequestLinks.decline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, html, commits, approve, diff, diffstat, comments, activity, merge, decline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullrequestLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    approve: ").append(toIndentedString(approve)).append("\n");
    sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
    sb.append("    diffstat: ").append(toIndentedString(diffstat)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
    sb.append("    decline: ").append(toIndentedString(decline)).append("\n");
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