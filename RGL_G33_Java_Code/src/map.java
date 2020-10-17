import javax.swing.*;

public class map {
    private JFrame frame;
    private String title;
    private int height;
    private int weidth;
    private JFrame map;


    public map(String title, int height, int weidth) {
        this.title = title;
        this.height = height;
        this.weidth = weidth;

        gameDisplay();
    }

    private void gameDisplay() {

        frame= new JFrame(title);
        frame.setSize(weidth,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);// user cant drag
        frame.setLocationRelativeTo(null);// screen will be in center of the screen.
        frame.setVisible(true);

    }


}
