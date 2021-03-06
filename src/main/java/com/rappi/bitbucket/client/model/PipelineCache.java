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
import org.threeten.bp.OffsetDateTime;
/**
 * PipelineCache
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PipelineCache extends Object {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("pipeline_uuid")
  private String pipelineUuid = null;

  @JsonProperty("step_uuid")
  private String stepUuid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("file_size_bytes")
  private Integer fileSizeBytes = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  public PipelineCache uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID identifying the pipeline cache.
   * @return uuid
  **/
  @Schema(description = "The UUID identifying the pipeline cache.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public PipelineCache pipelineUuid(String pipelineUuid) {
    this.pipelineUuid = pipelineUuid;
    return this;
  }

   /**
   * The UUID of the pipeline that created the cache.
   * @return pipelineUuid
  **/
  @Schema(description = "The UUID of the pipeline that created the cache.")
  public String getPipelineUuid() {
    return pipelineUuid;
  }

  public void setPipelineUuid(String pipelineUuid) {
    this.pipelineUuid = pipelineUuid;
  }

  public PipelineCache stepUuid(String stepUuid) {
    this.stepUuid = stepUuid;
    return this;
  }

   /**
   * The uuid of the step that created the cache.
   * @return stepUuid
  **/
  @Schema(description = "The uuid of the step that created the cache.")
  public String getStepUuid() {
    return stepUuid;
  }

  public void setStepUuid(String stepUuid) {
    this.stepUuid = stepUuid;
  }

  public PipelineCache name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the cache.
   * @return name
  **/
  @Schema(description = "The name of the cache.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelineCache path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path where the cache contents were retrieved from.
   * @return path
  **/
  @Schema(description = "The path where the cache contents were retrieved from.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PipelineCache fileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }

   /**
   * The size of the file containing the archive of the cache.
   * @return fileSizeBytes
  **/
  @Schema(description = "The size of the file containing the archive of the cache.")
  public Integer getFileSizeBytes() {
    return fileSizeBytes;
  }

  public void setFileSizeBytes(Integer fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
  }

  public PipelineCache createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The timestamp when the cache was created.
   * @return createdOn
  **/
  @Schema(description = "The timestamp when the cache was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineCache pipelineCache = (PipelineCache) o;
    return Objects.equals(this.uuid, pipelineCache.uuid) &&
        Objects.equals(this.pipelineUuid, pipelineCache.pipelineUuid) &&
        Objects.equals(this.stepUuid, pipelineCache.stepUuid) &&
        Objects.equals(this.name, pipelineCache.name) &&
        Objects.equals(this.path, pipelineCache.path) &&
        Objects.equals(this.fileSizeBytes, pipelineCache.fileSizeBytes) &&
        Objects.equals(this.createdOn, pipelineCache.createdOn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, pipelineUuid, stepUuid, name, path, fileSizeBytes, createdOn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineCache {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    pipelineUuid: ").append(toIndentedString(pipelineUuid)).append("\n");
    sb.append("    stepUuid: ").append(toIndentedString(stepUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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
