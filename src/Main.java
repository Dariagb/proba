import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет собеседник!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Как у тебя дела?");
        Scanner scanner1 = new Scanner(System.in);
        String input1 = scanner1.nextLine();
        if(input1=="хорошо"){
            System.out.println("Я рад, что все прекрасно!");
        }
        else {
            System.out.println("Давай разбираться в проблеме");
        }
    }
}