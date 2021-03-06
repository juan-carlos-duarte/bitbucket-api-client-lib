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
import java.util.ArrayList;
import java.util.List;
/**
 * RepositoryLinks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class RepositoryLinks {
  @JsonProperty("self")
  private SubjectTypesRepositoryEvents self = null;

  @JsonProperty("html")
  private SubjectTypesRepositoryEvents html = null;

  @JsonProperty("avatar")
  private SubjectTypesRepositoryEvents avatar = null;

  @JsonProperty("pullrequests")
  private SubjectTypesRepositoryEvents pullrequests = null;

  @JsonProperty("commits")
  private SubjectTypesRepositoryEvents commits = null;

  @JsonProperty("forks")
  private SubjectTypesRepositoryEvents forks = null;

  @JsonProperty("watchers")
  private SubjectTypesRepositoryEvents watchers = null;

  @JsonProperty("downloads")
  private SubjectTypesRepositoryEvents downloads = null;

  @JsonProperty("clone")
  private List<SubjectTypesRepositoryEvents> clone = null;

  @JsonProperty("hooks")
  private SubjectTypesRepositoryEvents hooks = null;

  public RepositoryLinks self(SubjectTypesRepositoryEvents self) {
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

  public RepositoryLinks html(SubjectTypesRepositoryEvents html) {
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

  public RepositoryLinks avatar(SubjectTypesRepositoryEvents avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getAvatar() {
    return avatar;
  }

  public void setAvatar(SubjectTypesRepositoryEvents avatar) {
    this.avatar = avatar;
  }

  public RepositoryLinks pullrequests(SubjectTypesRepositoryEvents pullrequests) {
    this.pullrequests = pullrequests;
    return this;
  }

   /**
   * Get pullrequests
   * @return pullrequests
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getPullrequests() {
    return pullrequests;
  }

  public void setPullrequests(SubjectTypesRepositoryEvents pullrequests) {
    this.pullrequests = pullrequests;
  }

  public RepositoryLinks commits(SubjectTypesRepositoryEvents commits) {
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

  public RepositoryLinks forks(SubjectTypesRepositoryEvents forks) {
    this.forks = forks;
    return this;
  }

   /**
   * Get forks
   * @return forks
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getForks() {
    return forks;
  }

  public void setForks(SubjectTypesRepositoryEvents forks) {
    this.forks = forks;
  }

  public RepositoryLinks watchers(SubjectTypesRepositoryEvents watchers) {
    this.watchers = watchers;
    return this;
  }

   /**
   * Get watchers
   * @return watchers
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getWatchers() {
    return watchers;
  }

  public void setWatchers(SubjectTypesRepositoryEvents watchers) {
    this.watchers = watchers;
  }

  public RepositoryLinks downloads(SubjectTypesRepositoryEvents downloads) {
    this.downloads = downloads;
    return this;
  }

   /**
   * Get downloads
   * @return downloads
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getDownloads() {
    return downloads;
  }

  public void setDownloads(SubjectTypesRepositoryEvents downloads) {
    this.downloads = downloads;
  }

  public RepositoryLinks clone(List<SubjectTypesRepositoryEvents> clone) {
    this.clone = clone;
    return this;
  }

  public RepositoryLinks addCloneItem(SubjectTypesRepositoryEvents cloneItem) {
    if (this.clone == null) {
      this.clone = new ArrayList<SubjectTypesRepositoryEvents>();
    }
    this.clone.add(cloneItem);
    return this;
  }

   /**
   * Get clone
   * @return clone
  **/
  @Schema(description = "")
  public List<SubjectTypesRepositoryEvents> getClone() {
    return clone;
  }

  public void setClone(List<SubjectTypesRepositoryEvents> clone) {
    this.clone = clone;
  }

  public RepositoryLinks hooks(SubjectTypesRepositoryEvents hooks) {
    this.hooks = hooks;
    return this;
  }

   /**
   * Get hooks
   * @return hooks
  **/
  @Schema(description = "")
  public SubjectTypesRepositoryEvents getHooks() {
    return hooks;
  }

  public void setHooks(SubjectTypesRepositoryEvents hooks) {
    this.hooks = hooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryLinks repositoryLinks = (RepositoryLinks) o;
    return Objects.equals(this.self, repositoryLinks.self) &&
        Objects.equals(this.html, repositoryLinks.html) &&
        Objects.equals(this.avatar, repositoryLinks.avatar) &&
        Objects.equals(this.pullrequests, repositoryLinks.pullrequests) &&
        Objects.equals(this.commits, repositoryLinks.commits) &&
        Objects.equals(this.forks, repositoryLinks.forks) &&
        Objects.equals(this.watchers, repositoryLinks.watchers) &&
        Objects.equals(this.downloads, repositoryLinks.downloads) &&
        Objects.equals(this.clone, repositoryLinks.clone) &&
        Objects.equals(this.hooks, repositoryLinks.hooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, html, avatar, pullrequests, commits, forks, watchers, downloads, clone, hooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    pullrequests: ").append(toIndentedString(pullrequests)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    forks: ").append(toIndentedString(forks)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
    sb.append("    clone: ").append(toIndentedString(clone)).append("\n");
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
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
