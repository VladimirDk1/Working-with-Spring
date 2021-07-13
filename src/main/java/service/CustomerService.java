package service;

import model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    Customer getById(UUID id); // Получение клиента по id

    //List<Customer> getAll(); // Получение всех клиентов
}
