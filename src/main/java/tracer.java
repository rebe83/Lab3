import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author theo
 *
 */
public class tracer {


        public static void main(final String[] args)  {
            String webstring   =   urlToString("http://erdani.com/tdpl/hamlet.txt");
            int count = 0;
            String [] words = webstring.split(" ");
            System.out.println(words.length);
            Scanner scanner =   new Scanner(System.in);
            scanner.nextLine();
}
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
                urlScanner  =   new Scanner(new URL(url).openStream(),  "UTF-8");
        }   catch   (IOException    e)  {
            return  "";
        }
        String contents =   urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}