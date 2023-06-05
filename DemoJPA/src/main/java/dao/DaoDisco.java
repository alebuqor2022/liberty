package dao;

import model.Disc;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoDisco {


    public static void create(Disc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la Disco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static Disc find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Disc p=null;

        try{
            p=em.find(Disc.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la Disco" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Disc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la Disco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            Disc p=DaoDisco.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la Disco" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}


