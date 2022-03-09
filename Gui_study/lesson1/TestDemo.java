package Gui_study.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestDemo {
    public static void main(String[] args) {
        //总 Frame
        Frame frame = new Frame("lesson1.TestDemo");
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));



        //四个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        //上面填充
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p1.add(new Button("West-1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);

        //下面填充
        p3.add(new Button("East-2"),BorderLayout.EAST);
        p3.add(new Button("West-2"),BorderLayout.WEST);
        //中间四个
        for(int i = 0;i < 4;i++){
            p4.add(new Button("for-"+i+1));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
