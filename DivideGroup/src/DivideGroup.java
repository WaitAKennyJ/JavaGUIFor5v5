/**
 * Created by kennywzj on 2017/10/25.
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class DivideGroup extends JFrame {
    public  List<String>Horse = new ArrayList<String>();
    public  List<String>People = new ArrayList<String>();


    public DivideGroup(List<String> Member) {
        super("组队系统......");

        //赋值
         List<String>MemberN = new ArrayList<String>();
         MemberN.addAll(Member);
        /*
           如果不使用addAll 而使用= 赋值 地址空间将指向一处

        */

        List<String>MemberU = new ArrayList<String>();
        MemberU.addAll(Member);


        String[] data = null;
        data =  MemberN.toArray(new String[MemberN.size()]);


        //原始数据
        setLocation(350, 150);
        setSize(700,500);
        setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                setVisible(false);
                dispose();
            }
        });
        System.out.println(MemberN.size());
        int count=10;
        for(int i = 0; i<5;i++){
            int math =(int)(Math.random()*count);
            Horse.add(MemberN.get(math));
            MemberN.remove(math);
            count--;
            math =(int)(Math.random()*count);
            People.add(MemberN.get(math));
            MemberN.remove(math);
            count--;



            //int Score = CE.get(Member.get(math));
            //	HorseScore =HorseScore + Score;

        }


        System.out.println("Horse队：");
        for(int i = 0; i<Horse.size();i++){
            System.out.println(Horse.get(i));
        }
        System.out.println("People队：");
        for(int i = 0; i<People.size();i++){
            System.out.println(People.get(i));
        }


        String[] horse = null;
        String[] people =null;
        horse =	Horse.toArray(new String[Horse.size()]);
        people = People.toArray(new String[People.size()]);



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


        JPanel listp= new JPanel(new FlowLayout(FlowLayout.CENTER));
        listp.setOpaque(false);
        JList<String> list = new JList<String>();
        list.setPreferredSize(new java.awt.Dimension(150, 380));
        list.setListData(horse);
        list.setFont(new Font("楷体", 1, 30));
        con.add("Center",listp);
        listp.add(list);

        JPanel listp2= new JPanel(new FlowLayout(FlowLayout.CENTER));
        listp2.setOpaque(false);
        JList<String> list2 = new JList<String>();
        list2.setPreferredSize(new java.awt.Dimension(300, 380));
        list2.setListData(people);
        list2.setFont(new Font("楷体", 1, 30));
        list2.setOpaque(false);
        ((JLabel)list2.getCellRenderer()).setOpaque(false);
        con.add("East",listp2);
        listp2.add(list2);

        JPanel btnp=new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnp.setOpaque(false);
        JButton btn1 = new JButton("重新分组");
        btn1.setFont(new Font("楷体", 1, 30));
        btnp.add(btn1);
        con.add("South", btnp);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DivideGroup(MemberU);
            }
        });
        setVisible(true);
    }
}