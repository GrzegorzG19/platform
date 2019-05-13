public class Course {

    String course;
    int length;

    Category category;
    double price;

    Course(String kurs, int dlugosc, Category kategory, double cena){
        course = kurs;
        length = dlugosc;
        category = kategory;

        price = cena;
    }

    void show(){

        System.out.printf(course + ", category: " + category.name + ", description: "+ category.description + ", length: " + length + "min " + "price: " + price + "\n");
    }

}
