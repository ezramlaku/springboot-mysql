package com.thinkconstructive.rest_demo.impl;

import com.thinkconstructive.rest_demo.exception.CloudVendorNotFoundException;
import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    //    @Autowired
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Vendor Created Successfully";
    }

    @Override
    public CloudVendor getCloudVendor(Long cloudVendorId)   {
        CloudVendor dbVendor =cloudVendorRepository.findByVendorId(cloudVendorId);
        if(dbVendor == null){
           throw new CloudVendorNotFoundException("Requested Cloud Vendor Doses not Exist");
        }
        return dbVendor;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor,Long vendorId) {


//        cloudVendorRepository.save(cloudVendor);
        CloudVendor db_vendor = cloudVendorRepository.findByVendorId(vendorId);
        if(db_vendor == null){
            return "Vendor not found";
        }
        if(cloudVendor.getVendorName() != null){
            db_vendor.setVendorName(cloudVendor.getVendorName());
        }
        if(cloudVendor.getVendorPhoneNumber() != null){
            db_vendor.setVendorPhoneNumber(cloudVendor.getVendorPhoneNumber());
        }
        if(cloudVendor.getVendorAddress() != null){
            db_vendor.setVendorAddress(cloudVendor.getVendorAddress());
        }
        cloudVendorRepository.save(db_vendor);
        return "Vendor Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(Long cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Vendor deleted successfully";
    }
}
