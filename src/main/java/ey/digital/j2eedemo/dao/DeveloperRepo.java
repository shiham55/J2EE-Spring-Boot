package ey.digital.j2eedemo.dao;

import org.springframework.data.repository.CrudRepository;

import ey.digital.j2eedemo.entities.Developer;

public interface DeveloperRepo extends CrudRepository<Developer, Integer> {

}
