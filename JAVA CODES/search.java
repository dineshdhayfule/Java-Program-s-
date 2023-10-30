	public class search {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr= {2,4,6,9,11,12,14,20,36,48};
			int target=3;
			
			int index=Search(arr,target);
			System.out.println(index);
		}
		
		public static int Search(int[] arr,int target) {
			int s=0;
			int e=arr.length-1;
			// int m=0;
			while(s<=e) {
				 int m=s+(e-s)/2;
				
				if(target<arr[m]) {
					e=m-1;
				}
				else if(target>arr[m]) {
					s=m+1;
				}
				else {
					return m;
				}
			}
			return -1;
		}

	}