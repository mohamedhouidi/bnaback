package com.projet.banking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.banking.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
