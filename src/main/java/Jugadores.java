import javax.persistence.*;

@Entity
public class Jugadores {
	@Id
	@GeneratedValue
	Integer id_jugador; //PK

	String nombre;
	String apellido;
	String domicilo;
	Integer nacimiento;

	@Transient
	@OneToOne
	Paletas paleta; //FK
}
