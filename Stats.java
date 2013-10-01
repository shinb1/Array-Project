public class Stats {

	public static void main(String[] args) {
		int[] a = {2, 7, 4, 1, 5, 5, 7, 9, 10, 9};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		

		System.out.println(quartile3(a));
		//print(organize(a));
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
		return middle;

	}

	public static int quartile1(int[] a) {

		int q1 = 0;
		organize(a);

		q1 = a[((a.length/5))];
		return q1;

	}

	public static int quartile3(int[] a) {

		int q3 = 0;
		organize(a);

		q3 = a[((a.length/5*3))];
		return q3;

	}
	
	public static int mode(int a[]) {
	    int value = 0;
	    int maxCount = 0;

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[j] == a[i]) count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            value = a[i];
	        }
	    }

	    return value;
	} 

	public static double standardDeviation(int a[]) {

		double total = 0;
		double difference = 0;
		double average = mean(a);
		double result = 0;

		for (int i = 0; i < a.length; i++) {
			difference = a[i] - average;
			total = total + difference * difference;
		}

		result = Math.sqrt(total/a.length);

		return result;

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