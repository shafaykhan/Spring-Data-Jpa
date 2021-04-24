package com.shafay.Spring.Data.Jpa.relationship.one_to_one.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User saveOrUpdate(User user) {
    return userRepository.save(user);
  }

  public List<User> findAll() {

    return userRepository.findAll();
  }

  public Optional<User> findById(Long id) {
    return userRepository.findById(id);
  }

  public void deleteById(Long id) {
    userRepository.deleteById(id);
  }

}
