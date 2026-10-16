import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario{

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tutor")
    private long id;

    @NotBlank
    @Column(nullable = false, length = 150)
    private String correo ;
    
    @NotBlank
    @Column(nullable = false, length = 150)
    private String nombre ;
    
    @NotBlank
    @Column(nullable = false, length = 150)
    private String programa ;

    @NotBlank
    @Column(nullable = false, length = 150)
    private String estado ;
   

    public void setId(long id){
        this.id=id;
    }  
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    public void setId(long id){
        this.id=id;
    }  
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public void setPrograma(String programa){
        this.programa=programa;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEstado(){
        return estado;
    }
    public String getCorreo(){
        return correo;
    }
    public String getPrograma(){
        return programa;
    }

    
}