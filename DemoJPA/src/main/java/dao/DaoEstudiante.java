package dao;

import model.Estudiante;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoEstudiante {

    public static void create(Estudiante p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la Estudiante" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static Estudiante find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Estudiante p=null;

        try{
            p=em.find(Estudiante.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la Estudiante" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Estudiante p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la Estudiante" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            Estudiante p=DaoEstudiante.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la Estudiante" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}
