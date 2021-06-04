package Biblioteca.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro {

		public enum Catalogo {

			LIBRO, LIBROANTICO, PERIODICO
		}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(unique = true)
		private String titolo;
		private String autore;
		private Catalogo catalogo;
		private String soggetto;
		private String classificazione;
		private int annoDiPubblicazione;
		private String editore;
		private String lingua;
		private String parolaChiave;

		@ManyToOne(targetEntity = Scaffale.class)
		@JoinColumn(name = "idScaffale", referencedColumnName = "id")
		private Scaffale scaffale;
		
		
}
