public enum Wood {

	MAHOGANY, ALDER, MAPLE;

	public String toString() {
		switch (this) {
		case MAHOGANY:
			return "Mahogany";
		case MAPLE:
			return "Maple";
		case ALDER:
			return "Alder";
		default:
			return "unspecified";
		}
	}
}