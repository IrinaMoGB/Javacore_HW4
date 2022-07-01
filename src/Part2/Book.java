package Part2;

public class Book {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("89631232345", "Иванов");
        phoneBook.add("89630987654", "Соловьев");
        phoneBook.add("89124544545", "Иванов");
        phoneBook.add("89501554343", "Фролов");
        phoneBook.add("89199199125", "Кузнецов");
        phoneBook.add("89631232346", "Екатерина");

        System.out.println(phoneBook.getPhoneNumber("Кузнецов"));




    }
}
