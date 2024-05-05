package org.example;

public class UntrustworthyMailWorker implements MailService{
    MailService[] service;

    public UntrustworthyMailWorker(MailService[] service){
        this.service = service;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        Sendable mailMod = mail;
        for(MailService entity : service){
            mailMod = entity.processMail(mailMod);
        }
        return mailMod;
    }
}
