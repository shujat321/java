import java.util.ArrayList;

public class assignment5_todolist {
    public static void main(String[] args) {

        ArrayList<String> todo = new ArrayList<>();

        todo.add("Buy groceries");
        todo.add("Finish assignment");
        todo.add("Clean room");
        todo.add("Read book");

        // Remove the third task
        todo.remove(2);

        StringBuffer output = new StringBuffer();
        output.append("My To-Do List:\n");

        int number = 1;
        for (String task : todo) {
            output.append(number)
                  .append(". ")
                  .append(task)
                  .append("\n");
            number++;
        }

        System.out.println(output.toString());
    }
}
