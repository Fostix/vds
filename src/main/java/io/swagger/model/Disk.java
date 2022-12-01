package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Disk
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")


public class Disk   {
  @JsonProperty("DiskID")
  private Long diskID = null;

  @JsonProperty("capacity")
  private Long capacity = null;

  @JsonProperty("ssd")
  private Boolean ssd = null;

  @JsonProperty("price")
  private Long price = null;

  public Disk diskID(Long diskID) {
    this.diskID = diskID;
    return this;
  }

  /**
   * Get diskID
   * @return diskID
   **/
  @Schema(description = "")
  
    public Long getDiskID() {
    return diskID;
  }

  public void setDiskID(Long diskID) {
    this.diskID = diskID;
  }

  public Disk capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public Disk ssd(Boolean ssd) {
    this.ssd = ssd;
    return this;
  }

  /**
   * Get ssd
   * @return ssd
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Boolean isSsd() {
    return ssd;
  }

  public void setSsd(Boolean ssd) {
    this.ssd = ssd;
  }

  public Disk price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
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
    Disk disk = (Disk) o;
    return Objects.equals(this.diskID, disk.diskID) &&
        Objects.equals(this.capacity, disk.capacity) &&
        Objects.equals(this.ssd, disk.ssd) &&
        Objects.equals(this.price, disk.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskID, capacity, ssd, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disk {\n");
    
    sb.append("    diskID: ").append(toIndentedString(diskID)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    ssd: ").append(toIndentedString(ssd)).append("\n");
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
