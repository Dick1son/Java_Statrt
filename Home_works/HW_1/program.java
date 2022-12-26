package Home_works.HW_1;

//Task 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// import java.util.Scanner;
// public class program{
//     public static int getFactorial(int f) {
//         if (f <= 1) {
//            return 1;
//         }
//         else {
//            return f * getFactorial(f - 1);
//         }
//       }

//     public static int getTriangle(int t) {
//         if (t < 1) {
//             return 0;
//         }
//         else {
//             return ((t/2)*(t + 1)) ;
//         }
//     }

//     public static int getEntry() {
//         int num = 0;
//         while(true){
//             try {
//                 System.out.print("Введите натуральное число n: ");
//                 Scanner n = new Scanner(System.in);
//                 num = n.nextInt();
//                 if (num < 0) {
//                     System.out.println("Введены не валидные данные\n");
//                     continue;
//                 }
//                 break;
//             } catch (Exception e) {
//                 System.out.println("Введены не валидные данные\n");
//             } 
//         }
//         return num;
//     }

//     public static void main(String[] args) {
//         int choice = 0;
//         int num = 0;
//         System.out.println("Выберите действие цифрой(1,2):\n1.Вычислить n-ое треугольного число\n2.Вычислить факториал числа n(Не более 16)");
//         while(true){
//            try {
//                 System.out.print("Ввод: ");
//                 Scanner n = new Scanner(System.in);
//                 choice = n.nextInt();
//                 if (choice > 2 || choice < 1) {
//                     System.out.println("Введены не валидные данные\n");
//                     continue;
//                 }
//                 break;
//             } catch (Exception e) {
//                 System.out.println("Введены не валидные данные\n");
//             } 
//         }

//         switch (choice){
//             case 1:
//                 num = getEntry();
//                 System.out.println(getTriangle(num));
//                 break;
//             case 2:
//                 num = getEntry();
//                 if (num > 16) {
//                     System.out.println("Введены не валидные данные\n");
//                     num = getEntry();
//                 }
//                 System.out.println(getFactorial(num));
//                 break; 
//         } 
//     }
// }

//Task 2. Вывести все простые числа от 1 до 1000
// public class program{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 1000; i++)
//             System.out.println(i);
//     }
// }

//Task 3. Реализовать простой калькулятор
// import java.util.Scanner;
// public class program{
//         public static int getEntry() {
//             int num = 0;
//             while(true){
//                 try {
//                     System.out.print("Введите числo: ");
//                     Scanner n = new Scanner(System.in);
//                     num = n.nextInt();
//                     // if (num < 0) {
//                     //     System.out.println("Введены не валидные данные\n");
//                     //     continue;
//                     // }
//                     break;
//                 } catch (Exception e) {
//                     System.out.println("Введены не валидные данные\n");
//                 } 
//             }
//             return num;
//         }
//     public static void main(String[] args) {
//         System.out.print("Введите операцию(+, -, *, /, %, ^): ");
//         Scanner n = new Scanner(System.in);
//         String operation = n.nextLine();
//         int num_1 = getEntry();
//         int num_2 = getEntry();
//         switch (operation) {
//             case "+":
//                 System.out.println(num_1 + num_2);
//                 break;

//             case "-":
//             System.out.println(num_1 - num_2);
//             break;

//             case "*":
//             System.out.println(num_1 * num_2);
//             break;

//             case "/":
//             System.out.println(num_1 / num_2);
//             break;

//             case "%":
//             System.out.println(num_1 % num_2);
//             break;

//             case "^":
//             System.out.println(Math.pow(num_1, num_2));
//             break;

//             default:
//                 break;
//         }
        
//     }
// }