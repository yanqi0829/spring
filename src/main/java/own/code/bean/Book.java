package own.code.bean;

public class Book {
    private String name;

    public Book() {
        System.out.println("Book  constructor。。。。。");
    }

    public String getName() {return name;}

    public void setName(String name) {
        System.out.println("Book setter。。。。。");
        this.name = name;
    }

    public void init() {
        System.out.println("Book init");
    }

    public void destory() {
        System.out.println("Book destory");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
