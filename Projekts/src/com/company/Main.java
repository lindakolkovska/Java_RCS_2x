package com.company;

public class Main {

    public static void main(String[] args) {
    	// ja metode ir static, vinu var izsaukt pašu par sevi,
		// bet ojekta izveidošanas (bez tur human.getsmth(); vnk getsmth();
		//ja static metode ir citā klasē, tad izsaukt to var  KlasesNosauk.metodesNosaukums.
		//static metodēs nevar izmantot cita tipa metodes; static tikai ar static;

    //objekta	izveidošana (objektu izveido no klases; klase ir apraksts par to, kā izveidot objektu)
	Person human = new Person("Hannah", "Bolt", 58);
	Person human1 = new Person("Curt", "Cobain");
	//
	/*human.setFirstName("Hannah");
	human.setLastName("Colt");
	human.setAge(56);*/
	/*human.aging1();
	human1.aging1();

	System.out.println(human1.getFullName() +", Vecums: "+ human1.getAge());
	System.out.println(human.getFullName() +", Vecums: "+ human.getAge());*/

	Person.iAmHuman();
    }

    static void printTekst() {
		System.out.println("kkas");
	}
}
