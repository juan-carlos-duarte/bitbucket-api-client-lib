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
import com.rappi.bitbucket.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * Participant
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Participant extends Object {
  @JsonProperty("user")
  private User user = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    PARTICIPANT("PARTICIPANT"),
    REVIEWER("REVIEWER");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("approved")
  private Boolean approved = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    APPROVED("approved"),
    CHANGES_REQUESTED("changes_requested");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("participated_on")
  private OffsetDateTime participatedOn = null;

  public Participant user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Participant role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public Participant approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @Schema(description = "")
  public Boolean isApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public Participant state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Participant participatedOn(OffsetDateTime participatedOn) {
    this.participatedOn = participatedOn;
    return this;
  }

   /**
   * The ISO8601 timestamp of the participant&#x27;s action. For approvers, this is the time of their approval. For commenters and pull request reviewers who are not approvers, this is the time they last commented, or null if they have not commented.
   * @return participatedOn
  **/
  @Schema(description = "The ISO8601 timestamp of the participant's action. For approvers, this is the time of their approval. For commenters and pull request reviewers who are not approvers, this is the time they last commented, or null if they have not commented.")
  public OffsetDateTime getParticipatedOn() {
    return participatedOn;
  }

  public void setParticipatedOn(OffsetDateTime participatedOn) {
    this.participatedOn = participatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participant participant = (Participant) o;
    return Objects.equals(this.user, participant.user) &&
        Objects.equals(this.role, participant.role) &&
        Objects.equals(this.approved, participant.approved) &&
        Objects.equals(this.state, participant.state) &&
        Objects.equals(this.participatedOn, participant.participatedOn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, role, approved, state, participatedOn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    participatedOn: ").append(toIndentedString(participatedOn)).append("\n");
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