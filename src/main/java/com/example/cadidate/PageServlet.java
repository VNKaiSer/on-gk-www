package com.example.cadidate;

import java.io.*;
import java.util.List;

import com.example.cadidate.models.Candidate;
import com.example.cadidate.services.CandidateService;
import com.example.cadidate.services.impl.CandidateServicesImpl;
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
        try{
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
                handleActionCandidate(request, response);
                break;
            case "detail-candidate":
                handleActionCandidateDetail(request, response);
                break;
        }
        }catch (Exception e){
            e.printStackTrace();
        }

        // Hello

    }

    private void handleActionCandidateDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
        long can_id = Long.parseLong(request.getParameter("id"));
        CandidateService service = new CandidateServicesImpl();
        Candidate candidate = service.getCandidateDetail(can_id);
        System.out.println(candidate);
        request.setAttribute("candidate", candidate);
        String page = "/candidate/candidate_detail.jsp";
        forwardToPage(page, request, response);
    }

    private void handleActionCandidate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CandidateService service = new CandidateServicesImpl();
        List<Candidate> candidates = service.getAllCandidate();
        request.setAttribute("candidates", candidates);
        String page = "/candidate/candidate.jsp";
        forwardToPage(page, request, response);
    }

    private void forwardToPage(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(page).include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }
}