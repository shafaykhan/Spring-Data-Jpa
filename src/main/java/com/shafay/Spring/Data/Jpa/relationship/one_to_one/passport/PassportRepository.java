package com.shafay.Spring.Data.Jpa.relationship.one_to_one.passport;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassportRepository extends CrudRepository<Passport, Long> {

  List<Passport> findAll();
}
