import java.util.ArrayList;
import java.util.Scanner;

class Train {
    String trainName;
    String time;
    int passengerStrength;
    int trainNumber;

    public Train(String trainName, String time, int passengerStrength, int trainNumber) {
        this.trainName = trainName;
        this.time = time;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }
}

class ReservationSystem {
    private ArrayList<Train> trains = new ArrayList<>();
    private ArrayList<String> bookedSeats = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ReservationSystem() {
        trains.add(new Train("Mumbai - Delhi Superfast", "13:05", 50, 1010));
        trains.add(new Train("Delhi - Jaipur SuperFast", "07:00", 50, 2013));
        trains.add(new Train("Prayagraj - Delhi Express", "10:00", 50, 3045));
    }

    public void displayMenu() {
        System.out.println("\n*** Railway Reservation System ***");
        System.out.println("1. Train Information");
        System.out.println("2. Seat Availability");
        System.out.println("3. Booking");
        System.out.println("4. Canceling");
        System.out.println("5. Ticket Display");
        System.out.println("0. Exit");
    }

    public void trainInformation() {
        System.out.println("\nTrain Information:");
        for (Train train : trains) {
            System.out.println("Train Name: " + train.trainName);
            System.out.println("Departure Time: " + train.time);
            System.out.println("Passenger Strength: " + train.passengerStrength);
            System.out.println("Train Number: " + train.trainNumber);
            System.out.println();
        }
    }

    public void seatAvailability() {
        System.out.println("\nSeat Availability:");
        // Implement logic to check and display available seats
    }

    public void booking() {
        System.out.println("\nBooking:");
        // Implement logic for booking seats
    }

    public void canceling() {
        System.out.println("\nCanceling:");
        // Implement logic for canceling booked tickets
    }

    public void ticketDisplay() {
        System.out.println("\nTicket Display:");
        // Implement logic to display booked ticket details
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (0-5): ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                case 1:
                    trainInformation();
                    break;
                case 2:
                    seatAvailability();
                    break;
                case 3:
                    booking();
                    break;
                case 4:
                    canceling();
                    break;
                case 5:
                    ticketDisplay();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.run();
    }
}
