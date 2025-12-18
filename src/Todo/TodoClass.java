package Todo;

import File.FileHandler;

import java.util.List;

public class TodoClass {

    private String name;
    private boolean done;


    public String toJson() {
        return "{" +
                "\"name\" : \"" + name + '\"' +
                ",\" done\" : " + done +
                '}';
    }

    public static String todoListToJson(List<TodoClass> list) {
        StringBuilder json = new StringBuilder();
        json.append("[");

        for (int i = 0; i < list.size(); i++) {
            json.append(list.get(i).toJson());

            if(i < list.size()-1){
                json.append(",");
            }

            FileHandler.writeFile("todo",json.toString());
        }
        json.append("]");
        FileHandler.writeFile("todo",json.toString());

        return json.toString();
    }


    public TodoClass() {

    }

    public TodoClass(String name, boolean done) {
        this.name = name;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
