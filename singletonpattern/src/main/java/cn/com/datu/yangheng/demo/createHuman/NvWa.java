package cn.com.datu.yangheng.demo.createHuman;

/**
 * @author yangheng
 * @Classname NvWa
 * @Description TODO
 * @Date 2019/10/30 15:20
 * @group smart video north
 */
public class NvWa {

    private HumanFactory humanFactory = new HumanFactoryImpl();

    private Human human;

    public void main() {

        Human human = this.humanFactory.creatHuman(this.human);
        System.out.println("human.getName() = " + human.getName());
    }

}
