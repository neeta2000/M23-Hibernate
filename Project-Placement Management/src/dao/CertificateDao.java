package dao;

import entities.Certificate;

public interface CertificateDao {
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int id);
	public abstract Certificate deleteCertificate(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();


}
