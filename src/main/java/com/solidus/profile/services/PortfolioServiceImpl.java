package com.solidus.profile.services;

import com.solidus.profile.models.Portfolio;
import com.solidus.profile.domain.PortfolioDTO;
import com.solidus.profile.repositories.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PortfolioServiceImpl implements PortfolioService{

    private final PortfolioRepository portfolioRepository;

    @Autowired
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Portfolio> getPortfolios(){
        return portfolioRepository.findAll();
    }

    @Override
    @Transactional
    public Portfolio updatePortfolio(PortfolioDTO portfolioDTO){
        Optional<Portfolio> portfolioOpt = portfolioRepository.findById(portfolioDTO.getId().intValue());
        if(portfolioOpt.isEmpty()){
            return new Portfolio();
        }

        Portfolio portfolio = portfolioOpt.get();
        //Assuming this fields are the same
        if(!portfolioDTO.getName().isEmpty() && !portfolioDTO.getName().equals(portfolio.getTwitterUserName())){
            portfolio.setTwitterUserName(portfolioDTO.getName());
        }

        if(!portfolioDTO.getDescription().isEmpty() && !portfolioDTO.getDescription().equals(portfolio.getDescription())){
            portfolio.setDescription(portfolioDTO.getDescription());
        }

        if(!portfolioDTO.getImage().isEmpty() && !portfolioDTO.getImage().equals(portfolio.getImageUrl())){
            portfolio.setImageUrl(portfolioDTO.getImage());
        }

        return portfolioRepository.saveAndFlush(portfolio);

    }

}
