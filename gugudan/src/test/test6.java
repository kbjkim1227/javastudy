package test;

public class test6 {
	public static void main(String[] args) {
		int kuk[] = {95,70,45,60,83};
		int eng[] = {90,60,65,90,93};
		int mat[] = {85,70,45,65,83};
		int sum[] = new int[5];
		int max = 0;
		double avg[] = new double[5];
		int min = 999;
		String[] name = {"말자","숙자","인자","혼자","혜자"};
		int myRank[] = new int[5];
		char gread[] = new char[5];

		
		for(int i=0; i<name.length; i++) {
			sum[i] = kuk[i]+eng[i]+mat[i];
			avg[i] = (double) sum[i] / 3;
			
			if(sum[i] > max) max = sum[i];
			if(sum[i] < min) min = sum[i];
			
			switch(sum[i]/30) {
			case 10:			
			case 9:
				gread[i] = 'A';
				break;
			case 8:
				gread[i] = 'B';
				break;
			case 7:
				gread[i] = 'D';
				break;
			case 6:
				gread[i] = 'E';
				break;
			default :
				gread[i] = 'F';
			}
		}
		
		for(int i=0; i<name.length; i++) {
			myRank[i] = 1;
			for(int j=0; j<name.length; j++) {
				if(sum[i]<sum[j])
					myRank[i] ++;
			}
			for (int j = 0; j < gread.length; j++) {

				
			}
			
		}
					
		System.out.println("------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t등급\t등수");
		System.out.println("------------------------------------------------------------");
		
		for(int i=0; i<name.length; i++)
		
			
			
			
			System.out.println((i+1) + "\t" + name[i] + "\t" + kuk[i] + "\t" + 
		eng[i] + "\t" + mat[i] + "\t" + sum[i] + "\t" + gread[i] + "\t" + myRank[i] + "\t" + Math.round(avg[i]*10)/10.0);
		
	
	}

}