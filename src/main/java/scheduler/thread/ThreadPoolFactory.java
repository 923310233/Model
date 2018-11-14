/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */

package scheduler.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陈旭
 * @version $Id: ThreadPoolFactory, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年04月23日 22:04 陈旭 Exp $
 */

public class ThreadPoolFactory {
    public static Map<String,ThreadPool> poolMap=new HashMap<>();

    public static synchronized ThreadPool getThreadPool(String poolName){
        if (!poolMap.containsKey(poolName)){
            poolMap.put(poolName,new ThreadPool(poolName));
        }
        return poolMap.get(poolName);
    }
}
