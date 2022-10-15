public class Person {

    protected String name;
    protected String lastName;
    protected int ticket;


    //Объявить конструктор для имени, фамилии и отчества
    public Person(String name, String lastName, int ticket) {
        this.name = name;
        this.lastName = lastName;
        this.ticket = ticket;
    }

    //Получаем значение для поля "Имя"
    public String getName() {
        return name;
    }

    //Получаем значение для поля "Фамилия"
    public String getLastName() {
        return lastName;
    }

    //Получаем значение для поля с количеством билетов
    public int getTicket() {
        return ticket;
    }

    //Присваиваем новое значение для поля с количеством билетов
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    //Метод удаления билета при его использовании
    public void ticketsUsed() {
        if (ticket > 0) {
            ticket--;
        }
    }
}
