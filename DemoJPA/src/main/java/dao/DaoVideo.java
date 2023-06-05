package dao;

import model.VideoDisc;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoVideo {

    public static void create(VideoDisc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la VideoDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static VideoDisc find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        VideoDisc p=null;

        try{
            p=em.find(VideoDisc.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la VideoDisco" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(VideoDisc p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la VideoDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            VideoDisc p=DaoVideo.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la VideoDisco" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}
