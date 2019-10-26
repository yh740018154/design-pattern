package cn.com.datu.yangheng.builder;

/**
 * @author yangheng
 * @Classname Builder
 * @Description TODO
 * @Date 2019/10/26 14:41
 * @group smart video north
 */
public interface Builder {

    /**
     *造手机的屏幕
     * @return
     */
    void  buildScreen();

    /**
     * 造手机电池
     * @return
     */
    void buildBattery();

    /**
     * 造手机机身
     * @return
     */
    void buildBody();

    /**
     * 造手机
     * @return
     */
    MoiblePhone buildMoilePhone();
}
