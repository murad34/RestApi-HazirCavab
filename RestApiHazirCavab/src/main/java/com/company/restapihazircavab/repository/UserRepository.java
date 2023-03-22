package com.company.restapihazircavab.repository;

import com.company.restapihazircavab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int id);

}
