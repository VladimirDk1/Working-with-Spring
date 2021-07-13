package repository;

/**
 * Это интерфейс нужен для работы с БД,
 * но он нам в данной работе как бы не нужен, ибо работа происходит с файлами.
 */

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
