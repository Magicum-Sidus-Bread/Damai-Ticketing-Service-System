package com.damai.service.init;

import com.damai.core.SpringUtil;
import com.damai.initialize.base.AbstractApplicationPostConstructHandler;
import com.damai.service.ProgramService;
import com.damai.service.ProgramShowTimeService;
import com.damai.util.BusinessEsHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 节目演出时间更新
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Component
public class ProgramShowTimeRenewal extends AbstractApplicationPostConstructHandler {
    
    @Autowired
    private ProgramShowTimeService programShowTimeService;
    
    @Autowired
    private ProgramService programService;
    
    @Autowired
    private BusinessEsHandle businessEsHandle;
    
    @Override
    public Integer executeOrder() {
        return 2;
    }
    
    @Override
    public void executeInit(final ConfigurableApplicationContext context) {
        Set<Long> programIdSet = programShowTimeService.renewal();
        if (!programIdSet.isEmpty()) {
            businessEsHandle.deleteIndex(SpringUtil.getPrefixDistinctionName() + "-" +
                    ProgramDocumentParamName.INDEX_NAME);
            for (Long programId : programIdSet) {
                programService.delRedisData(programId);
                programService.delLocalCache(programId);
            }
        }
    }
}
