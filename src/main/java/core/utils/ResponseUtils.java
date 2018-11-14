package core.utils;

import model.enums.StatusEnum;
import model.to.response.RiskResponse;
import org.apache.commons.lang3.StringUtils;

public class ResponseUtils {

    /**
     * 正常返回
     *
     * @return
     */
    public static RiskResponse success(String data) {
        return new RiskResponse(StatusEnum.SUCCESS.getMessage(),data,StringUtils.EMPTY);
    }

    /**
     * 异常返回
     *
     * @return
     */
    public static RiskResponse error(String msg) {
        return new RiskResponse(StatusEnum.FAILED.getMessage(),StringUtils.EMPTY,msg);
    }


}
