package cn.com.datu.yangheng.builder;

/**
 * @author yangheng
 * @Classname IphoneXBuilder
 * @Description 造iPhoneX的建造类，实现了builder接口
 * @Date 2019/10/26 14:44
 * @group smart video north
 */
public class IphoneXBuilder implements Builder {

    private MoiblePhone IphoneX = new MoiblePhone();

    /**
     * 造手机的屏幕
     *
     * @return
     */
    public void buildScreen() {

        IphoneX.setScreen("5.4英寸");

    }

    /**
     * 造手机电池
     *
     * @return
     */
    public void buildBattery() {
        IphoneX.setBattery("3400毫安");
    }

    /**
     * 造手机机身
     *
     * @return
     */
    public void buildBody() {
        IphoneX.setPhoneBody("土豪金");
    }

    public MoiblePhone buildMoilePhone() {

        return IphoneX;
    }
}
