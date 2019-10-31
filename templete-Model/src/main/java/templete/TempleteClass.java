package templete;

/**
 * @author yangheng
 * @Classname TempleteClass
 * @Description TODO
 * @Date 2019/10/30 16:25
 * @group smart video north
 */
public abstract class TempleteClass {

       abstract void init();

      abstract void destory();

    final void service() {

        init();
        destory();
    }
}
