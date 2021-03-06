package Gui_study.lesson1;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame,JDK,看源码！
        Frame frame = new Frame("我的第一个Java图像界面窗口");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小 w h
        frame.setSize(400,400);

        //设置背景颜色
        frame.setBackground(new Color(253, 244, 71, 255));

        //弹出的初始位置
        frame.setLocation(400,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
