import javax.persistence.*;

@Entity
public class Paletas {
	@Id
	@GeneratedValue
	Integer cod_paleta; //PK
	String nombre;
	Integer grosor;


	//@Transient
	@OneToOne
	Color color; //FK

	//@Transient
	@ManyToOne
	Constructor constructor; //FK
}
