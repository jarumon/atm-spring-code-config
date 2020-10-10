package th.ac.ku.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSourceDB();
        }
    @Bean
    public Bank bank() {
        return new Bank("Airline Bank", dataSource());

    }

    @Bean
    public ATM atm() {
        return new ATM(bank());
    }
    }

