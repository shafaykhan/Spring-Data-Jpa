package com.shafay.Spring.Data.Jpa.relationship.one_to_one.passport;

import com.shafay.Spring.Data.Jpa.relationship.one_to_one.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String number;
  @OneToOne(mappedBy = "passport")
  private User user;
}
