/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegePack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class SubmitAnsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String desc=request.getParameter("desc");
       
        String qidstr=request.getParameter("qid");
        int qid=-1;
        try{
            qid=Integer.parseInt(qidstr);
        }
        catch(Exception e){
            qid=-1;
        }
        if(qid!=-1)
        {
            System.out.println("qid="+qid);
            HttpSession session=request.getSession(false);  
            int userid=(Integer)session.getAttribute("userid");  
            Answer answer=new Answer();
            answer.setiQuestionId(qid);
            answer.setIupvote(0);
            answer.setStrAnswer(desc);
            answer.setiUserId(userid);
            answer.addAnswer(answer);
            response.sendRedirect("ansQues.jsp?flag=1");
        }
        else
            response.sendRedirect("ansQues.jsp?flag=0");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
