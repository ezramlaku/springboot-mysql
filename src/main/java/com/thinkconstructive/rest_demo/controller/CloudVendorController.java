package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //get the cloud vendor by its ID
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") Long vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    //get all cloud vendors
    @GetMapping
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorService.getAllCloudVendors();
    }

    //create a new cloud vendor
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
return      cloudVendorService.createCloudVendor(cloudVendor);
    }

    //update a cloud vendor details  by its ID  - PUT method should be used for this purpose
    @PutMapping("{vendorId}")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor,@PathVariable("vendorId") Long vendorId) {
        return cloudVendorService.updateCloudVendor(cloudVendor, vendorId);
    }

    //    delete cloud vendor details
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") Long vendorId) {
        return cloudVendorService.deleteCloudVendor(vendorId);

    }


}
