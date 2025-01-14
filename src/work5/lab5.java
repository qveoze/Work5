package work5;

public class lab5 {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        //ввод адресов
        Address address1 = new Address("Санкт-Петербург", "Пушкинская", 20);
        Address address2 = new Address("Москва", "возможно Пушкинская", 6);
        Address address3 = new Address("Кострома", "не Пушкинская", 9);

        //ввод людей
        people[0] = new Person("Настя", 18, address1);
        people[1] = new Person("Соня", 21, address1);
        people[2] = new Person("Аня", 18, address2);
        people[3] = new Person("Саша", 19, address2);
        people[4] = new Person("Ваня", 23, address3);

        printPeople(people, 21, null, null);
        printPeople(people, "Санкт-Петербург", null);
        printPeople(people, "Санкт-Петербург", "Пушкинская");
    }

    public static void printPeople(Person[] people, String city, String street) {
        Person[] filteredPeople = new Person[people.length];
                for (int i = 0; i < people.length; i++){
                    Person person = people[i];
                    Address personAddress = person.getAddress();
                    if ((personAddress.getCity() == city || city == null) && (personAddress.getStreet() == street || street == null)){
                        filteredPeople[i] = person;
                    }
                }
                for (Person person : filteredPeople){
                    if (person != null){
                        person.printInfo();
                    }
                }
            }

            public static void printPeople(Person[] people, int age, String city, String street){
                Person[] filteredPeople = new Person[people.length];

                for (int i = 0; i < people.length; i++){
                    Person person = people[i];
                    Address personAddress = person.getAddress();
                    if (person.getAge() == age && (personAddress.getCity() == city || city == null) && (personAddress.getStreet() == street || street == null)){
                        filteredPeople[i] = person;
                    }
                }
                for (Person person : filteredPeople){
                    if (person != null){
                        person.printInfo();
                    }
                }
            }
        }
