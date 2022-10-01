public class Main {
    public static void main(String[] args) {
        // Задание 6
        System.out.println("Задача 6");
        var Boxer1Weight = 78.2;
        System.out.println(Boxer1Weight);
        var Boxer2Weight = 82.7;
        System.out.println(Boxer2Weight);
        var SummarWeight = Boxer1Weight + Boxer2Weight;
        System.out.println("Общий вес двух бойцов: " + SummarWeight);
        var DifferenceWeight = Boxer2Weight - Boxer1Weight;
        System.out.println("Разница: " + DifferenceWeight);
        // Задание 7
        System.out.println("Задача 7");
        System.out.println( "Разница в весе: 1 способ " + (Boxer2Weight - Boxer1Weight));
        System.out.println("Разница в весе: 2 способ " + (Boxer2Weight % Boxer1Weight));
        //Задание 8
System.out.println("Задача 8");
var WorkingHours = 640;
var PeopleWorkingHours = 8;
var AllEmployees = WorkingHours / PeopleWorkingHours;
System.out.println( "Всего работников в компании " + (WorkingHours / PeopleWorkingHours) + " человек");
AllEmployees = AllEmployees + 94;
System.out.println("Если в компании работает " + AllEmployees + " человека, то всего " + (AllEmployees * 8) + " часа работы может быть поделено между сотрудниками");
    }
}