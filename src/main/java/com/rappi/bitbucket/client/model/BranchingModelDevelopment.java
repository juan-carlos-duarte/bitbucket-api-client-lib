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
import com.rappi.bitbucket.client.model.Branch;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * BranchingModelDevelopment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class BranchingModelDevelopment {
  @JsonProperty("branch")
  private Branch branch = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("use_mainbranch")
  private Boolean useMainbranch = null;

  public BranchingModelDevelopment branch(Branch branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @Schema(description = "")
  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }

  public BranchingModelDevelopment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the target branch. Will be listed here even when the target branch does not exist. Will be &#x60;null&#x60; if targeting the main branch and the repository is empty.
   * @return name
  **/
  @Schema(required = true, description = "Name of the target branch. Will be listed here even when the target branch does not exist. Will be `null` if targeting the main branch and the repository is empty.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchingModelDevelopment useMainbranch(Boolean useMainbranch) {
    this.useMainbranch = useMainbranch;
    return this;
  }

   /**
   * Indicates if the setting points at an explicit branch (&#x60;false&#x60;) or tracks the main branch (&#x60;true&#x60;).
   * @return useMainbranch
  **/
  @Schema(required = true, description = "Indicates if the setting points at an explicit branch (`false`) or tracks the main branch (`true`).")
  public Boolean isUseMainbranch() {
    return useMainbranch;
  }

  public void setUseMainbranch(Boolean useMainbranch) {
    this.useMainbranch = useMainbranch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchingModelDevelopment branchingModelDevelopment = (BranchingModelDevelopment) o;
    return Objects.equals(this.branch, branchingModelDevelopment.branch) &&
        Objects.equals(this.name, branchingModelDevelopment.name) &&
        Objects.equals(this.useMainbranch, branchingModelDevelopment.useMainbranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, name, useMainbranch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchingModelDevelopment {\n");
    
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    useMainbranch: ").append(toIndentedString(useMainbranch)).append("\n");
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
