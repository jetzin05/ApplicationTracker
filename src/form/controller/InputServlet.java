package form.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: philipp
 * Date: 6/24/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(name = "InputServlet")
public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream outStream = response.getOutputStream();
        String inputName = request.getParameter("inputName");
        String inputSurname = request.getParameter("inputSurname");
        outStream.println("name: " + inputName);
        outStream.println("surname: " + inputSurname);
    }
}
