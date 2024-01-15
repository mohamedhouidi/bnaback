package com.projet.banking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.banking.entities.Charge;

public interface ChargeRepository extends JpaRepository<Charge, Integer>{

}
