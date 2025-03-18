package com.damai.handler;


import com.damai.config.BloomFilterProperties;
import com.damai.core.SpringUtil;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;



/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 布隆过滤器
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public class BloomFilterHandler {
    
    private final RBloomFilter<String> cachePenetrationBloomFilter;
    
    public BloomFilterHandler(RedissonClient redissonClient, BloomFilterProperties bloomFilterProperties){
        RBloomFilter<String> cachePenetrationBloomFilter = redissonClient.getBloomFilter(
                SpringUtil.getPrefixDistinctionName() + "-" + bloomFilterProperties.getName());
        cachePenetrationBloomFilter.tryInit(bloomFilterProperties.getExpectedInsertions(), 
                bloomFilterProperties.getFalseProbability());
        this.cachePenetrationBloomFilter = cachePenetrationBloomFilter;
    }
    
    public boolean add(String data) {
        return cachePenetrationBloomFilter.add(data);
    }
    
    public boolean contains(String data) {
        return cachePenetrationBloomFilter.contains(data);
    }
    
    public long getExpectedInsertions() {
        return cachePenetrationBloomFilter.getExpectedInsertions();
    }
    
    public double getFalseProbability() {
        return cachePenetrationBloomFilter.getFalseProbability();
    }
    
    public long getSize() {
        return cachePenetrationBloomFilter.getSize();
    }
    
    public int getHashIterations() {
        return cachePenetrationBloomFilter.getHashIterations();
    }
    
    public long count() {
        return cachePenetrationBloomFilter.count();
    }
}
