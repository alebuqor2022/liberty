package dao;

import model.Persona;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class DaoPersona {
// dao = data access object
// crud = create read update delete ... ABM alta baja modificacion

    public static void create(Persona p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la persona" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static Persona find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Persona p=null;

        try{
            p=em.find(Persona.class, id);
        }catch(Exception ex) {
        System.out.println("ups, error al buscar la persona" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Persona p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la persona" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
           Persona p=DaoPersona.find(id);
           em.remove(p); // ejecuta el DELETE
           em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la persona" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}
