/*
 * Copyright (c) 2015 - 9 - 28  11 : 44 :$second.second
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package w.p.j.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.util.ClassUtils;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;
import w.p.j.util.MyMapper;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by WPJ587 on 2015/9/28.
 */
@Configuration
@EnableAutoConfiguration(exclude = {DruidDataSourceEntity.class})
//@MapperScan(basePackages = "w.p.j.dao",markerInterface = MyMapper.class)
@ImportResource("classpath:applicationContext.xml")
public class MybatisConfig {
//    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
//    @Autowired
//    private DruidDataSourceEntity druidDataSourceEntity;
//    @Bean
//    public DataSource dataSource() {
//        logger.info("------------druidDataSourceEntity------" + druidDataSourceEntity);
//        //加载配置文件属性
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(druidDataSourceEntity.getDriverClassName());
//        dataSource.setUsername(druidDataSourceEntity.getUsername());
//        dataSource.setPassword(druidDataSourceEntity.getPassword());
//        dataSource.setUrl(druidDataSourceEntity.getUrl());
//        dataSource.setMaxActive(druidDataSourceEntity.getMaxActive());
//        dataSource.setValidationQuery(druidDataSourceEntity.getValidationQuery());
//        dataSource.setTestOnBorrow(druidDataSourceEntity.isTestOnBorrow());
//        dataSource.setTestOnReturn(druidDataSourceEntity.isTestOnReturn());
//        dataSource.setTestWhileIdle(druidDataSourceEntity.isTestWhileIdle());
//        dataSource.setTimeBetweenEvictionRunsMillis(druidDataSourceEntity.getTimeBetweenEvictionRunsMillis());
//        dataSource.setMinEvictableIdleTimeMillis(druidDataSourceEntity.getMinEictableIdleTimeMillis());
//        dataSource.setPoolPreparedStatements(druidDataSourceEntity.isPoolPreparedStatements());
//        dataSource.setMaxOpenPreparedStatements(druidDataSourceEntity.getMaxOpenPreparedStatements());
//        try {
//            dataSource.setFilters(druidDataSourceEntity.getFilters());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }
//
//    public Resource[] getResource(String basePackage, String pattern) throws IOException {
//        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
//                + ClassUtils.convertClassNameToResourcePath(new StandardEnvironment()
//                .resolveRequiredPlaceholders(basePackage)) + "/" + pattern;
//        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(packageSearchPath);
//        return resources;
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        logger.info("------> sqlSessionFactory");
//        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(dataSource());
//        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
//        sqlSessionFactory.setFailFast(true);
//        sqlSessionFactory.setMapperLocations(getResource("mapper", "**/*.xml"));
//        //配置插件
//
//        return sqlSessionFactory.getObject();
//    }
//
//
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        logger.info("> transactionManager");
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//    @Bean
//    @Scope(value = "prototype")
//    public SqlSessionTemplate sqlSessionTemplate() {
//
//        try {
//            logger.info("SqlSessionTemplate---");
//            return new SqlSessionTemplate(sqlSessionFactory());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        logger.info("---sqlSesson----","空");
//        return null;
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        logger.info("jdbc.settings={}", druidDataSourceEntity);
//        logger.info("sqlSession",sqlSessionTemplate());
//
//    }

}
