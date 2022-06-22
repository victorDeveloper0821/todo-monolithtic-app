package idv.victor.controller;

import idv.victor.service.TodoService;
import idv.victor.vo.TodoItem;
import idv.victor.vo.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf8")
    @ResponseBody
    public TodoItem findTodoItem(@PathVariable("id") Long todo_id){
        return todoService.findTodoById(todo_id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = "application/json;charset=utf8")
    @ResponseBody
    public TodoItem createTodoItem(@RequestBody TodoRequest request){
        return null;
    }
}
