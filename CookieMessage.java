package P2_Imparte_surprize;

import java.util.ArrayList;

public class CookieMessage {

	private String message;
	private String author;

	private static String[] messagesArray =

			{ "Persoanele care avanseaza in viata sunt acelea care cauta circumstantele pe care le vor si daca nu le gasesc le creaza.",

					"Lanturile sclaviei leaga doar miinile: mintea este cea care elibereaza omul.",

					"Oricine renunta sa invete este batran, chiar daca are 20 sau 80 de ani. Oricine continua sa invete ramane tanar. Cel mai important lucru in viata este sa-ti pastrezi propria minte tanara.",

					"Avem 40 de milioane de motive pentru a gresi, dar o singura scuza.",

					"Cei care gresesc se impart in doua categorii: Aceia care au actionat fara sa gandeasca si cei care au gandit fara sa actioneze.",

					"Exista doar 3 culori, 10 cifre si 7 note; ceea ce facem cu ele este important.",

					"Faceti ceea ce puteti, cu ceea ce aveti, acolo unde sunteti.",

					"Nu spune lumii ceea ce stii sa faci, fa-o si gata.",

					"Daca continui sa faci ceea ce faci, vei continua sa primesti ceea ce primesti.",

					"Cind vezi o afacere de succes inseamna ca cineva a luat o decizie curajoasa.",

					"Daca crezi ca educatia este scumpa asteapta sa vezi cat te va costa ignoranta ta.",

					"Unele persoane cresc responsabile, altele pur si simplu sunt ingamfate.",

					"Cea mai buna rasplata pentru munca facuta nu este ceea ce se obtine din ea ci ceea ce se devine datorita acesteia.",

					"Viata este ciudata, daca iti refuzi sa accepti orice alt lucru in afara de cel mai bun, deseori il obtii.",

					"Nu exista vint prielnic pentru marinarul care nu stie unde sa mearga.",

					"Cind un om si-a impus niste limite pentru ce va face, si-a impus niste limite pentru cit poate sa faca.",

					"Exista doua lucruri care nu se mai intorc niciodata inapoi: o sageata aruncata si o ocazie pierduta.",

					"Daca tin  foarte mult sa fac ceva, acel ceva nu se numeste munca.",

					"Cunoasterea pe jumatate este mai rea decit ignoranta.",

					"Nu-mi spune cit greu muncesti, spune-mi ceea ce ai realizat." };

	private static String[] authorsArray = { "George Bernard Shaw", "Franz Grillparzer", "Henry Ford",
			"Rudyard Kipling", "John Charles Salak", "Rith Ross", "Theodore Roosevelt", "Riccardo Oda",
			"John M. Capozzi", "Peter Drucker", "John M. Capozzi", "John M. Capozzi", "Hubbell", " John Ruskin",
			"Somerset Maugham", "Seneca", "Charles M. Schwab", "Jim Rohn", "Richard Bach", "Macauley"};

	public CookieMessage(int index) {
		this.message = messagesArray[index];
		this.author = authorsArray[index];
	}

	public String getMessage() {
		return message;
	}

	public String getAuthor() {
		return author;
	}

	@Override

	public String toString() {
		return String.format("%s" + "\n\n                                 " + "           	 %s", getMessage(), getAuthor());
	}

}
