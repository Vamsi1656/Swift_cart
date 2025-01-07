package com.greetlabs.swiftcart.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
 * @author Venkata Siva Reddy Tumu
 * @date 16/09/2024
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Long userMobile;
    private Long alterMobile;
    private String userEmail;
    private String userPassword;
    private Boolean isAccepted;
    
//    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL)
//    private List<UserAddress> addresses = new ArrayList<>();


}
