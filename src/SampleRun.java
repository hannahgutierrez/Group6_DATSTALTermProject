import java.util.ArrayList;

public class SampleRun{

    public static void main(String[] args) {

        ArrayList<String> locationsCSVFile = new ArrayList<>();
        locationsCSVFile.add("Cafeteria");
        locationsCSVFile.add("Library");
        locationsCSVFile.add("Classroom");
        locationsCSVFile.add("Auditorium");
        locationsCSVFile.add("Gymnasium");
        locationsCSVFile.add("Computer Laboratory");

        Queue<String> locationQueue = new Queue<>(locationsCSVFile.size());

        for (String location : locationsCSVFile) {
            if (!locationQueue.isFull()) {
                locationQueue.offer(location);
            }
        }

        System.out.println("Front: " + locationQueue.front());
        System.out.println("Back: " + locationQueue.back());

        System.out.println();
        while (!locationQueue.isEmpty()) {
            System.out.println("Size: " + locationQueue.size());
            System.out.println("Polled: " + locationQueue.poll());
        }
    }
}
