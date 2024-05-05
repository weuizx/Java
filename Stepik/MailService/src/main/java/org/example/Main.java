package org.example;

import java.util.logging.Logger;

public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";


    public static void main(String[] args)
    {
        MailMessage message1 = new MailMessage("Alan Walker", "Jim Kerry", "Fuck you, Jim");
        MailMessage message2 = new MailMessage("Alan Walker", AUSTIN_POWERS, "Fuck you, Jim");
        MailMessage message3 = new MailMessage(AUSTIN_POWERS, "Jim Kerry", "Fuck you, Jim");
        MailPackage package1 = new MailPackage("Alan Walker", "Jim Kerry",new Package("diamonds",10000));
        MailPackage package2 = new MailPackage("Alan Walker", "Jim Kerry",new Package("wood",400));
        MailPackage package3 = new MailPackage("Alan Walker", "Jim Kerry",new Package(WEAPONS,280000));
        MailPackage package4 = new MailPackage("Alan Walker", "Jim Kerry",new Package(BANNED_SUBSTANCE,1));

        Thief thief = new Thief(1000);
        Inspector inspector = new Inspector();
        Spy spy = new Spy(Logger.getLogger(Main.class.getName()));
        MailService[] a = {thief, inspector, spy};
        UntrustworthyMailWorker worker = new UntrustworthyMailWorker(a);
        worker.processMail(message2);
        worker.processMail(message1);
        worker.processMail(message3);
//        Sendable messageMod1 = thief.processMail(message1);
//        Sendable packageMod1 = thief.processMail(package1);
//        Sendable packageMod2 = thief.processMail(package2);
//        Sendable packageMod3 = thief.processMail(package3);
//        Sendable packageMod4 = thief.processMail(package4);
//        Sendable messageModMod1 = spy.processMail(messageMod1);
//        Sendable packageModMod1 = spy.processMail(message2);
//        Sendable packageModMod2 = spy.processMail(message3);
//        Sendable packageModMod3 = spy.processMail(package3);
//        Sendable packageModMod4 = spy.processMail(package4);

//        System.out.println(messageMod1.getFrom());
//        System.out.println(messageMod1.getTo());
//        System.out.println(((MailMessage)messageMod1).getMessage());
//
//        System.out.println(((MailPackage) packageMod1).getContent().getContent());
//        System.out.println(((MailPackage) packageMod1).getContent().getPrice());
//        System.out.println(((MailPackage) packageMod2).getContent().getContent());
//        System.out.println(((MailPackage) packageMod2).getContent().getPrice());
//        System.out.println(((MailPackage) packageMod3).getContent().getContent());
//        System.out.println(((MailPackage) packageMod3).getContent().getPrice());
//        System.out.println(((MailPackage) packageMod4).getContent().getContent());
//        System.out.println(((MailPackage) packageMod4).getContent().getPrice());

//        System.out.println(thief.getStolenValue());
    }
}