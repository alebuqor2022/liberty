package dao;

import model.Curso;
import utils.JpaUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class DaoCurso {

    public static void create(Curso p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.persist(p); // hacer un INSERT
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al crear la Curso" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static List<Curso> findAllCursos(int fk){
        EntityManager em=JpaUtils.getEmf().createEntityManager();
        Query cursos=em.createNativeQuery("SELECT estudiantes.nombre, cursos.nombre\n" +
                "FROM (estudiantes inner join estudiante_cursos on estudiantes.id = estudiante_cursos.fk_estudiante)\n" +
                "inner join cursos on cursos.id = estudiante_cursos.fk_curso\n" +
                "where estudiantes.id=" + fk +
                "; ");
        List<Curso> c=cursos.getResultList();
        return c;
    }

    public static Curso find(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        Curso p=null;

        try{
            p=em.find(Curso.class, id);
        }catch(Exception ex) {
            System.out.println("ups, error al buscar la Curso" + ex.getMessage());
        }finally{
            em.close();
        }
        return p;
    }

    public static void update(Curso p){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin(); // abrimos un canal de comunicacion con la BD
        try {
            em.merge(p); // hacer un UPDATE
            tx.commit();
            System.out.println("modificooooo !!!!");
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al modificar la Curso" + ex.getMessage());
        } finally{
            em.close();
        }
    }

    public static void delete(Long id){
        EntityManager em= JpaUtils.getEmf().createEntityManager();
        em.getTransaction().begin(); // abrimos un canal de comunicacion con la BD
        try {
            Curso p=DaoCurso.find(id);
            em.remove(p); // ejecuta el DELETE
            em.getTransaction().commit();
        }catch(Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ups, error al borrar la Curso" + ex.getMessage());
        } finally{
            em.close();
        }
    }
}
