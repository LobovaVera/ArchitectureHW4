package Sales;

public class CashProvider {
    private long card;
    private long hashCard;


    private int amount;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false;
    }
    public void authorization(Customer customer) {
        isAuthorization = true;
    }

    public void buy(Ticket ticket) {

            ticket.soldOut();


    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean cardHasFunds(double ticketPrice, long amount) {
        if(amount > ticketPrice ){
            return true;
        } else{
        return false;
    }
  }

    public void setCash(int i) {
    }
}