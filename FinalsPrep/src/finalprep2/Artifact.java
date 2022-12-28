package finalprep2;

public abstract class Artifact { // make abstract class

	private String nameOfArtifact;
	private String description;
	private String fromDate; // year and BC or AD

//	add getters and setters and constructor - if needed
	public Artifact(String name) { 
		//super();
		nameOfArtifact = name;
	}
	
	public String getNameOfArtifact() {
		return nameOfArtifact;
	}

	public void setNameOfArtifact(String nameOfArtifact) {
		this.nameOfArtifact = nameOfArtifact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	@Override
	public String toString() {
		String tempstr = "Name of Artifact: " + nameOfArtifact 
				+ "\nDescription of Artifact: " + description
				+ "\nTime period of Artifact: " + fromDate;
		
		return tempstr;
	}
}