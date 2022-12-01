package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IPAddresses
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")


public class IPAddresses   {
  @JsonProperty("DiskID")
  private Long diskID = null;

  @JsonProperty("capacity")
  private String capacity = null;

  @JsonProperty("price")
  private Long price = null;

  public IPAddresses diskID(Long diskID) {
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

  public IPAddresses capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
   **/
  @Schema(example = "1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet", description = "")
  
    public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public IPAddresses price(Long price) {
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
    IPAddresses ipAddresses = (IPAddresses) o;
    return Objects.equals(this.diskID, ipAddresses.diskID) &&
        Objects.equals(this.capacity, ipAddresses.capacity) &&
        Objects.equals(this.price, ipAddresses.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskID, capacity, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddresses {\n");
    
    sb.append("    diskID: ").append(toIndentedString(diskID)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
