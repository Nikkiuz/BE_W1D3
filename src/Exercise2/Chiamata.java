package Exercise2;

public record Chiamata(String numeroChiamata, double minutiChiamata) {
	@Override
	public String toString() {
		return "Chiamata{" +
			"minutiChiamata=" + minutiChiamata +
			", numeroChiamata='" + numeroChiamata + '\'' +
			'}';
	}
}

