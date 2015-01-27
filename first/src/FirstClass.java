import java.util.Scanner;
public class FirstClass
{

    public static void main (String args[]) // точка входа в программу
    {
        FirstClass object = new FirstClass();

        object.calculateIt();



    }

    public void exit(){ //метод выхода
        System.out.println("Thanks for using our software! :)");
        System.exit(0);
    }

    public void calculateIt(){ // метод расчёта

        Scanner sc = new Scanner(System.in);
        double first = 1, second = 1, result, response = 1;
        int action = 1;

        System.out.println("Enter first number: "); //ввод числа
        if(sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать целое число
            first = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
        } else {
            System.out.println("You have entered incorrect data please try again (You should use numbers for calculating)!"); // вызов метода заново для перерасчёт в связи с некоректно введёнными данными
            this.calculateIt();
        }

        System.out.println("Enter second number: ");
        if(sc.hasNextDouble()) {
            second = sc.nextDouble();
        } else {
            System.out.println("You have entered incorrect data please try again (You should use numbers for calculating)!");
            this.calculateIt();
        }
        System.out.println("Select operation (use 1 for Divide, 2 for Multiple, 3 for Add, 4 for Subtraction ): ");
        if(sc.hasNextInt()) {
            action = sc.nextInt();
        } else {
            System.out.println("You have entered incorrect data please try again (You should use numbers for selecting operation)!");
            this.calculateIt();
        }

        switch (action){ // расчёты относительно того что было введено
            case 1:
                result = first / second;
                System.out.println(result);
                break;

            case 2:
                result = first * second;
                System.out.println(result);
                break;

            case 3:
                result = first + second;
                System.out.println(result);
                break;

            case 4:
                result = first - second;
                System.out.println(result);
                break;
        }

        System.out.println("Do you want to calculate something else(If Yes press 1 please or any key+ENTER for exit)?: "); // Предложение продолжить или закрыть
        if(sc.hasNextInt()) {
            response = sc.nextInt();
        } else {
            this.exit();
        }
        if (response == 1){
        this.calculateIt(); }
    }
}