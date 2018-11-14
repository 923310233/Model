/**
 * @company 杭州信牛网络科技有限公司
 * @copyright Copyright (c) 2015 - 2018
 */
package model.enums;

import lombok.Getter;

/**
 * @author 尹佳鹏(Sec)
 * @version $Id: ErrorEnum, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年01月10日 17:33 尹佳鹏(Sec) Exp $
 */

public enum ErrorEnum {

    /*
     *参数格式不正确
     */
    ILLEGAL_FORMAT("参数格式不正确");;

    @Getter
    private String message;

    ErrorEnum(String message) {
        this.message = message;
    }

}
