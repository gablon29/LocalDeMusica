package homework2;

import java.util.ArrayList;
import java.util.List;

public class TaskAplication {
        List<String> listTask;

    public TaskAplication() {
        this.listTask = new ArrayList<>();
    }

    public void addTask(String newtask) {
            listTask.add(newtask);
            System.out.println("Tarea agregada con exito");
    }

        public void markTaskAsComplete(int index){
            String tarea = listTask.get(index);
            listTask.set(index, tarea + " completada");
            System.out.println(tarea + " completada");
        }
        public void removeTask(int index){
            String tareaRemovida = listTask.get(index);
            listTask.remove(index);
            System.out.println(tareaRemovida + " fue removida con exito");
        }

        public void printAllTask() {
            for (String task: listTask) {
                System.out.println(task);
            }
        }
}
