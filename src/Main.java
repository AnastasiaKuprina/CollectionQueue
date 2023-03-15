import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> list = generateClients();

        Deque<Person> deque = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            deque.offer(list.get(i));
        }

        while (!deque.isEmpty()) {
            Person person = deque.poll();
            System.out.println(person.getName() + " прокатился на аттракционе!");
            person.setQuantity(person.getQuantity()-1);

            if (!(person.getQuantity() == 0)) {
                deque.offerLast(person);
            }
        }
    }

    // Возвращает список из порядка 5 людей
    public static List<Person> generateClients() {

        LinkedList list = new LinkedList();
        list.add(new Person("Иван Петров", 1));
        list.add(new Person("Сергей Алексеев", 2));
        list.add(new Person("Алексей Сидоров", 1));
        list.add(new Person("Максим Попов", 2));
        list.add(new Person("Никита Кузнецова", 1));

        return list;
    }

}




