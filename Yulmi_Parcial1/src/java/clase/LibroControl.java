/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package clase;

import clase.AlumnoController;
import clase.LibroModel;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Yosmeri C. Cruz
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class LibroControl extends HttpServlet {
LibroModel cliente;
 AlumnoController registroAlumno;
    LibroModel [] alumnosRegistrados;
    
    
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter respuesta = response.getWriter()) {
           cliente=new LibroModel (
                request.getParameter("codigo"),
                request.getParameter("nombre"),
                request.getParameter("año"),
                request.getParameter("tipodpasta"),
                request.getParameter("editorial")     
            );               
            
            if(registroAlumno==null){
                 registroAlumno=new AlumnoController();
            }
           
            registroAlumno.guardarAlumno( cliente);//almacenarlo en el array
             alumnosRegistrados= registroAlumno.getAlumnos();
           respuesta.println("<!DOCTYPE html>");
            respuesta.println("<html>");
            respuesta.println("<head>");
            respuesta.println("<title>Servlet NewServlet</title>");   
            respuesta.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css' integrity='sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N' crossorigin='anonymous'>");
            respuesta.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js' integrity='sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct' crossorigin='anonymous'></script>");
            respuesta.println("</head>");
            respuesta.println("<body>");           
            respuesta.println("<div class='container'>");
             respuesta.println("<br><h1>Libro Registrado </h1><br>");  
            respuesta.println("<form name='nombreForm'>");
            respuesta.println("<div class='container-lg d-flex'> <a href='index.html' class=\"btn btn-success ml-auto\">Registrar Nuevo</a></div><br>");
                respuesta.println("<div class='container-lg d-flex'> <a href='newhtml.html' class=\"btn btn-success ml-auto\">Registrar LIBRO</a></div><br>");
            respuesta.println("<table class=\"table table-hover table-striped\">");   
            respuesta.println("<thead><tr> <th scope=\"col\">CODIGO LIBRO</th>\n"+ "<th scope=\"col\">NOMBRE DEL LIBRO</th>\n"+
                                "<th scope=\"col\"> TIPO DE PASTA </th>\n" + "<th scope=\"col\">AÑO DE PUBLICACION</th>\n" +
                             "   <th scope=\"col\"> EDITORIAL </th> </tr></thead>");  
            respuesta.println("<tbody>");
            for (int i = 0; i < alumnosRegistrados.length; i++){
                    if(!alumnosRegistrados[i].getCodigo().isEmpty()){
                       respuesta.println("<tr><td>" + alumnosRegistrados[i].getCodigo()+ "</td>");
                       respuesta.println("<td>" + alumnosRegistrados[i].getNombre() + "</td>");
                       respuesta.println("<td>" + alumnosRegistrados[i].getTipodpasta()+ "</td>");
                       respuesta.println("<td>" + alumnosRegistrados[i].getAño()+ "</td>");
                          respuesta.println("<td>" + alumnosRegistrados[i].getEditorial()+ "</td>");
                    }
                }
            respuesta.println("</tbody></table>");
            respuesta.println("</div>");
            respuesta.println("</form>");
            respuesta.println("</body>");
            respuesta.println("</html>");
        }
    }
}
             
     