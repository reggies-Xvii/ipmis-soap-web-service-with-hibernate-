package org.tmea.unido.ipmis.data.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.tmea.unido.ipmis.data.entity.Medicine;

public class MedicineDao implements MedicineDaoInterface<Medicine, String> {

	private Session currentSession;

	private Transaction currentTransaction;

	public MedicineDao() {

	}
	
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}


	public void persist(Medicine entity) {
		getCurrentSession().save(entity);
	}

	public void update(Medicine entity) {
		getCurrentSession().update(entity);
	}

	public Medicine findById(String id) {
		Medicine medicine = (Medicine)getCurrentSession().get(Medicine.class, id);
		return medicine;
	}

	public void delete(Medicine entity) {
		getCurrentSession().delete(entity);
	}

	public List<Medicine> findAll() {
		@SuppressWarnings("unchecked")
		List<Medicine> medicine = (List<Medicine>)getCurrentSession().createQuery("from classification").list();
		return medicine;
	}

	public void deleteAll() {
		List<Medicine> entityList = findAll();
		for(Medicine entity: entityList){
			delete(entity);
		}
	}

	public Medicine findById(Long id) {
		Medicine medicine = (Medicine)getCurrentSession().get(Medicine.class, id);
		return medicine;
	}

}
