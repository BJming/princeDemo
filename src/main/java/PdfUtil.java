import com.princexml.PrinceControl;

import java.io.IOException;

/**
 * Created by bjming on 17-3-3.
 */
public class PdfUtil {
    public static void main(String [] args) throws IOException {
        PrinceControl control = new PrinceControl("/usr/lib/prince");
        control.start();
        String version = control.getVersion();
        System.out.println("Prince Version: "+version);
    }
}
