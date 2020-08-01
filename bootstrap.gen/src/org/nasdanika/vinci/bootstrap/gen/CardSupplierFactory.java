package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.Card;

public class CardSupplierFactory implements SupplierFactory<ViewPart> {
	
	private Card target;
	
	public CardSupplierFactory(Card target) {
		this.target = target;
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		throw new UnsupportedOperationException();
	}	

}
