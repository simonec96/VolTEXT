package classes;

public class UnitConverter {
	public static Float convmmPoint(Float mm) {
		return (float) ((mm/25.4)*72);
	}
	public static Float convPointmm(Float point) {
		return (float) ((point/72)*25.4);
	}
	public static Float convPixelmm(Float px) {
		return px*37.795275591f;
	}
	public static Float convmmPixel(Float mm) {
		return mm/37.795275591f;
	}
	public static Float convPixelPoint(Float px) {
		return convmmPoint(convPixelmm(px));
	}
	public static Float convPointPixel(Float point) {
		return convmmPixel(convPointmm(point));
	}
}