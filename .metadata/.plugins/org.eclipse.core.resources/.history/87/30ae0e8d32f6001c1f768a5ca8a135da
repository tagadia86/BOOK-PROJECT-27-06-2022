package fr.dawan.BOOKPROJECT.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
	
	@Column(nullable = false, length = 50)
	private String publishingHouse;
	

	@Column(nullable = false, length = 500)
	private String description;
	
	
	
	@Enumerated(EnumType.STRING)
	private Language language = Language.FRANÇAIS;
	
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private int pointBook;
	
	@Enumerated(EnumType.STRING)
	private BookEtat etat = BookEtat.MOYEN;
	

	@Enumerated(EnumType.STRING)
	private Availability isavailable = Availability.AVAILABLE;
	
	
	@Lob
	private byte[] picture;


	//Liste de mapping book-author
	@ManyToMany(mappedBy = "books")
	private List<Author> authorListInBook = new ArrayList<>();
	
	//Liste de mapping category-book
	@ManyToMany(mappedBy = "booksCategory")
	private List<Category> categoryListInBook = new ArrayList<>();
	
	//Liste de mapping book-user
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User userBook;

	public Book() {
		super();
	}

	public Book(long iSBN, String title, LocalDate publishedDate, double weight, int pageNumber, String publishingHouse,
			String description, Language language, double price, int pointBook, BookEtat etat, Availability isavailable,
			byte[] picture, List<Author> authorListInBook, List<Category> categoryListInBook, User userBook) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.publishedDate = publishedDate;
		this.weight = weight;
		this.pageNumber = pageNumber;
		this.publishingHouse = publishingHouse;
		this.description = description;
		this.language = language;
		this.price = price;
		this.pointBook = pointBook;
		this.etat = etat;
		this.isavailable = isavailable;
		this.picture = picture;
		this.authorListInBook = authorListInBook;
		this.categoryListInBook = categoryListInBook;
		this.userBook = userBook;
	}

	public long getId() {
		return id;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPointBook() {
		return pointBook;
	}

	public void setPointBook(int pointBook) {
		this.pointBook = pointBook;
	}

	public BookEtat getEtat() {
		return etat;
	}

	public void setEtat(BookEtat etat) {
		this.etat = etat;
	}

	public Availability getIsavailable() {
		return isavailable;
	}

	public void setIsavailable(Availability isavailable) {
		this.isavailable = isavailable;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public List<Author> getAuthorListInBook() {
		return authorListInBook;
	}

	public void setAuthorListInBook(List<Author> authorListInBook) {
		this.authorListInBook = authorListInBook;
	}

	public List<Category> getCategoryListInBook() {
		return categoryListInBook;
	}

	public void setCategoryListInBook(List<Category> categoryListInBook) {
		this.categoryListInBook = categoryListInBook;
	}

	public User getUserBook() {
		return userBook;
	}

	public void setUserBook(User userBook) {
		this.userBook = userBook;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", publishedDate=" + publishedDate
				+ ", weight=" + weight + ", pageNumber=" + pageNumber + ", publishingHouse=" + publishingHouse
				+ ", description=" + description + ", language=" + language + ", price=" + price + ", pointBook="
				+ pointBook + ", etat=" + etat + ", isavailable=" + isavailable + ", picture="
				+ Arrays.toString(picture) + ", authorListInBook=" + authorListInBook + ", categoryListInBook="
				+ categoryListInBook + ", userBook=" + userBook + "]";
	}
	
	
}
