package dao;

import model.Ciudad;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoCiudad {


    public static void create(Ciudad p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la Ciudad" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static Ciudad find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Ciudad p=null;

        try{
            p=em.find(Ciudad.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la Ciudad" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Ciudad p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la Ciudad" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            Ciudad p=DaoCiudad.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la Ciudad" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}


