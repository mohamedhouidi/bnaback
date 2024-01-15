package com.projet.banking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.banking.entities.TransactionType;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Integer>{

}
