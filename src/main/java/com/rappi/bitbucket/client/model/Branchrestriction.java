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
import com.rappi.bitbucket.client.model.Account;
import com.rappi.bitbucket.client.model.BranchingModelSettingsLinks;
import com.rappi.bitbucket.client.model.Group;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Branchrestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Branchrestriction extends Object {
  @JsonProperty("links")
  private BranchingModelSettingsLinks links = null;

  @JsonProperty("id")
  private Integer id = null;

  /**
   * The type of restriction that is being applied.
   */
  public enum KindEnum {
    REQUIRE_TASKS_TO_BE_COMPLETED("require_tasks_to_be_completed"),
    FORCE("force"),
    RESTRICT_MERGES("restrict_merges"),
    ENFORCE_MERGE_CHECKS("enforce_merge_checks"),
    REQUIRE_APPROVALS_TO_MERGE("require_approvals_to_merge"),
    ALLOW_AUTO_MERGE_WHEN_BUILDS_PASS("allow_auto_merge_when_builds_pass"),
    DELETE("delete"),
    REQUIRE_ALL_DEPENDENCIES_MERGED("require_all_dependencies_merged"),
    PUSH("push"),
    REQUIRE_PASSING_BUILDS_TO_MERGE("require_passing_builds_to_merge"),
    RESET_PULLREQUEST_APPROVALS_ON_CHANGE("reset_pullrequest_approvals_on_change"),
    REQUIRE_DEFAULT_REVIEWER_APPROVALS_TO_MERGE("require_default_reviewer_approvals_to_merge");

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

  /**
   * Indicates how the restriction is matched against a branch. The default is &#x60;glob&#x60;.
   */
  public enum BranchMatchKindEnum {
    BRANCHING_MODEL("branching_model"),
    GLOB("glob");

    private String value;

    BranchMatchKindEnum(String value) {
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
    public static BranchMatchKindEnum fromValue(String text) {
      for (BranchMatchKindEnum b : BranchMatchKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("branch_match_kind")
  private BranchMatchKindEnum branchMatchKind = null;

  /**
   * Apply the restriction to branches of this type. Active when &#x60;branch_match_kind&#x60; is &#x60;branching_model&#x60;. The branch type will be calculated using the branching model configured for the repository.
   */
  public enum BranchTypeEnum {
    FEATURE("feature"),
    BUGFIX("bugfix"),
    RELEASE("release"),
    HOTFIX("hotfix"),
    DEVELOPMENT("development"),
    PRODUCTION("production");

    private String value;

    BranchTypeEnum(String value) {
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
    public static BranchTypeEnum fromValue(String text) {
      for (BranchTypeEnum b : BranchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("branch_type")
  private BranchTypeEnum branchType = null;

  @JsonProperty("pattern")
  private String pattern = null;

  @JsonProperty("users")
  private List<Account> users = null;

  @JsonProperty("groups")
  private List<Group> groups = null;

  @JsonProperty("value")
  private Integer value = null;

  public Branchrestriction links(BranchingModelSettingsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public BranchingModelSettingsLinks getLinks() {
    return links;
  }

  public void setLinks(BranchingModelSettingsLinks links) {
    this.links = links;
  }

  public Branchrestriction id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The branch restriction status&#x27; id.
   * @return id
  **/
  @Schema(description = "The branch restriction status' id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Branchrestriction kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The type of restriction that is being applied.
   * @return kind
  **/
  @Schema(required = true, description = "The type of restriction that is being applied.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Branchrestriction branchMatchKind(BranchMatchKindEnum branchMatchKind) {
    this.branchMatchKind = branchMatchKind;
    return this;
  }

   /**
   * Indicates how the restriction is matched against a branch. The default is &#x60;glob&#x60;.
   * @return branchMatchKind
  **/
  @Schema(required = true, description = "Indicates how the restriction is matched against a branch. The default is `glob`.")
  public BranchMatchKindEnum getBranchMatchKind() {
    return branchMatchKind;
  }

  public void setBranchMatchKind(BranchMatchKindEnum branchMatchKind) {
    this.branchMatchKind = branchMatchKind;
  }

  public Branchrestriction branchType(BranchTypeEnum branchType) {
    this.branchType = branchType;
    return this;
  }

   /**
   * Apply the restriction to branches of this type. Active when &#x60;branch_match_kind&#x60; is &#x60;branching_model&#x60;. The branch type will be calculated using the branching model configured for the repository.
   * @return branchType
  **/
  @Schema(description = "Apply the restriction to branches of this type. Active when `branch_match_kind` is `branching_model`. The branch type will be calculated using the branching model configured for the repository.")
  public BranchTypeEnum getBranchType() {
    return branchType;
  }

  public void setBranchType(BranchTypeEnum branchType) {
    this.branchType = branchType;
  }

  public Branchrestriction pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Apply the restriction to branches that match this pattern. Active when &#x60;branch_match_kind&#x60; is &#x60;glob&#x60;. Will be empty when &#x60;branch_match_kind&#x60; is &#x60;branching_model&#x60;.
   * @return pattern
  **/
  @Schema(required = true, description = "Apply the restriction to branches that match this pattern. Active when `branch_match_kind` is `glob`. Will be empty when `branch_match_kind` is `branching_model`.")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public Branchrestriction users(List<Account> users) {
    this.users = users;
    return this;
  }

  public Branchrestriction addUsersItem(Account usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<Account>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<Account> getUsers() {
    return users;
  }

  public void setUsers(List<Account> users) {
    this.users = users;
  }

  public Branchrestriction groups(List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public Branchrestriction addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Group>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public Branchrestriction value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Value with kind-specific semantics: \&quot;require_approvals_to_merge\&quot; uses it to require a minimum number of approvals on a PR; \&quot;require_default_reviewer_approvals_to_merge\&quot; uses it to require a minimum number of approvals from default reviewers on a PR; \&quot;require_passing_builds_to_merge\&quot; uses it to require a minimum number of passing builds.
   * @return value
  **/
  @Schema(description = "Value with kind-specific semantics: \"require_approvals_to_merge\" uses it to require a minimum number of approvals on a PR; \"require_default_reviewer_approvals_to_merge\" uses it to require a minimum number of approvals from default reviewers on a PR; \"require_passing_builds_to_merge\" uses it to require a minimum number of passing builds.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
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
    Branchrestriction branchrestriction = (Branchrestriction) o;
    return Objects.equals(this.links, branchrestriction.links) &&
        Objects.equals(this.id, branchrestriction.id) &&
        Objects.equals(this.kind, branchrestriction.kind) &&
        Objects.equals(this.branchMatchKind, branchrestriction.branchMatchKind) &&
        Objects.equals(this.branchType, branchrestriction.branchType) &&
        Objects.equals(this.pattern, branchrestriction.pattern) &&
        Objects.equals(this.users, branchrestriction.users) &&
        Objects.equals(this.groups, branchrestriction.groups) &&
        Objects.equals(this.value, branchrestriction.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, kind, branchMatchKind, branchType, pattern, users, groups, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branchrestriction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    branchMatchKind: ").append(toIndentedString(branchMatchKind)).append("\n");
    sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
