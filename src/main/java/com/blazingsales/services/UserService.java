package com.blazingsales.services;

import com.blazingsales.entity.User;
import java.util.List;
import java.util.UUID;


public interface UserService {

    boolean createUser(User user) throws Exception;

    boolean updateUser(User user);

    List<User> getAllUserAccounts();

    User getById(UUID userId);

    boolean deleteUserById(UUID userId);

    boolean restoreUserById(UUID userId);


}
