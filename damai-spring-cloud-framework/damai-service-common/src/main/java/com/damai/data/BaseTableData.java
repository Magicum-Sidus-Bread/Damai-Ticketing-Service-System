package com.damai.data;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 表必要字段
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
public class BaseTableData {

    /**
     * 创建时间
     * */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    
    /**
     * 编辑时间
     * */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date editTime;
    
    
    /**
     * 1:正常 0:删除
     */
    private Integer status;
}
