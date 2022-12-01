package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Processor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")


public class Processor   {
  @JsonProperty("processorID")
  private Long processorID = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("architecture")
  private String architecture = null;

  @JsonProperty("frequency")
  private String frequency = null;

  @JsonProperty("core")
  private String core = null;

  @JsonProperty("price")
  private String price = null;

  public Processor processorID(Long processorID) {
    this.processorID = processorID;
    return this;
  }

  /**
   * Get processorID
   * @return processorID
   **/
  @Schema(description = "")
  
    public Long getProcessorID() {
    return processorID;
  }

  public void setProcessorID(Long processorID) {
    this.processorID = processorID;
  }

  public Processor brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   **/
  @Schema(example = "intel or amd", required = true, description = "")
      @NotNull

    public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Processor architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   **/
  @Schema(example = "Zen4", required = true, description = "")
      @NotNull

    public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public Processor frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   **/
  @Schema(example = "3,4", required = true, description = "")
      @NotNull

    public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public Processor core(String core) {
    this.core = core;
    return this;
  }

  /**
   * Get core
   * @return core
   **/
  @Schema(example = "count core then more than better", required = true, description = "")
      @NotNull

    public String getCore() {
    return core;
  }

  public void setCore(String core) {
    this.core = core;
  }

  public Processor price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(example = "10000", required = true, description = "")
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
    Processor processor = (Processor) o;
    return Objects.equals(this.processorID, processor.processorID) &&
        Objects.equals(this.brand, processor.brand) &&
        Objects.equals(this.architecture, processor.architecture) &&
        Objects.equals(this.frequency, processor.frequency) &&
        Objects.equals(this.core, processor.core) &&
        Objects.equals(this.price, processor.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorID, brand, architecture, frequency, core, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor {\n");
    
    sb.append("    processorID: ").append(toIndentedString(processorID)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
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
