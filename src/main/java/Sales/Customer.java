package Sales;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private List<Ticket> tickets;
    CashProvider cash;

    public Customer(int id, CashProvider cash) {
        this.id = id;
        this.tickets = new ArrayList<>();
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash != null) {
            if (cash.cardHasFunds(ticket.getPrice(), cash.getAmount())) {
                cash.buy(ticket);
                tickets.add(ticket);
                return true;
            } else {
                System.out.println("Ошибка");
                // Обработать ошибки
            }
        } else {
            System.out.println("Ошибка");
            // ужно доработать с исключениями
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", cash=" + cash +
                '}';
    }

    public List<Ticket> search(LocalDateTime date, long rootNumber) {
        // Логика поиска билетов
        return new ArrayList<>(); // Вернуть список найденных билетов
    }
}