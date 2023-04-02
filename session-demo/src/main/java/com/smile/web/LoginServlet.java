package com.smile.web;

import com.smile.pojo.User;
import com.smile.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service=new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = service.login(username, password);

        if(user!=null){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            String contextPath = req.getContextPath();
            resp.sendRedirect(contextPath+"/selectAllServlet");
        }
        else{
            req.setAttribute("login_msg","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
