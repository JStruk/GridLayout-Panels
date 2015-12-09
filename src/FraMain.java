
import java.awt.GridLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Justin
 */
public class FraMain extends JFrame {

    Pan1 p1;
    Pan2 p2;
    Pan3 p3;
    Pan4 p4;

    public FraMain() {
        setVisible(true);
        setTitle("Panels w/ gridlayout - Juddy");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1 = new Pan1();
        p2 = new Pan2();
        p3 = new Pan3();
        p4 = new Pan4();
        this.setLayout(new GridLayout(2, 2));
        add(p1);
        add(p2);
        add(p3);
        add(p4);
    }
}
