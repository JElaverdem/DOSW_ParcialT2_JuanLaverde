import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "solicitantes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Solicitante{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "solicitante_id")
    private long id;

    @NotBlank
    @Column(nullable = false, length = 150)
    private String nivel ;


    public void setNivel(String nivel){
        this.nivel=nivel;
    }  
    public void setId(long id){
        this.id=id;
    }  
    public long getId(){
        return id;
    }
    public Date getNivel(){
        return nivel;
    }

    
}