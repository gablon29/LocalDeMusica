package homework2;

public class Main {
    public static void main(String[] args) {

        TaskAplication aplicacion = new TaskAplication();
        System.out.println("agregamos tareas");
        aplicacion.addTask("planchar");
        aplicacion.addTask("lavar");
        aplicacion.addTask("cocinar");
        System.out.println("imprimos las tareas");
        aplicacion.printAllTask();
        System.out.println("marcamos las tarea como completa");
        aplicacion.markTaskAsComplete(1);
        aplicacion.markTaskAsComplete(2);
        System.out.println("imprimos las tareas nuevas");
        aplicacion.printAllTask();
        System.out.println("removemos las tareas");
        aplicacion.removeTask(2);
        System.out.println("imprimos las nuevas tareas");
        aplicacion.printAllTask();

    }
}