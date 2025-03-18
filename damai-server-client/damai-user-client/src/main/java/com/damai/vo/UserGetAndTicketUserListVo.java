package com.damai.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用户和购票人 vo
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Data
@Schema(title="UserGetAndTicketUserListVo", description ="用户和购票人集合数据")
public class UserGetAndTicketUserListVo {
    
    @Schema(name ="userVo", type ="UserVo", description ="用户")
    private UserVo userVo;
    
    @Schema(name ="ticketUserVoList", type ="List<TicketUserVo>", description ="购票人集合")
    private List<TicketUserVo> ticketUserVoList;
}
