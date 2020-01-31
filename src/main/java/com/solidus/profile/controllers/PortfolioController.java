package com.solidus.profile.controllers;

import com.solidus.profile.models.Portfolio;
import com.solidus.profile.domain.PortfolioDTO;
import com.solidus.profile.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zemoga_portfolio_api")
public class PortfolioController {

    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping(value = "/user_info")
    public List<Portfolio> findAll(){
        return portfolioService.getPortfolios();
    }

    @PostMapping(value = "/modify_user_info", produces = MediaType.APPLICATION_JSON_VALUE)
    public Portfolio update(@RequestBody PortfolioDTO portfolioDTO){
        return portfolioService.updatePortfolio(portfolioDTO);
    }

}
