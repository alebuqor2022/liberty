package dao;

import model.AudioDisc;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoAudio {

    public static void create(AudioDisc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la AudioDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static AudioDisc find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        AudioDisc p=null;

        try{
            p=em.find(AudioDisc.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la AudioDisco" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(AudioDisc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la AudioDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            AudioDisc p=DaoAudio.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la AudioDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}
