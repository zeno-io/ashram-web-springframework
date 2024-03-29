///*
// * Copyright 2020 SvenAugustus
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package xyz.flysium.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * Spring MVC 配置
// *
// * @author zeno.cai
// */
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//  // 视图解析器
//  @Bean
//  public ViewResolver viewResolver() {
//    final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//    viewResolver.setPrefix("/WEB-INF/jsp/");
//    viewResolver.setSuffix(".jsp");
//    viewResolver.setViewClass(JstlView.class);
//    return viewResolver;
//  }
//
//  @Override
//  public void addViewControllers(ViewControllerRegistry registry) {
//    // index.jsp
//    registry.addViewController("/").setViewName("index");
//  }
//
//}
