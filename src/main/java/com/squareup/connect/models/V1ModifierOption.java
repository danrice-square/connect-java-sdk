/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1ModifierOption
 */

public class V1ModifierOption {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price_money")
  private V1Money priceMoney = null;

  @JsonProperty("on_by_default")
  private Boolean onByDefault = null;

  @JsonProperty("ordinal")
  private Integer ordinal = null;

  @JsonProperty("modifier_list_id")
  private String modifierListId = null;

  public V1ModifierOption id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The modifier option's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The modifier option's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1ModifierOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The modifier option's name.
   * @return name
  **/
  @ApiModelProperty(value = "The modifier option's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ModifierOption priceMoney(V1Money priceMoney) {
    this.priceMoney = priceMoney;
    return this;
  }

   /**
   * The modifier option's price.
   * @return priceMoney
  **/
  @ApiModelProperty(value = "The modifier option's price.")
  public V1Money getPriceMoney() {
    return priceMoney;
  }

  public void setPriceMoney(V1Money priceMoney) {
    this.priceMoney = priceMoney;
  }

  public V1ModifierOption onByDefault(Boolean onByDefault) {
    this.onByDefault = onByDefault;
    return this;
  }

   /**
   * If true, the modifier option is the default option in a modifier list for which selection_type is SINGLE.
   * @return onByDefault
  **/
  @ApiModelProperty(value = "If true, the modifier option is the default option in a modifier list for which selection_type is SINGLE.")
  public Boolean getOnByDefault() {
    return onByDefault;
  }

  public void setOnByDefault(Boolean onByDefault) {
    this.onByDefault = onByDefault;
  }

  public V1ModifierOption ordinal(Integer ordinal) {
    this.ordinal = ordinal;
    return this;
  }

   /**
   * Indicates the modifier option's list position when displayed in Square Register and the merchant dashboard. If more than one modifier option in the same modifier list has the same ordinal value, those options are displayed in alphabetical order.
   * @return ordinal
  **/
  @ApiModelProperty(value = "Indicates the modifier option's list position when displayed in Square Register and the merchant dashboard. If more than one modifier option in the same modifier list has the same ordinal value, those options are displayed in alphabetical order.")
  public Integer getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }

  public V1ModifierOption modifierListId(String modifierListId) {
    this.modifierListId = modifierListId;
    return this;
  }

   /**
   * The ID of the modifier list the option belongs to.
   * @return modifierListId
  **/
  @ApiModelProperty(value = "The ID of the modifier list the option belongs to.")
  public String getModifierListId() {
    return modifierListId;
  }

  public void setModifierListId(String modifierListId) {
    this.modifierListId = modifierListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ModifierOption v1ModifierOption = (V1ModifierOption) o;
    return Objects.equals(this.id, v1ModifierOption.id) &&
        Objects.equals(this.name, v1ModifierOption.name) &&
        Objects.equals(this.priceMoney, v1ModifierOption.priceMoney) &&
        Objects.equals(this.onByDefault, v1ModifierOption.onByDefault) &&
        Objects.equals(this.ordinal, v1ModifierOption.ordinal) &&
        Objects.equals(this.modifierListId, v1ModifierOption.modifierListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, priceMoney, onByDefault, ordinal, modifierListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ModifierOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceMoney: ").append(toIndentedString(priceMoney)).append("\n");
    sb.append("    onByDefault: ").append(toIndentedString(onByDefault)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    modifierListId: ").append(toIndentedString(modifierListId)).append("\n");
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

