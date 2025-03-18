package com.damai.service.lua;

import com.damai.vo.SeatVo;
import lombok.Data;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目缓存更新 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class ProgramCacheCreateOrderData {

    private Integer code;
    
    private List<SeatVo> purchaseSeatList;
}
