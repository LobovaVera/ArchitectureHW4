package Sales;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        CashProvider cash1 = new CashProvider(11111, 11111);
        Customer customer1 = new Customer(1);
        customer1.setCash(cash1);
        Ticket ticket1 = new Ticket(1,25.00,null, LocalDateTime.now());
        System.out.println(ticket1 + " " + customer1);
        customer1.cash.setAmount(1000);
        ticket1.setPrice(20);
        customer1.buyTicket(ticket1);
        System.out.println(ticket1 + " " + customer1);
    }
}