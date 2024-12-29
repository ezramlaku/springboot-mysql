package com.thinkconstructive.rest_demo.impl;

import com.thinkconstructive.rest_demo.model.ArifUser;

import java.util.List;

import com.thinkconstructive.rest_demo.repository.ArifUserRepository;
import com.thinkconstructive.rest_demo.service.ArifUserService;
import org.springframework.stereotype.Service;

@Service
public class ArifUserServiceImpl implements ArifUserService {
    ArifUserRepository arifUserRepository;

    public ArifUserServiceImpl(ArifUserRepository arifUserRepository) {
        this.arifUserRepository = arifUserRepository;
    }

    @Override
    public String createArifUser(ArifUser arifUser) {
        arifUserRepository.save(arifUser);
        return "ArifUser created successfully.";
    }

    @Override
    public ArifUser getArifUser(Long userId) {
        // Implement logic to get ArifUser by userId
        return arifUserRepository.findByUserId(userId);
    }

    @Override
    public List<ArifUser> getAllArifUsers() {
        // Implement logic to get all ArifUsers
        return arifUserRepository.findAll();
    }

    @Override
    public String updateArifUser(ArifUser user, Long userId) {
        ArifUser existingUser = arifUserRepository.findByUserId(userId);

        if (existingUser == null) {
            return "ArifUser not found.";
        }


        if (user.getEmail() != null) {
            existingUser.setEmail(user.getEmail());
        }

        if (user.getFirstName() != null) {
            existingUser.setFirstName(user.getFirstName());
        }

        if (user.getLastName() != null) {
            existingUser.setLastName(user.getLastName());
        }
        arifUserRepository.save(existingUser);


        return "ArifUser with id: " + userId + " updated successfully.";
    }

    @Override
    public String deleteArifUser(Long userId) {
        // Implement logic to delete ArifUser by userId
        ArifUser existingUser = arifUserRepository.findByUserId(userId);
        if (existingUser == null) {
            return "ArifUser not found.";
        }
        arifUserRepository.delete(existingUser);
        return "ArifUser with id: " + userId + " deleted successfully.";
    }
}

