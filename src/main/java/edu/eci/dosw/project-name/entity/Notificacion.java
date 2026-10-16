import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "notificaciones")
@Inheritance(strategy = InheritanceType.JOINED)
public class Notificacion{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "correo_usuario")
    private String correo;

    @NotBlank
    @Column(nullable = false, length = 150)
    private String mensaje;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notificacion_id")
    private Long id;

    public void setId(long id){
        this.id=id;
    }  
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }   

    public Long getId(){
        return id;
    }
    public String getMensaje(){
        return mensaje;
    }

    public String getCorreo(){
        return correo;
    }

    
}