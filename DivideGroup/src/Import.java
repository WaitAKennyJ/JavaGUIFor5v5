/**
 * Created by kennywzj on 2017/10/25.
 */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import java.util.logging.Logger;

import javax.swing.*;
public class Import extends JDialog{
    Import(){
        super();

        final Initial init = new Initial();
        setLocation(600, 250);
        setSize(20,330);
        setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                setVisible(false);
                dispose();
            }
        });

        JTextField j1 = new JTextField();
        JTextField j2 = new JTextField();
        JTextField j3 = new JTextField();
        JTextField j4 = new JTextField();
        JTextField j5 = new JTextField();
        JTextField j6 = new JTextField();
        JTextField j7 = new JTextField();
        JTextField j8 = new JTextField();
        JTextField j9 = new JTextField();
        JTextField j10 = new JTextField();

        j1.setText("王子杰");
        j2.setText("龙哥");
        j3.setText("严荣");
        j4.setText("搞基");
        j5.setText("弟弟");
        j6.setText("北极熊");
        j7.setText("马睿");
        j8.setText("a");
        j9.setText("b");
        j10.setText("c");

        final List<JTextField> text = new ArrayList<JTextField>(Arrays.asList(j1,j2,j3,j4,j5,j6,j7,j8,j9,j10));
        text.add(j1);
        JButton btn = new JButton("确认");
        this.setLayout(new GridLayout(11, 1));
        this.add(j1);
        this.add(j2);
        this.add(j3);
        this.add(j4);
        this.add(j5);
        this.add(j6);
        this.add(j7);
        this.add(j8);
        this.add(j9);
        this.add(j10);
        this.add(btn);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    init.clear();
                    for(JTextField t:text){
                        String name =t.getText().toString().trim();
                        init.Add(init.getMember(), name);
                    }
                    dispose();
                    new DivideGroup(init.getMember());

                } catch (Exception e2) {

                }

            }
        });
        this.setVisible(true);


    }

}
