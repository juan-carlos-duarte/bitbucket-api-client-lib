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
 * IssueContent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-12T14:05:09.453-06:00[America/Mexico_City]")
public class IssueContent {
  @JsonProperty("raw")
  private String raw = null;

  /**
   * The type of markup language the raw content is to be interpreted in.
   */
  public enum MarkupEnum {
    MARKDOWN("markdown"),
    CREOLE("creole"),
    PLAINTEXT("plaintext");

    private String value;

    MarkupEnum(String value) {
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
    public static MarkupEnum fromValue(String text) {
      for (MarkupEnum b : MarkupEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("markup")
  private MarkupEnum markup = null;

  @JsonProperty("html")
  private String html = null;

  public IssueContent raw(String raw) {
    this.raw = raw;
    return this;
  }

   /**
   * The text as it was typed by a user.
   * @return raw
  **/
  @Schema(description = "The text as it was typed by a user.")
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public IssueContent markup(MarkupEnum markup) {
    this.markup = markup;
    return this;
  }

   /**
   * The type of markup language the raw content is to be interpreted in.
   * @return markup
  **/
  @Schema(description = "The type of markup language the raw content is to be interpreted in.")
  public MarkupEnum getMarkup() {
    return markup;
  }

  public void setMarkup(MarkupEnum markup) {
    this.markup = markup;
  }

  public IssueContent html(String html) {
    this.html = html;
    return this;
  }

   /**
   * The user&#x27;s content rendered as HTML.
   * @return html
  **/
  @Schema(description = "The user's content rendered as HTML.")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueContent issueContent = (IssueContent) o;
    return Objects.equals(this.raw, issueContent.raw) &&
        Objects.equals(this.markup, issueContent.markup) &&
        Objects.equals(this.html, issueContent.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw, markup, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueContent {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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
