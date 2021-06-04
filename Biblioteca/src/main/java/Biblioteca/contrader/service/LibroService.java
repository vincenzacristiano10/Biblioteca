package Biblioteca.contrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Biblioteca.contrader.DTO.LibroDTO;
import Biblioteca.contrader.DTO.ScaffaleDTO;
import Biblioteca.contrader.converter.LibroConverter;
import Biblioteca.contrader.converter.ScaffaleConverter;
import Biblioteca.contrader.model.Libro;
import Biblioteca.contrader.repository.LibroRepository;

@Service
public class LibroService extends AbstractService<Libro, LibroDTO> {

	@Autowired
	private LibroConverter libroConverter;

	@Autowired
	private LibroRepository libroRepository;

	@Autowired
	private ScaffaleConverter scaffaleConverter;
	
	public LibroDTO findLibroById(Long id) {
		return libroConverter.toDTO(libroRepository.findLibroById(id));
	}

	public LibroDTO findLibroByTitolo(String titolo) {
		return libroConverter.toDTO(libroRepository.findLibroByTitolo(titolo));
	}

	public LibroDTO findLibroByAutore(String autore) {
		return libroConverter.toDTO(libroRepository.findLibroByAutore(autore));
	}

	public List<LibroDTO> findAllByScaffale(ScaffaleDTO scaffale) {
		return libroConverter.toDTOList(libroRepository.findAllByScaffale(scaffaleConverter.toEntity(scaffale)));
	}
}
