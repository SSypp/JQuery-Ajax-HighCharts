package top.wfjjt.www.service;

import flexjson.JSONSerializer;
import top.wfjjt.www.dao.employeeDao;
import top.wfjjt.www.entity.employee;

import java.util.List;

/**
 * 员工业务层
 */
public class employeeService {
    private employeeDao empDao = new employeeDao();

    /**
     * 调用dao得到所有的员工对象
     * @return
     */
    public List<employee> findAllEmployees(){
        return empDao.findAllEmployees();
    }
    /**
     * 将获取到的数据转换为json数据
     */
    public String tojson(List<employee>employees){
        //创建json转换器对象
        JSONSerializer serializer = new JSONSerializer();
        //排除class属性
        serializer.exclude("class");
        return serializer.serialize(employees);
    }
}
