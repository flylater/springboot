package com.flylater.springboot.config;

import com.flylater.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author : Flylater
 * @version : 1.0
 * @date : 2020/4/27
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

//    @Bean
//    public LocaleResolver localeResolver() {
//
//        LocaleResolver localeResolver = new LocaleResolver() {
//            @Override
//            public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//                String l = httpServletRequest.getParameter("l");
//                Locale locale = Locale.getDefault();
//                if (!StringUtils.isEmpty(l)) {
//                    String[] split = l.split("_");
//                    locale = new Locale(split[0], split[1]);
//                }
//                return locale;
//            }
//
//            @Override
//            public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
//
//            }
//        };
//        return localeResolver;
//    }
}
