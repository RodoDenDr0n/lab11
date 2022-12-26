package task2;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> informations;
    private final MailSender sender;

    public MailBox() {
        informations = new ArrayList<>();
        sender = MailSender.getSender();
    }
    public void sendAllEmails() {
        for (MailInfo info:
                informations) {
            info.generate();
            sender.sendEmail(info);
        }
    }

}