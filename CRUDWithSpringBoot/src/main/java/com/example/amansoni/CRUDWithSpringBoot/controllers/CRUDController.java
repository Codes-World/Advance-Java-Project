package com.example.amansoni.CRUDWithSpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.amansoni.CRUDWithSpringBoot.models.Characters;
import com.example.amansoni.CRUDWithSpringBoot.services.CRUDServices;

@RestController
public class CRUDController {
	
	@Autowired
	CRUDServices crudServices;
	//CRUD
	//Create API endpoint - POST
	
	@PostMapping(path = "create")
	public void createSuperHero(@RequestBody Characters superhero) {
		crudServices.createSuperhero(superhero);
	}
	
	@GetMapping("read")
	public Characters readSuperHeroById(@RequestParam(name="id") int val) {
		return crudServices.readSuperHero(val);
	}
	
	@PutMapping("update")
	public void updateSuperHero(@RequestBody Characters superhero, @RequestParam(name="id") int id) {
		crudServices.updateSuperHero(superhero, id);
	}
	
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name="id") int id) {
		crudServices.deleteSuperHero(id);
	}
}
