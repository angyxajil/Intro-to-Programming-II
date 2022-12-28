package finalprep3;

public class CassetteTape extends MediaItem { // make subclass of MediaItem

	//private // solution didnt have this set as private //: but it was asked in the prompt
	private CassetteLength cassetteSize;

	// add getters, setters, and constructor
	public enum CassetteLength {
		C30, C60, C90, C120
	};
	
	/* there is no default cassetteSize, must be specified in the constructor
	 * 
	public CassetteTape(String nameOfAlbum, String nameOfBand, int rating, CassetteLength cassetteSize) {
		super(nameOfAlbum, nameOfBand);
		
		//this.nameOfAlbum = nameOfAlbum; cannot access variable bc its not in this class bozo
		this.cassetteSize = cassetteSize;
	}
	*/
	
	public CassetteTape(String album, String band, CassetteLength cassetteSize) {
		super(album, band); //has to be the same in the parent class
		this.cassetteSize = cassetteSize;
	} 
	
	public CassetteLength getCassetteSize() {
		return cassetteSize;
	}
	
	public void setCassetteSize(CassetteLength cassetteSize) {
		this.cassetteSize = cassetteSize;
	}	

	@Override
	public String toString() {
		
		return "Artist: " + getNameOfArtist()
		+ "\nSong: " + getNameOfAlbum()
		+ "\nCassetteSize: " + cassetteSize
		+ "\nRating: " + getRating();
	}
	
	/*
	 * THIS GETS PRINTED SECOND
	 * because cassettes get added to the media collection second 
	 */

}
