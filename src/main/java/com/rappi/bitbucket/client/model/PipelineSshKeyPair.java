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
 * PipelineSshKeyPair
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class PipelineSshKeyPair extends Object {
  @JsonProperty("private_key")
  private String privateKey = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  public PipelineSshKeyPair privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The SSH private key. This value will be empty when retrieving the SSH key pair.
   * @return privateKey
  **/
  @Schema(description = "The SSH private key. This value will be empty when retrieving the SSH key pair.")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public PipelineSshKeyPair publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The SSH public key.
   * @return publicKey
  **/
  @Schema(description = "The SSH public key.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineSshKeyPair pipelineSshKeyPair = (PipelineSshKeyPair) o;
    return Objects.equals(this.privateKey, pipelineSshKeyPair.privateKey) &&
        Objects.equals(this.publicKey, pipelineSshKeyPair.publicKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, publicKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineSshKeyPair {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
