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
import java.math.BigDecimal;
/**
 * The status of an import or export job
 */
@Schema(description = "The status of an import or export job")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class IssueJobStatus {
  @JsonProperty("type")
  private String type = null;

  /**
   * The status of the import/export job
   */
  public enum StatusEnum {
    ACCEPTED("ACCEPTED"),
    STARTED("STARTED"),
    RUNNING("RUNNING"),
    FAILURE("FAILURE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("phase")
  private String phase = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("pct")
  private BigDecimal pct = null;

  public IssueJobStatus type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IssueJobStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the import/export job
   * @return status
  **/
  @Schema(description = "The status of the import/export job")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public IssueJobStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * The phase of the import/export job
   * @return phase
  **/
  @Schema(description = "The phase of the import/export job")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IssueJobStatus total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of issues being imported/exported
   * @return total
  **/
  @Schema(description = "The total number of issues being imported/exported")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public IssueJobStatus count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of issues already imported/exported
   * @return count
  **/
  @Schema(description = "The total number of issues already imported/exported")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IssueJobStatus pct(BigDecimal pct) {
    this.pct = pct;
    return this;
  }

   /**
   * The percentage of issues already imported/exported
   * minimum: 0
   * maximum: 100
   * @return pct
  **/
  @Schema(description = "The percentage of issues already imported/exported")
  public BigDecimal getPct() {
    return pct;
  }

  public void setPct(BigDecimal pct) {
    this.pct = pct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueJobStatus issueJobStatus = (IssueJobStatus) o;
    return Objects.equals(this.type, issueJobStatus.type) &&
        Objects.equals(this.status, issueJobStatus.status) &&
        Objects.equals(this.phase, issueJobStatus.phase) &&
        Objects.equals(this.total, issueJobStatus.total) &&
        Objects.equals(this.count, issueJobStatus.count) &&
        Objects.equals(this.pct, issueJobStatus.pct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, phase, total, count, pct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueJobStatus {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    pct: ").append(toIndentedString(pct)).append("\n");
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
