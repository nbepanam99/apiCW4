package com.cw4technologies.api.repo;

import com.cw4technologies.api.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String roleName);

}
