/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlaor;

import dao.DataConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Idalia
 */
@WebServlet(name = "GuardarMateria", urlPatterns = {"/guardar_materia"})
public class GuardarMateria extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         //int id = Integer.parseInt(req.getParameter("id"));
            String materia = req.getParameter("materia");        
            String grupo = req.getParameter("grupo");        
            String hora = req.getParameter("hora");        
            String sql = "insert into materias values(null,?,?,?)";
            int index = 1;
            PreparedStatement ps;
        try {
            
            
            ps = DataConnection.createConnetion().getConnection().prepareStatement(sql);
            //ps.setInt(index++, id);
            ps.setString(index++, materia);
            ps.setString(index++, grupo);
            ps.setString(index++, hora);
            
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
}
