package fr.dawan.BOOKPROJECT.dto;

import java.time.LocalDate;

import fr.dawan.BOOKPROJECT.enums.Availability;
import fr.dawan.BOOKPROJECT.enums.BookEtat;
import fr.dawan.BOOKPROJECT.enums.Language;

public class BookDto {
	
	private long id;

	private long ISBN;

	private String title;

	private LocalDate publishedDate;

	private double weight;

	private int pageNumber;

	private String publishingHouse;

	private String description;

	private Language language = Language.FRANÇAIS;

	private Availability isavailable = Availability.DISPONIBLE;

	private BookEtat etat = BookEtat.MOYEN;
	
	 private byte[] image;

}
