public class Stats {

	public static void main(String[] args) {
		int[] a = {4, 9, 4, 4, 15, 19, 26};
		

		System.out.println(mode(a));
		print(organize(a));
	}

	

	public static int max(int[] a) {
		
		int x = a[0];

		for (int i=1; i < a.length; i++) {
			
			if (a[i]>x) {
				x = a[i];
			}	

		}

		return x;

	}

	public static int min(int[] a) {

		int x = a[0];

		for (int i=1; i < a.length; i++) {
			
			if (a[i]<x) {
				x = a[i];
			}	

		}

		return x;

	}

	public static double mean(int[] a) {

		double x = 0.0;

		for (int i=0; i < a.length; i++) {
			x = x + a[i];
		}

		x = x/a.length;
  
		return x;
	}

	public static double median(int[] a) {

		double middle = 0;
		organize(a);

		if (a.length % 2 == 1) {
			middle = a[a.length/2];
		} else {
			middle = ((a[a.length/2] + a[a.length/2 + 1])/2);
		}

		System.out.println("The median is: ");
		return middle;

	}

	public static int quartile1(int[] a) {

		int q1 = 0;
		organize(a);

		q1 = a[((a.length+1)/4)-1];

		System.out.println("The number indicating the first quartile is: ");
		return q1;

	}

	public static int quartile3(int[] a) {

		int q3 = 0;
		organize(a);

		q3 = a[((a.length+1)/4*3)-1];

		System.out.println("The number indicating the third quartile is: ");
		return q3;

	}
	
	public static int mode(int a[]) {
	    int value = 0;
	    int maxCount = 0;

	    for (int i = 0; i < a.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < a.length; ++j) {
	            if (a[j] == a[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            value = a[i];
	        }
	    }

	    return value;
	} 

	public static int[] organize(int[] a) {

		int x=0;
		int y=0;

		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
				if (a[j] > a[j+1]) {

					x = a[j];
					y = a[j+1];
					a[j] = y;
					a[j+1] = x;

				}
			}
		}

		return a;

	}

	public static int print(int[] a) {

		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

		return 0;

	}

}




// max

// min

// mean

// median

// quartile 1

//quartile 3

// mode

// standard deviation