import java.time.LocalDate;

public class Book {
	// 필수 멤버 필드
	private String title;
	private String author;
	
	// 선택 멤버 필드
	private String color;
	private int pages;
	private LocalDate publicationDate;
	private String weight;
	
	/*
	// 점층적 생성자 패턴
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String color) {
        this.title = title;
        this.author = author;
        this.color = color;
    }

    public Book(String title, String author, String color, int pages) {
        this.title = title;
        this.author = author;
        this.color = color;
        this.pages = pages;
    }

    public Book(String title, String author, String color, int pages, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.color = color;
        this.pages = pages;
        this.publicationDate = publicationDate;
    }

    public Book(String title, String author, String color, int pages, LocalDate publicationDate, String weight) {
        this.title = title;
        this.author = author;
        this.color = color;
        this.pages = pages;
        this.publicationDate = publicationDate;
        this.weight = weight;
    }
    */
	
	// 자바빈즈 패턴
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    
    public static void main(String[] args) {
    	Book book = new Book();
    	book.setTitle("My Book");
    	book.setAuthor("me");
    	book.setColor("black");
    	book.setPages(100);
    	book.setPublicationDate(LocalDate.now());
    	book.setWeight("3kg");
	}
}
