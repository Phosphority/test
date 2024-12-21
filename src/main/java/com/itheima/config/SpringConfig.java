package com.itheima.config;

import com.itheima.beans.Others;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import(Others.class)
public class SpringConfig {

}
