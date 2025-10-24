class TicketBooking {
    int availableTicketCount = 1;
    public void bookTicket(String userName, int ticketCount) {
        synchronized (this) {
            if (availableTicketCount >= ticketCount) {
                System.out.println(userName + " is booking " + ticketCount + " ticket...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                availableTicketCount -= ticketCount;
                System.out.println("Booking successful for " + userName);
            } else {
                System.out.println("Booking failed for " + userName);
            }
        }
    }
}

class User extends Thread {
    String name;
    int ticketCount;
    TicketBooking ticket;

    User(TicketBooking ticket, String name, int ticketCount) {
        this.ticket = ticket;
        this.name = name;
        this.ticketCount = ticketCount;
    }

    @Override
    public void run() {
        ticket.bookTicket(name, ticketCount);
    }
}

public class Q6 {
    public static void main(String[] args) {
        TicketBooking ticket = new TicketBooking();
        User user1 = new User(ticket, "Abhishek", 1);
        User user2 = new User(ticket, "Gauri", 1);
        user1.start();
        user2.start();
    }
}