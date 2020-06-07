//201902104035王兆娣
import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class DrawingPanel extends JPanel {
    public DrawingPanel() {
    }
    /**
     * 令本对象关联字段指向一个集合对象
     * @param shapes 被关联的集合对象
     */
    public DrawingPanel(Collection<Shape> shapes) {
        super();
        this.shapes = shapes;
    }
    //定义paintComponent方法，参数为Graphics类型的对象
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()){
            Shape shape = it.next();
            //向集合中的元素发送drawMyself消息
            shape.drawMyself(g);
        }
    }
    //关联一个集合对象，元素类型为Shape
    private Collection<Shape> shapes;
}
