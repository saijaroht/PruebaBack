package com.solidus.profile.services;

import com.solidus.profile.domain.PortfolioDTO;
import com.solidus.profile.models.Portfolio;

import java.util.List;

public interface PortfolioService {

    /**
     * Get all the portfolios from database
     *
     * @return Collection of portfolios
     * */
    List<Portfolio> getPortfolios();

    /**
     * Update the data of a portfolio (this must have an id)
     *
     * @param portfolioDTO Information of the portfolio to update
     * @return Entity updated
     * */
    Portfolio updatePortfolio(PortfolioDTO portfolioDTO);
}
