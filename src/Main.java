public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1");

        String firstName = "Иван";
        String midleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + midleName;
        System.out.println(fullName);

        //task
        System.out.println("Задача 2");

        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        //task 3
        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}