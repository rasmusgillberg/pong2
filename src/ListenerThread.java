import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This is a class
 * Created 2021-03-16
 *
 * @author Magnus Silverdal
 */
public class ListenerThread implements Runnable{
    private BufferedReader in;
    private Controller Controller;

    public ListenerThread(BufferedReader in) {
        this.in = in;
        this.Controller = Controller;
    }

    @Override
    public void run() {
        String msg = null;
        while (true) {
            try {
                msg = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(msg);
        }
    }

    public void stop()  {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}