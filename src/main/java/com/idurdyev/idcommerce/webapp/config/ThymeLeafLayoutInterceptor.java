package com.idurdyev.idcommerce.webapp.config;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is Thymeleaf layout configurator
 *
 * @author Ilya Durdyev, ilya.durdyev@gmail.com, icq 159152
 */
public class ThymeLeafLayoutInterceptor extends HandlerInterceptorAdapter {
    private static final String DEFAULT_LAYOUT = "layouts/base_layout";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }
        String originalViewName = modelAndView.getViewName();
        modelAndView.setViewName(DEFAULT_LAYOUT);
        modelAndView.addObject(DEFAULT_VIEW_ATTRIBUTE_NAME, originalViewName);
    }
}
