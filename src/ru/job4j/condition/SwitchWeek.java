package ru.job4j.condition;

public class SwitchWeek {
    public String nameOfDay(int day) {
       String day2;
        switch (day) {
            case 1 :
                day2 = "Понедельник";
                break;
            case 2:
                day2 = "Вторник";
                break;
            case 3:
                day2 = "Среда";
                break;
            case 4:
                day2 = "Четверг";
                break;
            case 5:
                day2 = "Пятница";
                break;
            case 6:
                day2 = "Суббота";
                break;
            case 7:
                day2 = "Воскресенье";
                break;
            default:
                day2 = "Ошибка";
                break;
        }
    return day2;
    }
}
