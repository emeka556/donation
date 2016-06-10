package utils;

import java.util.Comparator;

import models.Donation;

public class DonationDateComparator implements Comparator <Donation> {

	@Override
	public int compare(Donation arg0, Donation arg1) {
		return arg0.dateDonated.compareTo(arg1.dateDonated);
	}

}
