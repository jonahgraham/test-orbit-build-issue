package jonah;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private static final String FILE_URL = "https://repository.jboss.org/nexus/content/groups/public/com/sun/media/jai-codec/1.1.3/jai-codec-1.1.3.jar";
	private static final String FILE_NAME = "/tmp/jai-codec-1.1.3.jar";
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws Exception
    {
		System.out.println("Downloading " + FILE_URL + " to " + FILE_NAME);
		InputStream in = new URL(FILE_URL).openStream();
		Files.copy(in, Paths.get(FILE_NAME), StandardCopyOption.REPLACE_EXISTING);
    }
}
