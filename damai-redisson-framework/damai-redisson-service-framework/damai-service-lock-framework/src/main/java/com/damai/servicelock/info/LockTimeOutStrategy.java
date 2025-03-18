package com.damai.servicelock.info;


/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 分布式锁 策略
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public enum LockTimeOutStrategy implements LockTimeOutHandler{
    /**
     * 快速失败
     * */
    FAIL(){
        @Override
        public void handler(String lockName) {
            String msg = String.format("%s请求频繁",lockName);
            throw new RuntimeException(msg);
        }
    }
}
