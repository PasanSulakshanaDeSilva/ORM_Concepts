package lk.ijse.pasi.hibernate;

import lk.ijse.pasi.hibernate.entity.Customer;
import lk.ijse.pasi.hibernate.repository.CustomerRepository;
import lk.ijse.pasi.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Customer obj1 = new Customer();
        obj1.setName("Pasan");
        obj1.setAge(20);

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.saveCustomer(obj1);

        obj1.setName("Deshan");
        customerRepository.updateCustomer(obj1);

        customerRepository.deleteCustomer(obj1);

        customerRepository.getCustomer(obj1);

    }
}
