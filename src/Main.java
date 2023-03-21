public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task7();
    }
    public static void task1() {
        int age = 15;
        System.out.println("Задача 1");
        boolean adult = age >=18;
        if (adult) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int outdoorTemperature = 15;
        if (outdoorTemperature<5) {
            System.out.println("На улице " + outdoorTemperature +" градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        float speed = 59.7f ;
        if (speed <= 60.0) {
            System.out.println("Если скорость " + speed +", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed +", то придется заплатить штраф");
        }
    }



    public static void task4 () {
        System.out.println("Пример 4");
        int age = 47;
        if (age>2 && age<6) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в детский сад");
        } else if (age<18) {
            System.out.println("Если возраст человека равен " + age +", то ему нужно ходить в школу");
        } else if (age >=18 && age<=24) {
            System.out.println("Если возраст человека равен " + age +", то его место в университете.");
        } else if (age>24) {
            System.out.println("Если возраст человека равен " + age +", то ему пора ходить на работу.");
        }
    }
    public static void task5 () {
        System.out.println("Пример 5");
        int ageChild = 12;
        if (ageChild<5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild>=5 && ageChild<14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого.");
        } else if (ageChild>14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Пример 6");
        System.out.println("При условии, что сначала будут заниматься только сидячие места");
        int numberPassengers = 70;
        int numberSeats = 60;
        int totalCapacityOfTheCar = 102;
        if (numberPassengers<numberSeats) {
            System.out.println("В вагоне есть свободные сидячее и стоячее места");
        } else if (numberPassengers>=numberSeats && numberPassengers<totalCapacityOfTheCar) {
            System.out.println("В вагоне есть тоолько стоячее свободное место");
        } else if (numberPassengers>=totalCapacityOfTheCar) {
            System.out.println("В вагоне не осталось свободных мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        System.out.println("При условии, что среди трёх чисел нет ни одной пары равных друг другу");
        int one = 5;
        int two = 14;
        int three = 23;
        if (one>two && one>three) {
            System.out.println("Самое большое число" + one);
        } else if (one<two && one>three) {
            System.out.println("Самое большое число " + two);
        } else if (one>two && one<three) {
            System.out.println("Самое большое число " + three);
        }
    }

}