package CollegePack;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class ServletSignUp extends HttpServlet {

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
        try {
           String username=request.getParameter("username");
           String firstname=request.getParameter("firstname");
           String lastname=request.getParameter("lastname");
           String emailid=request.getParameter("emailid");
           String password=request.getParameter("password");
           String institutename=request.getParameter("institutename");
           String city=request.getParameter("city");
           String year=request.getParameter("year");
           String placeofwork=request.getParameter("placeofwork");
           
           User user=new User();
           user.setStrUserName(username);
           user.setStrFirstName(firstname);
           user.setStrLastName(lastname);
           user.setStrEmailId(emailid);
           user.setStrPassword(password);
           user.setStrInstituteName(institutename);
           user.setStrCity(city);
           user.setStrYear(year);
           user.setStrPlaceOfWork(placeofwork);
           
           user.addUser(user);
           request.setAttribute("flag", "1");
           RequestDispatcher rs=request.getRequestDispatcher("/SignUp.jsp");
           rs.forward(request,response);
        } finally {            
            out.close();
        }
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
