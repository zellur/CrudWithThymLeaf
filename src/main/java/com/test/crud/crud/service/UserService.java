package com.test.crud.crud.service;

import com.test.crud.crud.data.User;
import com.test.crud.crud.model.UserModel;
import com.test.crud.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserModel save(UserModel userModel){
        if(userModel.getId() != null){
            User user = userRepository.getOne(userModel.getId());
            user.setName(userModel.getName());
            user.setMobile(userModel.getMobile());
            user.setPassword(userModel.getPassword());
            user.setEmail(userModel.getEmail());
            userRepository.saveAndFlush(user);
            return new UserModel(user);
        } else {
           User user = userRepository.saveAndFlush(new User(userModel));
           return new UserModel(user);
        }
    }
    public List<UserModel> getAllUsers(){
        List<User> users = userRepository.findAll();
        List<UserModel> models = new ArrayList<>();
        for(User user : users){
            models.add(new UserModel(user));
        }
        return models;
    }

    public void delete(Long id){
        User user = userRepository.getOne(id);
        userRepository.delete(user);
    }
    public UserModel findUserByid(Long id){
        User user = userRepository.getOne(id);
        return new UserModel(user);
    }
}
