package Biblioteca.contrader.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Biblioteca.contrader.model.Libro;
import Biblioteca.contrader.model.Scaffale;

@Repository
@Transactional
public interface LibroRepository extends CrudRepository<Libro, Long> {

	Libro findLibroById(Long id);

	Libro findLibroByTitolo(String titolo);

	Libro findLibroByAutore(String autore);

	List<Libro> findAllByScaffale(Scaffale scaffale);
}
