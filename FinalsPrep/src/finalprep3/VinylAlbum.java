package finalprep3;

public class VinylAlbum extends MediaItem { // make subclass of MediaItem

	public enum RPM {
		THIRTY_THREE, FOURTY_FIVE, SEVENTY_EIGHT
	}
	
	RPM speed;

	// add getters, setters
	public RPM getSpeed() {
		return speed;
	}
	
	public void setSpeed(RPM speed) {
		this.speed = speed;
	}

	// there is no default speed, must be specified in the constructor
	public VinylAlbum(String album, String band, RPM rpm) {
		super(album, band);
		speed = rpm; //sets variable to constructor
	}

	@Override
	public String toString() {
		return "Artist: " + getNameOfArtist()
		+ "\nAlbum: " + getNameOfAlbum()
		+ "\nRPM Speed: " + speed
		+ "\nRating: " + getRating();
		
		/*
		 * THIS GETS PRINTED FIRST
		 * because vinyls get added to the media collection first 
		 */
	}

}
