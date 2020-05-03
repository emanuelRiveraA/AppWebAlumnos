
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
@WebServlet(name = "GuardarUsuario", urlPatterns = {"/guardar-usuario"})
public class GuardarUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
            //int id = Integer.parseInt(req.getParameter("id"));
            String nombre = req.getParameter("nombre");        
            String apellidos = req.getParameter("apellidos");        
            String grupo = req.getParameter("grupo");        
            String sql = "insert into usuarios values(null,?,?,?)";
            int index = 1;
            PreparedStatement ps;
        try {            
            
            ps = DataConnection.createConnetion().getConnection().prepareStatement(sql);
            //ps.setInt(index++, id);
            ps.setString(index++, nombre);
            ps.setString(index++, apellidos);
            ps.setString(index++, grupo);
            
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuardarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    

    

}
