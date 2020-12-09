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
import com.rappi.bitbucket.client.model.CommitstatusLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * Commitstatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Commitstatus extends Object {
  @JsonProperty("links")
  private CommitstatusLinks links = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("refname")
  private String refname = null;

  @JsonProperty("url")
  private String url = null;

  /**
   * Provides some indication of the status of this commit
   */
  public enum StateEnum {
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED"),
    INPROGRESS("INPROGRESS"),
    STOPPED("STOPPED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("updated_on")
  private OffsetDateTime updatedOn = null;

  public Commitstatus links(CommitstatusLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public CommitstatusLinks getLinks() {
    return links;
  }

  public void setLinks(CommitstatusLinks links) {
    this.links = links;
  }

  public Commitstatus uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The commit status&#x27; id.
   * @return uuid
  **/
  @Schema(description = "The commit status' id.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Commitstatus key(String key) {
    this.key = key;
    return this;
  }

   /**
   * An identifier for the status that&#x27;s unique to         its type (current \&quot;build\&quot; is the only supported type) and the vendor,         e.g. BB-DEPLOY
   * @return key
  **/
  @Schema(description = "An identifier for the status that's unique to         its type (current \"build\" is the only supported type) and the vendor,         e.g. BB-DEPLOY")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Commitstatus refname(String refname) {
    this.refname = refname;
    return this;
  }

   /**
   *  The name of the ref that pointed to this commit at the time the status object was created. Note that this the ref may since have moved off of the commit. This optional field can be useful for build systems whose build triggers and configuration are branch-dependent (e.g. a Pipeline build). It is legitimate for this field to not be set, or even apply (e.g. a static linting job).
   * @return refname
  **/
  @Schema(description = " The name of the ref that pointed to this commit at the time the status object was created. Note that this the ref may since have moved off of the commit. This optional field can be useful for build systems whose build triggers and configuration are branch-dependent (e.g. a Pipeline build). It is legitimate for this field to not be set, or even apply (e.g. a static linting job).")
  public String getRefname() {
    return refname;
  }

  public void setRefname(String refname) {
    this.refname = refname;
  }

  public Commitstatus url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL linking back to the vendor or build system, for providing more information about whatever process produced this status. Accepts context variables &#x60;repository&#x60; and &#x60;commit&#x60; that Bitbucket will evaluate at runtime whenever at runtime. For example, one could use https://foo.com/builds/{repository.full_name} which Bitbucket will turn into https://foo.com/builds/foo/bar at render time.
   * @return url
  **/
  @Schema(description = "A URL linking back to the vendor or build system, for providing more information about whatever process produced this status. Accepts context variables `repository` and `commit` that Bitbucket will evaluate at runtime whenever at runtime. For example, one could use https://foo.com/builds/{repository.full_name} which Bitbucket will turn into https://foo.com/builds/foo/bar at render time.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Commitstatus state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Provides some indication of the status of this commit
   * @return state
  **/
  @Schema(description = "Provides some indication of the status of this commit")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Commitstatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * An identifier for the build itself, e.g. BB-DEPLOY-1
   * @return name
  **/
  @Schema(description = "An identifier for the build itself, e.g. BB-DEPLOY-1")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Commitstatus description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the build (e.g. \&quot;Unit tests in Bamboo\&quot;)
   * @return description
  **/
  @Schema(description = "A description of the build (e.g. \"Unit tests in Bamboo\")")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Commitstatus createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Commitstatus updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commitstatus commitstatus = (Commitstatus) o;
    return Objects.equals(this.links, commitstatus.links) &&
        Objects.equals(this.uuid, commitstatus.uuid) &&
        Objects.equals(this.key, commitstatus.key) &&
        Objects.equals(this.refname, commitstatus.refname) &&
        Objects.equals(this.url, commitstatus.url) &&
        Objects.equals(this.state, commitstatus.state) &&
        Objects.equals(this.name, commitstatus.name) &&
        Objects.equals(this.description, commitstatus.description) &&
        Objects.equals(this.createdOn, commitstatus.createdOn) &&
        Objects.equals(this.updatedOn, commitstatus.updatedOn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, uuid, key, refname, url, state, name, description, createdOn, updatedOn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commitstatus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    refname: ").append(toIndentedString(refname)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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