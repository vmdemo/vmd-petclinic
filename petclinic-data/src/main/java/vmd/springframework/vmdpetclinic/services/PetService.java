package vmd.springframework.vmdpetclinic.services;

import vmd.springframework.vmdpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
