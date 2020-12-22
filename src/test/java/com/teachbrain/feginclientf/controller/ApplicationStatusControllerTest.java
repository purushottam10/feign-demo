package com.teachbrain.feginclientf.controller;

import com.teachbrain.feginclientf.client.FeignClientF;
import com.teachbrain.feginclientf.model.User;
import com.teachbrain.feginclientf.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(ApplicationStatusController.class)
public class ApplicationStatusControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;
    @MockBean
    private FeignClientF feignClientF;

    @Test
    public void getAllUserTest() throws  Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("purushottam", "puru@gmail.com", "988484883"));
        users.add(new User("purus", "puru@gmail.com", "988484883"));
        when(userService.getAllUser()).thenReturn(users);
       this.mockMvc.perform(get("/status/getAll")).andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON));

    }

}
