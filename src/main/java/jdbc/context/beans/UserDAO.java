package jdbc.context.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class UserDAO {

    private DataSource dataSource;

    private UserDAO(@Autowired DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**Подход Spring из официальной документации кажется разумным: используйте внедрением
     * зависимости через конструктор для обязательных зависимостей и внедрение с помощью
     * метода установки / через поле для необязательных зависимостей. Еще раз предупреждаю:
     * будьте действительно последовательны с этим.*/

//    OR:
//    @Autowired
//    private DataSource dataSource;

//    OR:
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
}
