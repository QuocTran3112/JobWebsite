package com.example.casestudymodule4.repository;

import com.example.casestudymodule4.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
