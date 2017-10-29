package com.example.repository;

import com.example.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Monir on 10/27/2017.
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByOrderByPostedOnDesc();

    Post findBySlug(String slug);

    List<Post> findAllByAuthorIdOrderByPostedOnDesc(Long id);

}