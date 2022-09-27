package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		
		      int[][] ar = new int[10][10];
		      int num=0;
		      
		      //입력
//			      for(int i=0; i<ar.length; i++) { //행
//			         for(int j=0; j<ar[i].length; j++) { //열
//			            num++; //1
//			            ar[i][j] = num;
//			         }
//			      }
		      
//			      for(int i=0; i<ar.length; i++) { //행
//			         for(int j=0; j<ar[i].length; j++) { //열
//			            num++; //1
//			            ar[j][i] = num;
//			         }
//			      }
		      
		      for(int i=ar.length-1; i>=0; i--) { //행
		         for(int j=ar[i].length-1; j>=0; j--) { //열
		            num++; //1
		            ar[i][j] = num;
		         }
		      }

		      //출력
		      for(int i=0; i<ar.length; i++) { //행
		         for(int j=0; j<ar[i].length; j++) { //열
		            System.out.print(String.format("%4d", ar[i][j]));
		         }//for j
		         System.out.println();
		      }//for i
			  
		
	}

}
