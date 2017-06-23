package com.jack.orion.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 资源获取标签，
 * 如输入参数则返回指定参数 Key 的值
 * 如无输入参数，则默认用变量名作为 Key 查找值并返回
 * Created by Jack on 2017/6/23.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Config {
    String value() default "";
}
