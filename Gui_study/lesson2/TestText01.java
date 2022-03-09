package Gui_study.lesson2;

import java.awt.*;
import java.awt.event.*;

public class TestText01 {
    public static void main(String[] args) {
        //启动！！
        MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //按下enter，就会触发输入框的事件
        textField.addActionListener(myActionListener2);

        //设置编码
        textField.setEchoChar('*');

        setVisible(true);
        pack();

        MyWindowsListening myWindowsListening = new MyWindowsListening();
        addWindowListener(myWindowsListening);

    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();//获得一些资源,返回的一个对象
        System.out.println(field.getText());//获得输入框中的文本
        field.setText("");//清空输入框中的文本
    }
}

class MyWindowsListening extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}