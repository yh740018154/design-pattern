package cn.com.datu.yangheng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yangheng
 * @Classname FreeSingleton
 * @Description TODO
 * @Date 2019/10/25 10:10
 * @group smart video north
 */
public class FreeSingleton {
    private static final Logger LOGGER = LoggerFactory.getLogger(FreeSingleton.class);
    private static final FreeSingleton freeSingleton = new FreeSingleton();

    private FreeSingleton() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("FreeSingleton is inited...");
        }
    }
    public static synchronized FreeSingleton getInstance() {
        return freeSingleton;
    }
    public void service() {
        LOGGER.info("freeSingleton serviced...");
    }
}
