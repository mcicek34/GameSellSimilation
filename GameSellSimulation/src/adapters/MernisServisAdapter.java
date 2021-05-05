package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;

import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		KPSPublicSoap proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(gamer.nationalityId), gamer.firstName.toUpperCase(),
					gamer.lastName.toUpperCase(), gamer.dateofBirth.getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
