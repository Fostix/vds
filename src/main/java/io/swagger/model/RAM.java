package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RAM
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")


public class RAM   {
  @JsonProperty("RAMID")
  private Long RAMID = null;

  @JsonProperty("memory")
  private Long memory = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("price")
  private Integer price = null;

  public RAM RAMID(Long RAMID) {
    this.RAMID = RAMID;
    return this;
  }

  /**
   * Get RAMID
   * @return RAMID
   **/
  @Schema(description = "")
  
    public Long getRAMID() {
    return RAMID;
  }

  public void setRAMID(Long RAMID) {
    this.RAMID = RAMID;
  }

  public RAM memory(Long memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getMemory() {
    return memory;
  }

  public void setMemory(Long memory) {
    this.memory = memory;
  }

  public RAM frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public RAM price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
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
    RAM RAM = (RAM) o;
    return Objects.equals(this.RAMID, RAM.RAMID) &&
        Objects.equals(this.memory, RAM.memory) &&
        Objects.equals(this.frequency, RAM.frequency) &&
        Objects.equals(this.price, RAM.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RAMID, memory, frequency, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RAM {\n");
    
    sb.append("    RAMID: ").append(toIndentedString(RAMID)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
