package finalprep3;

public abstract class MediaItem {

	private String nameOfAlbum;
	private String nameOfBand;
	private int rating;

	// public add getters, setters, and constructor

	/*
	 * public MediaItem(String nameOfAlbum, String nameOfBand, int rating) {
	 * super(); }
	 */

	public MediaItem(String album, String band) { // does not take rating because it must be kept at 0 for the user to
													// rate it on their own
		nameOfAlbum = album;
		nameOfBand = band;
		// rating = 0;
	}

	/*
	 * constructor does not use name of variable in parameters because child classes
	 * must inherit same paramters
	 * 
	 * if it were nameOf____ , child classes cannot access variable due to the
	 * visibility type
	 */

	public String getNameOfAlbum() {
		return nameOfAlbum;
	}

	public void setNameOfAlbum(String nameOfAlbum) {
		this.nameOfAlbum = nameOfAlbum;
	}

	public String getNameOfArtist() {
		return nameOfBand;
	}

	public void setNameOfArtist(String nameOfBand) {
		this.nameOfBand = nameOfBand;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	// abstract method toString()
	// @Override
	@Override
	public abstract String toString();

}
