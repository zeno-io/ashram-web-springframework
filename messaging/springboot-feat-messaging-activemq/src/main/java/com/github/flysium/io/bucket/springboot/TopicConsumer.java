/*
 * Copyright 2018-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.flysium.io.bucket.springboot;

import com.github.flysium.io.bucket.springboot.entity.UserInfo;
import javax.jms.JMSException;
import javax.jms.Message;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Copy from git@github.com:spring-projects/spring-oot.git
 *
 * @author Sven Augustus
 */
@Component
@Profile("topic-consumer")
public class TopicConsumer {

  // @JmsListener 如果不指定独立的 containerFactory 的话是只能消费queue消息
  @JmsListener(destination = "sample.topic", containerFactory = "topicJmsListenerContainer")
  public void receiveTopic(@Payload UserInfo userInfo, Message message) throws JMSException {
    try {
      System.out.println(
          "receiveTopic== threadId= " + Thread.currentThread().getId() + ",msgId= " + message
              .getJMSMessageID() + ",body= " + userInfo);
      // 手动确认消息已收到，如若不确认，消息将一直存在于消息队列中
      message.acknowledge();
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }

}
