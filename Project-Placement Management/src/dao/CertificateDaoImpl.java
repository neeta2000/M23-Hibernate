package dao;

import javax.persistence.EntityManager;

import entities.Certificate;

public class CertificateDaoImpl implements CertificateDao {
	
	private EntityManager em;
	
	
public CertificateDaoImpl() {
		super();
		em = JPAUtil.getEntityManager();
	}



	@Override
	public Certificate addCertificate(Certificate certificate) {
		em.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		em.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate=em.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		em.remove(id);
		return null;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}


}
