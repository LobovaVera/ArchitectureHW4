package Sales;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List<Ticket> availableTickets;

    public TicketProvider() {
        this.availableTickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        return availableTickets.add(ticket);
    }

    public boolean removeTicket(Ticket ticket) {
        return availableTickets.remove(ticket);
    }

    public List<Ticket> getTicket(long rootNumber) {
        ArrayList listOfTickets = new ArrayList<>();
        for (int i = 0; i < availableTickets.size(); i++) {
            if (availableTickets.get(i).getRootNumber() == rootNumber){
                listOfTickets.add(availableTickets.get(i));
            }
        }

        return listOfTickets;
    }

    public boolean updateTicketStatus(Ticket ticket) {
        // Логика обновления статуса билета
        return true; // Возвращать true, если статус обновлен успешно
    }
}