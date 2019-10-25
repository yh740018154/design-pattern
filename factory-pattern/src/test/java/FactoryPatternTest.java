import cn.com.datu.yangheng.demo.FactoryPattern;
import cn.com.datu.yangheng.demo.model.Vehicle;
import org.junit.Test;

/**
 * @author yangheng
 * @Classname FactoryPatternTest
 * @Description TODO
 * @Date 2019/10/25 10:33
 * @group smart video north
 */
public class FactoryPatternTest {

    @Test
    public void testFactory(){
        Vehicle vehicle = FactoryPattern.create(FactoryPattern.VehicleType.bike);
        System.out.println(vehicle);

    }
}
