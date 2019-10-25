package cn.com.datu.yangheng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * @author yangheng
 * @Classname SingletonDemo
 * @Description 单例模式学习
 * @Date 2019/10/25 9:28
 * @group smart video north
 */
public class SingletonDemo {
    private final static Logger LOGGER = LoggerFactory.getLogger(SingletonDemo.class);

    private static SingletonDemo singletonDemo;

    private SingletonDemo() {
        LOGGER.debug("singleton is inited");
    }

    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            return new SingletonDemo();
        }
        return singletonDemo;
    }

    public void service() {
        LOGGER.info("单例模式，service方法");
    }
}
