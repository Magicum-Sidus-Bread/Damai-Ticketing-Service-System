package com.damai.util;

import org.apache.commons.lang.StringUtils;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 远程工具
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class RemoteUtil {
    
    public static String getRemoteId(HttpServletRequest request) {
        String forward = request.getHeader("X-Forwarded-For");
        String ip = getRemoteIpFromForward(forward);
        String ua = request.getHeader("user-agent");
        if (StringUtils.isNotBlank(ip)) {
            return ip + ua;
        }
        return request.getRemoteAddr() + ua;
    }
    
    private static String getRemoteIpFromForward(String forward) {
        if (StringUtils.isNotBlank(forward)) {
            String[] ipList = forward.split(",");
            return StringUtils.trim(ipList[0]);
        }
        return null;
    }
}
