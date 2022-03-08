package com.cw4technologies.api.service;

import com.cw4technologies.api.domain.AppUser;
import com.cw4technologies.api.domain.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    AppUser getUser(String userName);
    List<AppUser> getUsers();}
