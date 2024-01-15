package com.projet.banking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.banking.entities.DepositType;
@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200"})
public interface DepositTypeRepository extends JpaRepository<DepositType, Integer>{

}
