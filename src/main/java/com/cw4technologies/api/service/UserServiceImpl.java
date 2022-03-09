package com.cw4technologies.api.service;

import com.cw4technologies.api.domain.AppUser;
import com.cw4technologies.api.domain.Role;
import com.cw4technologies.api.repo.RoleRepository;
import com.cw4technologies.api.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Save new user : {}", user);
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Save new role : {}", role);
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        AppUser appUser = userRepository.findByUsername(userName);
        Role role = roleRepository.findByName(roleName);
        log.info("add role {} to user {}", role.getName(), appUser.getName());
        appUser.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String userName) {
        log.info("get user {}", userName);
        return userRepository.findByUsername(userName);
    }

    @Override
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
}
