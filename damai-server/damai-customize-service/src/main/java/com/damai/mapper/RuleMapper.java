package com.damai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damai.entity.Rule;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 普通规则 mapper
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface RuleMapper extends BaseMapper<Rule> {
    
    /**
     * 删除所有规则
     * @return 结果
     * */
    int delAll();
}
