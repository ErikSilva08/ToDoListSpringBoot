package br.com.erikdev.toDoList.repository;

import br.com.erikdev.toDoList.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Long> {
}
