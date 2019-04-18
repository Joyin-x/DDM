package com.joyin.demo.Public.Config;

import com.joyin.demo.util.AllLnterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author wwx
 * @date 2019/4/18 11:03
 **/
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器 拦截规则
        //多个拦截器时 以此添加 执行顺序按添加顺序
        registry.addInterceptor(new AllLnterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/error");
        super.addInterceptors(registry);
    }
}
