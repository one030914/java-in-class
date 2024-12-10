import java.util.Scanner;

public class Task{
    private enum State{
        UNFINISHED, PROCESSING, COMPLETED
    }
    private State state;
    private int priority;
    private String name;
    public Task(int priority, String name){
        this.name = name;
        this.priority = priority;
        this.state = State.UNFINISHED;
    }
    public void updateStatus(State state){
        this.state = state;
    }
    public String toString(){
        return (this.priority + ". [" + this.state + "] " + this.name);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 100;
        Task[] tasks = new Task[SIZE];
        Task task;
        String cmd = "", name = "";
        int priority = 0, index = 0;

        while(scanner.hasNext()){
            cmd = scanner.next().toLowerCase();
            switch (cmd){
                case "append":
                    name = scanner.next();
                    task = new Task(priority, name);
                    tasks[priority++] = task;
                    break;
                case "update":
                    index = scanner.nextInt();
                    name = scanner.next();
                    tasks[index].updateStatus(Task.State.valueOf(name.toUpperCase()));
                    break;
                default:
                    System.out.println("Invalid command.");
                    continue;
            }
            for(int i = 0; i < priority; i++){
                System.out.println(tasks[i].toString());
            }
        }
    }
}