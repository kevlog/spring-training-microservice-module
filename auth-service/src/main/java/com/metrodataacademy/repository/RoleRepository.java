package com.metrodataacademy.repository;

import com.metrodataacademy.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    // TODO: Lengkapi query sesuai kebutuhan
    Role findByName(String name);
}
