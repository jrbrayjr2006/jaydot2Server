package com.jaydot2.jaydot2server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class UserServiceTest {

    UserService service;
    private UserRepository mockRepository;

    @BeforeEach
    void setUp() {
        mockRepository = mock(UserRepository.class);
        service = new UserService(mockRepository);
    }

    @Test
    @DisplayName("Given a user, when the service save is called, the repository should involke save")
    void shouldInvokeRepository_whenInsertCalled() {
        // Given
        User user = User.builder().id(0).fullName("John Doe").email("johndoe@somemail.com").build();
        // When
        service.save(user);
        // Then
        verify(mockRepository).save(user);
    }
}