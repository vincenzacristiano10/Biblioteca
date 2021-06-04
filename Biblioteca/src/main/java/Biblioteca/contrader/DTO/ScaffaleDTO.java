package Biblioteca.contrader.DTO;

import java.util.ArrayList;
import java.util.List;

import Biblioteca.contrader.model.Libro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScaffaleDTO {
	
	private Long id;
	private String corridoio;
	private String tipologia;
	private int capienza;
	private List<Libro> listLibro = new ArrayList<>();
}
