package Biblioteca.contrader.converter;

import org.springframework.stereotype.Component;

import Biblioteca.contrader.DTO.LibroDTO;
import Biblioteca.contrader.model.Libro;

@Component
public class LibroConverter extends AbstractConverter<Libro, LibroDTO> {

	
	
	@Override
	public Libro toEntity(LibroDTO libroDTO) {
		Libro libro = null;

		if (libroDTO != null) {
			libro = new Libro(libroDTO.getId(), libroDTO.getTitolo(), libroDTO.getAutore(), libroDTO.getCatalogo(),
					libroDTO.getSoggetto(), libroDTO.getClassificazione(), libroDTO.getAnnoDiPubblicazione(),
					libroDTO.getEditore(), libroDTO.getLingua(), libroDTO.getParolaChiave(), libroDTO.getScaffale());

		}
		return libro;
	}
	
	@Override
	public LibroDTO toDTO(Libro libro) {
		LibroDTO libroDTO = null;

		if (libro != null) {
			libroDTO = new LibroDTO(libro.getId(), libro.getTitolo(), libro.getAutore(), libro.getCatalogo(), 
					libro.getSoggetto(), libro.getClassificazione(), libro.getAnnoDiPubblicazione(),
					libro.getEditore(), libro.getLingua(), libro.getParolaChiave(), libro.getScaffale());

		}
		return libroDTO;
	}
}