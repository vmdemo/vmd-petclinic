package vmd.springframework.sfgpetclinic.services;

import vmd.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
