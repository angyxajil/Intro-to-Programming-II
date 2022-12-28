package finalprep3;

import java.util.Scanner;

import finalprep3.CassetteTape.CassetteLength;
import finalprep3.VinylAlbum.RPM;

public class StartMediaCollection {

	public static void main(String[] args) {
//		Has exactly NO Lists or Arrays - everything is stored in the class objects

		VinylAlbum v1 = new VinylAlbum("Nostalgia Ultra", "Frank Ocean", RPM.FOURTY_FIVE);
		VinylAlbum v2 = new VinylAlbum("Watch My Back", "LUCKI", RPM.SEVENTY_EIGHT);

//		Make 2 CassetteTape  objects and fill out the attributes, EXCEPT leave the
//		ratingValue as it's default of 0.

		CassetteTape c1 = new CassetteTape("Little Lies", "ODIE", CassetteLength.C60);
		CassetteTape c2 = new CassetteTape("Mr. Rager", "Kid Cudi", CassetteLength.C120);

		// Make a MyCollection object
		MyCollection coll = new MyCollection();

// 		Add all the VinylAlbum and the CassetteTape to the MyCollection.
		coll.getMedia().add(v1);
		coll.getMedia().add(v2);
		coll.getMedia().add(c1);
		coll.getMedia().add(c2);

		int numberItems = coll.getMedia().size(); // num of media items are added to MyCollection

		Scanner userinput = new Scanner(System.in);
		int rate;
		int item = 0;

		while (item < numberItems) {
			System.out.println("--------------------------------");

//			display MediaItem info
			MediaItem media = coll.getMedia().get(item);

			System.out.println(media.toString());

			System.out.println("\nEnter a rating of 1 to 10 for the above Media Item: ");

			rate = userinput.nextInt();
			while (rate < 1 || 10 < rate) {
				System.out.println("\nEnter a rating of 1 to 5");
				rate = userinput.nextInt();
			}

//			set the rating value for the media item
			item += 1;
		}
		userinput.close();

//		display it all together one last time
		for (int i = 0; i < numberItems; i++) {

//			display MediaItem info
			System.out.println();
			System.out.println(coll.getMedia().get(i).toString());
			System.out.println("-----------------------------------------------------");
		}
	}
}
