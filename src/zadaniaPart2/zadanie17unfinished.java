package zadaniaPart2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class zadanie17unfinished {
        List<Workers> workers = new ArrayList<>();

    public static void main(String[] args) {


    }


    public void dodajPracownika(Workers worker){
        workers.add(worker);
    }

    public static void findOldestWorker(List<Workers> workers) {
        int ageofWorker = 0;
        for (Workers worker : workers) {
            if (worker.getAge() > ageofWorker) {
                ageofWorker = worker.getAge();

            }
        }
        System.out.println("The oldest worker has: " + ageofWorker + " years");

    }

    public static void findYoungestWorker(List<Workers> workers) {
        int ageofWorker = 2000;
        for (Workers worker : workers) {
            if (worker.getAge() < ageofWorker) {
                ageofWorker = worker.getAge();

            }
        }
        System.out.println("The youngest worker has: " + ageofWorker + " years");

    }

    public static void findLongestEmployment(List<Workers> workers) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


        for (Workers worker : workers) {

            LocalDate howLongHired = LocalDate.parse(worker.getWhenHired(), formatter);





        }
    }
}
