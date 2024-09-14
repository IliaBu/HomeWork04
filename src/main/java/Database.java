import java.util.*;

public class Database {

    public Database() {
        for (int i = 0; i < 50; i++) {
            tickets.add(new Ticket());
            if (i > 0 && i % 2 == 0) {
                Customer customer = new Customer();
                String login = customer.getLogin();
                logins.put(login, customer.getId());
                passwords.put(login, customer.getPassword());
                customers.add(customer);
                int j = i;
                while (j >= i - 1) {
                    customer.getTickets().add(tickets.get(j));
                    tickets.get(j).setCustomerId(customer.getId());
                    j--;
                }
            }
        }
    }

    private static int counter = 100;
    private final List<Ticket> tickets = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();
    private final Map<String, Integer> logins = new HashMap<>();
    private final Map<String, String> passwords = new HashMap<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public Map<String, Integer> getLogins() {
        return logins;
    }

    public Map<String, String> getPasswords() {
        return passwords;
    }

    /**
     * Получить актуальную стоимость билета
     * 
     * @return
     */
    public double getTicketAmount() {
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * 
     * @return
     */
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}