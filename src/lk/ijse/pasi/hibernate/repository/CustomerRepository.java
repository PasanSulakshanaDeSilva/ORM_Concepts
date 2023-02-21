package lk.ijse.pasi.hibernate.repository;

import lk.ijse.pasi.hibernate.entity.Customer;
import lk.ijse.pasi.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepository {
    Session session = FactoryConfiguration.getInstance().getSession();

    public Customer saveCustomer(Customer customer) {
        Transaction transaction = session.beginTransaction();
        try {
            session.save(customer);
            transaction.commit();

            System.out.println("id: "+customer.getId());
            return customer;
        } catch (Exception e) {
            transaction.rollback();
            return null;
        }
    }
    public Customer updateCustomer(Customer customer) {
        Transaction transaction2 = session.beginTransaction();
        try {
            session.update(customer);
            transaction2.commit();

            System.out.println("id: "+customer.getId());
            return customer;
        } catch (Exception e) {
            transaction2.rollback();
            return null;
        }
    }
    public Customer deleteCustomer(Customer customer) {
        Transaction transaction3 = session.beginTransaction();
        try {
            session.delete(customer);
            transaction3.commit();

            System.out.println("id: "+customer.getId());
            return customer;
        } catch (Exception e) {
            transaction3.rollback();
            return null;
        }
    }
    public Customer getCustomer(Customer customer) {
        Transaction transaction3 = session.beginTransaction();
        try {
            session.get(Customer.class,1);
            transaction3.commit();

            System.out.println("id: "+customer.getId());
            return customer;
        } catch (Exception e) {
            transaction3.rollback();
            throw e;
        }
    }

}