package dao;

import model.Pais;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoPais {

    public static void create(Pais p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear el Pais" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static Pais find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Pais p=null;

        try{
            p=em.find(Pais.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar el Pais" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Pais p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar el Pais" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            Pais p=DaoPais.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar el Pais" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}


