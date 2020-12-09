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
import com.rappi.bitbucket.client.model.Account;
import com.rappi.bitbucket.client.model.GroupLinks;
import com.rappi.bitbucket.client.model.Workspace;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Group
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Group extends Object {
  @JsonProperty("links")
  private GroupLinks links = null;

  @JsonProperty("owner")
  private Account owner = null;

  @JsonProperty("workspace")
  private Workspace workspace = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("full_slug")
  private String fullSlug = null;

  public Group links(GroupLinks links) {
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

  public Group owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Group workspace(Workspace workspace) {
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @Schema(description = "")
  public Workspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * The \&quot;sluggified\&quot; version of the group&#x27;s name. This contains only ASCII characters and can therefore be slightly different than the name
   * @return slug
  **/
  @Schema(description = "The \"sluggified\" version of the group's name. This contains only ASCII characters and can therefore be slightly different than the name")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Group fullSlug(String fullSlug) {
    this.fullSlug = fullSlug;
    return this;
  }

   /**
   * The concatenation of the workspace&#x27;s slug and the group&#x27;s slug, separated with a colon (e.g. &#x60;acme:developers&#x60;) 
   * @return fullSlug
  **/
  @Schema(description = "The concatenation of the workspace's slug and the group's slug, separated with a colon (e.g. `acme:developers`) ")
  public String getFullSlug() {
    return fullSlug;
  }

  public void setFullSlug(String fullSlug) {
    this.fullSlug = fullSlug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.links, group.links) &&
        Objects.equals(this.owner, group.owner) &&
        Objects.equals(this.workspace, group.workspace) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.slug, group.slug) &&
        Objects.equals(this.fullSlug, group.fullSlug) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, owner, workspace, name, slug, fullSlug, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    fullSlug: ").append(toIndentedString(fullSlug)).append("\n");
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