package top.wfjjt.www.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import top.wfjjt.www.entity.employee;
import top.wfjjt.www.utils.DataSourceUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * 数据访问类
 */
public class employeeDao {
    /**
     * 通过工具类来得到数据源对象，然后传递给QueryRunner对象
     */
    private QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
    /**
     * 查询所有员工
     */
    public List<employee> findAllEmployees(){
        try {
           return runner.query("select * from employee",new BeanListHandler<>(employee.class));
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }
}
