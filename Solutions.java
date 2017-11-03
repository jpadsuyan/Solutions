import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 */

/**
 * @author Group5 sample sample sample
 *
 */
public class Solutions {

	/**
	 * @param args
	 */
	private static Scanner scan;
	public static void main(String[] args) throws Exception{
		System.out.println("Bear" +bear(1,1));
		System.out.println("Monster" +monster(4,20,6,69));
		Do();
		//brainPhoto();
		System.out.println("Hulk" +hulkFeelings(1));
		System.out.println("Taxes" +taxes(1));
		System.out.println("MishkaAndGame" +MishkaAndGame(1,1,1));
		System.out.println(brainPhoto(2,2,"cm"));
        System.out.println(weedAndScramble("Buadsflbasaurfsdjlk","Bulbasaur"));

	}
	//Windee
	public static int bear(int a,int b){

         int res = 0;
         int res1 = a;
         int res2 = b;

          while(res1 <= res2){
              res1 = res1 * 3;
              res2 = res2 * 2;
              res++;
          }

        return res;
 }
    	//Art
	public static String brainPhoto(int x, int y,String current) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (current.charAt(0) == 'C' || current.charAt(0) == 'M'
                        || current.charAt(0) == 'Y') {
                    return "#Color";
                }
            }
        }
        return "#Black&White";

    }

	//Rey
	 public static int monster(int a, int b, int c, int d) {
		int counter = 0;
		int ba,dc;
		int none = -1;
		int answer = 0;

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (counter = 0; counter <=100; counter++){
			ba=b+(counter*a);
			list1.add(ba);
			dc=d+(counter*c);
			list2.add(dc);
			if (list1.contains(dc)){
				answer = dc;
				break;
			}
			if (list2.contains(ba)){
				answer = ba;
				break;
			}
			if (counter==100){
				answer = none;
				break;
			}

		}
		return answer;
	}

	 //John
	 public static void Do(){
	        Scanner kbd = new Scanner(System.in);
	        try {
	            System.out.print("Input a Number: ");
	            long side = kbd.nextLong();

	            if (side < 3) {
	                System.out.println(-1);
	            } else if (side % 2 == 0){
	                System.out.println((side * side / 4 - 1) + " " + (side * side / 4 + 1));
	            } else {
			System.out.println((side * side) / 2 + " " + ((side * side) / 2 + 1));
	            }
	            } catch (InputMismatchException x){
			System.out.println("Input Mismatch Exception x :" + x.toString());
	            }
	            kbd.close();
		}

	 	public static int hulkFeelings(int banner){
	        for (int feelings = 1; feelings <= banner; feelings++){
	        	if(feelings % 2 == 0){
	        	System.out.print("I love ");
	        	}else{
	        	System.out.print("I hate ");
	        	}

	        	if(banner > feelings){
	        	System.out.print("that ");
	        	}else {
	        	System.out.print("it");
	        	}
	        }
				return banner;

	        }
	 	//Ryan
		public static String MishkaAndGame(int r, int m, int c){
			Random rand = new Random();
            r = 0;
            int winM = 0, winC = 0;
            for (int i = 0; i < r; i++) {
                	 m = 0;
                	 c = 0;
                if (m > c) {
                    winM++;
                }
                else if(c > m) {
                    winC++;
                }
            }
            if (winM > winC) {
                return "Mishka";
            }
            else if (winC > winM) {
                return "Chris";
            }
            else {
                return "Friendship is magic!^^";
            }
    }
		//Franxine
		public static int taxes(int n){
	    		int i = 1;
	    		int a = n % i;
	    		while(a==0){
	    			a = n % i;
	    			i++;
	    	}
	    		i = i / 2;
	    		return i;

	    }
		//lem
		    public static void hulk (int banner){
        	String f ="";
        	String f2="";
	        for (int feelings = 1; feelings <= banner; feelings++){

        	if(feelings % 2 == 0){
        	System.out.print("I love ");
        	}else{
        	System.out.print("I hate ");
        	}

        	if(banner > feelings){
        	System.out.print("that ");
        	}else {
        	System.out.print("it");
        	}}


	    }
     static ArrayList<Character> toArrayList (String word){
     ArrayList <Character> bush = new ArrayList <Character>();
     for (char c : word.toCharArray()) {
      bush.add(c);
    }
    return bush;
  }
    static int weedAndScramble(String b,String p){
    ArrayList <Character> bush = toArrayList(b);
    ArrayList <Character> pokemon = toArrayList(p);
    ArrayList <Character> caught = new ArrayList <Character>();

   int len = bush.size();

    for (int x = 0; x < pokemon.size(); x++) {
      for (int y = 0; y < bush.size(); y++) {
        if (pokemon.contains(bush.get(y))) {
          caught.add(bush.get(y));
          bush.remove(y);
          break;
        } else {
          bush.remove(y);
          y--;
        }
      }
      if (x == pokemon.size() - 1 && x < len) {
        len = len - pokemon.size();
        x = -1;
      }
    }


    int leng = caught.size();

    for (int k = 0; k < pokemon.size(); k++) {
      for (int l = 0; l < caught.size(); l++) {
        if (pokemon.get(k) == caught.get(l)) {
          bush.add(caught.get(l));
          caught.remove(l);
          break;
        }
      }
      if (k == pokemon.size() - 1 && k < leng) {
        leng = leng - pokemon.size();
        k = -1;
      }
    }

    return bush.size()/pokemon.size();
  }

}





