package org.example;

import static org.example.Main.BANNED_SUBSTANCE;
import static org.example.Main.WEAPONS;

public class Inspector implements MailService{

    public Inspector(){

    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            String thisPackage = ((MailPackage) mail).getContent().getContent();
            if (thisPackage.equals(WEAPONS) || thisPackage.equals(BANNED_SUBSTANCE)){
                throw new IllegalPackageException("Illegal Package!");
            }
            if (thisPackage.contains("stones")){
                throw new StolenPackageException("Package was stolen!");
            }
        }
        return mail;
    }
}
