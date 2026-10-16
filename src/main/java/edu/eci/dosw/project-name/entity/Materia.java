import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "materias")
@Inheritance(strategy = InheritanceType.JOINED)
public class Materia{

    @NotBlank
    @Column(nullable = false, length = 150)
    private String siglas ;

    @Column(name = "estado")
    private String nombre;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "materia_id")
    private Long id;

    public void setId(long id){
        this.id=id;
    }  
    public void setNombre(String nombre){
        this.nombre=nombre;
    }  
    public void setSiglas(String siglas){
        this.siglas=siglas;
    }  

    public Long getId(){
        return id;
    }
    public String getSiglas(){
        return siglas;
    }
    public String getNombre(){
        return nombre;
    }

    
}