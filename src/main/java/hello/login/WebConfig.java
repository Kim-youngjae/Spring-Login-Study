package hello.login;

import hello.login.web.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LogFilter()); // 생성하여 사용할 필터를 등록해줘야 한다.
        filterRegistrationBean.setOrder(1); // filter가 체인으로 들어갈 때 순서를 정해주기
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
