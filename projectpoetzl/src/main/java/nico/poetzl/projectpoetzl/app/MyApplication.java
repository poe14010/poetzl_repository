package nico.poetzl.projectpoetzl.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import nico.poetzl.projectpoetzl.app.PersistenceFactorylmpl;
import nico.poetzl.projectpoetzl.repositoryjpa.PersistenceFactory;

//import at.grueneis.timetable.app.MyApplication;

//import at.grueneis.timetable.app.ServiceFactoryImpl;
//import at.grueneis.timetable.service.ServiceFactory;


public class MyApplication {
    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private PersistenceFactory persistenceFactory;

    private ServiceFactoryimpl serviceFactory;

    public MyApplication() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        persistenceFactory = new PersistenceFactoryImpl(entityManager);
        serviceFactory = new ServiceFactoryImpl(persistenceFactory);
    }

    public void doSomething() {

    }

    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.doSomething();
        myApplication.teardown();
    }
}
