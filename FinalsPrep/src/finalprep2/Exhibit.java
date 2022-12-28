package finalprep2;

import java.util.ArrayList;
import java.util.List;

public class Exhibit {

	public enum DisplayType {
		wall, glassCase, pedistal, hangFromCeling
	}
	
	private DisplayType dType;

//	ArrayList of Artifacts
	private ArrayList<Artifact> artifact;

//	add getters and setters - as needed
	public void addArtifact(Artifact newArtifact) {
		artifact.add(newArtifact);
	}

	public List<Artifact> getArtifact() {
		return artifact;
	}
	
	public void setDType(DisplayType dType) {
		this.dType = dType;
	}

	public DisplayType getDType () {
		return this.dType;
	}

	// add constructor(s) as needed
	public Exhibit(DisplayType dType, Artifact artIn) {
		this.dType = dType;
		artifact = new ArrayList<>();
		artifact.add(artIn);
	}
	
	@Override
	public String toString() {
		String tmpstr = "Displayed on: " + dType +
				"\n" + artifact.get(0).toString();
		//this could get a loop when expecting more than one artifact
		return tmpstr;
	}

}
