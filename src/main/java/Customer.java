import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private static int counter = 100;

    private final int id;
    private final String login;
    private final String password;

    public Customer() {
        id = ++counter;
        login = "user" + counter;
        password = "pass";
    }

    private Collection<Ticket> tickets = new ArrayList<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    protected String getLogin() {
        return login;
    }

    protected String getPassword() {
        return password;
    }

}