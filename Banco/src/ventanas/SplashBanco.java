package ventanas;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class SplashBanco extends JFrame {

    private JProgressBar barra;

    public SplashBanco() {
        setSize(600, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
        initSplash();
        iniciar();
    }
    
    private void initSplash() {
        JLabel label = new JLabel();
        label.setSize(600, 130);
        ImageIcon img = new ImageIcon(getClass().getResource("/images/logo.png"));
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(label.getWidth(),
                label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.repaint();

        barra = new JProgressBar(0, 100);
        barra.setBounds(100, 150, 400, 30);
        barra.setStringPainted(true);

        this.add(label);
        this.add(barra);
    }

    private void iniciar() {
        Thread hilo = new Thread(new Runnable() {
            int tiempo = 0;

            @Override
            public void run() {

                try {
                    while (tiempo < 100) {
                        barra.setValue(tiempo);
                        tiempo++;
                        Thread.sleep(10);
                    }
                    dispose();
                    try {
                        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Login login = new Login("Ingreso al sistema");
                    login.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }

}
