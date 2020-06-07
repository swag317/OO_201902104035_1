import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Q implements Shape,OverlapSensitive,CanBeAttacked,Movable{
    {
        this.whereIamIn = new ArrayList<Collection>();
        Helper.addObjectToCollection(this.whereIamIn,this, Commons.shapeSet,Commons.canBeAttackedSet,Commons.overlapSensitiveSet);
    }

    public Q() {
    }
    public Q(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void moveLeft() {
        this.x-=5;
    }

    @Override
    public void moveRight() {
        this.x+=5;
    }

    @Override
    public void moveDown() {
        this.y+=5;
    }

    @Override
    public void moveUp() {
        this.y-=5;
    }

    @Override
    public void attacked(CanAttack attacker) {
        Helper.removeObjectFromCollectionCollection(this.whereIamIn,this);
    }

    //返回中心点x坐标
    @Override
    public int getCx() {
        return this.x + this.w / 2;
    }
    //返回中心点y坐标
    @Override
    public int getCy() {
        return this.y + this.h / 2;
    }
    //返回宽度
    @Override
    public int getW() {
        return w;
    }
    //返回高度
    @Override
    public int getH() {
        return h;
    }

    //画出自己
    @Override
    public void drawMyself(Graphics g) {
        //根据左上角位置及长、宽画出当前的图片，观察者对象设置为null
        g.drawRect(this.x,this.y,this.w,this.h);
    }

    //Q所在的所有集合
    private Collection<Collection> whereIamIn;
    //左上角横坐标
    private int x = 250;
    //左上角纵坐标
    private int y = 300;
    //宽度
    private int w = 50;
    //高度
    private int h = 50;
}
