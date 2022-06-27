package fr.dawan.BOOKPROJECT.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import fr.dawan.BOOKPROJECT.enums.Country;


@Entity
@Table(name = "authors")
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, length = 20)
	private String firstname;

	@Column(nullable = false, length = 20)
	private String lastname;

	@Column(nullable = false)
	private LocalDate birthdate;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Country country = Country.FRANCE;

	//Liste de mapping avec author-book
	@ManyToMany
	private List<Book> bookListMapperInAuthor = new ArrayList<>();


}
