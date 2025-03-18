package com.damai.namefactory;


/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 线程工厂
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class BusinessNameThreadFactory extends AbstractNameThreadFactory {

    /**
     * 将线程池工厂的前缀
     * 例子:task-pool--1(线程池的数量)
     */
    @Override
    public String getNamePrefix() {
        return "task-pool" + "--" + POOL_NUM.getAndIncrement();
    }
}
