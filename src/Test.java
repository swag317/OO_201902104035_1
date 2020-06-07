public final class Test {
    public static void main(String[] args) {
        Bomb bomb= new Bomb(20,150,60,30,5);
        Q q = new Q(20,250,10,20);
        //创建画图面板对象，并使之关联shapeSet集合对象
        Commons.drawingPanel = new DrawingPanel(Commons.shapeSet);
        //创建控制面板对象，并使之关联tank对象
        KeyControlPanel keyControlPanel = new KeyControlPanel(q);
        //创建顶层框架，并使之关联画图面板和控制面板对象
        MyFrame myFrame = new MyFrame(Commons.drawingPanel,keyControlPanel);
        //设置框架的大小
        myFrame.setSize(800,600);
        //使框架可见
        myFrame.setVisible(true);
    }
}
