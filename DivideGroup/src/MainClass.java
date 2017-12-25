/**
 * Created by kennywzj on 2017/10/25.
 */
import org.junit.Test;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class MainClass extends JFrame{
    boolean tag = true;
    public MainClass() {
        // TODO Auto-generated constructor stub
        setLocation(350, 150);
        setSize(700,500);
        setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                setVisible(false);
                dispose();
            }
        });

        Container con = getContentPane();
        String path = "BackGround2.jpg";
        ImageIcon background = new ImageIcon(path);
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        ((JPanel)con).setOpaque(false);

        con.setLayout(new BorderLayout(100,50));

        JLabel Title = new JLabel("Csgo5V5分组系统");
        JPanel panelTitle = new JPanel();
        panelTitle.setOpaque(false);
        Title.setFont(new Font("楷体", 1, 62));
        panelTitle.add(Title);
        con.add("North",panelTitle); //设置标题

        JPanel p2 = new JPanel();
        p2.setOpaque(false);
        con.add(p2);
        JPanel btnp=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnp.setOpaque(false);
        JButton btn1 = new JButton("初始化");
        btn1.setFont(new Font("楷体", 1, 30));
        btnp.add(btn1);
        con.add("Center", btnp);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {


                new Import();

            }
        });




        setVisible(true);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MainClass mainC = new MainClass();

    }

}
