package com.matthewwerth.springbootreactconnect.repo;

import com.matthewwerth.springbootreactconnect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
