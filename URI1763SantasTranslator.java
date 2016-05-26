
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
		String country;
		while ((country = in.readLine()) != null) {
			switch (country) {
				case "estados-unidos":
				case "inglaterra":
				case "australia":
				case "antardida":
				case "canada":
					out.println("Merry Christmas!");
					break;
				case "espanha":
				case "argentina":
				case "chile":
				case "mexico":
					out.println("Feliz Navidad!");
					break;
				case "brasil":
				case "portugal":
					out.println("Feliz Natal!");
					break;
				case "italia":
				case "libia":
					out.println("Buon Natale!");
					break;
				case "siria":
				case "marrocos":
					out.println("Milad Mubarak!");
					break;
				case "austria":
					out.println("Frohe Weihnacht!");
					break;
				case "grecia":
					out.println("Kala Christougena!");
					break;
				case "suecia":
					out.println("God Jul!");
					break;
				case "turquia":
					out.println("Mutlu Noeller");
					break;
				case "japao":
					out.println("Merii Kurisumasu!");
					break;
				case "alemanha":
					out.println("Frohliche Weihnachten!");
					break;
				case "belgica":
					out.println("Zalig Kerstfeest!");
					break;
				case "coreia":
					out.println("Chuk Sung Tan!");
					break;
				case "irlanda":
					out.println("Nollaig Shona Dhuit!");
					break;
				default:
					out.println("--- NOT FOUND ---");
					break;
			}
		}
		out.close();
	}

}
