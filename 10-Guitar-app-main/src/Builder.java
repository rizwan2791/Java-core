public enum Builder {

	FENDER, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case RYAN:
			return "Ryan";
		case PRS:
			return "PRS";
		default:
			return "Unspecified";
		}
	}
}