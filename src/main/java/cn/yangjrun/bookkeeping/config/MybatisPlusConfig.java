package cn.yangjrun.bookkeeping.config;

import cn.yangjrun.bookkeeping.handler.mybatis.DateTimeInterceptor;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.autoconfigure.SpringBootVFS;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.MybatisXMLLanguageDriver;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.ExecutorType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages = "cn.yangjrun.bookkeeping.dao")
public class MybatisPlusConfig {

    private DataSource dataSource;

    private MybatisPlusProperties properties;

    @Autowired
    private ResourceLoader resourceLoader = new DefaultResourceLoader();

    @Autowired(required = false)
    private Interceptor[] interceptors;

    @Autowired(required = false)
    private DatabaseIdProvider databaseIdProvider;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Autowired
    public void setProperties(MybatisPlusProperties properties) {
        this.properties = properties;
    }


    /**
     * mybatis-plus分页插件
     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType("mysql");
//        return page;
//    }

    /**
     * 这里全部使用mybatis-autoconfigure 已经自动加载的资源。不手动指定 配置文件和mybatis-boot的配置文件同步
     *
     * @return
     * @throws IOException
     */
    @Bean
    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() throws IOException, IOException {
        MybatisSqlSessionFactoryBean mybatisPlus = new MybatisSqlSessionFactoryBean();
        mybatisPlus.setDataSource(dataSource);
        mybatisPlus.setVfs(SpringBootVFS.class);
        String configLocation = this.properties.getConfigLocation();
        if (StringUtils.isNotBlank(configLocation)) {
            mybatisPlus.setConfigLocation(this.resourceLoader.getResource(configLocation));
        }
        mybatisPlus.setConfiguration(properties.getConfiguration());
        mybatisPlus.setPlugins(this.interceptors);
        MybatisConfiguration mc = new MybatisConfiguration();
        mc.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
        mc.setMapUnderscoreToCamelCase(true);// 数据库和java都是驼峰，就不需要
        //      使全局的映射器启用或禁用换成
        mc.setCacheEnabled(true);

        //        允许JDBC 支持自动生成主键
        mc.setUseGeneratedKeys(true);
        //  指定MyBatis 所用日志的具体实现
        mc.setLogImpl(Log4j2Impl.class);
        //        配置默认的执行器.SIMPLE就是普通执行器;REUSE执行器会重用预处理语句(prepared statements);BATCH执行器将重用语句并执行批量更新
        mc.setDefaultExecutorType(ExecutorType.SIMPLE);
        //        添加create time 和 update time 自动填充拦截器
        mc.addInterceptor(new DateTimeInterceptor());
        mybatisPlus.setConfiguration(mc);
        if (this.databaseIdProvider != null) {
            mybatisPlus.setDatabaseIdProvider(this.databaseIdProvider);
        }
        mybatisPlus.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
        mybatisPlus.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
        mybatisPlus.setMapperLocations(this.properties.resolveMapperLocations());
        // 设置mapper.xml文件的路径
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resource = resolver.getResources("classpath:mybatis/mapper/*.xml");
        mybatisPlus.setMapperLocations(resource);
        return mybatisPlus;
    }


}
