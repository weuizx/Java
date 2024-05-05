package org.example;

import java.util.logging.Logger;

import static org.example.Main.AUSTIN_POWERS;

public class Spy implements MailService{
    private final Logger logger;

    public Spy(Logger logger){
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage){
            if(mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)){
                logger.warning("Detected target mail correspondence: from " + mail.getFrom() + " to " + mail.getTo() + " \"" + ((MailMessage)mail).getMessage()+"\"");
            }else{
                logger.info("Usual correspondence: from " + mail.getFrom() + " to " + mail.getTo());
            }
        }
        return mail;
    }
}
