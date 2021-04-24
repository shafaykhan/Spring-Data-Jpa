package com.shafay.Spring.Data.Jpa.relationship.one_to_one.passport;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PassportService {

  private final PassportRepository passportRepository;

  public PassportService(PassportRepository passportRepository) {
    this.passportRepository = passportRepository;
  }

  public Passport saveOrUpdate(Passport passport) {
    return passportRepository.save(passport);
  }

  public List<Passport> findAll() {
    return passportRepository.findAll();
  }

  public Optional<Passport> findById(Long id) {
    return passportRepository.findById(id);
  }

  public void deleteById(Long id) {
    passportRepository.deleteById(id);
  }

}
