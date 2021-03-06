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
import com.rappi.bitbucket.client.model.Branch;
import com.rappi.bitbucket.client.model.Project;
import com.rappi.bitbucket.client.model.Repository;
import com.rappi.bitbucket.client.model.RepositoryLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
/**
 * Repository
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class Repository extends Object {
  @JsonProperty("links")
  private RepositoryLinks links = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("is_private")
  private Boolean isPrivate = null;

  @JsonProperty("parent")
  private Repository parent = null;

  /**
   * Gets or Sets scm
   */
  public enum ScmEnum {
    HG("hg"),
    GIT("git");

    private String value;

    ScmEnum(String value) {
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
    public static ScmEnum fromValue(String text) {
      for (ScmEnum b : ScmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("scm")
  private ScmEnum scm = null;

  @JsonProperty("owner")
  private Account owner = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("created_on")
  private OffsetDateTime createdOn = null;

  @JsonProperty("updated_on")
  private OffsetDateTime updatedOn = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("has_issues")
  private Boolean hasIssues = null;

  @JsonProperty("has_wiki")
  private Boolean hasWiki = null;

  /**
   *  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking 
   */
  public enum ForkPolicyEnum {
    ALLOW_FORKS("allow_forks"),
    NO_PUBLIC_FORKS("no_public_forks"),
    NO_FORKS("no_forks");

    private String value;

    ForkPolicyEnum(String value) {
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
    public static ForkPolicyEnum fromValue(String text) {
      for (ForkPolicyEnum b : ForkPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("fork_policy")
  private ForkPolicyEnum forkPolicy = null;

  @JsonProperty("project")
  private Project project = null;

  @JsonProperty("mainbranch")
  private Branch mainbranch = null;

  public Repository links(RepositoryLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public RepositoryLinks getLinks() {
    return links;
  }

  public void setLinks(RepositoryLinks links) {
    this.links = links;
  }

  public Repository uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The repository&#x27;s immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.
   * @return uuid
  **/
  @Schema(description = "The repository's immutable id. This can be used as a substitute for the slug segment in URLs. Doing this guarantees your URLs will survive renaming of the repository by its owner, or even transfer of the repository to a different user.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Repository fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The concatenation of the repository owner&#x27;s username and the slugified name, e.g. \&quot;evzijst/interruptingcow\&quot;. This is the same string used in Bitbucket URLs.
   * @return fullName
  **/
  @Schema(description = "The concatenation of the repository owner's username and the slugified name, e.g. \"evzijst/interruptingcow\". This is the same string used in Bitbucket URLs.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Repository isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @Schema(description = "")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public Repository parent(Repository parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Repository getParent() {
    return parent;
  }

  public void setParent(Repository parent) {
    this.parent = parent;
  }

  public Repository scm(ScmEnum scm) {
    this.scm = scm;
    return this;
  }

   /**
   * Get scm
   * @return scm
  **/
  @Schema(description = "")
  public ScmEnum getScm() {
    return scm;
  }

  public void setScm(ScmEnum scm) {
    this.scm = scm;
  }

  public Repository owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Repository name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Repository description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Repository createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Repository updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Repository size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Repository language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Repository hasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
    return this;
  }

   /**
   * Get hasIssues
   * @return hasIssues
  **/
  @Schema(description = "")
  public Boolean isHasIssues() {
    return hasIssues;
  }

  public void setHasIssues(Boolean hasIssues) {
    this.hasIssues = hasIssues;
  }

  public Repository hasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
    return this;
  }

   /**
   * Get hasWiki
   * @return hasWiki
  **/
  @Schema(description = "")
  public Boolean isHasWiki() {
    return hasWiki;
  }

  public void setHasWiki(Boolean hasWiki) {
    this.hasWiki = hasWiki;
  }

  public Repository forkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
    return this;
  }

   /**
   *  Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking 
   * @return forkPolicy
  **/
  @Schema(description = " Controls the rules for forking this repository.  * **allow_forks**: unrestricted forking * **no_public_forks**: restrict forking to private forks (forks cannot   be made public later) * **no_forks**: deny all forking ")
  public ForkPolicyEnum getForkPolicy() {
    return forkPolicy;
  }

  public void setForkPolicy(ForkPolicyEnum forkPolicy) {
    this.forkPolicy = forkPolicy;
  }

  public Repository project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Repository mainbranch(Branch mainbranch) {
    this.mainbranch = mainbranch;
    return this;
  }

   /**
   * Get mainbranch
   * @return mainbranch
  **/
  @Schema(description = "")
  public Branch getMainbranch() {
    return mainbranch;
  }

  public void setMainbranch(Branch mainbranch) {
    this.mainbranch = mainbranch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.links, repository.links) &&
        Objects.equals(this.uuid, repository.uuid) &&
        Objects.equals(this.fullName, repository.fullName) &&
        Objects.equals(this.isPrivate, repository.isPrivate) &&
        Objects.equals(this.parent, repository.parent) &&
        Objects.equals(this.scm, repository.scm) &&
        Objects.equals(this.owner, repository.owner) &&
        Objects.equals(this.name, repository.name) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.createdOn, repository.createdOn) &&
        Objects.equals(this.updatedOn, repository.updatedOn) &&
        Objects.equals(this.size, repository.size) &&
        Objects.equals(this.language, repository.language) &&
        Objects.equals(this.hasIssues, repository.hasIssues) &&
        Objects.equals(this.hasWiki, repository.hasWiki) &&
        Objects.equals(this.forkPolicy, repository.forkPolicy) &&
        Objects.equals(this.project, repository.project) &&
        Objects.equals(this.mainbranch, repository.mainbranch) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, uuid, fullName, isPrivate, parent, scm, owner, name, description, createdOn, updatedOn, size, language, hasIssues, hasWiki, forkPolicy, project, mainbranch, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    scm: ").append(toIndentedString(scm)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    hasIssues: ").append(toIndentedString(hasIssues)).append("\n");
    sb.append("    hasWiki: ").append(toIndentedString(hasWiki)).append("\n");
    sb.append("    forkPolicy: ").append(toIndentedString(forkPolicy)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    mainbranch: ").append(toIndentedString(mainbranch)).append("\n");
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
