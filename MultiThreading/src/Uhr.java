import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Uhr extends JFrame implements Runnable {

    JLabel ausgabe;

    public Uhr() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(null);

        ausgabe = new JLabel("Ausgabe");
        ausgabe.setBOunds(20, 20, 300, 25);
        add(ausgabe);

        setVisible(true);
    }

    public void run() {
        ausgabe.setText(new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").format(new Date()));
    }
    
}
