package com.alura_oracle_one.GutBucher.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alura_oracle_one.GutBucher.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByName(String name);
    List<Author> findByCountry(String country);
    
    List<Author> findByBirthYearLessThanEqualAndDeathYearGreaterThanEqualOrDeathYearIsNull(int year, int year2);
}
