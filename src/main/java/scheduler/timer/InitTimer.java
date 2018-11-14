/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */

package scheduler.timer;

import core.utils.LoggerUtils;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.integration.kafka.util.LoggingUtils;
import org.springframework.stereotype.Component;

/**
 * @author 陈旭
 * @version $Id: InitTimer, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年04月24日 14:26 陈旭 Exp $
 */

@Component()
public class InitTimer implements
        ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(LoggerUtils.getSplitLogger("spring初始化完毕"));
        System.out.println(LoggerUtils.getSplitLogger("进行项目初始化"));
    }
}
