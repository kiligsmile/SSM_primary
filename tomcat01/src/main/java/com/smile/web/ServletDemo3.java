package com.smile.web;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get3.... ");

        req.setCharacterEncoding("UTF-8");

        Map<String, String[]> map =  req.getParameterMap();
        for(String key:map.keySet()){
            System.out.print(key+":");
            String[] values = map.get(key);
            for(String value:values){
                System.out.print(value+" ");
            }
            System.out.println();

        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
