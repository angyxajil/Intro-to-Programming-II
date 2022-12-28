package finalprep2;

public class Mummy extends Artifact implements Cursed { // make subclass of Artifact

	private String nameOfPerson;
	private boolean isCursed;
	private boolean magicSealActivated;

	public Mummy(String nameOfPerson, boolean isCursed, boolean magicProtection, String nameOfArtifact,
			String description, String fromYear) {

		super(nameOfArtifact);
		this.nameOfPerson = nameOfPerson;
		this.isCursed = isCursed;
		this.magicSealActivated = magicProtection;

		setDescription(description);
		setFromDate(fromYear);

	}

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public boolean isCursed() {
		return isCursed;
	}

	public void setCursed(boolean isCursed) {
		this.isCursed = isCursed;
	}

	public boolean isMagicSealActivated() {
		return magicSealActivated;
	}

	public void setMagicSealActivated(boolean magicSealActivated) {
		this.magicSealActivated = magicSealActivated;
	}

	@Override
	public void applyMagicSeal() {
		magicSealActivated = true;
	}

	@Override
	public boolean checkMagicSeal() {
		return magicSealActivated;
	}

	@Override
	public boolean getIsCursed() {
		return isCursed;
	}

	@Override
	public void setIsCursed(boolean x) {
		isCursed = x;
	}
	
	@Override
	public String toString() {
		String tempstr = "Name of Artifact: " + getNameOfArtifact() 
				+ "\nDescription of Artifact: " + getDescription()
				+ "\nTime period of Artifact: " + getFromDate()
				+"\nName of person: " + nameOfPerson
				+ "\nActive Curse: " + isCursed
				+ "\nMagic seal Activated: " + magicSealActivated;
		
		return tempstr;
	}

}