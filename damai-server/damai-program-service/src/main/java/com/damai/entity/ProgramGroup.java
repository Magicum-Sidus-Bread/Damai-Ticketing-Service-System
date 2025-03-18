package com.damai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.damai.data.BaseTableData;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目分组 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@TableName("d_program_group")
public class ProgramGroup extends BaseTableData implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 节目json
     */
    private String programJson;
    
    /**
     * 最近的节目演出时间
     * */
    private Date recentShowTime;
}
