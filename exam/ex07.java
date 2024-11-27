import java.util.Scanner;

public class ex07{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter title: ");
        String title = scanner.nextLine();
        Book book = new Book(title);
        while(true){
            System.out.printf("Enter command (borrow, return, status): ");
            String command = scanner.nextLine();
            switch (command){
                case "borrow":
                    book.borrowBook();
                    continue;
                case "status":
                    book.getStatus();
                    continue;
                case "return":
                    book.returnBook();
                    continue;
                default:
                    break;
            }
            break;
        }
    }
}

class Book{
    String title = "";
    boolean isAvailable = true;

    public Book(String title){
        this.title = title;
    }
    public void borrowBook(){
        System.out.printf("You successfully borrowed \"%s\".\n", this.title);
        this.isAvailable = false;
    }
    public void returnBook(){
        System.out.printf("You successfully returned \"%s\".\n", this.title);
        this.isAvailable = true;
    }
    public void getStatus(){
        if (this.title != "" && this.isAvailable != true){
            System.out.printf("\"%s\" is currently borrowed.\n", this.title);
        }else{
            System.out.printf("\"%s\" is available.\n", this.title);
        }
    }
}