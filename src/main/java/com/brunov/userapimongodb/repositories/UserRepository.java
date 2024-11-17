package com.brunov.userapimongodb.repositories;

import com.brunov.userapimongodb.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    User findByCpf(String cpf);
    List<User> queryByNomeLike(String name);
}
