package com.damai.rejectedexecutionhandler;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 拒绝策略
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class ThreadPoolRejectedExecutionHandler {
    
    
    public static class BusinessAbortPolicy implements RejectedExecutionHandler {

        public BusinessAbortPolicy() {
        }

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            throw new RejectedExecutionException("threadPoolApplicationName business task " + r.toString() +
                    " rejected from " +
                    executor.toString());
        }
    }
}
