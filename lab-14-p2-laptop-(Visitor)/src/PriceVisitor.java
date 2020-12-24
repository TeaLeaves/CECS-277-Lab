public class PriceVisitor implements Visitor
{

	public double visit(Product product)
	{
		if(product instanceof LaptopComputer)
		{
			LaptopComputer lc = (LaptopComputer)product;
			if(lc.getBrand().equalsIgnoreCase("Microsoft Surface"))
				lc.setPrice(lc.getPrice()*80/100);
			return lc.getPrice()*lc.getQuantity();
		}	
		
		else if(product instanceof MobilPhone)
		{
			MobilPhone m = (MobilPhone)product;
			if(m.getBrand().equalsIgnoreCase("Apple") && m.getPrice() >= 400.00)
				m.setPrice(m.getPrice()-30);
	
			if(m.getBrand().equalsIgnoreCase("Samsung") && m.getModel().equalsIgnoreCase("Galaxy S8"))
				m.setPrice(m.getPrice()*80/100);
	
			return m.getPrice()*m.getQuantity();
		}
		
		else if(product instanceof VideoGame)
		{
			//YOUR CODE
			VideoGame vc = (VideoGame) product;
	           if (vc.getBrand().equalsIgnoreCase("Sony-Playstation"))
	               vc.setPrice(vc.getPrice() * 80 / 100);
	           if (vc.getBrand().equalsIgnoreCase("Microsoft Xbox One") && vc.getQuantity() == 2) {
	               vc.setPrice(vc.getPrice() * 70 / 100);
	           }
	           return vc.getPrice() * vc.getQuantity();
		}
			
		else	return 0;
	}
}