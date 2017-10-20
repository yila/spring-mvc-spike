package com.springmvc.spike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages={"com.springmvc.spike.controller"})
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter{
	 @Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		  configurer.enable();
	}
	 
	   @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		   registry.addResourceHandler("/views/**").addResourceLocations("/WEB-INF/views/");
	}
	  @Bean
	public ViewResolver htmlViewResolver(ViewResolverRegistry registry) {
		  InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		  viewResolver.setViewClass(JstlView.class);
		  viewResolver.setPrefix("/WEB-INF/views");
		  viewResolver.setSuffix(".html");
		  return viewResolver;
	}
}
