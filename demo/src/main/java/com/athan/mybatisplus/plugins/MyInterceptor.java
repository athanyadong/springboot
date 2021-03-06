package com.athan.mybatisplus.plugins;

import org.apache.ibatis.javassist.bytecode.analysis.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * @author athan dongdong980327@163.copm
 * @version 2022/3/7 17:56
 * @since jdk11
 */
@Intercepts({@Signature(
        type = Executor.class,
        method = "update",
        args = {MappedStatement.class,Object.class}
)})
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //拦截方法，具体业务逻辑编写的位置
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        //创建target对象的代理对象，目的是将当前拦截器加入到该对象
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {
        //属性设置
    }

}
