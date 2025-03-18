package com.damai.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damai.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 订单 mapper
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface OrderMapper extends BaseMapper<Order> {
    
    /**
     * 查询账户下购票人数量
     * @param userId 用户id
     * @param programId 节目id
     * @return 结果
     * */
    Integer accountOrderCount(@Param("userId")Long userId,@Param("programId")Long programId);
    
    /**
     * 真实删除订单数据
     * @return 结果
     * */
    Integer relDelOrder();
}
