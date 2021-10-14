package com.jaydot2.jaydot2server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ContactUsControllerTest {

    MockMvc mockMvc;
    ContactUsController controller;

    @BeforeEach
    void setUp() {
        controller = new ContactUsController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    @DisplayName("Given user endpoint, when user data submitted, then return status successful")
    void givenUserEndpoint_thenReturnStatusSuccessful() throws Exception{
        // Given
        User user = User.builder().id(0).fullName("John Doe").email("johndoe@somemail.com").build();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String jsonUser = ow.writeValueAsString(user);

        // When
        mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(jsonUser)).andExpect(status().is2xxSuccessful());
    }

    @Test
    @DisplayName("Given user data, then create a new user")
    void shouldCreateNewUser() throws Exception {
        // Given
        User user = User.builder().id(0).fullName("John Doe").email("johndoe@somemail.com").build();

        // When
        controller.createUser(user);

        // Then
    }

}