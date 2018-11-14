package core.utils.http;

import org.apache.http.impl.client.CloseableHttpClient;

/**
 * 用途描述
 *
 * @author qinpeng
 * @version $Id: HttpClientDownloader, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2017年06月29日 上午11:42 qinpeng Exp $
 */
public class HttpClientUtils {

    private final static HttpClientPool httpClientPool;

    static {
        httpClientPool = new HttpClientPool();
    }

    public static CloseableHttpClient getHttpClient() {
        CloseableHttpClient httpClient = null;
        synchronized (httpClientPool) {
            httpClient = httpClientPool.getClient();
        }
        return httpClient;
    }

}
