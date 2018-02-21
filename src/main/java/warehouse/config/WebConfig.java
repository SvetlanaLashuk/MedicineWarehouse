package warehouse.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 *  Configuration class
 */

@Configuration
@EnableWebMvc
@ComponentScan({"warehouse.config", "warehouse.controller", "warehouse.entity", "warehouse.repository", "warehouse.service"})
public class WebConfig extends WebMvcConfigurerAdapter{
}
