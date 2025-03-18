package com.damai.enums;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 通用状态枚举
 * @author: Magicum Sidus（Niuzhongyu）
 **/

public enum BusinessStatus {
    /**
     * 通用状态枚举
     * */
    YES(1,"是"),
    NO(0,"否")
    ;

    private Integer code;

    private String msg;

    BusinessStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }
    
    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }
    
    public static String getMsg(Integer code) {
        for (BusinessStatus re : BusinessStatus.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static BusinessStatus getRc(Integer code) {
        for (BusinessStatus re : BusinessStatus.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
