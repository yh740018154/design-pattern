package cn.com.datu.yangheng.demo;

import org.junit.Test;

/**
 * @author yangheng
 * @Classname SingletonTest
 * @Description TODO
 * @Date 2019/10/25 9:51
 * @group smart video north
 */
public class SingletonTest {

    @Test
    public  void  singleton(){
        SingletonDemo singletonDemo=SingletonDemo.getInstance();
        System.out.println(singletonDemo);
    }
}
