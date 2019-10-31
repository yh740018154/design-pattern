package cn.com.datu.yangheng.demo.createHuman;

/**
 * @author yangheng
 * @Classname HumanFactory
 * @Description 工厂模式的一般实现
 * @Date 2019/10/30 15:07
 * @group smart video north
 */
public interface HumanFactory {

    default Human creatHuman(Human human)  {
        return null;
    }

}
