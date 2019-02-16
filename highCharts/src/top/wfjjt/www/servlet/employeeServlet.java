package top.wfjjt.www.servlet;

import top.wfjjt.www.entity.employee;
import top.wfjjt.www.service.employeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/employee")
public class employeeServlet extends HttpServlet {
    //调用业务层
    private employeeService empService = new employeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //输出指定类型的数据
        response.setContentType("text/json;charset=utf-8");
        //获取到打印流进行输出
        PrintWriter out = response.getWriter();
        //获取数据库中的所有员工对象
       List<employee> employees = empService.findAllEmployees();
       //将获取到的数据转换成json输出到浏览器上
        String json = empService.tojson(employees);
        //输出数据
        out.print(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
