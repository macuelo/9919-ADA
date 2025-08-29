package dao;

import modelo.Usuario; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    public void registrarUsuario(Usuario u) throws SQLException {
        String sql = "INSERT usuarios (nombre, correo, password)(?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, u.getNombre());
        stmt.setString(2, u.getCorreo());
        stmt.setString(3, u.getPassword());
        stmt.executeUpdate();
    }

    public List<Usuario> obtenerUsuarios() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Usuario u = new Usuario(
                rs.getInt("id_usuario"),
                rs.getString("nombre"),
                rs.getString("correo"),
                rs.getString("password")
            );
            lista.add(u);
        }
        return lista;
    }
}