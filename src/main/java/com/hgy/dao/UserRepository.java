package com.hgy.dao;

import com.hgy.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by He on 2020/4/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
