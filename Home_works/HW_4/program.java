package Home_works.HW_4;

//Task 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// import java.util.LinkedList;

// public class program {

//     public static void main(String[] args) {

//         int[] listMas = {5, 3, 2, 6, 7, 4, 9, 1, 4};
//         LinkedList<Integer> linkList = new LinkedList<>();

//         for (Integer temp : listMas) {
//             linkList.add(temp);
//         }
        
//         int temp = 0;
//         while (temp != linkList.size() - 1) {
//             linkList.add(linkList.size()-temp, linkList.getFirst());
//             linkList.removeFirst();
//             temp++;
//         }

//         System.out.println("Reverse linkList = " + linkList);

//     }
// }

//Task 2.Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

// import java.util.LinkedList;

// public class program {

//     public static void main(String[] args) {


//         int[] list = { 1, 2, 3, 4, 5, 6 };

//         LinkedList<Integer> linkList = new LinkedList<>();
//         for (Integer temp : list) {
//             linkList.add(temp);
//         }

//         System.out.println(linkList);

//         System.out.println("\nДобавим в конец 7");
//         enqueue(linkList, 7);
//         System.out.println(linkList);

//         System.out.println("\nВозьмем первый элемент с его удалением");
//         System.out.println(dequeue(linkList));
//         System.out.println(linkList);

//         System.out.println("\nВозьмем первый элемент без его удаления");
//         System.out.println(first(linkList));
//         System.out.println(linkList);
//     }

//     public static void enqueue(LinkedList<Integer> list, int num) {
//         list.addLast(num);
//     }

//     public static int dequeue(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         list.remove(0);
//         return num;
//     }

//     public static int first(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         return num;
//     }
// }