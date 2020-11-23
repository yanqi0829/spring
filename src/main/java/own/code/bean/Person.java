package own.code.bean;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String lastName;
    private Integer age;
    private String gender;
    private String email;
    private Car car;
    private List<Book> books;
    private Map<String,Object> maps;
    private Properties properties;

    public Person() {
        System.out.println("Person无参构造器、、、");
    }

    public Person(String lastName, Integer age, String gender, String email) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        System.out.println("Person有参构造器、、、");
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {
        System.out.println("lastName setter" + lastName+"、、、");
        this.lastName = lastName;
    }

    public Integer getAge() {return age;}

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public Car getCar() {return car;}

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {return books;}

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMaps() {return maps;}

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {return properties;}

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", car=" + car +
                ", books=" + books +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
