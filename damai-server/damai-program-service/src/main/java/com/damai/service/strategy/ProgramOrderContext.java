package com.damai.service.strategy;

import com.damai.enums.BaseCode;
import com.damai.exception.DaMaiFrameException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目订单上下文
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class ProgramOrderContext {
    
    private static final Map<String,ProgramOrderStrategy> MAP = new HashMap<>(8);
    
    public static void add(String version,ProgramOrderStrategy programOrderStrategy){
        MAP.put(version,programOrderStrategy);
    }
    
    public static ProgramOrderStrategy get(String version){
        return Optional.ofNullable(MAP.get(version)).orElseThrow(() -> 
                new DaMaiFrameException(BaseCode.PROGRAM_ORDER_STRATEGY_NOT_EXIST));
    }
}
