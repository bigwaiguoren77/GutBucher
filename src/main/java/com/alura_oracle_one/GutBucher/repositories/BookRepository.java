package com.alura_oracle_one.GutBucher.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alura_oracle_one.GutBucher.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
    List<Book> findByLanguages(String language);
}
