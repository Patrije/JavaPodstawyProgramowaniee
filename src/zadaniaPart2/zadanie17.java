package zadaniaPart2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class zadanie17 {


    public static void main(String[] args) {

        List<Workers> workers = new ArrayList<>();
        workers.add(new Workers("Marcin", "Kowalski", 20, 185, Sex.MEN,"10-06-2020"));
        workers.add(new Workers("Jan", "Patyk", 35, 178, Sex.MEN,"04-03-2018"));
        workers.add(new Workers("Ania", "Kowalska", 28, 170, Sex.WOMEN,"01-10-2019" ));
        workers.add(new Workers("Kasia", "Jagoda", 24, 167, Sex.WOMEN, "23-03-2021"));

        findOldestWorker(workers);
        findYoungestWorker(workers);


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
            LocalDate hiredFor = ;





        }
    }
}
