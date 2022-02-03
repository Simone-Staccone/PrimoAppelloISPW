package factory;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class EveryFood implements Food{
    @Override
    public boolean order() {
        boolean ret = false;
        Random rand;
        int n = 0;
        try {
            rand = SecureRandom.getInstanceStrong();
            n = rand.nextInt();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Errore nella random");
        }

        if(n%2 == 0)
            ret = true;
        return ret;
    }

    @Override
    public void eat() {
        System.out.println("You are eating!");
    }
}
