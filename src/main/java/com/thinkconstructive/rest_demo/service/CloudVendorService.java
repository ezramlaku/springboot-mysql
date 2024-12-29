package com.thinkconstructive.rest_demo.service;
import java.util.List;
import com.thinkconstructive.rest_demo.model.CloudVendor;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public CloudVendor getCloudVendor(Long cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public String updateCloudVendor(CloudVendor cloudVendor,Long vendorId);
    public String deleteCloudVendor(Long cloudVendorId);

}
