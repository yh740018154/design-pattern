package cn.com.datu.yangheng.builder;

/**
 * @author yangheng
 * @Classname MoiblePhone
 * @Description 建造者模式：使用相同的构造方法可以构造出不同的对象；
 *              产品类：现在举例子造手机
 * @Date 2019/10/26 14:38
 * @group smart video north
 */
public class MoiblePhone {
    private String screen;
    private String battery;
    private String phoneBody;


    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }


    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getPhoneBody() {

        return phoneBody;
    }

    public void setPhoneBody(String phoneBody) {
        this.phoneBody = phoneBody;
    }
}
