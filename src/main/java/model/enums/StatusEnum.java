/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */
package model.enums;

import lombok.Getter;

/**
 * @author 尹佳鹏(Sec)
 * @version $Id: ResultEnum, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年01月10日 18:01 尹佳鹏(Sec) Exp $
 */

public enum StatusEnum {
    /**
     * 成功
     */
    SUCCESS("success", "成功"),
    /**
     * 失败
     */
    FAILED("failed", "失败");

    @Getter
    private String message;

    @Getter
    private String description;

    StatusEnum(String message, String description) {
        this.message = message;
        this.description = description;
    }

}
