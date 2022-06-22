package idv.victor.service;

import idv.victor.entity.Todos;
import idv.victor.repo.TodoRepository;
import idv.victor.vo.TodoItem;
import idv.victor.vo.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    public TodoItem createTodo(TodoRequest request){

        return null;
    }

    public TodoItem findTodoById(Long todo_id){
        Optional<Todos> finding = todoRepository.findById(todo_id);
        TodoItem item = new TodoItem();
        String firstName = finding.map(todos -> todos.getUsers()).map(users -> users.getFirstName()).orElse("");
        String lastName = finding.map(todos -> todos.getUsers()).map(users -> users.getLastName()).orElse("");

        item.setEmail(finding.map(t->t.getUsers()).map(u->u.getEmail()).orElse("unknown@gmail.com"));
        item.setFullName(firstName+" "+lastName);
        item.setTitle(finding.map(todos -> todos.getTitle()).orElse(""));
        item.setContent(finding.map(todos -> todos.getItem()).orElse(""));

        return item;
    }
}
