/**
 * 
 */
package afg.lektion2;

/**
 * @author Mathias Weigert
 * 
 */
public class Kunde {

	private String nummer;
	private String name;
	private String vorname;

	public Kunde(String nummer, String name, String vorname) {
		this.nummer = nummer;
		this.name = name;
		this.vorname = name;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public boolean equals(Object o) {

		if (o == null)
			return false;

		if (o == this)
			return true;

		Kunde that = (Kunde) o;

		if (!(o instanceof Kunde))
			return false;
		return false;

	}
}
