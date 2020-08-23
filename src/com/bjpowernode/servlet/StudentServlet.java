package com.bjpowernode.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();

        if (path.equals("/student/insert")){
            int res = insertStudent(request,response);
        }else if (path.equals("/student/delete")){
            int res = deleteStudent(request,response);
        }else if (path.equals("/student/update")){
            int res = updateStudent(request,response);
        }else if (path.equals("/student/select")){
            int res = selectStudent(request,response);
        }
    }

    private int selectStudent(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行查询操作");
        return 0;
    }

    private int updateStudent(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行更新操作");
        return 0;
    }

    private int deleteStudent(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行删除操作");
        return 0;
    }

    public int insertStudent(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行添加操作");

        return 0;
    }
}
