package com.shafay.Spring.Data.Jpa.relationship.one_to_one.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAll();
}
