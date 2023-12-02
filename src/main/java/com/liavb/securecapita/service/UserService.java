package com.liavb.securecapita.service;


import com.liavb.securecapita.domain.User;
import com.liavb.securecapita.dto.UserDTO;

public interface UserService {
    UserDTO createUser(User user);
    UserDTO getUserByEmail(String email);
}
