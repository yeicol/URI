
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * See
 * <a href="https://www.urionlinejudge.com.br/judge/en/problems/view/1763">Santa's
 * Translator</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class URI1763SantasTranslator {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		Map<String, String> countries = new HashMap<String, String>();
		countries.put("brasil", "Feliz Natal!");
		countries.put("austria", "Frohe Weihnacht!");
		countries.put("espanha", "Feliz Navidad!");
		countries.put("grecia", "Kala Christougena!");
		countries.put("estados-unidos", "Merry Christmas!");
		countries.put("inglaterra", "Merry Christmas!");
		countries.put("australia", "Merry Christmas!");
		countries.put("portugal", "Feliz Natal!");
		countries.put("suecia", "God Jul!");
		countries.put("turquia", "Mutlu Noeller");
		countries.put("argentina", "Feliz Navidad!");
		countries.put("chile", "Feliz Navidad!");
		countries.put("mexico", "Feliz Navidad!");
		countries.put("antardida", "Merry Christmas!");
		countries.put("canada", "Merry Christmas!");
		countries.put("italia", "Buon Natale!");
		countries.put("libia", "Buon Natale!");
		countries.put("siria", "Milad Mubarak!");
		countries.put("marrocos", "Milad Mubarak!");
		countries.put("japao", "Merii Kurisumasu!");
		countries.put("alemanha", "Frohliche Weihnachten!");
		countries.put("belgica", "Zalig Kerstfeest!");
		countries.put("coreia", "Chuk Sung Tan!");
		countries.put("irlanda", "Nollaig Shona Dhuit!");
		String country;
		while ((country = in.readLine()) != null) {
			out.println(countries.containsKey(country) ? countries.get(country) : "--- NOT FOUND ---");
		}
		out.close();
	}

}
