package org.lyflexi.strategypattern.strategyByAop.handler.annotationHander;

import lombok.extern.slf4j.Slf4j;
import org.lyflexi.strategypattern.strategyByAop.annotation.PassiveMsgHandlerType;
import org.lyflexi.strategypattern.strategyByAop.handler.AiPassiveMsgHandler;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:49
 */
@Slf4j
@PassiveMsgHandlerType("audit.serviceVersion.publish")
public class PublishServiceVersionMsgHandler extends AiPassiveMsgHandler {

    @Override
    public Map<String, Object> handle(Map<String, Object> params) {
        try {
            log.info("PublishServiceVersionMsgHandler begin");
        }
        catch (RuntimeException e) {
        }

        return new HashMap<>();
    }
}