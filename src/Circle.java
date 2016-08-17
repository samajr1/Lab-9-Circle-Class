
public class Circle {
	private double radius;
	public static int totalObjectCount = 0;
	
	public Circle (double r){  //constructor
		radius = r;
		
		totalObjectCount++;
	}
	
	public String toString (){  //accessor
		return "Radius: " + formatNumber(radius) + "m\t(" + radius + "m)\n" + "Circumference: " + getFormattedCircumference(radius) + "m\t(" + getCircumference(radius) + "m)\n" 
				+ "Area: " + getFormattedArea(radius) + "m^2\t(" + getArea(radius) + "m^2)" + "\n";
	}
	
	public static int getObjectCount (){  //accessor
		return totalObjectCount;
	}
	
	public String formatNumber (double x){   //mutator  formats the radius input to be displayed properly
		String s = String.format("%1$.2f", radius);
		return s;
	}
	
	public double getCircumference(double r){  
		return 2 * Math.PI * radius;
	}
	
	public String getFormattedCircumference(double r){  //mutator
		String s = String.format("%1$.2f", getCircumference(radius));			//formats Circumference to 2 decimal places, rounding appropriately
		return s;
	}
	
	public double getArea(double r){
		return Math.PI * radius * radius;
	}
	
	public String getFormattedArea(double r){
		String s = String.format("%1$.2f", getArea(radius));			//formats Area to 2 decimal places, rounding appropriately
		return s;
	}
	
	
	// these methods preserve the formatted radius, area, circumference as double variables
//	public double getRadiusFormatted (double r){
//		return (double) Math.round(radius * 100) / 100;
//	}
//	
//	public double getFormattedCircumference(double r){
//		return (double) Math.round(getCircumference(radius) * 100) / 100;	//formats Circumference to 2 decimal places, rounding appropriately
//	}
//	
//	public double getFormattedArea(double r){
//		return (double) Math.round(getArea(radius) * 100) / 100;			//formats Area to 2 decimal places, rounding appropriately
//	}
	
}
