package com.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.damai.data.BaseTableData;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 地区 实体
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@TableName("d_area")
public class Area extends BaseTableData implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父区域id
     */
    private Long parentId;
    /**
     * 区域名字
     */
    private String name;

    /**
     * 1:省 2:区 3:县
     */
    private Integer type;

    /**
     * 1:是 0:否
     */
    private Integer municipality;
}
