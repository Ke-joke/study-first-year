package Gui_study.lesson2;

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //按下按钮的时侯，触发一些事件
        Button button = new Button();
        //因为addActionListener()需要一个ActionListener，所以我们需要构建一个ActionListener。
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);


        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        windowListener(frame);//关闭窗口
        frame.setVisible(true);

    }

    //关闭窗口事件
    public static void windowListener(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

//事件监听
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}

