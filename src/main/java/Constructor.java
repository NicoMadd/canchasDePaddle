import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Constructor {
	@Id
	@GeneratedValue
	Integer cod_constructor; //PK

	String nombre;
	Integer domicilio; 
}
