package com.thinkconstructive.rest_demo.repository;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {

    CloudVendor findByVendorId(Long  id);


//    CloudVendor findByVendorName(String name);

//    CloudVendor findByVendorAddress(String vendorAddress);

//    CloudVendor findByVendorPhoneNumber(String vendorPhoneNumber);
//    List<CloudVendor> findAllByVendorId(Long vendorId);





}
