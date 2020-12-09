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
import com.rappi.bitbucket.client.model.PipelineStepError;
import com.rappi.bitbucket.client.model.PipelineStepStateCompletedResult;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PipelineStepStateCompletedError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PipelineStepStateCompletedError extends PipelineStepStateCompletedResult {
  /**
   * The name of the result (ERROR)
   */
  public enum NameEnum {
    ERROR("ERROR");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("name")
  private NameEnum name = null;

  @JsonProperty("error")
  private PipelineStepError error = null;

  public PipelineStepStateCompletedError name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the result (ERROR)
   * @return name
  **/
  @Schema(description = "The name of the result (ERROR)")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public PipelineStepStateCompletedError error(PipelineStepError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public PipelineStepError getError() {
    return error;
  }

  public void setError(PipelineStepError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStepStateCompletedError pipelineStepStateCompletedError = (PipelineStepStateCompletedError) o;
    return Objects.equals(this.name, pipelineStepStateCompletedError.name) &&
        Objects.equals(this.error, pipelineStepStateCompletedError.error) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, error, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStepStateCompletedError {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
