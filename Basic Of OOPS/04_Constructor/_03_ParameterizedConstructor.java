class Book {
    float price;
    String Name;
    String Author;

    // Parametrized Constructor
    Book(String nm, String au, float p) {
        System.out.println("This is a Parametrized Constructor");
        this.price = p;
        this.Name = nm;
        this.Author = au;
    }

    Book getValue() {
        return this;
    }
}

public class _03_ParameterizedConstructor {
    public static void main(String args[]) {
        Book obj = new Book("The Power Of Your Subconscious Mind", "Dr. Joseph Murphy", 140);
        System.out.println("Name : " + (obj.getValue()).Name);
        System.out.println("Author : " + (obj.getValue()).Author);
        System.out.println("Price : " + (obj.getValue()).price);
    }
}