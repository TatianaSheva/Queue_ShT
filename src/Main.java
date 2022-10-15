import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Создаем объект person
        Person person;

        // Создаем список клиентов и раздаем билеты
        List<Person> clients = generateClients();

        //Создаем очередь
        Queue<Person> queueForTheRide = new LinkedList<>(clients);

        while (!queueForTheRide.isEmpty()) {
            person = queueForTheRide.poll();
            person.ticketsUsed();
            System.out.println(person.name + " " + person.lastName + " прокатился на аттракционе! (^_^). Осталось покатушек: " + person.getTicket());
            if (person.getTicket() > 0) {
                queueForTheRide.offer(person);
            }
        }
    }

    //Метод создания списка катающихся
    static List<Person> generateClients() {
        Person[] clients = new Person[]{
                new Person("Фродо", "Бэггинс", 4),
                new Person("Сэмуайз", "Гэмджи", 3),
                new Person("Перегрин", "Тук", 2),
                new Person("Мериадок", "Брендибак", 5),
                new Person("Гендальф", "Белый", 6)
        };
        return Arrays.asList(clients);
    }
}