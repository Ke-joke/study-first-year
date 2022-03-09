package Gui_study.lesson1;

import java.awt.*;

public class TestFrame02 {
    public static void main(String[] args) {
        //展示多个窗口 new
        Myframe myframe1 = new Myframe(100, 100, 200, 200, Color.blue);
        Myframe myframe2 = new Myframe(300, 100, 200, 200, Color.cyan);
        Myframe myframe3 = new Myframe(100, 300, 200, 200, Color.red);
        Myframe myframe4 = new Myframe(300, 300, 200, 200, Color.magenta);
    }
}

class Myframe extends Frame{
    static int id = 0;//可能存在多个窗口，我们需要一个计数器

    public Myframe(int x, int y,int w,int h,Color color){
        super("lesson1.Myframe"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
