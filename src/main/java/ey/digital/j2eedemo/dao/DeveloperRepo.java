package ey.digital.j2eedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ey.digital.j2eedemo.entities.Developer;

public interface DeveloperRepo extends JpaRepository<Developer, Integer> {

}
