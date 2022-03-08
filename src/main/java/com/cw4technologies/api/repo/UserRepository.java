package com.cw4technologies.api.repo;

import com.cw4technologies.api.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Long> {

    AppUser findByUsername(String username);
}
