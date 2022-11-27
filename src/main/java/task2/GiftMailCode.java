package task2;

public class GiftMailCode implements MailCode {
    public static String TEMPLATE = "Black friday %name Buy!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%name", client.getName());
    }
}
