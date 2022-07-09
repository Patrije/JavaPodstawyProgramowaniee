package Zadania.Zadanie_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static List<Employee> workersList = new ArrayList<Employee>();

    public static void main(String[] args) {

        Employee employee1 = new Employee("Martin", "Garix", 28, 192, "male", "04-07-2016");
        Employee employee2 = new Employee("Mathias", "Paul", 23, 178, "male", "01-09-2013");
        Employee employee3 = new Employee("Tijs", "Verwest", 31, 186, "male", "07-04-2007");
        Employee employee4 = new Employee("Andre", "Tanneberger", 39, 181, "male", "15-06-2009");
        Employee employee5 = new Employee("Claus", "Terhoeven", 22, 173, "male", "05-05-2021");
        Employee employee6 = new Employee("Stefan", "Bossems", 24, 198, "male", "01-02-2019");

        workersList.add(employee1);
        workersList.add(employee2);
        workersList.add(employee3);
        workersList.add(employee4);
        workersList.add(employee5);
        workersList.add(employee6);

        System.out.println("Hello Admin! What do You want to do?");

        startMethod();

    }

    private static void startMethod() {
        System.out.println("[1] Add new worker");
        System.out.println("[2] Find the oldest worker");
        System.out.println("[3] Find the youngest worker");
        System.out.println("[4] Find worker who works the longest");
        System.out.println("[5] To the EXIT");
        userChoice();
        exitMethod();

    }


    private static void userChoice() {
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                addNewEmployee(workersList);
                break;
            case 2:
                findTheOldestWorker(workersList);
                break;
            case 3:
                findTheYoungestWorker(workersList);
                break;
            case 4:
                findWorkerWhoWorksTheLongest(workersList);
                break;
            case 5:
                exitMethod();
                break;

            default:
                System.out.println("Wrong number! Enter w number from [1] to [5]");
                startMethod();
        }
        nextMove();
    }

    private static void exitMethod() {
        System.out.println("Thank You! BB!");
    }

    private static void nextMove() {
        System.out.println("What do You want to do now?");
        userChoice();

    }

    private static void findWorkerWhoWorksTheLongest(List<Employee> workersList) {


    }

    private static void findTheYoungestWorker(List<Employee> workersList) {

        int age = 100;
        String name = "";
        String surname = "";

        for (Employee worker : workersList) {
            if (worker.getAge() < age) {
                name = worker.getName();
                surname = worker.getSurname();
            }
        }
        System.out.println("The youngest worker is " + name + " " + surname);
    }

    private static void findTheOldestWorker(List<Employee> workersList) {
        int workersAge = 0;
        String workerName = "";
        String workerSurname = "";
        for (Employee worker : workersList) {
            if (worker.getAge() > workersAge) {
                workersAge = worker.getAge();
                workerName = worker.getName();
                workerSurname = worker.getSurname();
            }
        }
        System.out.println("The oldest worker is " + workerName + " " + workerSurname);

    }


    private static void addNewEmployee(List<Employee> workersList) {
        System.out.println("Enter employee information");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname:");
        String surname = scanner.nextLine();
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println("Height:");
        int height = scanner.nextInt();
        System.out.println("Sex [male/female]:");
        String sex = scanner.next();
        System.out.println("Date of employment [dd-MM-YYYY]:");
        String dateOfEmployment = scanner.next();

        workersList.add(new Employee(name, surname, age, height, sex, dateOfEmployment));

    }
}
