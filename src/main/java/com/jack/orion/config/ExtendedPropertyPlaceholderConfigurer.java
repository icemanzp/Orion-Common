package com.jack.orion.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * 扩展资源文件处理，增加注解获取资源文件值的能力
 * Created by Jack on 2017/6/23.
 */
public class ExtendedPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private Properties props;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props)
            throws BeansException {
        super.processProperties(beanFactory, props);
        this.props = props;
    }

    public Object getProperty(String key) {
        return props.get(key);
    }
}
