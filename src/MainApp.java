
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainApp {

   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
        createAndShowGUI();
    });
    }

    private static void createAndShowGUI() {
       JFrame frame = new JFrame("Aplikasi Koneksi Database");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Utama panel = new Utama();
       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);
    }
    
}
