package Gui_study.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("lesson1.TestFlowLayout");

        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        //设置流式布局
        //frame.setLayout(new FlowLayout());//默认按钮位置（中间）
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));//按钮位置（左边）
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));//按钮位置（右边）

        frame.setSize(400,400);

        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
