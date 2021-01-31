package io.github.bertunes.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.bertunes.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
