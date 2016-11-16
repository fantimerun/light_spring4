package com.sonia.lightspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * description <br>
 *
 * @author johnny
 * @classname
 * @date 2016/11/16
 * @see
 */
@Configuration
@ComponentScan("com.sonia.lightspring")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {

}
