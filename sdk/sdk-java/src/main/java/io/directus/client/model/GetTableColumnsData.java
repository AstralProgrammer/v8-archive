/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.directus.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTableColumnsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T21:48:16.590Z")
public class GetTableColumnsData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("column_name")
  private String columnName = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("length")
  private String length = null;

  @SerializedName("precision")
  private Integer precision = null;

  @SerializedName("scale")
  private Integer scale = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("default_value")
  private String defaultValue = null;

  @SerializedName("nullable")
  private Boolean nullable = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("extra_options")
  private List<Object> extraOptions = null;

  @SerializedName("options")
  private List<Object> options = null;

  @SerializedName("table_name")
  private String tableName = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("ui")
  private String ui = null;

  @SerializedName("hidden_list")
  private Boolean hiddenList = null;

  @SerializedName("hidden_input")
  private Boolean hiddenInput = null;

  @SerializedName("relationship")
  private String relationship = null;

  @SerializedName("comment")
  private String comment = null;

  public GetTableColumnsData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetTableColumnsData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetTableColumnsData columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @ApiModelProperty(value = "")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public GetTableColumnsData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetTableColumnsData length(String length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public GetTableColumnsData precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Get precision
   * @return precision
  **/
  @ApiModelProperty(value = "")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }

  public GetTableColumnsData scale(Integer scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public Integer getScale() {
    return scale;
  }

  public void setScale(Integer scale) {
    this.scale = scale;
  }

  public GetTableColumnsData sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public GetTableColumnsData defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public GetTableColumnsData nullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

   /**
   * Get nullable
   * @return nullable
  **/
  @ApiModelProperty(value = "")
  public Boolean isNullable() {
    return nullable;
  }

  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }

  public GetTableColumnsData key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GetTableColumnsData extraOptions(List<Object> extraOptions) {
    this.extraOptions = extraOptions;
    return this;
  }

  public GetTableColumnsData addExtraOptionsItem(Object extraOptionsItem) {
    if (this.extraOptions == null) {
      this.extraOptions = new ArrayList<Object>();
    }
    this.extraOptions.add(extraOptionsItem);
    return this;
  }

   /**
   * Get extraOptions
   * @return extraOptions
  **/
  @ApiModelProperty(value = "")
  public List<Object> getExtraOptions() {
    return extraOptions;
  }

  public void setExtraOptions(List<Object> extraOptions) {
    this.extraOptions = extraOptions;
  }

  public GetTableColumnsData options(List<Object> options) {
    this.options = options;
    return this;
  }

  public GetTableColumnsData addOptionsItem(Object optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Object>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<Object> getOptions() {
    return options;
  }

  public void setOptions(List<Object> options) {
    this.options = options;
  }

  public GetTableColumnsData tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(value = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public GetTableColumnsData required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public GetTableColumnsData ui(String ui) {
    this.ui = ui;
    return this;
  }

   /**
   * Get ui
   * @return ui
  **/
  @ApiModelProperty(value = "")
  public String getUi() {
    return ui;
  }

  public void setUi(String ui) {
    this.ui = ui;
  }

  public GetTableColumnsData hiddenList(Boolean hiddenList) {
    this.hiddenList = hiddenList;
    return this;
  }

   /**
   * Get hiddenList
   * @return hiddenList
  **/
  @ApiModelProperty(value = "")
  public Boolean isHiddenList() {
    return hiddenList;
  }

  public void setHiddenList(Boolean hiddenList) {
    this.hiddenList = hiddenList;
  }

  public GetTableColumnsData hiddenInput(Boolean hiddenInput) {
    this.hiddenInput = hiddenInput;
    return this;
  }

   /**
   * Get hiddenInput
   * @return hiddenInput
  **/
  @ApiModelProperty(value = "")
  public Boolean isHiddenInput() {
    return hiddenInput;
  }

  public void setHiddenInput(Boolean hiddenInput) {
    this.hiddenInput = hiddenInput;
  }

  public GetTableColumnsData relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * Get relationship
   * @return relationship
  **/
  @ApiModelProperty(value = "")
  public String getRelationship() {
    return relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }

  public GetTableColumnsData comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTableColumnsData getTableColumnsData = (GetTableColumnsData) o;
    return Objects.equals(this.name, getTableColumnsData.name) &&
        Objects.equals(this.id, getTableColumnsData.id) &&
        Objects.equals(this.columnName, getTableColumnsData.columnName) &&
        Objects.equals(this.type, getTableColumnsData.type) &&
        Objects.equals(this.length, getTableColumnsData.length) &&
        Objects.equals(this.precision, getTableColumnsData.precision) &&
        Objects.equals(this.scale, getTableColumnsData.scale) &&
        Objects.equals(this.sort, getTableColumnsData.sort) &&
        Objects.equals(this.defaultValue, getTableColumnsData.defaultValue) &&
        Objects.equals(this.nullable, getTableColumnsData.nullable) &&
        Objects.equals(this.key, getTableColumnsData.key) &&
        Objects.equals(this.extraOptions, getTableColumnsData.extraOptions) &&
        Objects.equals(this.options, getTableColumnsData.options) &&
        Objects.equals(this.tableName, getTableColumnsData.tableName) &&
        Objects.equals(this.required, getTableColumnsData.required) &&
        Objects.equals(this.ui, getTableColumnsData.ui) &&
        Objects.equals(this.hiddenList, getTableColumnsData.hiddenList) &&
        Objects.equals(this.hiddenInput, getTableColumnsData.hiddenInput) &&
        Objects.equals(this.relationship, getTableColumnsData.relationship) &&
        Objects.equals(this.comment, getTableColumnsData.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, columnName, type, length, precision, scale, sort, defaultValue, nullable, key, extraOptions, options, tableName, required, ui, hiddenList, hiddenInput, relationship, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTableColumnsData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    extraOptions: ").append(toIndentedString(extraOptions)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
    sb.append("    hiddenList: ").append(toIndentedString(hiddenList)).append("\n");
    sb.append("    hiddenInput: ").append(toIndentedString(hiddenInput)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

