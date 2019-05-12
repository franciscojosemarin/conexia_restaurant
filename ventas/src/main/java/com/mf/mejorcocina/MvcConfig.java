package com.mf.mejorcocina;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/invoice").setViewName("invoice");
		registry.addViewController("/report1").setViewName("report1");
		registry.addViewController("/report2").setViewName("report2");
	}

}
