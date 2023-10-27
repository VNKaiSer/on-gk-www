package com.example.cadidate;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "pageServlet", value = "/page")
public class PageServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String action = request.getParameter("action");
        if(action == null) {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
            return;
        }

        switch (action){
            case "home": {
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h1> Home </h1>");
                out.println("</body></html>");
            }
            case "candidate":
                handleActionCandidate();
                break;
        }

        // Hello

    }

    private void handleActionCandidate() {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}