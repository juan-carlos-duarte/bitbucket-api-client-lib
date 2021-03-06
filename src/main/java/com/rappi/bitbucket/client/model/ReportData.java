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
 * A key-value element that will be displayed along with the report.
 */
@Schema(description = "A key-value element that will be displayed along with the report.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class ReportData {
  /**
   * The type of data contained in the value field. If not provided, then the value will be detected as a boolean, number or string.
   */
  public enum TypeEnum {
    BOOLEAN("BOOLEAN"),
    DATE("DATE"),
    DURATION("DURATION"),
    LINK("LINK"),
    NUMBER("NUMBER"),
    PERCENTAGE("PERCENTAGE"),
    TEXT("TEXT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("value")
  private Object value = null;

  public ReportData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of data contained in the value field. If not provided, then the value will be detected as a boolean, number or string.
   * @return type
  **/
  @Schema(description = "The type of data contained in the value field. If not provided, then the value will be detected as a boolean, number or string.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ReportData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A string describing what this data field represents.
   * @return title
  **/
  @Schema(description = "A string describing what this data field represents.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ReportData value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the data element.
   * @return value
  **/
  @Schema(description = "The value of the data element.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportData reportData = (ReportData) o;
    return Objects.equals(this.type, reportData.type) &&
        Objects.equals(this.title, reportData.title) &&
        Objects.equals(this.value, reportData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
