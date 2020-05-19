package com.restful.example.repositories;

import com.restful.example.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Abro on 5/19/2020.
 */
public interface UserRepository extends CrudRepository<User, Integer>{
}
