import java.util.Date;

class Ticket {

    static int counter = 1000;

    public Ticket() {
        id = ++counter;
        qrcode = "AA" + counter;
        date = new Date();
    }
    private final int id;
    private int customerId;
    private final Date date;
    private final String qrcode;
    private boolean enable = true;

    public int getId() {
        return id;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }
}