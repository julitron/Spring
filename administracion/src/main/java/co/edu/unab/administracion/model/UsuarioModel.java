package co.edu.unab.administracion.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
     private int IdUsuario;
     @Column(unique = true, nullable = false)
     private String cedulaUsuario;
     @Column(nullable = false)
     private String nombreUsuario;
     @Column(nullable = false)
     private String apellidoUsuario;
     @Column(unique = true,nullable = false)
     private String loginUsuario;
     @Column(nullable = false)
     private String contrasenaUsuario;
}
