package top.wfjjt.www.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

/**
 * 数据源工具类
 */
public class DataSourceUtils {
    /**
     * 创建一个连接池
     */
    private static ComboPooledDataSource ds = new ComboPooledDataSource();
    /**
     * 获取一个数据源对象
     */
    public static DataSource getDataSource(){
        return ds;
    }
}