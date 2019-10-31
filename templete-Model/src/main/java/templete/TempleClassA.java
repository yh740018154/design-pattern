package templete;

/**
 * @author yangheng
 * @Classname TempleClassA
 * @Description TODO
 * @Date 2019/10/30 16:28
 * @group smart video north
 */
public class TempleClassA extends TempleteClass {

    @Override
    protected void init() {
        System.out.println("TempleClassA");
    }

    @Override
    protected void destory() {
        System.out.println("TempleClassA");
    }
}
