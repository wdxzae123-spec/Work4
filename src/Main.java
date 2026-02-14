void main() {
    {
        System.out.println("Задание 1");
        int age = 16;
        System.out.println("Вам " + age + " лет");
        if (age >= 18) {
            System.out.println("Поздравляю, вас ждут приключения во взрослой жизни");
        } else {
            System.out.println("Вы не совершеннолетний,нужно немного подождать");
        }
    }
    {
        System.out.println("Задание 2");
        int temperature = 3;
        System.out.println("На улице " + temperature + " градусов");
        if (temperature < 5) {
            System.out.println("На улице холодно,нужно надеть шапку");
        } else if (temperature > 5) {
            System.out.println("Сегодня тепло,можно идти без шапки");
        }
    }
    {
        System.out.println("Задание 3");
        int speed = 43;
        System.out.println("Ваша скорость " + speed + " км/ч");
        if (speed > 60) {
            System.out.println("Скорость превышена, нужно заплатить штраф");
        } else {
            System.out.println("Превышение скорости нет");
        }
    }
    {
        System.out.println("Задание 4");
        int age4 = 9;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить в университет");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + " ,то ему нужно ходить на работу");
        }
    }
    {
        System.out.println("Задание 5");
        int age5 = 15;
        if (age5 < 5) {
            System.out.println("Если возраст ребёнка равен " + age5 + " ,то ему нельзя кататься на аттракционе ");
        } else if (age5 >= 5 && age5 <= 14) {
            System.out.println("Если возраст ребёнка равен " + age5 + " ,то можно кататься в сопровождении взрослого");
        } else if (age5 > 14) {
            System.out.println("Если возраст ребёнка равен " + age5 + " ,то можно кататься без сопровождения взрослого");
        }
    }
    {
        System.out.println("Задание 6");
        int train = 102;
        int trainSeat = 60;
        int trainStand = 42;
        int placeTrain = 92;
        int placeTrainSeat = 7;
        int placeTrainStand = 102 - (placeTrain + placeTrainSeat);
        int place = train - placeTrain;
        int place1 = trainSeat - placeTrainSeat;
        int place3 = trainStand - placeTrainStand;
        if (placeTrain < train) {
            System.out.println("Места ещё есть " + place + " шт");
            if (placeTrainSeat < trainSeat) {
                System.out.println("Сидячие места есть " + place1 + " шт");
            } else {
                System.out.println("Сидячих мест нет");
            }
            if (placeTrainStand < trainStand) {
                System.out.println("Стоячие места есть " + place3 + " шт");
            } else {
                System.out.println("Стоячих мест нет");
            }
        } else {
            System.out.println("Мест в вагоне нет");
        }
    }
    {
        System.out.println("Задание 7");
        int one = 3;
        int two = 1;
        int three = 13;
        if (one == two && two == three && one == three) {
            System.out.println("Набиольшего значения нет, все числа равны между собой " + "(" + one + ")");

        } else if (one >= two && one >= three) {
            System.out.println(one + " Наибольшее чилсо");
        } else if (two >= one && two >= three) {
            System.out.println(two + " Наибольшее чилсо");
        } else {
            System.out.println(three + " Наибольшее чилсо");
        }
    }
}

