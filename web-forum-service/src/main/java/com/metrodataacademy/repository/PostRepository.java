package com.metrodataacademy.repository;

import com.metrodataacademy.domain.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    // TODO: Lengkapi query sesuai kebutuhan
    Page<Post> findByThreads_Id(String threadsId, Pageable pageable);
}
