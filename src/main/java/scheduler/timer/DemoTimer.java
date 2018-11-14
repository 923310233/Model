/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */

package scheduler.timer;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author 陈旭
 * @version $Id: DemoTimer, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年04月24日 14:24 陈旭 Exp $
 */

public class DemoTimer {

    @Scheduled(cron = "0 0/5 * * * ? *")
    public void test(){
        System.out.println("定时器:5分钟执行任务");
    }
}
