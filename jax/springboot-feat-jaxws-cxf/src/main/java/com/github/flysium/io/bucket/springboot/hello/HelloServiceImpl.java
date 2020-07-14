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

package com.github.flysium.io.bucket.springboot.hello;

import com.github.flysium.io.bucket.springboot.api.HelloService;
import com.github.flysium.io.bucket.springboot.entity.UserInfo;
import javax.jws.WebService;

/**
 * Hello Service
 *
 * @author Sven Augustus
 */
@WebService(serviceName = "HelloService", // 与接口中指定的name一致
    targetNamespace = "http://model.springboot.bucket.io.flysium.github.com/", // Model的命名空间,一般是接口的包名倒排
    endpointInterface = "com.github.flysium.io.bucket.springboot.api.HelloService"// 接口地址
)
public class HelloServiceImpl implements HelloService {

  @Override
  public String sayHello(String a) {
    return "Hello " + a + ", Welcome to CXF WS Spring Boot World!!!";
  }

  @Override
  public UserInfo getUser(String name) {
    return new UserInfo(1000L, name, 23);
  }

}
