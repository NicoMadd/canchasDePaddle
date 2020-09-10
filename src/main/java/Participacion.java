import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
public class Participacion {

	/*@Id
	@GeneratedValue
	Integer id_partipacion;*/

	//como es??? porque no reconoce a participacion como id?

	@NaturalId
	//@Transient
	@OneToMany
	Jugadores jugador; //PK FK

	@NaturalId
	//@Transient
	@OneToMany
	Partidos partido; //PK FK

	@Transient
	@ManyToOne
	Paletas paleta; //FK
}
