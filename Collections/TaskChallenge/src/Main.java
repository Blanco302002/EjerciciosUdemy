import java.util.*;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

/*
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);
*/
        // cuales son todas las tareas descriptas por el manager?
        Set<Task> misTareas = new HashSet<>();
        String[] integrantes = {"carol", "bob", "ann", "tasks"};

        for (int i = 0; i < integrantes.length; i++) {
            misTareas.addAll(TaskData.getTasks(integrantes[i]));
        }
        sortAndPrint("Total tareas", misTareas);

        // que tareas estan asignadas a al menos 3 de tus integrantes de equipo.
        for (int i = 0; i < integrantes.length - 1; i++) {
            misTareas.retainAll(TaskData.getTasks(integrantes[i]));
        }
        sortAndPrint("Tarea asignada a los 3 miembros del equipo", misTareas);
        misTareas.clear();

        // que tareas todavia tienen que ser asignadas?
        misTareas = TaskData.getTasks(integrantes[3]); // aca tengo las tareas en cola
        for (int i = 0; i < integrantes.length - 1; i++) {
            misTareas.removeAll(TaskData.getTasks(integrantes[i]));
        }
        sortAndPrint("Tareas que todavia faltan asignar", misTareas);
        misTareas.clear();

        // que tareas estan asignadas a al menos uno de los 3 integrantes de tu equipo
        misTareas = TaskData.getTasks(integrantes[1]);
        sortAndPrint("tareas de Bob", misTareas);
    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }
}
