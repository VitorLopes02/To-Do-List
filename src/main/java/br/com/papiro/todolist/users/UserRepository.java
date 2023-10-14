package br.com.papiro.todolist.users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);

}
