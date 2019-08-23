package com.bdg.collections;

import java.util.ArrayList;

public class Best20BooksReadRateVersion {
    public static void main(String[] args) {
        ArrayList<String> bookNames = new ArrayList<>();
        bookNames.add("451 по Фаренгейту - Рей Бредбери");
        bookNames.add("1984 - Джордж Оруэлл");
        bookNames.add("Шантарам - Грегори Девид Робертс");
        bookNames.add("Мастер и Маргарита - Михаил Афанасьевич Булгаков");
        bookNames.add("Три товарища - Эрих Мария Ремарк");
        bookNames.add("Портрет Дориана Грея - Оскар Уайльд");
        bookNames.add("Атлант расправил плечи - Айн Ренд");
        bookNames.add("Вино из одуванчиков - Рей Бредбери");
        bookNames.add("Над пропастью во ржи - Джером Д. Сэлинджер");
        bookNames.add("Цветы для Элджернона - Даниел Киз");
        bookNames.add("Мальенкий принц - Антуан де Сент-Экзюпери");
        bookNames.add("Анна Каренина - Лев Толстой");
        bookNames.add("Убить пересмешника - Харпер Ли");
        bookNames.add("Сто лет одиночества- Габриель Гарсиа Маркес");
        bookNames.add("Преступление и наказание - Федор Михайлович Достоевский");
        bookNames.add("Тень горы - Грегори Дэвид Робертс");
        bookNames.add("Граф Монте-Кристо - Александр Дюма");
        bookNames.add("Марсианин - Энди Вейер");
        bookNames.add("Триумфальная арка - Эрих Мария Ремарк");
        bookNames.add("Двенадцать стульев - Евгений Петров и др.");
        bookNames.add("Бойцовский клуб - Чак Паланик");
        bookNames.add("Евгений Онегин- Александр Сергеевич Пушкин");
        bookNames.add("Идиот - Федор Михайлович Достоевский");
        bookNames.add("Мне тебя обещали- Эльчин Сафарли");
        bookNames.add("Жизнь взаймы - Эрих Мария Ремарк");
        bookNames.add("Книжный вор - Маркус Зусак");
        bookNames.add("Великий Гетсби - Фрэнсис Скотт Фицджеральд");
        bookNames.add("Альхимик - Пауло Коельо");
        bookNames.add("Одиночество в сети - Януш Леон Вишневский");
        bookNames.add("Герой нашего времени - Михаил Юревич Лермонтов");
        System.out.println(bookNames.toArray().length);
        System.out.println("Best 30 books from ReadRAte");
        int count = 1;
        for (int i = 0; i <bookNames.toArray().length ; i++) {
            System.out.println("N"+count+" "+bookNames.get(i));
            count++;
        }


    }
}
