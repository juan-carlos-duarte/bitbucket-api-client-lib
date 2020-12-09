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
 * An executable pipeline command.
 */
@Schema(description = "An executable pipeline command.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PipelineCommand {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("command")
  private String command = null;

  public PipelineCommand name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the command.
   * @return name
  **/
  @Schema(description = "The name of the command.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelineCommand command(String command) {
    this.command = command;
    return this;
  }

   /**
   * The executable command.
   * @return command
  **/
  @Schema(description = "The executable command.")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineCommand pipelineCommand = (PipelineCommand) o;
    return Objects.equals(this.name, pipelineCommand.name) &&
        Objects.equals(this.command, pipelineCommand.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, command);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineCommand {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
