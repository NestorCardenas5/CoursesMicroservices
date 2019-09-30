package nestor.gonzalo.cardenas.rojas.app.microservices.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "courses")
public class Courses implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	private String id;
	@NotEmpty
	private String nombreCurso;
	
	public Courses(@NotNull String id, @NotEmpty String nombreCurso) {
		super();
		this.id = id;
		this.nombreCurso = nombreCurso;
	}
	public Courses() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	
}
