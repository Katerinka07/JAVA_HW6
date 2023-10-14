public class Program {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        String name6;
        String name7;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        int number7;
        int number8;
        int number9;
        int number10;

        name1 = "Иванов";
        name2 = "Скворцов";
        name3 = "Илюшкина";
        name4 = "Сидоров";
        name5 = "Максимова";
        number1 = 2453456;
        number2 = 2698745;
        number3 = 4385210;
        number4 = 4785213;
        number5 = 2135689;
        number6 = 4354752;
        number7 = 2517863;
        number8 = 2567402;
        number9 = 4520385;
        number10 = 4128012;

        PhoneBook myBook = new PhoneBook();

        myBook.add(name1, number1);
        myBook.add(name1, number2);
        myBook.add(name1, number3);
        myBook.add(name2, number4);
        myBook.add(name3, number5);
        myBook.add(name2, number7);
        myBook.add(name4, number8);
        myBook.add(name5, number9);
        myBook.add(name5, number10);

        System.out.println(myBook.find(name1));
        System.out.println("-".repeat(16));
        System.out.println(myBook.find("Мария"));
        System.out.println("-".repeat(16));
        myBook.getPhoneBook();





    }
}
