package edu.wsb.modelingdataexercise.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.wsb.modelingdataexercise.person.Person;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "company")
    @JsonIgnoreProperties("company")
    private Set<Person> people;

    public Company(String name) {
        this.name = name;
    }

    private String name;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Set<Person> getPeople() {
        return people;
    }
}