package jdbc.context.beans;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class JdbcContext {

    @Bean
    @Scope("singleton")
    public DataSource dataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("1qaz2wsx");
        dataSource.setURL("jdbc:mysql://localhost:3306/business");
        return dataSource;
    }
}
