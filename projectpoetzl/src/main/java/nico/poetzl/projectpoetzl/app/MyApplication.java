package nico.poetzl.projectpoetzl.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import nico.poetzl.projectpoetzl.ServiceJpa.ServiceJpaFactory;
import nico.poetzl.projectpoetzl.app.PersistenceFactorylmpl;
import nico.poetzl.projectpoetzl.repositoryjpa.PersistenceFactory;

//import at.grueneis.timetable.app.MyApplication;

//import at.grueneis.timetable.app.ServiceFactoryImpl;
//import at.grueneis.timetable.service.ServiceFactory;
import nico.poetzl.projectpoetzl.app.ServiceFactoryimpl;


public class MyApplication {
    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private PersistenceFactory persistenceFactory;

    private ServiceJpaFactory serviceFactory;

    public MyApplication() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        persistenceFactory = new PersistenceFactorylmpl(entityManager);
        serviceFactory = new ServiceFactoryimpl(persistenceFactory);
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
