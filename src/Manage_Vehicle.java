import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

/**
 * Created by mahapata on 7/25/2017.
 */
public class Manage_Vehicle {
    private static SessionFactory factory;
    public static void main(String[] args){
        try{
            factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        }catch (Throwable ex){
            System.err.println("Failed to create session factory" +ex);
        }
        Manage_Vehicle mv=new Manage_Vehicle();
        java.util.Date date=new java.util.Date();
        Insurance i=mv.addInsurance(9000.87,"akm",Calendar.getInstance().getTime());
        int Vid=mv.addVehicle("23422","asoll",i);

    }
    public Insurance addInsurance(double amount, String company, java.util.Date date){
        Session session=factory.openSession();
        Transaction tx=null;
        Integer Iid=null;
        Insurance insurance=null;
        try {
            tx=session.beginTransaction();
            insurance=new Insurance(amount,company,date);
            Iid=(Integer) session.save(insurance);
            tx.commit();
        }catch (HibernateException e){
            if(tx!=null){
                tx.rollback();
                e.printStackTrace();
            }
        }finally {
            session.close();
        }
        return insurance;
    }

    public Integer addVehicle(String regNo,String makemModel,Insurance insurance){
        Session session=factory.openSession();
        Transaction tx=null;
        Integer Vid=null;
        try {
            tx=session.beginTransaction();
            Vehicle vehicle=new Vehicle(regNo,makemModel,insurance);
            Vid=(Integer) session.save(vehicle);
            tx.commit();
        }catch (HibernateException e){
            if(tx!=null){
                tx.rollback();
                e.printStackTrace();
            }
        }finally {
            session.close();
        }
        return Vid;
    }
}
