/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */

package core.aop.exceptionaspect;

import core.utils.ResponseUtils;
import model.exceptions.XinNiuException;
import model.to.response.RiskResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 陈旭
 * @version $Id: ExceptionAspect, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年04月16日 22:26 陈旭 Exp $
 */
@Component
@ControllerAdvice
public class ControllerExceptionAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler({XinNiuException.class})
    @ResponseBody
    public RiskResponse xinniuExceptionHandler(XinNiuException e) {
        if (null == e.getException()) {
            logger.error(e.getErrorEnum().getMessage());
        } else {
            logger.error(e.getErrorEnum().getMessage(), e.getException());
        }
        return ResponseUtils.error(e.getErrorEnum().getMessage());
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public RiskResponse exceptionHandler(Exception e) {
        logger.error("发生未知异常", e);
        return ResponseUtils.error("发生未知异常");
    }

}