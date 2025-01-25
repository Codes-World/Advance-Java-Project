package com.example.amansoni.CRUDWithSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amansoni.CRUDWithSpringBoot.models.Characters;

@Repository
public interface SuperHeroCharacterReposiory extends JpaRepository<Characters, Integer>{

}
