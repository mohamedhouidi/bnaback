package com.projet.banking.servicesImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.ChargeCalculationTypeRepository;
import com.projet.banking.Repositories.ChargeRepository;
import com.projet.banking.Repositories.ChargeTimeTypeRepository;
import com.projet.banking.entities.Charge;
import com.projet.banking.entities.ChargeCalculationType;
import com.projet.banking.entities.ChargeTimeType;
import com.projet.banking.services.ChargeService;

@Service
public class ChargeServiceImpl implements ChargeService {

	private ChargeRepository chargeRepository;
	private ChargeTimeTypeRepository chargeTimeTypeRepository;
	private ChargeCalculationTypeRepository chargeCalculationTypeRepository;
	
	
	
	public ChargeServiceImpl(ChargeRepository chargeRepository, ChargeTimeTypeRepository chargeTimeTypeRepository,
			ChargeCalculationTypeRepository chargeCalculationTypeRepository) {
		super();
		this.chargeRepository = chargeRepository;
		this.chargeTimeTypeRepository = chargeTimeTypeRepository;
		this.chargeCalculationTypeRepository = chargeCalculationTypeRepository;
	}



	@Override
	public Charge create(Charge charge) {
		Optional<ChargeTimeType>chargeTimeTypeOptional = chargeTimeTypeRepository.findById(charge.getChargeTimeType().getId());
	    if (!chargeTimeTypeOptional.isPresent())
	    	charge.setChargeTimeType(chargeTimeTypeRepository.save(charge.getChargeTimeType()));
	    
	    Optional<ChargeCalculationType>chargeCalculationTypeOptional = chargeCalculationTypeRepository.findById(charge.getChargeCalculationType().getId());
	    if (!chargeCalculationTypeOptional.isPresent())
	    	charge.setChargeCalculationType(chargeCalculationTypeRepository.save(charge.getChargeCalculationType()));
		
		
		return chargeRepository.save(charge);
	}

}
