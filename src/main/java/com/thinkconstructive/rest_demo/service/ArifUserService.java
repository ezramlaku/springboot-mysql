package com.thinkconstructive.rest_demo.service;
import java.util.List;
import com.thinkconstructive.rest_demo.model.ArifUser;
public interface ArifUserService {

    public String createArifUser(ArifUser arifUser);

    public ArifUser getArifUser(Long userId);
    public List<ArifUser> getAllArifUsers();

    public String updateArifUser(ArifUser user,Long userId);

    public String deleteArifUser(Long userId);



}
