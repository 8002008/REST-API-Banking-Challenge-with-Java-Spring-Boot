package com.challenge.Bank.repository;

import com.challenge.Bank.DTO.TransactionDTO;

import java.util.List;

public interface TransactionRepository {

    List<TransactionDTO> findAll(Integer timeSearch);

    TransactionDTO save(TransactionDTO transactionDTO);

    void delete(Long id);

}
