package model.to.response;

import lombok.Getter;
import lombok.Setter;

public class RiskResponse {

    /**
     * 状态
     */
    @Getter
    @Setter
    private String status;

    /**
     * 错误描述
     */
    @Getter
    @Setter
    private String msg;

    /**
     * 数据
     */
    @Getter
    @Setter
    private String data;

    public RiskResponse(){

    }

    public RiskResponse(String status,String data,String msg){
        this.status=status;
        this.data=data;
        this.msg=msg;
    }
}
