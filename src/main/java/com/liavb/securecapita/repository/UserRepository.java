package com.liavb.securecapita.repository;

import com.liavb.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository<T extends User> {
    /* Basic CRUD Operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    boolean delete(Long id);

    /* More Complex Operations */
    User getUserByEmail(String email);
}
