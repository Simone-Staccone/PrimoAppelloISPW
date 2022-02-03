package factory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class EveryFood implements Food{
    @Override
    public boolean order() {
        boolean ret = false;
        Random rand;
        int n;
        try {
            rand = SecureRandom.getInstanceStrong();
            n = rand.nextInt();
        } catch (NoSuchAlgorithmException e) {
            n = 0;
        }

        if(n%2 == 0)
            ret = true;
        return ret;
    }

    @Override
    public void eat() {
        String res = "Stai mangiando qualcosa" + "\n";

        try (RandomAccessFile raf = new RandomAccessFile("output.txt", "rw")){
            raf.seek(raf.length());
            raf.write(res.getBytes());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
