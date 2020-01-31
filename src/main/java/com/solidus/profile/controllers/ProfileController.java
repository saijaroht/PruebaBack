package com.solidus.profile.controllers;

import com.solidus.profile.domain.Quote;
import com.solidus.profile.models.Portfolio;
import com.solidus.profile.services.PortfolioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProfileController {

    private static final Logger log = LoggerFactory.getLogger(ProfileController.class);

    private final PortfolioService portfolioService;

    private final RestTemplate restTemplate;

    @Autowired
    public ProfileController(PortfolioService portfolioService, RestTemplate restTemplate) {
        this.portfolioService = portfolioService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String loadProfile(Model model) {

        /* Consuming a rest service to test that retTemplate is working correctly, I'm not consuming the twitter API since
            I don't have an API-KEY and API-SECRET yet, however I have already requested the keys in a programmer account
            in order to complete it if necessary. */
        Quote quote = restTemplate.getForObject(
                "https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());

        //Getting any record of this collection, not specified if we have to show all the profiles or any of them.
        Portfolio portfolio = portfolioService.getPortfolios().get(1);
        model.addAttribute("portfolio", portfolio);
        return "profile";
    }

}
