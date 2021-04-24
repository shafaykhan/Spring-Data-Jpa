package com.shafay.Spring.Data.Jpa.relationship.one_to_one.passport;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/one-to-one/passports")
public class PassportController {

  private final PassportService passportService;

  public PassportController(PassportService passportService) {
    this.passportService = passportService;
  }

  @PostMapping
  public Passport saveOrUpdate(@RequestBody Passport passport) {
    return passportService.saveOrUpdate(passport);
  }

  @GetMapping
  public List<Passport> findAll() {
    return passportService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Passport> findById(@PathVariable Long id) {
    return passportService.findById(id);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    passportService.deleteById(id);
  }

}
