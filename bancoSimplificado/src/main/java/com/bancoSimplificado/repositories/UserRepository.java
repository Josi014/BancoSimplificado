package com.bancoSimplificado.repositories;

import com.bancoSimplificado.domain.user.User;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserByDocument(String document);
   Optional<User> findUserById(Long id);

}
