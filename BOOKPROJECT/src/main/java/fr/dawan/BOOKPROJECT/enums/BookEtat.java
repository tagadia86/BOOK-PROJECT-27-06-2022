package fr.dawan.BOOKPROJECT.enums;

public enum BookEtat {
	NEUF("Neuf"),
    MOYEN("Moyen"),
    USE("Usé");

       private String bookEtat;

    BookEtat(String  bookEtat) {
        this.bookEtat =  bookEtat;
    }
 
    public String getUrl() {
        return  bookEtat;
    }

}
