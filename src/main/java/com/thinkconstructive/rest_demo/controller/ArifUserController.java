package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.ArifUser;
import com.thinkconstructive.rest_demo.service.ArifUserService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arifusers")
public class ArifUserController {
    ArifUserService arifUserService;

    public ArifUserController(ArifUserService arifUserService) {
        this.arifUserService = arifUserService;
    }

    @GetMapping("{userId}")
    public ArifUser getArifUserById(@PathVariable("userId") Long userId) {
        return arifUserService.getArifUser(userId);
    }

    @GetMapping
    public List<ArifUser> getAllArifUsers() {
        return arifUserService.getAllArifUsers();
    }

    @PostMapping
    public String createArifUser(@RequestBody ArifUser arifuser) {
        return arifUserService.createArifUser(arifuser);
    }

    @PutMapping("{userId}")
    public String updateArifUser(@PathVariable("userId") Long userId, @RequestBody ArifUser updatedUser) {
        return arifUserService.updateArifUser(updatedUser, userId);
    }

    @DeleteMapping("{userId}")
    public String deleteArifUser(@PathVariable("userId") Long userId) {
        return arifUserService.deleteArifUser(userId);
    }


}
