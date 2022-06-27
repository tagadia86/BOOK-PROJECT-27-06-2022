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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.enums.Language;


@Entity
@Table(name = "books")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private long ISBN;

	@Column(nullable = false, length = 50)
	private String title;

	@Column(nullable = false)
	private LocalDate publishedDate;

	@Column(nullable = false)
	private double weight;

	@Column(nullable = false)
	private int pageNumber;

	//Liste de mapping book-author
	@ManyToMany(mappedBy = "bookListMapperInAuthor")
	private List<Author> authorListInBook = new ArrayList<>();
	
	//Liste de mapping category-book
	@ManyToMany(mappedBy = "bookListMapperInCategory")
	private List<Category> categoryListInBook = new ArrayList<>();
	
	//Liste de mapping book-user
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User userMapperInBook;

	@Column(nullable = false, length = 50)
	private String publishingHouse;

	@Column(nullable = false, length = 500)
	private String description;

	@Enumerated(EnumType.STRING)
	private Language language = Language.FRANÇAIS;

	@Enumerated(EnumType.STRING)
	private Availability isavailable = Availability.DISPONIBLE;

	/*
	 * @Column(nullable = false) PAS NECESSAIRE CAR LA LIAISON ENTRE LES TABLES SE
	 * FAIT AVEC MAPPRED BY private long userId;
	 */

	@Enumerated(EnumType.STRING)
	private BookEtat etat = BookEtat.MOYEN;

	@Column(nullable = false)
	private int pointBook;

	@Column(nullable = false)
	private double price;

}