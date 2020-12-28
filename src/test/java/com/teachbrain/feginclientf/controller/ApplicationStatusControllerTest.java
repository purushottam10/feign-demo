package com.teachbrain.feginclientf.controller;

import com.teachbrain.feginclientf.model.User;
import com.teachbrain.feginclientf.service.UserService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationStatusControllerTest {


    private MockMvc mockMvc;
    @Mock
    private UserService userService;
    @InjectMocks
    private ApplicationStatusController applicationStatusController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(applicationStatusController)
                .build();
    }

    @Test
    public void getAllUserTest() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(1l,"purushottam", "puru@gmail.com", "988484883"));
        users.add(new User(2l,"purus", "puru@gmail.com", "988484883"));
        when(userService.getAllUser()).thenReturn(users);
        this.mockMvc.perform(get("/status/getAll")).andExpect(status().isOk())
                .andExpect(content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.*", Matchers.hasSize(2)));
    }

}
