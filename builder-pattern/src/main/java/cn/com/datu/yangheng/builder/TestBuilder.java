package cn.com.datu.yangheng.builder;

import org.junit.Test;

/**
 * @author yangheng
 * @Classname TestBuilder
 * @Description TODO
 * @Date 2019/10/26 14:47
 * @group smart video north
 */
public class TestBuilder {

    /**
     * builder 为一个接口，我们可以传入不同的实现类，然后可以造很多种手机
     * @param builder
     * @return
     */
    @Test
    public MoiblePhone buildMoiblePhone(Builder builder) {

        builder.buildBattery();
        builder.buildBody();
        builder.buildScreen();
        return builder.buildMoilePhone();
    }
}
