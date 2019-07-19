package web.web.MyMvcConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import web.web.controller.LoginHandlerInterceptor;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //自己写的配置类，将输入的url转到另一个页面
    //视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/main.html").setViewName("/dashboard.htm");//同上

        registry.addViewController("/").setViewName("/index");//将/转到/index?，这里的index指的是templates目录下的index，与其页面的title叫什么无关
//        registry.addViewController("/index.html").setViewName("/index");//同上

    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/user/index");

    }
}
