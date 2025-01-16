package br.com.erikdev.toDoList.controller;

import br.com.erikdev.toDoList.entity.ToDoEntity;
import br.com.erikdev.toDoList.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    public ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping
    List<ToDoEntity> create(@RequestBody ToDoEntity toDoEntity) {
        return toDoService.create(toDoEntity);
    }

    @GetMapping
    List<ToDoEntity> list() {
        return toDoService.list();
    }

    @PutMapping
    List<ToDoEntity> update(@RequestBody ToDoEntity toDoEntity) {
        return toDoService.update(toDoEntity);
    }

    @DeleteMapping("{id}")
    List<ToDoEntity> delete(@PathVariable("id") Long id) {
        return toDoService.delete(id);
    }
}
