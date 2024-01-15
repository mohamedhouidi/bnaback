package com.projet.banking.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.banking.entities.Currency;
@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200"})
public interface CurrencyRepository extends JpaRepository<Currency, String>{

	public Optional<Currency> getByCode(String code);
}
