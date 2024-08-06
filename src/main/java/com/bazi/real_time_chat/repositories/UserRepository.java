package com.bazi.real_time_chat.repositories;

import com.bazi.real_time_chat.models.Status;
import com.bazi.real_time_chat.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByStatus(Status status);
}
