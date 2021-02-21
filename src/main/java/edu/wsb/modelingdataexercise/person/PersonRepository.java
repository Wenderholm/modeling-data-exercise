package edu.wsb.modelingdataexercise.person;


import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByUsername(String username);

    Optional<Person> findByUsernameAndEnabled(String username, Boolean enabled);
}

