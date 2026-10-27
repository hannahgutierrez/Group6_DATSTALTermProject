import java.util.Scanner;
import java.util.ArrayList;

public class SampleRun{

    public static void shortestPathToDestination(ArrayList<String> locationsCSVFile){

        Queue<String> locationQueueTest2 = new Queue<>(locationsCSVFile.size());

        for (String location : locationsCSVFile) {
            locationQueueTest2.offer(location);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCafeteria --> Library --> Classroom --> Auditorium --> Gymnasium --> Computer Laboratory");

        System.out.print("\nEnter your current location: ");
        String currentLocation = scanner.nextLine().trim();

        System.out.print("Enter your destination: ");
        String destination = scanner.nextLine().trim();

        int pathTaken = 1;

        while (!locationQueueTest2.isEmpty() && !locationQueueTest2.front().equals(currentLocation)){
            locationQueueTest2.poll();
        }

        System.out.println();
        while (!locationQueueTest2.isEmpty()) {
            System.out.println("Location: " + locationQueueTest2.poll());
            pathTaken += 1;
            if (destination.equals(locationQueueTest2.front())){
                System.out.println("Location: " + locationQueueTest2.poll());
                System.out.println("\nNumber of Paths Taken: " + pathTaken);
                break;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> locationsCSVFile = new ArrayList<>();
        locationsCSVFile.add("Cafeteria");
        locationsCSVFile.add("Library");
        locationsCSVFile.add("Classroom");
        locationsCSVFile.add("Auditorium");
        locationsCSVFile.add("Gymnasium");
        locationsCSVFile.add("Computer Laboratory");

        Queue<String> locationQueueTest1 = new Queue<>(locationsCSVFile.size());

        for (String location : locationsCSVFile) {
            if (!locationQueueTest1.isFull()){
                locationQueueTest1.offer(location);
            }
        }

        System.out.println("\n========================= Sample Test Run 1 =========================\n");

        System.out.println("Front: " + locationQueueTest1.front());
        System.out.println("Back: " + locationQueueTest1.back());

        System.out.println();
        while (!locationQueueTest1.isEmpty()) {
            System.out.println("Size: " + locationQueueTest1.size());
            System.out.println("Polled: " + locationQueueTest1.poll());
        }

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("\n========================= Sample Test Run 2 =========================\n");

            System.out.println("1. Shortest Path To Destination");
            System.out.println("2. Exit");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1: shortestPathToDestination(locationsCSVFile);
                    break;
                case 2: System.exit(0);
            }
        }

    }
}