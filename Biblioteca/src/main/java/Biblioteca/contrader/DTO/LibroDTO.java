package Biblioteca.contrader.DTO;

import Biblioteca.contrader.model.Libro.Catalogo;
import Biblioteca.contrader.model.Scaffale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

	private Long id;
	private String titolo;
	private String autore;
	private Catalogo catalogo;
	private String soggetto;
	private String classificazione;
	private int annoDiPubblicazione;
	private String editore;
	private String lingua;
	private String parolaChiave;
	private Scaffale scaffale;
}
