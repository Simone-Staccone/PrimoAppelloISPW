package factory;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Hamburger extends EveryFood{
    @Override
    public void eat() {
        String res = "Stai mangiando hmburger" + "\n";

        try (RandomAccessFile raf = new RandomAccessFile("output.txt", "rw")){
            raf.seek(raf.length());
            raf.write(res.getBytes());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
