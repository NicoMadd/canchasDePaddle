import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Participacion implements Serializable {

	/*@Id
	@GeneratedValue
	Integer id_partipacion;*/

	//como es??? porque no reconoce a participacion como id?

	@Id
	//@Transient
	@ManyToOne
	Jugadores jugador; //PK FK

	@Id
	//@Transient
	@ManyToOne
	Partidos partido; //PK FK

	@Transient
	@ManyToOne
	Paletas paleta; //FK
}
