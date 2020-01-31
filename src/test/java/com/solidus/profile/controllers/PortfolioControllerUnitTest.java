package com.solidus.profile.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solidus.profile.domain.PortfolioDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PortfolioControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void gettingUserInfo_thenCorrectResponse() throws Exception {
        this.mockMvc.perform(get("/zemoga_portfolio_api/user_info"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    // I used the first record of the database to execute this test.
    @Test
    public void modifyingUserInfo_thenCorrectResponse() throws Exception {

        final ObjectMapper objectMapper = new ObjectMapper();

        PortfolioDTO portfolioDTO = new PortfolioDTO();
        portfolioDTO.setId(1L);
        portfolioDTO.setDescription("King of the north");
        portfolioDTO.setName("Lord Snow");
        portfolioDTO.setImage("Test image URL");

        this.mockMvc.perform(post("/zemoga_portfolio_api/modify_user_info")
                .content(objectMapper.writeValueAsString(portfolioDTO))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
