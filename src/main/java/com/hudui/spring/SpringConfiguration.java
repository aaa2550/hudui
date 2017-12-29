package com.hudui.spring;

import lombok.Getter;
import lombok.Setter;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
import org.jfaster.mango.plugin.page.MySQLPageInterceptor;
import org.jfaster.mango.plugin.spring.AbstractMangoFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Configuration
@Setter
@Getter
@ConfigurationProperties(prefix = "hudui")
public class SpringConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Bean
    public AbstractMangoFactoryBean getAbstractMangoFactoryBean() {
        return new  AbstractMangoFactoryBean() {
            public Mango createMango() {
                Mango mango = Mango.newInstance(new DriverManagerDataSource(driverClassName, url, username, password));
                mango.addInterceptor(new MySQLPageInterceptor());
                return mango;
            }
        };
    }

}
