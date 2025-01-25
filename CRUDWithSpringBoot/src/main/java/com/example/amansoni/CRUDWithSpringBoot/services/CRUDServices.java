package com.example.amansoni.CRUDWithSpringBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.amansoni.CRUDWithSpringBoot.models.Characters;
import com.example.amansoni.CRUDWithSpringBoot.repositories.SuperHeroCharacterReposiory;

@Service
public class CRUDServices {
	
	@Autowired
	SuperHeroCharacterReposiory superHeroCharacterRepository;
	public void createSuperhero(Characters superhero) {
		superHeroCharacterRepository.save(superhero);
	}
	
	public Characters readSuperHero(int val) {
		return superHeroCharacterRepository.findById(val).get();
	}
	
	public void updateSuperHero(Characters superhero, int id) {
		Characters superHeroToBeUpdate = readSuperHero(id);
		superHeroToBeUpdate.setHumanName(superhero.getHumanName());
		superHeroCharacterRepository.save(superHeroToBeUpdate);
	}
	
	public void deleteSuperHero(int id) {
		superHeroCharacterRepository.deleteById(id);
	}
}
