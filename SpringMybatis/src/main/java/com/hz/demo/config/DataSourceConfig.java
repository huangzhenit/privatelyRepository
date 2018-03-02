package com.hz.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages={"com.hz.demo.dao.mapper"})
public class DataSourceConfig {
	
    @Bean(name = "testdataSource")
    @ConfigurationProperties(prefix = "spring.datasource") //mapper 配置前缀 会自动获取test.driverClassName 等信息链接数据库
    public DataSource dataSourceTest() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "testSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("testdataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
//        bean.setPlugins(new Interceptor[]{new mybatisPage(Dialect.Type.MYSQL.toString())});
        return bean.getObject();
    }


    //事务配置
    @Bean(name = "dealermarketTransactionManager")
    public DataSourceTransactionManager getTransactionManager(@Qualifier("testdataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    @Bean(name = "dealermarketSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate1(@Qualifier("testSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
        return template;
    }

}
