package com.challenge.Bank.service;

import com.challenge.Bank.DTO.TransactionDTO;
import com.challenge.Bank.exceptions.BadRequest;
import com.challenge.Bank.exceptions.UnprocessableEntity;
import com.challenge.Bank.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

import static java.time.OffsetDateTime.now;

@Service
public class TransactionService {

    private final Logger log =  LoggerFactory.getLogger(TransactionService.class);

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public TransactionDTO save(TransactionDTO transactionDTO) {
        log.info("Saving transaction");

        var dataHora = transactionDTO.getDataHora();
        var valor = transactionDTO.getValor();

        if (!dataHora.isBefore(now())) {
            throw new UnprocessableEntity("Error relational in dataHora");
        }
        if (valor == null || valor < 0) {
            throw new BadRequest("Error relational in value is negative");
        }

        return transactionRepository.save(transactionDTO);
    }

    public void delete(Long id) {
        log.info("Deleting transaction");
        transactionRepository.delete(id);
    }

    public List<TransactionDTO> getTransactionByTime(Integer TimeSearch) {
        log.info("Getting transaction by time");

        OffsetDateTime dataHoraTimeSearch = OffsetDateTime.now().minusSeconds(TimeSearch);

        log.info("return of transaction");
        return transactionRepository.findAll(TimeSearch)
                .stream().filter(transactionDTO -> transactionDTO.getDataHora()
                        .isAfter(dataHoraTimeSearch)).toList();

    }

}
