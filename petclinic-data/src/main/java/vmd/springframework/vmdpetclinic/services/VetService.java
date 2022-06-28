package vmd.springframework.vmdpetclinic.services;

import vmd.springframework.vmdpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
