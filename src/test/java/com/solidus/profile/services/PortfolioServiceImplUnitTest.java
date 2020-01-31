package com.solidus.profile.services;

import com.solidus.profile.models.Portfolio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortfolioServiceImplUnitTest {

    @Autowired
    private PortfolioService portfolioService;

    @Test
    public void checkDatabaseRecords(){
        List<Portfolio> portfolios = portfolioService.getPortfolios();

        Assert.assertEquals(portfolios.size(), 4);
    }
}
