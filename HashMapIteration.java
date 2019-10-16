import java.util.HashMap;
import java.util.Set;
public class HashMapIteration{
	public static void main(String[] args){
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("sadPencil", "crying pecil ran out of lead, it crys at night" );
		trackList.put("highTurtle", "the turtle is high like a kite");
		trackList.put("leafIntheAir", "I'm falling, falling to earth like a leaf in fall");
		trackList.put("thisStory", "my story takes me to the mall, with my friends we window shopping");

		// Pull out one of the songs by its track title
		String name = trackList.get("thisStory");
		System.out.println("lyric: " + name);

		// Print out all the track names and lyrics in the format Track: Lyrics
		Set<String> accessAll = trackList.keySet();
		for(String allTracks: accessAll){
			System.out.println(allTracks + ":" + trackList.get(allTracks));
		}
	}
}