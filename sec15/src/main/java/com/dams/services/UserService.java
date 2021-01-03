package com.dams.services;

import com.dams.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
