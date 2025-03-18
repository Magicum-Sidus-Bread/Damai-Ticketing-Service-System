package com.damai.servicelock.factory;

import com.damai.core.ManageLocker;
import com.damai.servicelock.LockType;
import com.damai.servicelock.ServiceLocker;
import lombok.AllArgsConstructor;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分布式锁类型工厂
 * @author: Magicum Sidus（Niuzhongyu）
 **/
@AllArgsConstructor
public class ServiceLockFactory {
    
    private final ManageLocker manageLocker;
    

    public ServiceLocker getLock(LockType lockType){
        ServiceLocker lock;
        switch (lockType) {
            case Fair:
                lock = manageLocker.getFairLocker();
                break;
            case Write:
                lock = manageLocker.getWriteLocker();
                break;
            case Read:
                lock = manageLocker.getReadLocker();
                break;
            default:
                lock = manageLocker.getReentrantLocker();
                break;
        }
        return lock;
    }
}
