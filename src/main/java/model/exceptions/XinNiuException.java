package model.exceptions;


import lombok.Getter;
import model.enums.ErrorEnum;

public class XinNiuException extends RuntimeException {

    /**
     * 任务id
     */
    @Getter
    private String taskId;

    /**
     * 异常类型
     */
    @Getter
    private ErrorEnum errorEnum;

    /**
     * 异常栈信息 非必需
     */
    @Getter
    private Exception exception;

    public XinNiuException() {
        super();
    }


    public XinNiuException(String taskId,ErrorEnum errorEnum) {
        super();
        this.taskId = taskId;
        this.errorEnum = errorEnum;
    }

    public XinNiuException(String taskId,
                           ErrorEnum errorEnum,
                           Exception exception) {
        super();
        this.taskId = taskId;
        this.errorEnum = errorEnum;
        this.exception = exception;
    }


}

