package Biblioteca.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Biblioteca.contrader.DTO.ScaffaleDTO;
import Biblioteca.contrader.converter.ScaffaleConverter;
import Biblioteca.contrader.model.Scaffale;
import Biblioteca.contrader.repository.ScaffaleRepository;

@Service
public class ScaffaleService extends AbstractService<Scaffale, ScaffaleDTO> {

	@Autowired
	private ScaffaleConverter scaffaleConverter;
	
	@Autowired
	private ScaffaleRepository scaffaleRepository;
	
	public ScaffaleDTO findScaffaleById(Long id) {
		return scaffaleConverter.toDTO(scaffaleRepository.findScaffaleById(id));
	}
}
