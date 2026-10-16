import java.util.Date;

import jakarta.*;
import java.util.List;

@Entity
@Table(name = "tutores")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tutor{

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tutor")
    private long id;

   

    public void setId(long id){
        this.id=id;
    }  
    public Long getId(){
        return id;
    }

    
}