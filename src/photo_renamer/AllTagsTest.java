package photo_renamer;



import java.io.IOException;

import static org.junit.Assert.*;

public class AllTagsTest {
	
	
	/*
	 * Tests that AllTags serializes correctly.
	 */
	public void SerializeTest() throws IOException, ClassNotFoundException {
		AllTags.getInstance().addTag("lol");
		AllTags.saveToFile();
		AllTags.readFromFile();
		assertTrue(AllTags.getInstance().getTags().contains("lol"));
	}
	
	/*
	 * Test that AllTags adds tags correctly.
	 */
	public void AddTagTest() throws IOException {
		AllTags.getInstance().addTag("abc");
		assertTrue(AllTags.getInstance().getTags().contains("abc"));
	}

}
