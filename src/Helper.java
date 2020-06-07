
import java.util.Collection;

public class Helper {
    /**
     * 把一个对象添加到多个小集合中，同时将小集合添加到大集合中
     * @param collectionCollection 元素为集合类对象的大集合类对象
     * @param toAdd 需要加入多个集合的实体类对象
     * @param collections 不定个数的小集合
     */
    public static void addObjectToCollection(Collection<Collection>collectionCollection,Object toAdd,Collection... collections){
        for(Collection collection:collections){
            //把toAdd添加到各小集合中
            collection.add(toAdd);
            //把各小集合添加到大集合中去
            collectionCollection.add(collection);
        }
    }

    /**
     * 从多个集合中删除指定对象
     * @param collectionCollection 保存集合类对象的集合类对象（大集合）
     * @param toRemove 要从多个集合中删除的对象
     */
    public static void removeObjectFromCollectionCollection(Collection<Collection> collectionCollection,Object toRemove){
        for(Collection collection:collectionCollection){
            //从小集合中删除某对象
            collection.remove(toRemove);
        }
    }

    //线程延迟
    public static void delay(int time){
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //判断是否重叠
    public static boolean checkOverlap(OverlapSensitive overlaping, OverlapSensitive overlapped) {
        //两个对象的的中心坐标
        int cx1 = overlaping.getCx();
        int cy1 = overlaping.getCy();
        int cx2 = overlapped.getCx();
        int cy2 = overlapped.getCy();
        //两个对象的宽和高
        int w1 = overlaping.getW();
        int h1 = overlaping.getH();
        int w2 = overlapped.getW();
        int h2 = overlapped.getH();
        //两个对象中心点坐标差值的绝对值
        int dx = Math.abs(cx1 - cx2);
        int dy = Math.abs(cy1 - cy2);
        //如果满足条件就是重叠，返回true，反之false
        return (dx < (w1 + w2) / 2 && dy < (h1 + h2) / 2);
    }

    //判断是否在攻击范围内
    public static boolean checkAttackRange(OverlapSensitive overlaping, OverlapSensitive overlapped){
        //两个对象的的中心坐标
        int cx1 = overlaping.getCx();
        int cy1 = overlaping.getCy();
        int cx2 = overlapped.getCx();
        int cy2 = overlapped.getCy();
        //两个对象中心点之间的距离
        double distance=Math.pow(Math.pow(cx1-cx2,2)+Math.pow(cy1-cy2,2),0.5);
        //距离小于200即可攻击
        return distance<200;
    }
}
