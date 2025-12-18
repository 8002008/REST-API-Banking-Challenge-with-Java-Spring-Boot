package com.challenge.Bank.service;

import com.challenge.Bank.DTO.StatisticsDTO;
import com.challenge.Bank.DTO.TransactionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;

@Service
public class StatisticsService {

    private  static final Logger log = LoggerFactory.getLogger(StatisticsService.class);
    private final TransactionService transactionService;

    public StatisticsService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public StatisticsDTO calcularStatistics(Integer TimeSearch) {
        log.info("Extract Statistics");

        long start = System.currentTimeMillis();

        var transactions = transactionService.getTransactionByTime(TimeSearch);

        if (transactions.isEmpty()) {
            return new StatisticsDTO();
        }

        DoubleSummaryStatistics statisticsTransactions = transactions.stream()
                .mapToDouble(TransactionDTO::getValor).summaryStatistics();

        long end = System.currentTimeMillis();
        long timeRequest = end - start;
        log.info("Extract Statistics Time: {}", timeRequest);

        return new StatisticsDTO(
                statisticsTransactions.getCount(),
                statisticsTransactions.getSum(),
                statisticsTransactions.getAverage(),
                statisticsTransactions.getMin(),
                statisticsTransactions.getMax());
    }

}
