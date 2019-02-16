package top.wfjjt.www.test;
import org.junit.Test;
import top.wfjjt.www.dao.employeeDao;
import top.wfjjt.www.entity.employee;
import top.wfjjt.www.utils.DataSourceUtils;
import javax.sql.DataSource;
import java.util.List;

public class TestEmployeeDao {
    employeeDao empDao = new employeeDao();
    @Test
    public void testGetDataSource(){
        DataSource ds = DataSourceUtils.getDataSource();
        System.out.println(ds);
    }
    @Test
    public void testFindAllEmployees(){
        List<employee> employees = empDao.findAllEmployees();
        for (employee empl : employees) {
            System.out.println(empl);
        }
    }
    }


