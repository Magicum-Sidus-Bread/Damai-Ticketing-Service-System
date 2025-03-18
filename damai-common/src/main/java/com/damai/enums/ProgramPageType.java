package com.damai.enums;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目分页查询类型
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public enum ProgramPageType {
    /**
     * 节目分页查询类型
     * */
    RELEVANCY(1,"relevancy","相关度排序"),
    
    RECOMMEND(2,"recommend","推荐排序"),
    
    RECENT_PERFORMANCE(3,"recent_performance","最近开场"),
    
    LATEST_ISSUE(4,"latest_issue","最新上架"),
    ;

    private Integer code;
    
    private String value;

    private String msg;

    ProgramPageType(Integer code, String value, String msg) {
        this.code = code;
        this.value = value;
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
    
    public String getValue() {
        return value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public static String getMsg(Integer code) {
        for (ProgramPageType re : ProgramPageType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static ProgramPageType getRc(Integer code) {
        for (ProgramPageType re : ProgramPageType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
