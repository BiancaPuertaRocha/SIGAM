package control;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import view.DashboardSecretario;

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

    public void gerarRelatorio(HashMap<String, Object> parametros, List<T> lista, String caminho) {
        JasperReport relatorio;
        JRBeanCollectionDataSource dados = new JRBeanCollectionDataSource(lista, false);
        JasperPrint print;
        caminho = new File(caminho).getAbsolutePath();
        try {
            relatorio = JasperCompileManager.compileReport(caminho);
            print = JasperFillManager.fillReport(relatorio, parametros, dados);
            JasperViewer viw = new JasperViewer(print, false);
            viw.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(DashboardSecretario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
