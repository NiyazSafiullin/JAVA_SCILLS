package ru.safiullinnh.springboot.server.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.safiullinnh.springboot.server.demo.model.User;

public interface UsersRepositiry extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
