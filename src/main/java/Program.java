import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на
     * автобус в час пик".
     * 
     * @param args
     */
    public static void main(String[] args) {

        Core core = new Core();

        MobileApp mobileApp = new MobileApp(
                core.getTicketProvider(),
                core.getCustomerProvider(),
                "user101",
                "pass");

        BusStation busStation = new BusStation(core.getTicketProvider());

        mobileApp.buyTicket("1289000000007");
        mobileApp.searchTicket(new Date());
        mobileApp.getTickets();
        busStation.checkTicket("AA1001");
    }

}