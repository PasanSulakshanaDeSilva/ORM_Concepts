package lk.ijse.pasi.hibernate;

import lk.ijse.pasi.hibernate.embeded.CustName;
import lk.ijse.pasi.hibernate.entity.Customer;
import lk.ijse.pasi.hibernate.repository.CustomerRepository;
import lk.ijse.pasi.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Customer obj1 = new Customer();
        obj1.setName(new CustName("Pasan","Sulakshana","De Silva"));
        obj1.setAge(20);
        obj1.setCardNo("000001");

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.saveCustomer(obj1);

        //obj1.setName("Deshan");
        customerRepository.updateCustomer(obj1);

        //customerRepository.deleteCustomer(obj1);

        customerRepository.getCustomer(obj1);

    }
}
