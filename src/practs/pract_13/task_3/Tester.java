package practs.pract_13.task_3;

public class Tester {
    public static void main(String[] args) {
        String address1 = "Россия, Владимирская область, Владимир, Ленина, д1, кв1";
        String address2 = "Россия; Самарская область; Самара; Пушкина; д2; кв2";
        String address3 = "Россия. Московская область, Москва. Ленина. д3. кв3";
        String address4 = "Россия, Ульяновская область; Ульяновск, Маркса, д4. кв4";
        Address address = new Address();
        address.splitData(address1);
        System.out.println(address);
        address.splitData(address2);
        System.out.println(address);
        address.splitData(address3);
        System.out.println(address);
        address.splitData(address4);
        System.out.println(address);
    }
}
