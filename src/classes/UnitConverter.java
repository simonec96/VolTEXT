package classes;

public class UnitConverter {
	public static Float convmmPoint(Float mm) {
		return (float) ((mm/25.4)*72);
	}
	public static Float convmmPoint(Integer mm) {
		return convmmPoint((float)mm);
	}
	public static Float convPointmm(Integer point) {
		return (float) ((point/72)*25.4);
	}
	public static Float convPointmm(Float point) {
		return convPointmm(point.intValue());
	}
	public static Float convPixelmm(Integer px) {
		return px*37.795275591f;
	}
	public static Float convmmPixel(Float mm) {
		return mm/37.795275591f;
	}
	public static Float convPixelPoint(Integer px) {
		return convmmPoint(convPixelmm(px));
	}
	public static Float convPointPixel(Integer point) {
		return convmmPixel(convPointmm(point));
	}
	public static Float convPixelmm(Float px) {
		return convPixelmm(px.intValue());
	}
	public static Float convmmPixel(Integer mm) {
		return convmmPixel((float)mm);
	}
	public static Float convPixelPoint(Float px) {
		return convPixelPoint(px.intValue());
	}
	public static Float convPointPixel(Float point) {
		return convPointPixel(point.intValue());
	}
}