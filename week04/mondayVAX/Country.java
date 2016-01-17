package mondayVAX;

public class Country {
	private final String mCountryId;
	private final String mName;
	private final boolean mIsDefault;
	private final double mVatTax;

	public Country(String countryId, String name, boolean isDefault,
			double vatTax) {

		if (vatTax < 0 || vatTax > 1) {
			// throws
		}

		mCountryId = countryId;
		mName = name;
		mIsDefault = isDefault;
		mVatTax = vatTax;
	}

	public String getCountryId() {
		return mCountryId;
	}

	public String getName() {
		return mName;
	}

	public boolean getIsDefault() {
		return mIsDefault;
	}

	public double getVatTax() {
		return mVatTax;
	}

}
