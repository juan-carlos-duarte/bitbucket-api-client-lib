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
import com.rappi.bitbucket.client.model.PipelineSelector;
import com.rappi.bitbucket.client.model.PipelineTarget;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PipelineRefTarget
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PipelineRefTarget extends PipelineTarget {
  /**
   * The type of reference (branch/tag).
   */
  public enum RefTypeEnum {
    BRANCH("branch"),
    TAG("tag"),
    NAMED_BRANCH("named_branch"),
    BOOKMARK("bookmark");

    private String value;

    RefTypeEnum(String value) {
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
    public static RefTypeEnum fromValue(String text) {
      for (RefTypeEnum b : RefTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ref_type")
  private RefTypeEnum refType = null;

  @JsonProperty("ref_name")
  private String refName = null;

  @JsonProperty("commit")
  private Commit commit = null;

  @JsonProperty("selector")
  private PipelineSelector selector = null;

  public PipelineRefTarget refType(RefTypeEnum refType) {
    this.refType = refType;
    return this;
  }

   /**
   * The type of reference (branch/tag).
   * @return refType
  **/
  @Schema(description = "The type of reference (branch/tag).")
  public RefTypeEnum getRefType() {
    return refType;
  }

  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }

  public PipelineRefTarget refName(String refName) {
    this.refName = refName;
    return this;
  }

   /**
   * The name of the reference.
   * @return refName
  **/
  @Schema(description = "The name of the reference.")
  public String getRefName() {
    return refName;
  }

  public void setRefName(String refName) {
    this.refName = refName;
  }

  public PipelineRefTarget commit(Commit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @Schema(description = "")
  public Commit getCommit() {
    return commit;
  }

  public void setCommit(Commit commit) {
    this.commit = commit;
  }

  public PipelineRefTarget selector(PipelineSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @Schema(description = "")
  public PipelineSelector getSelector() {
    return selector;
  }

  public void setSelector(PipelineSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineRefTarget pipelineRefTarget = (PipelineRefTarget) o;
    return Objects.equals(this.refType, pipelineRefTarget.refType) &&
        Objects.equals(this.refName, pipelineRefTarget.refName) &&
        Objects.equals(this.commit, pipelineRefTarget.commit) &&
        Objects.equals(this.selector, pipelineRefTarget.selector) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refType, refName, commit, selector, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRefTarget {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
