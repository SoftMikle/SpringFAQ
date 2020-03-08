package knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        // Получение компонента knight
        BraveKnight knight = (BraveKnight) context.getBean("knight");
        // Использование компонента knight
        knight.embarkOnQuest();

    }
}
