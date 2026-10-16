import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "disponibilidades")
@Inheritance(strategy = InheritanceType.JOINED)
public class Disponibilidad{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_disponibilidad")
    private long idDisponibilidad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "correo_solicitante")
    private String correo;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_id")
    private Long id;

    public void setId(long id){
        this.id=id;
    }  
    public void setCorreo(String correo){
        this.correo=correo;
    }  
    public void setIdDisponibiliad(long idDisponibilidad){
        this.idDisponibilidad=idDisponibilidad;
    }     
    public Long getId(){
        return id;
    }
    public String getCorreo(){
        return correo;
    }
    public String getIdDisponibiliadad(){
        return idDisponibilidad;
    }

    
}