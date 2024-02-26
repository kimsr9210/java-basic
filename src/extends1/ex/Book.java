package extends1.ex;

public class Book extends Item{
    private String author; //저자
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override //부모의 기능을 override
    public void print(){
        super.print();
        System.out.println("- 저자 : " + this.author+ ", isbn : " + isbn);
    }
}
