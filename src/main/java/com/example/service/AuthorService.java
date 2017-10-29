package com.example.service;

import com.example.domain.Author;
import com.example.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Monir on 10/27/2017.
 */
@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        super();
        this.authorRepository = authorRepository;
    }

    public List<Author> list() {
        return authorRepository.findAllByOrderByLastNameAscFirstNameAsc();
    }

}
