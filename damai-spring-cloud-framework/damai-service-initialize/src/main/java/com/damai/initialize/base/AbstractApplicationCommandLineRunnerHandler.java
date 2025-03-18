package com.damai.initialize.base;

import org.springframework.boot.CommandLineRunner;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_COMMAND_LINE_RUNNER;
import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_POST_CONSTRUCT;

/**
 * @program: 极度真实还原大麦网高并发实战项目。  
 * @description: 用于处理 {@link CommandLineRunner} 类型 初始化执行 抽象
 * @author: Magicum Sidus（Niuzhongyu）
 **/
public abstract class AbstractApplicationCommandLineRunnerHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_COMMAND_LINE_RUNNER;
    }
}
