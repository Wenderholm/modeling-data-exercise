package edu.wsb.modelingdataexercise.company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//  company typ klasy

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
}