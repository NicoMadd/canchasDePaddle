import javax.persistence.*;

@Entity
public class Partidos {

	@Id @GeneratedValue
	Integer id_partido; //PK

	Integer inicio_partido;
	Integer fin_partido;


	@Transient
	@ManyToOne
	Integer id_cancha; //FK

	@Transient
	@ManyToOne
	Integer cod_color_cancha; //FK

	@Transient
	@OneToMany
	Integer id_jugador_responsable; //FK
}
