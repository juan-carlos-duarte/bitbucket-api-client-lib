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
import com.rappi.bitbucket.client.model.Commit;
import com.rappi.bitbucket.client.model.RefLinks;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * A ref object, representing a branch or tag in a repository.
 */
@Schema(description = "A ref object, representing a branch or tag in a repository.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Ref {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("links")
  private RefLinks links = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("target")
  private Commit target = null;

  public Ref type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ref links(RefLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public RefLinks getLinks() {
    return links;
  }

  public void setLinks(RefLinks links) {
    this.links = links;
  }

  public Ref name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the ref.
   * @return name
  **/
  @Schema(description = "The name of the ref.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ref target(Commit target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public Commit getTarget() {
    return target;
  }

  public void setTarget(Commit target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ref ref = (Ref) o;
    return Objects.equals(this.type, ref.type) &&
        Objects.equals(this.links, ref.links) &&
        Objects.equals(this.name, ref.name) &&
        Objects.equals(this.target, ref.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, links, name, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ref {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
