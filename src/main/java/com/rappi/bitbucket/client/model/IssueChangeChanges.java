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
import com.rappi.bitbucket.client.model.IssueChangeChangesAssignee;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * IssueChangeChanges
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class IssueChangeChanges {
  @JsonProperty("assignee")
  private IssueChangeChangesAssignee assignee = null;

  @JsonProperty("state")
  private IssueChangeChangesAssignee state = null;

  @JsonProperty("title")
  private IssueChangeChangesAssignee title = null;

  @JsonProperty("kind")
  private IssueChangeChangesAssignee kind = null;

  @JsonProperty("milestone")
  private IssueChangeChangesAssignee milestone = null;

  @JsonProperty("component")
  private IssueChangeChangesAssignee component = null;

  @JsonProperty("priority")
  private IssueChangeChangesAssignee priority = null;

  @JsonProperty("version")
  private IssueChangeChangesAssignee version = null;

  @JsonProperty("content")
  private IssueChangeChangesAssignee content = null;

  public IssueChangeChanges assignee(IssueChangeChangesAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getAssignee() {
    return assignee;
  }

  public void setAssignee(IssueChangeChangesAssignee assignee) {
    this.assignee = assignee;
  }

  public IssueChangeChanges state(IssueChangeChangesAssignee state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getState() {
    return state;
  }

  public void setState(IssueChangeChangesAssignee state) {
    this.state = state;
  }

  public IssueChangeChanges title(IssueChangeChangesAssignee title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getTitle() {
    return title;
  }

  public void setTitle(IssueChangeChangesAssignee title) {
    this.title = title;
  }

  public IssueChangeChanges kind(IssueChangeChangesAssignee kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getKind() {
    return kind;
  }

  public void setKind(IssueChangeChangesAssignee kind) {
    this.kind = kind;
  }

  public IssueChangeChanges milestone(IssueChangeChangesAssignee milestone) {
    this.milestone = milestone;
    return this;
  }

   /**
   * Get milestone
   * @return milestone
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getMilestone() {
    return milestone;
  }

  public void setMilestone(IssueChangeChangesAssignee milestone) {
    this.milestone = milestone;
  }

  public IssueChangeChanges component(IssueChangeChangesAssignee component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getComponent() {
    return component;
  }

  public void setComponent(IssueChangeChangesAssignee component) {
    this.component = component;
  }

  public IssueChangeChanges priority(IssueChangeChangesAssignee priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getPriority() {
    return priority;
  }

  public void setPriority(IssueChangeChangesAssignee priority) {
    this.priority = priority;
  }

  public IssueChangeChanges version(IssueChangeChangesAssignee version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getVersion() {
    return version;
  }

  public void setVersion(IssueChangeChangesAssignee version) {
    this.version = version;
  }

  public IssueChangeChanges content(IssueChangeChangesAssignee content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public IssueChangeChangesAssignee getContent() {
    return content;
  }

  public void setContent(IssueChangeChangesAssignee content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueChangeChanges issueChangeChanges = (IssueChangeChanges) o;
    return Objects.equals(this.assignee, issueChangeChanges.assignee) &&
        Objects.equals(this.state, issueChangeChanges.state) &&
        Objects.equals(this.title, issueChangeChanges.title) &&
        Objects.equals(this.kind, issueChangeChanges.kind) &&
        Objects.equals(this.milestone, issueChangeChanges.milestone) &&
        Objects.equals(this.component, issueChangeChanges.component) &&
        Objects.equals(this.priority, issueChangeChanges.priority) &&
        Objects.equals(this.version, issueChangeChanges.version) &&
        Objects.equals(this.content, issueChangeChanges.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, state, title, kind, milestone, component, priority, version, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueChangeChanges {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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