/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dubbo.samples.token;

import org.apache.dubbo.samples.token.api.DemoService;

//dubbo事件通知机制1
//https://blog.csdn.net/wangyiyungw/article/details/84142591

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:/spring/token-consumer.xml"})
public class NotifyIT {
    @Autowired
    private DemoService demoService;

   
    
    //消费端并没有设置token值  但是在调用服务端时却自动将token值传过去   why
    @Test
    public void testToken() throws Exception {
    	  try {
              String s=demoService.sayHello(11);
              System.out.println("---------"+s);
              System.in.read();
          } catch (Throwable t) {
              // ignore
          }
    }
}
