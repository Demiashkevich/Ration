package com.epam.ration.dao;

import com.epam.ration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    public User findUserByEmail(String email);

}
