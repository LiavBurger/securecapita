package com.liavb.securecapita.service.implementation;

import com.liavb.securecapita.domain.User;
import com.liavb.securecapita.dto.UserDTO;
import com.liavb.securecapita.dtomapper.UserDTOMapper;
import com.liavb.securecapita.repository.UserRepository;
import com.liavb.securecapita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return UserDTOMapper.fromUser(userRepository.getUserByEmail(email));
    }
}
