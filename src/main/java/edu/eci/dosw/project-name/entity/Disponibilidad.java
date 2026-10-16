import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "disponibilidades")
@Inheritance(strategy = InheritanceType.JOINED)
public class Disponibilidad{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "correo_tutor")
    private String correo;

    @NotBlank
    @Column(nullable = false, length = 150)
    private String modalidad ;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_inicio")
    private Date  fechaInicio;

    @Column(name = "fecha_final")
    private Date  fechaFinal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disponibilidad_id")
    private Long id;

    public void setId(long id){
        this.id=id;
    }  
    public void setEstado(String estado){
        this.estado=estado;
    }  
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio=fechaInicio;
    }  
    public void setFechaFinal(Date fechaFinal){
        this.fechaFinal=fechaFinal;
    }  
    public void setModalidad(String modalidad){
        this.modalidad=modalidad;
    }  
    public void setCorreo(String correo){
        this.correo=correo;
    }   

    public Long getId(){
        return id;
    }
    public String getModalidad(){
        return modalidad;
    }
    public String getEstado(){
        return estado;
    }
    public String getCorreo(){
        return correo;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    public Date getFechaFinal(){
        return fechaFinal;
    }

    
}