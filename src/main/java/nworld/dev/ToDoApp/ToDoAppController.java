package nworld.dev.ToDoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoAppController {

    @GetMapping("/")
    public String toDoApp() {
        return "To-Do Application !";
    }

}
