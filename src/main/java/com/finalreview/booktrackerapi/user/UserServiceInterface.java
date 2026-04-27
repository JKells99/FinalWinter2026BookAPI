package com.finalreview.booktrackerapi.user;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);
}
