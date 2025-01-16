package br.com.erikdev.toDoList.service;

import br.com.erikdev.toDoList.entity.ToDoEntity;
import br.com.erikdev.toDoList.repository.ToDoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDoEntity> create(ToDoEntity toDoEntity) {
        toDoRepository.save(toDoEntity);
        return list();
    }

    public List<ToDoEntity> list() {
        Sort sort = Sort.by("priority").descending();
        return toDoRepository.findAll(sort);
    }

    public List<ToDoEntity> update(ToDoEntity toDoEntity) {
        toDoRepository.save(toDoEntity);
        return list();
    }

    public List<ToDoEntity> delete(Long id) {
        toDoRepository.deleteById(id);
        return list();
    }
}
