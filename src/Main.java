
public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // В исходном коде причина ошибки - деление на ноль.


        calc.println.accept(c);



/*
        Обратите внимание на то, что приведенный выше код работать не будет.
        С помощью комментария в коде объясните причину возникновения ошибки,
        в чем заключается ошибка и способы ее решения. Напишите реализацию,
        в которой предусмотрите обработку возникающей ошибки.
*/

    }
}