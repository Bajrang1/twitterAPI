package com.twitte.twitter.repository;

import com.twitte.twitter.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
