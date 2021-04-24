package com.shafay.Spring.Data.Jpa.relationship.one_to_one.user;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/one-to-one/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public User saveOrUpdate(@RequestBody User user) {
    return userService.saveOrUpdate(user);
  }

  @GetMapping
  public List<User> findAll() {
    return userService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<User> findById(@PathVariable Long id) {
    return userService.findById(id);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    userService.deleteById(id);
  }

}
