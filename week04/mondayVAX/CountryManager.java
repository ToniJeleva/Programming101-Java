package mondayVAX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryManager {
	private static CountryManager sCountryManager;

	private HashMap<String, Country> mCountries = new HashMap<>();

	private CountryManager() {

	}

	public static CountryManager getInstance() {
		if (sCountryManager == null) { // няма да ни създава нов обект всеки път
			sCountryManager = new CountryManager();
		}
		return sCountryManager;
	}

	public void changeDefaultCountry(Country newDefault) {
		String newDefaultId = newDefault.getCountryId();
		Iterator<Map.Entry<String, Country>> iterator = mCountries.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Country> entry = iterator.next();
			String key = entry.getKey();
			Country country = entry.getValue();
			if (country.getIsDefault()) {
				mCountries.put(
						country.getCountryId(),
						new Country(key, country.getName(), false, country
								.getVatTax()));
				mCountries.put(newDefaultId, new Country(newDefaultId,
						newDefault.getName(), true, newDefault.getVatTax()));
			}

		}
	}

}
