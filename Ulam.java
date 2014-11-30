//Algorithm by Craig Coleman
// I did not look at any Ulam Spiral algorithms before I developed this.
// Plese give me credit if you use this
// This is an algorithm study.

class Ulam {
	public static void main (String args[]){
		int x = 0, y = 0,  e; // e is the end state of nlogic;
		int h = 0, k = 0;
		int parity = -1;//parity 0 + 1 
		int parityMOD = 4;
		int n, nlogic =0;
		n = 1;
		System.out.println("n:"+n+" x:"+x+" y:"+y+" h:"+h+" k:"+k+" nlogic "+nlogic+" parity:"+parity);
		for (e = 1;e < 4;e++){
			parity = -parity;
			System.out.println (e + " e ***************************");
			nlogic = 0;
			for (x = 0; x < e; x++){
				h = h + parity;
					n++;
				System.out.println("n:"+n+" x:"+x+" y:"+y+" h:"+h+" k:"+k+" nlogic "+nlogic+" parity:"+parity);
		}
			nlogic =1;
			for (y = 0; y < e; y++){
					k = k + parity;
					n++;
		System.out.println("n:"+n+" x:"+x+" y:"+y+" h:"+h+" k:"+k+" nlogic "+nlogic+" parity:"+parity);

			}
		}
	}
}
