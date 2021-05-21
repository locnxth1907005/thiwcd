package com.example.thiwcd;

import service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "createEmployeeServlet",urlPatterns = "/employee/list")
public class ListEmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
req.setAttribute("listEmployee",employeeService.getList());
    }
}
