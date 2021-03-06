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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BranchingModelSettingsBranchTypes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class BranchingModelSettingsBranchTypes {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  /**
   * The kind of the branch type.
   */
  public enum KindEnum {
    FEATURE("feature"),
    BUGFIX("bugfix"),
    RELEASE("release"),
    HOTFIX("hotfix");

    private String value;

    KindEnum(String value) {
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
    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("kind")
  private KindEnum kind = null;

  @JsonProperty("prefix")
  private String prefix = null;

  public BranchingModelSettingsBranchTypes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the branch type is enabled or not. A disabled branch type may contain an invalid &#x60;prefix&#x60;.
   * @return enabled
  **/
  @Schema(description = "Whether the branch type is enabled or not. A disabled branch type may contain an invalid `prefix`.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BranchingModelSettingsBranchTypes kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of the branch type.
   * @return kind
  **/
  @Schema(required = true, description = "The kind of the branch type.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public BranchingModelSettingsBranchTypes prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * The prefix for this branch type. A branch with this prefix will be classified as per &#x60;kind&#x60;. The &#x60;prefix&#x60; of an enabled branch type must be a valid branch prefix.Additionally, it cannot be blank, empty or &#x60;null&#x60;. The &#x60;prefix&#x60; for a disabled branch type can be empty or invalid.
   * @return prefix
  **/
  @Schema(description = "The prefix for this branch type. A branch with this prefix will be classified as per `kind`. The `prefix` of an enabled branch type must be a valid branch prefix.Additionally, it cannot be blank, empty or `null`. The `prefix` for a disabled branch type can be empty or invalid.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchingModelSettingsBranchTypes branchingModelSettingsBranchTypes = (BranchingModelSettingsBranchTypes) o;
    return Objects.equals(this.enabled, branchingModelSettingsBranchTypes.enabled) &&
        Objects.equals(this.kind, branchingModelSettingsBranchTypes.kind) &&
        Objects.equals(this.prefix, branchingModelSettingsBranchTypes.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, kind, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchingModelSettingsBranchTypes {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
