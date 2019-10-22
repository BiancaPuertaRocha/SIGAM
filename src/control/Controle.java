
package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;

public abstract class Controle<T> {
    protected EntityManagerFactory emf;
    private Class<T> classe;

    public Controle(Class<T> classe) {
        this.classe = classe;
        emf = Persistence.createEntityManagerFactory("SIGAMPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void persist(T objeto) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
    }

    public void delete(T objeto) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
    }

    public void alter(T objeto) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
    }

    public List<T> findAll() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(classe));
        return em.createQuery(cq).getResultList();
    }
}
