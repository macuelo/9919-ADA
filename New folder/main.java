/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import dao.UsuarioDAO;       
import modelo.Usuario;       
import util.ConexionBD;     
import java.sql.Connection;  
import java.util.List;  
public class main {

    public static void main(String[] args) {
        
           try (Connection conn = ConexionBD.getConnection()) {
            UsuarioDAO usuarioDAO = new UsuarioDAO(conn);

            // Registrar usuario
            Usuario nuevo = new Usuario(0, "Carlos", "carlos@mail.com", "clave123");
            usuarioDAO.registrarUsuario(nuevo);
            System.out.println("Usuario registrado!");

            // Obtener usuarios
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            for (Usuario u : usuarios) {
                System.out.println("ID: " + u.getId() + " Nombre: " + u.getNombre());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
        
        
