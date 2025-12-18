import File.FileHandler;
import Todo.TodoClass;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String msg = FileHandler.createNewJsonFile("todo");
        System.out.println(msg);

//       TodoClass todo = new TodoClass();
//       todo.setName("Should complete the course");
//       todo.setDone(true);


        List<TodoClass> todoClassList = new ArrayList<>();

        TodoClass todoClass1 = new TodoClass("Wake up", false);
        TodoClass todoClass2 = new TodoClass("Breakfast", false);
        TodoClass todoClass3 = new TodoClass("Lunch", false);
        TodoClass todoClass4 = new TodoClass("Dinner", false);

        todoClassList.add(todoClass1);
        todoClassList.add(todoClass2);
        todoClassList.add(todoClass3);
        todoClassList.add(todoClass4);

//       String content = todo.toJson();
//       msg = FileHandler.writeFile("todo",content);
//       System.out.println(msg);

        msg = TodoClass.todoListToJson(todoClassList);
        System.out.println(msg);
    }
}