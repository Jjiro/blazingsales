package com.blazingsales.services;

import com.blazingsales.entity.UserAccount;

import java.util.List;
import java.util.UUID;


public class UserAccountService {

    boolean createUser(UserAccount userAccount) throws Exception;

    boolean updateUser(UserAccount user);

    List<UserAccount> getAllUserAccounts();

    UserAccount getById(UUID userId);

    boolean deleteUserById(UUID userId);

    boolean restoreUserById(UUID userId);

}
