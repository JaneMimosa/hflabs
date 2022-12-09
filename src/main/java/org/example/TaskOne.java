package org.example;

import java.util.regex.Pattern;

public class TaskOne {

    public String filter(String string) {
        //Пишем регекс с учетом того что первые 6 цифр это индекс, в городе и улице нет цифр и
        // дом корпус и квартира написаны через специальные знаки
        Pattern pattern = Pattern.compile("\\d{6}\\s+([А-ЯЁ]+\\s?)+ \\d+[\\/]\\d[\\-]\\d", Pattern.UNICODE_CHARACTER_CLASS);
        if (pattern.matcher(string).find()) {
            return string;
        } else {
            //если адрес не подходит под регекс, убираем одну цифру после города
            return string.replaceAll("\\s\\d{1}\\s", " ");
        }
    }
}
