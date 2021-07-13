package model;

/**
 * Базовый класс для клиентов
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "custoners")
@Getter
@Setter
public class Customer extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "accountNumber")
    private long accountNumber;

    public Customer(String f, String l, String p, long a){
        firstName = f;
        lastName = l;
        patronymic = p;
        accountNumber = a;
    }

    public Customer(){
        firstName = lastName = patronymic = "Неизвестно";
        accountNumber = -1;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + patronymic + " " + accountNumber;
    }
}
