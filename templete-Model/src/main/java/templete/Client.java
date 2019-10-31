package templete;

import java.lang.reflect.Method;

/**
 * @author yangheng
 * @Classname Client
 * @Description TODO
 * @Date 2019/10/30 16:29
 * @group smart video north
 */
public class Client {
    public static void main(String[] args) {
        new TempleClassA().service();
        try {
            Class<?> name = Class.forName("templete.TempleteClass");
            Method[] declaredMethods = name.getDeclaredMethods();
            for (Method method : declaredMethods) {

                System.out.println("method.getName() = " + method.getName());
                System.out.println("method.isDefault() = " + method.isDefault());
                System.out.println("method.getModifiers() = " + method.getModifiers());

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
