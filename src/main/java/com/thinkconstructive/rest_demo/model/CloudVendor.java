package com.thinkconstructive.rest_demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    @JsonProperty("vendorId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;

    @NotNull
    @Size(min = 1, max = 255)
    @JsonProperty("vendorName")
    private String vendorName;

    private String vendorAddress;
    private String vendorPhoneNumber;


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public CloudVendor(String vendorAddress, String vendorPhoneNumber, Long vendorId, String vendorName) {
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.vendorId = vendorId;
        this.vendorName = vendorName;
    }

    public CloudVendor() {
    }


}
