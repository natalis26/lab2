import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Сканнер
        String str = ""; // Переменная для входной строки
        String stroka[]; // Массив координат в формате String
        double cord[] = {0, 0, 0}; // Массив координат в формате double
        String delimeter = " "; // Переменная "разделитель"

        System.out.println("Введите координаты первой точки через пробел");
        str = in.nextLine(); // Считываем входную строку
        stroka = str.split(delimeter); // Разделяем входную строку на массив слов
        for (int i = 0; i < 3; i++)
            cord[i] = Double.parseDouble(stroka[i]);
        Point3d a = new Point3d(cord[0], cord[1], cord[2]);

        System.out.println("Введите координаты второй точки через пробел");
        str = in.nextLine(); // Считываем входную строку
        stroka = str.split(delimeter); // Разделяем входную строку на массив слов
        for (int i = 0; i < 3; i++)
            cord[i] = Double.parseDouble(stroka[i]);
        Point3d b = new Point3d(cord[0], cord[1], cord[2]);

        System.out.println("Введите координаты третьей точки через пробел");
        str = in.nextLine(); // Считываем входную строку
        stroka = str.split(delimeter); // Разделяем входную строку на массив слов
        for (int i = 0; i < 3; i++)
            cord[i] = Double.parseDouble(stroka[i]);
        Point3d c = new Point3d(cord[0], cord[1], cord[2]);

        if (!a.equals(b) && !b.equals(c) && !c.equals(a)) {
            double S = (computeArea(a, b, c));
            if (S != -1)
                System.out.println("Площадь треугольника " + S);
            else
                System.out.println("Треугольника с такими вершинами не существует");
        }
        else
            System.out.println("Точки совпадают");
    }
    private static double computeArea(Point3d a, Point3d b, Point3d c)
    {
            // длины сторон
            double sideA = a.distanceTo(b);
            double sideB = b.distanceTo(c);
            double sideC = c.distanceTo(a);

            // полупериметр
            double p = (sideA + sideB + sideC) / 2;

            // площадь
            double S2 = (p * (p - sideA) * (p - sideB) * (p - sideC));
             if (S2 > 0) {
                 double S = Math.sqrt(S2);
                 return S;
             }
              else return -1;
    }
}