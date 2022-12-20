import java.util.*;

public class collectionsTask {
    static Collection fill (Collection<String> c){
        c.add("1. Берлин");
        c.add("2. Москва");
        c.add("3. Лондон");
        c.add("4. Варшава");

        return c;
    }
    static Map fill(Map m) {
        m.put("Берлин", 1);
        m.put("Москва", 2);
        m.put("Лондон", 3);
        m.put("Варшава", 4);

        return m;
    }
    public static void main(String[] args) {
        Collection linked_list = fill(new LinkedList());

        Collection tree_set = new TreeSet();
        Map terms_defenitions = new HashMap();


        System.out.println("Задание 1");
        System.out.println("Какой из данных городов самый большой по населению?");
        Scanner sc = new Scanner(System.in);
        System.out.println();

        linked_list.forEach(a -> System.out.println(a));
        String user_answer = sc.nextLine();

        if(user_answer.equals("2")){
            System.out.println("Правильный ответ!");
        }else{
            System.out.println("Неправильный ответ!");
        }
        System.out.println();
        System.out.println("Задание 2");

        System.out.println("Введите случайный набор из 4 чисел");
        sc = new Scanner(System.in);
        user_answer = sc.nextLine();

        for(int i = 0; i < user_answer.split(" ").length; i++){
            tree_set.add(user_answer.split(" ")[0]);
            tree_set.add(user_answer.split(" ")[1]);
            tree_set.add(user_answer.split(" ")[2]);
            tree_set.add(user_answer.split(" ")[3]);
        }
        System.out.println();
        System.out.println("Отсортированные числа:");
        System.out.println(tree_set);

        System.out.println("Задание 3");
        System.out.println();

        Collection<Object> values_arr = new ArrayList();
        Collection<Object> keys_arr = new ArrayList();

        terms_defenitions.put("Солнце", "Звезда");
        terms_defenitions.put("Автомобиль", "Средство передвижения");
        terms_defenitions.put("Интернет", "Средмтво передачи информации");

        System.out.println("Сопоставьте данные термины:");
        terms_defenitions.keySet().forEach(term -> System.out.println(term));

        System.out.println("С данными определениями:");
        terms_defenitions.values().forEach(defenition -> System.out.println(defenition));

        System.out.println("Введите ваши ответы");

        for(int i = 0; i < terms_defenitions.size(); i++){

            System.out.println("Укажите "+(i+1)+ " пару");
            String[] user_answers = sc.nextLine().split(" - ");

            if(terms_defenitions.get(user_answers[0]).equals(user_answers[1])){
                System.out.println("Правильно");
            }else{
                System.out.println("Неправильно");
            }
        }




    }

}
