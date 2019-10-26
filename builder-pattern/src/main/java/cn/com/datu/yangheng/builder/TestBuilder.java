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

    @Test
    public MoiblePhone buildMoiblePhone(Builder builder) {

        builder.buildBattery();
        builder.buildBody();
        builder.buildScreen();
        return builder.buildMoilePhone();
    }
}
