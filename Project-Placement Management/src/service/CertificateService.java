package service;

import entities.Certificate;

public interface CertificateService {
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int id);
	public abstract Certificate deleteCertificate(int id);

}
