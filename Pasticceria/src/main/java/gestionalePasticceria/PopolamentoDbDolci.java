package gestionalePasticceria;

public class PopolamentoDbDolci {
	
	public static void main(String[] args) {
		ServicesCrud crud = new ServicesCrud("jpa-Pasticceria");
		Dolce torta1 = new Dolce("torta", "cocco", 10);
		crud.jpaCreate(torta1);
		Dolce torta2 = new Dolce("torta", "crema", 10);
		crud.jpaCreate(torta2);
		Dolce torta3 = new Dolce("torta", "pera", 10);
		crud.jpaCreate(torta3);
		Dolce torta4  = new Dolce("torta", "EdC", 10);
		crud.jpaCreate(torta4);
		Dolce torta5  = new Dolce("torta", "MD", 10);
		crud.jpaCreate(torta5);
		Dolce crostata1= new Dolce("crostata", "cocco", 10);
		crud.jpaCreate(crostata1);
		Dolce crostata2 = new Dolce("crostata", "crema", 10);
		crud.jpaCreate(crostata2);
		Dolce crostata3 = new Dolce("crostata", "pera", 10);
		crud.jpaCreate(crostata3);
		Dolce crostata4 = new Dolce("crostata", "EdC", 10);
		crud.jpaCreate(crostata4);
		Dolce crostata5 = new Dolce("crostata", "MD", 10);
		crud.jpaCreate(crostata5);
		Dolce biscotto1= new Dolce("biscotto", "cocco", 10);
		crud.jpaCreate(biscotto1);
		Dolce biscotto2 = new Dolce("biscotto", "crema", 10);
		crud.jpaCreate(biscotto2);
		Dolce biscotto3 = new Dolce("biscotto", "pera", 10);
		crud.jpaCreate(biscotto3);
		Dolce biscotto4 = new Dolce("biscotto", "EdC", 10);
		crud.jpaCreate(biscotto4);
		Dolce biscotto5 = new Dolce("biscotto", "MD", 10);
		crud.jpaCreate(biscotto5);
		Dolce muffin1= new Dolce("muffin", "cocco", 10);
		crud.jpaCreate(muffin1);
		Dolce muffin2 = new Dolce("muffin", "crema", 10);
		crud.jpaCreate(muffin2);
		Dolce muffin3 = new Dolce("muffin", "pera", 10);
		crud.jpaCreate(muffin3);
		Dolce muffin4 = new Dolce("muffin", "EdC", 10);
		crud.jpaCreate(muffin4);
		Dolce muffin5 = new Dolce("muffin", "MD", 10);
		crud.jpaCreate(muffin5);
		Dolce cannolo1= new Dolce("cannolo", "cocco", 10);
		crud.jpaCreate(cannolo1);
		Dolce cannolo2 = new Dolce("cannolo", "crema", 10);
		crud.jpaCreate(cannolo2);
		Dolce cannolo3 = new Dolce("cannolo", "pera", 10);
		crud.jpaCreate(cannolo3);
		Dolce cannolo4 = new Dolce("cannolo", "EdC", 10);
		crud.jpaCreate(cannolo4);
		Dolce cannolo5 = new Dolce("cannolo", "MD", 0);
		crud.jpaCreate(cannolo5);
	}
}
