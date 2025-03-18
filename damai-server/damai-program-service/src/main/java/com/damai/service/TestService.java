package com.damai.service;

import com.baidu.fsg.uid.utils.PaddedAtomicLong;
import com.damai.dto.TestSendDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: Test service
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@Slf4j
@Service
public class TestService {
    
    AtomicLong count = new PaddedAtomicLong(0);
    
    public Boolean reset(final TestSendDto testSendDto) {
        count.set(0);
        return true;
    }
}
