package com.example.repository;

/**
 * Created by Monir on 10/27/2017.
 */
import java.util.List;

import com.example.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}