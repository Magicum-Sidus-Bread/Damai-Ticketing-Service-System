package com.damai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.damai.dto.ApiDataDto;
import com.damai.entity.ApiData;
import com.damai.vo.ApiDataVo;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: api调用记录 mapper
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public interface ApiDataMapper extends BaseMapper<ApiData> {
    /**
     * 分页查询
     * @param page 分页对象
     * @param apiDataDto 参数
     * @return 分页数据
     * */
    Page<ApiDataVo> pageList(Page<ApiData> page, ApiDataDto apiDataDto);
}
