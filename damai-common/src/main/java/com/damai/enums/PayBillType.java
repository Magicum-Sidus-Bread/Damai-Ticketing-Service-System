package com.damai.enums;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 账单类型
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public enum PayBillType {
    /**
     * 账单类型
     * */
    PROGRAM(1,"节目"),
    ;

    private Integer code;

    private String msg;

    PayBillType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        for (PayBillType re : PayBillType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static PayBillType getRc(Integer code) {
        for (PayBillType re : PayBillType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
