package com.antaladrien;

public class Main {

    public static void main(String[] args) {
	    Harcos h1 = new Harcos("Marci", 100, 10);
	    Harcos h2 = new Harcos("Karcsi", 80, 15);

	    int kor = 1;
        while (!h1.harcol(h2)) {
            System.out.println(kor + ". kör");
            kor++;
            System.out.println(h1);
            System.out.println(h2);
        }

        if (h1.getEletero()<1 && h2.getEletero()<1)
            System.out.println("Mindketten vesztettek.");
        else if (h1.getEletero()<1)
            System.out.println("Nyertes: " + h2);
        else
            System.out.println("Nyertes: " + h1);
    }
}
