package com.blazingsales.services;


import com.blazingsales.entity.Role;
import com.blazingsales.entity.User;
import com.blazingsales.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserServiceImpl  implements UserDetailsService, UserService {

    private final UserRepo userRepo;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public boolean createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setActive(true);
        userRepo.save(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        if (user == null || !userRepo.existsById(user.getId())) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setActive(true);
        userRepo.save(user);
        return true;
    }

    @Override
    public List<User> getAllUserAccounts() {
        return userRepo.findAll();
    }

    @Override
    public User getById(UUID userId) {
        return userRepo.getOne(userId);
    }

    @Override
    public boolean deleteUserById(UUID userId) {
        User user = getById(userId);
        if (userId == null) {
            return false;
        }
        user.setActive(false);
        updateUser(user);
        return true;
    }

    @Override
    public boolean restoreUserById(UUID userId) {
        User user = getById(userId);
        if (userId == null) {
            return false;
        }
        user.setActive(true);
        updateUser(user);
        return true;
    }

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepo.findByEmail(email);
        if (optionalUser.isEmpty()) {
            throw new Exception("User with this email does not exist");
        }
        return optionalUser.get();
    }


}
