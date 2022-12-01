package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Country
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")


public class Country   {
  @JsonProperty("countryID")
  private Long countryID = null;

  @JsonProperty("nameCountry")
  private String nameCountry = null;

  @JsonProperty("price")
  private String price = null;

  public Country countryID(Long countryID) {
    this.countryID = countryID;
    return this;
  }

  /**
   * Get countryID
   * @return countryID
   **/
  @Schema(description = "")
  
    public Long getCountryID() {
    return countryID;
  }

  public void setCountryID(Long countryID) {
    this.countryID = countryID;
  }

  public Country nameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
    return this;
  }

  /**
   * Get nameCountry
   * @return nameCountry
   **/
  @Schema(example = "Russia, USA, Africa", required = true, description = "")
      @NotNull

    public String getNameCountry() {
    return nameCountry;
  }

  public void setNameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
  }

  public Country price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(example = "russian rubles, dollars, pounds", required = true, description = "")
      @NotNull

    public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.countryID, country.countryID) &&
        Objects.equals(this.nameCountry, country.nameCountry) &&
        Objects.equals(this.price, country.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryID, nameCountry, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryID: ").append(toIndentedString(countryID)).append("\n");
    sb.append("    nameCountry: ").append(toIndentedString(nameCountry)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
