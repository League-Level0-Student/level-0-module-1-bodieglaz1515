package _05_for_loops._2_badgers;

public class Badger {
	public static void main(String[] args) {


		meow();
		woof(false);
		meow();
		woof(true);
	}

	public static void meow(){
		for (int badger=0; badger< 12; badger+=1) {
			System.out.print("Badger");

			if (badger<11) {

				System.out.print(", ");



			} 

		}
		System.out.println();
	}


	public static void woof(boolean mushroom ) {

		for (int mush=0; mush< 2; mush+=1) {

			System.out.print("Mushroom");

			if (mush<1) {

				System.out.print(", ");


			}else {
				System.out.println();
				System.out.println();
			}
		
		}
		if (mushroom) {
		
			
			System.out.println();
			System.out.println();
			System.out.print("A snake!");
			
			
			
			
			
			
			
			
			
			
		}
		}


	}

