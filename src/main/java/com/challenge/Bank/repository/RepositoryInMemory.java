package com.challenge.Bank.repository;

import com.challenge.Bank.DTO.TransactionDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class RepositoryInMemory implements TransactionRepository {

    private final Map<Long, TransactionDTO> map = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    @Override
    public List<TransactionDTO> findAll(Integer timeSearch) {
        return new ArrayList<>(map.values());
    }

    @Override
    public TransactionDTO save(TransactionDTO transactionDTO) {
        if (transactionDTO.getId()==null){transactionDTO.setId(sequence.getAndIncrement());}

        map.put(transactionDTO.getId(), transactionDTO);
        return transactionDTO;

    }

    @Override
    public void delete(Long id) {
        map.remove(id);
    }

}
