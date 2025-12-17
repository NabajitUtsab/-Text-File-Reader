import File.FileHandler;


public class Main {
    public static void main(String[] args) {
        String msg = FileHandler.createNewJsonFile("todo");
        System.out.println(msg);
    }
}