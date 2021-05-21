package com.example.thiwcd;

import entity.Employee;
import service.EmployeeService;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "createEmployeeServlet",urlPatterns = "/employee/create")
public class CreateEmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Employee employee = new Employee();
        employee.setFullName(req.getParameter("fullName"));
        employee.setAddress(req.getParameter("address"));
        employee.setDepartment(req.getParameter("department"));
        employee.setPosition(req.getParameter("position"));
        employee.setBirthDay((Date.valueOf(req.getParameter("birthday"))));
        employeeService .create(employee);
    }
}
