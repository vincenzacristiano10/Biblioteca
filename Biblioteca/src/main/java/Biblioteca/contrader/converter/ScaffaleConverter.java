package Biblioteca.contrader.converter;

import org.springframework.stereotype.Component;

import Biblioteca.contrader.DTO.ScaffaleDTO;
import Biblioteca.contrader.model.Scaffale;

@Component
public class ScaffaleConverter extends AbstractConverter<Scaffale, ScaffaleDTO> {

	/*@Autowired
	private LibroConverter libroConverter;*/
	
	
	@Override
	public Scaffale toEntity(ScaffaleDTO scaffaleDTO) {
		Scaffale scaffale = null;

		if (scaffaleDTO != null) {
			scaffale = new Scaffale(scaffaleDTO.getId(), scaffaleDTO.getCorridoio(), scaffaleDTO.getTipologia(), 
					scaffaleDTO.getCapienza(), scaffaleDTO.getListLibro());
		}
		return scaffale;
	}

	@Override
	public ScaffaleDTO toDTO(Scaffale scaffale) {
		ScaffaleDTO scaffaleDTO = null;

		if (scaffale != null) {
			scaffaleDTO = new ScaffaleDTO(scaffale.getId(), scaffale.getCorridoio(), 
					scaffale.getTipologia(), scaffale.getCapienza(), scaffale.getListLibro());
		}
		return scaffaleDTO;
	}
	
}
