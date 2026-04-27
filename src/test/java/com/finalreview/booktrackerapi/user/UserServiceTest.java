package com.finalreview.booktrackerapi.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;
    @Test
    public void testUserCreate(){
        User user = new User();
        user.setUsername("test");
        user.setEmail("test@example.com");
        user.setPassword("1234");
        user.setBio("test bio");

        when(userRepository.save(user)).thenReturn(user);
        userService.createUser(user);
        Assertions.assertEquals("test", user.getUsername());
        Assertions.assertEquals("test@example.com", user.getEmail());
        Assertions.assertEquals("test bio", user.getBio());
    }

}
